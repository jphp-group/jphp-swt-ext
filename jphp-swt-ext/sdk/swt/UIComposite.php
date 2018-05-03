<?php
namespace swt;

/**
 *
 * @package swt
 */
abstract class UIComposite extends UIControl
{
    /**
     * @var UIControl[]
     */
    public $children = [];
}