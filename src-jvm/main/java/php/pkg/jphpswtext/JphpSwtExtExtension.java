package php.pkg.jphpswtext;

import org.eclipse.swt.SWTException;
import org.eclipse.swt.widgets.*;
import php.pkg.jphpswtext.bind.ColorMemoryOperation;
import php.pkg.jphpswtext.bind.PointMemoryOperation;
import php.pkg.jphpswtext.classes.*;
import php.runtime.env.CompileScope;
import php.runtime.exceptions.CriticalException;
import php.runtime.ext.core.classes.lib.FsUtils;
import php.runtime.ext.support.Extension;
import php.runtime.memory.support.MemoryOperation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class JphpSwtExtExtension extends Extension {
    public static final String NS = "swt";

    static {
        loadSwtJar();
    }
    
    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }
    
    @Override
    public void onRegister(CompileScope scope) {
        MemoryOperation.register(new ColorMemoryOperation());
        MemoryOperation.register(new PointMemoryOperation());

        registerWrapperClass(scope, Display.class, UIDisplay.class);
        registerWrapperClass(scope, Widget.class, UIWidget.class);
        registerWrapperClass(scope, Control.class, UIControl.class);
        registerWrapperClass(scope, Composite.class, UIComposite.class);
        registerWrapperClass(scope, Shell.class, UIWindow.class);
        registerWrapperClass(scope, Button.class, UIButton.class);

        registerJavaException(scope, UIException.class, SWTException.class);
    }

    private static void loadSwtJar() {
        String osName = System.getProperty("os.name").toLowerCase();
        String osArch = System.getProperty("os.arch").toLowerCase();
        String swtFileNameOsPart =
                osName.contains("win") ? "win" :
                        osName.contains("mac") ? "macos" :
                                osName.contains("linux") || osName.contains("nix") ? "linux" :
                                        ""; // throw new RuntimeException("Unknown OS name: "+osName)

        String swtFileNameArchPart = osArch.contains("64") ? "x86_64" : "x86";
        String swtFileName = "swt-"+swtFileNameOsPart+"-"+swtFileNameArchPart+".jar";

        try {
            URLClassLoader classLoader = (URLClassLoader) JphpSwtExtExtension.class.getClassLoader();
            Method addUrlMethod = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
            addUrlMethod.setAccessible(true);

            //URL swtFileUrl = new File("./swt/" + swtFileName).toURI().toURL();

            InputStream resourceAsStream = JphpSwtExtExtension.class.getResourceAsStream("/swt/" + swtFileName);

            if (resourceAsStream == null) {
                throw new IOException("SWT jar not found");
            }

            File tempFile = File.createTempFile(swtFileName, ".jar");
            tempFile.deleteOnExit();

            FsUtils.copy(
                    resourceAsStream,
                    new FileOutputStream(tempFile)
            );
            // I am using Jar-in-Jar class loader which understands this URL; adjust accordingly if you don't

            addUrlMethod.invoke(classLoader, tempFile.toURI().toURL());
        } catch(Exception e) {
            throw new CriticalException("Unable to add the SWT jar to the class path: /swt/" + swtFileName, e);
        }
    }
}