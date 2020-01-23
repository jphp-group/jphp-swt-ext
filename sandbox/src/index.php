<?

use swt\{UIButton, UIDisplay, UIEvent, UIWindow};

$display = UIDisplay::getDefault();
$window = new UIWindow();
$window->size = [600, 400];
$window->title = "jPHP SWT Sandbox";

$button = new UIButton($window);
$button->text = 'Click Me!';
$button->size = [200, 40];
$button->position = [200, 160];

$button->bind('action', function (UIEvent $event) use ($button) {
    $event->display->beep();
    $event->widget->text = "Clicked!";
});

$window->bind('close', function () use ($window, $display) {
    $window->free();
});

$window->center();
$window->open();

while (!$window->isFree()) {
    if (!$display->readAndDispatch()) {
        $display->sleep();
    }
}

$display->free();
