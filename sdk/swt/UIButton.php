<?php
namespace swt;

/**
 * Simple Button.
 *
 * Events:
 * - `action` - on click button.
 *
 * @package swt
 */
class UIButton extends UIControl
{
    /**
     * @var string
     */
    public $text = '';

    /**
     * UIButton constructor.
     * @param UIComposite $owner
     */
    public function __construct(UIComposite $owner)
    {
    }
}