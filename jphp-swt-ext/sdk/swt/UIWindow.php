<?php
namespace swt;

/**
 * Window
 *
 * @package swt
 */
class UIWindow extends UIComposite
{
    /**
     * Title text of the window.
     * @var string
     */
    public $title = '';

    /**
     * @var bool
     */
    public $maximized = false;

    /**
     * @var bool
     */
    public $fullscreen = false;

    /**
     * Alpha of window, from 0.0 to 1.0
     * @var float
     */
    public $opacity = 1.0;

    /**
     * UIWindow constructor.
     * @param null|UIDisplay $display
     */
    public function __construct(?UIDisplay $display = null)
    {
    }

    /**
     * Set center position on monitor.
     */
    public function center()
    {
    }

    /**
     * Open the window.
     */
    public function open()
    {
    }

    /**
     * Close the window.
     */
    public function close()
    {
    }
}