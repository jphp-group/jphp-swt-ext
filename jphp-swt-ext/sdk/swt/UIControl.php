<?php
namespace swt;

/**
 * @package swt
 */
abstract class UIControl extends UIWidget
{
    /**
     * Visible
     * --RU--
     * Видимость
     *
     * @var bool
     */
    public $visible = true;

    /**
     * Enabled
     * --RU--
     * Доступность
     *
     * @var bool
     */
    public $enabled = true;

    /**
     * Size (Width and Height)
     * --RU--
     * Размеры (Ширина и Высота)
     *
     * @var array
     */
    public $size = [0, 0];

    /**
     * Position X, Y
     * --RU--
     * Позиция X и Y
     *
     * @var array
     */
    public $position = [0, 0];

    /**
     * Is focused control?
     * --RU--
     * Находится ли фокус на компоненте.
     *
     * @readonly
     * @var bool
     */
    public $focused = false;

    /**
     * @var UIComposite
     */
    public $parent;

    /**
     * Causes the receiver to be resized to its preferred size.
     * --RU--
     * Пересчитать предпочитаемые размеры.
     */
    public function pack()
    {
    }

    /**
     * Causes the receiver to have the keyboard focus, such that all keyboard events will be delivered to it.
     */
    public function requestFocus()
    {
    }
}