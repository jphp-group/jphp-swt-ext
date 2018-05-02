<?php

use swt\UIButton;
use swt\UIDisplay;
use swt\UIWindow;

$display = UIDisplay::getDefault();
$window = new UIWindow();
$window->size = [600, 400];
$window->title = "SWT Window";

$button = new UIButton($window);
$button->text = 'Click Me!';
$button->size = [200, 40];
$button->position = [100, 100];
$button->bind('action', function () {
    echo "Hello World\n";
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

echo "\nDone.";