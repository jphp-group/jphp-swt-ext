<?php

use swt\{UIButton, UIDisplay, UIWindow};

$display = UIDisplay::getDefault();
$window = new UIWindow();
$window->size = [600, 400];
$window->title = "Magic Button";

$button = new UIButton($window);
$button->text = 'Click Me!';
$button->size = [200, 40];
$button->position = [200, 160];

$button->bind('action', function () use ($button) {
    $button->text = "Clicked!";
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