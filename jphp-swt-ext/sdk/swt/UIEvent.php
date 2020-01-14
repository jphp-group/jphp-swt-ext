<?php

namespace swt;

class UIEvent {

    /**
     * @var UIDisplay
     */
    public $display;

    /**
     * @var UIWidget
     */
    public $widget;

    /**
     * @var int
     */
    public $x, $y;

    /**
     * @var int
     */
    public $width, $height;

    /**
     * @var int
     */
    public $count;

    /**
     * @var int
     */
    public $time;

    /**
     * @var int
     */
    public $button;

    /**
     * @var string
     */
    public $character, $text;

    /**
     * @var int
     */
    public $keyCode, $KeyLocation;

    /**
     * @var int
     */
    public $stateMask;

    /**
     * @var int
     */
    public $start, $end;

    /**
     * @var mixed
     */
    public $data;

    /**
     * @var int
     */
    public $xDirection, $yDirection;

    /**
     * @var int
     */
    public $magnification, $rotation;
}
