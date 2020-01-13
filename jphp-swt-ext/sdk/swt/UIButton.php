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
    const PUSH = 8;
    const ARROW = 4;
    const CHECK = 32;
    const RADIO = 16;
    const TOGGLE = 2;
    const FLAT = 8388608;
    const WRAP = 64;

    /**
     * @var string
     */
    public $text = '';

    /**
     * UIButton constructor.
     * @param UIComposite $owner
     * @param int $type
     */
    public function __construct(UIComposite $owner, int $type = self::PUSH)
    {
    }
}