<?php

use swt\UIBrowser;
use swt\UIDisplay;
use swt\UIWindow;

$display = UIDisplay::getDefault();
$window = new UIWindow();
$window->size = [1024, 760];
$window->title = "Simple Browser";

$browser = new UIBrowser($window);
$browser->size = [1024, 760];
$browser->url = 'https://google.com';

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