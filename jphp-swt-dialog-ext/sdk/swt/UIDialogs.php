<?php
namespace swt;

/**
 * Class UIDialogs
 * @package swt
 */
class UIDialogs
{
    /**
     * @param string $title
     * @param string $message
     * @param UIWindow|null $window
     */
    static function info(string $title, string $message, UIWindow $window = null): void
    {
    }

    /**
     * @param string $title
     * @param string $message
     * @param UIWindow|null $window
     */
    static function error(string $title, string $message, UIWindow $window = null): void
    {
    }

    /**
     * @param string $title
     * @param string $message
     * @param UIWindow|null $window
     * @return bool
     */
    static function confirm(string $title, string $message, UIWindow $window = null): bool
    {
    }
}