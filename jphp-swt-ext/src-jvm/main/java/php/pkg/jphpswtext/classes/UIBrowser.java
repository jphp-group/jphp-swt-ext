package php.pkg.jphpswtext.classes;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import php.pkg.jphpswtext.JphpSwtExtExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Namespace(JphpSwtExtExtension.NS)
public class UIBrowser extends UIControl<Browser> {
    public UIBrowser(Environment env, Browser wrappedObject) {
        super(env, wrappedObject);
    }

    public UIBrowser(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(Composite composite) {
        __wrappedObject = new Browser(composite, SWT.NONE);
    }

    @Getter
    public String getBrowserType() {
        return getWrappedObject().getBrowserType();
    }

    @Getter
    public String getHtml() {
        return getWrappedObject().getText();
    }

    @Setter
    public void setHtml(String value) {
        getWrappedObject().setText(value);
    }

    @Setter
    public void setUrl(String url) {
        getWrappedObject().setUrl(url);
    }

    @Getter
    public String getUrl() {
        return getWrappedObject().getUrl();
    }
}
