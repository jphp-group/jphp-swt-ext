<?php
namespace swt;

/**
 * Basic class for all UI widgets.
 * --RU--
 * Базовый класс для всех UI виджетов (компонентов).
 *
 * Events:
 *  - `paint` - on widget painted.
 *  - `keyUp`
 *  - `keyDown`
 *
 * @package swt
 */
abstract class UIWidget
{
    /**
     * @readonly
     * @var UIDisplay
     */
    public $display;


    /**
     * Dispose the widget.
     * --RU--
     * Уничтожить виджет.
     */
    public function free()
    {
    }

    /**
     * Check that the widget is disposed.
     * --RU--
     * Проверить, уничтожен ли виджет.
     *
     * @return bool
     */
    public function isFree(): bool
    {
    }

    /**
     * Set or get additional data for the widget.
     * --RU--
     * Задать или достать дополнительные данные из виджета.
     *
     * @param string $name
     * @param mixed $value [optional]
     * @return void|mixed
     */
    public function data(string $name, $value)
    {
    }

    /**
     * Add event handler to widget.
     * --RU--
     * Добавить обработчик события виджету.
     *
     * @param string $event
     * @param callable $handler
     *
     * @throws UIException
     */
    public function bind(string $event, callable $handler)
    {
    }

    /**
     * Remove all event handlers from widget.
     * --RU--
     * Удалить все обработчики события виджета.
     *
     * @param string $event
     */
    public function unbind(string $event)
    {
    }

    /**
     * Trigger event with all its handlers.
     * --RU--
     * Вызвать все обработчики события виджета.
     *
     * @param string $event
     */
    public function trigger(string $event)
    {
    }
}