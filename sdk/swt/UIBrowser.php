<?php
namespace swt;

/**
 * Browser for web pages based on System OS Browser.
 *
 * - For Windows is Internet Explorer.
 * - For Linux is Mozilla.
 * - For MacOS is WebKit.
 *
 * --RU--
 * Браузер для просмотра web страниц, базируется на системном браузере операционной системы:
 *
 * - Для Windows это Internet Explorer.
 * - Для Linux это Mozilla.
 * - Для MacOS это WebKit.
 *
 * @package swt
 */
class UIBrowser extends UIControl
{
    /**
     * Browser Type, eg: `ie` - internet explorer.
     * @readonly
     * @var string
     */
    public $browserType;

    /**
     * Current url of browser.
     * --RU--
     * Текущий url браузера.
     *
     * @var string
     */
    public $url = '';

    /**
     * Html content as string.
     * --RU--
     * Html контент в виде строки.
     *
     * @var string
     */
    public $html = '';

    /**
     * UIBrowser constructor.
     * If browser is not available on OS than will be an ui exception.
     *
     * @param UIComposite $owner
     * @throws UIException
     */
    public function __construct(UIComposite $owner)
    {
    }
}