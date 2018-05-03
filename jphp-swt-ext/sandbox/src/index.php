<?php

use swt\UIBrowser;
use swt\UIButton;
use swt\UIDisplay;
use swt\UIWindow;

$display = UIDisplay::getDefault();
$window = new UIWindow();
$window->size = [600, 400];
$window->title = "SWT Window";

$browser = new UIBrowser($window);
$browser->size = [600, 400];
$browser->url = 'http://youtube.com';

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