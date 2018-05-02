# UIBrowser

- **class** `UIBrowser` (`swt\UIBrowser`) **extends** [`UIControl`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/api-docs/classes/swt/UIControl.md)
- **source** `swt/UIBrowser.php`

**Description**

Browser for web pages based on System OS Browser.

- For Windows is Internet Explorer.
- For Linux is Mozilla.
- For MacOS is WebKit.


---

#### Properties

- `->`[`browserType`](#prop-browsertype) : `string` - _Browser Type, eg: `ie` - internet explorer._
- `->`[`url`](#prop-url) : `string` - _Current url of browser._
- `->`[`html`](#prop-html) : `string` - _Html content as string._
- *See also in the parent class* [UIControl](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/api-docs/classes/swt/UIControl.md).

---

#### Methods

- `->`[`__construct()`](#method-__construct) - _UIBrowser constructor._
- See also in the parent class [UIControl](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/api-docs/classes/swt/UIControl.md)

---
# Methods

<a name="method-__construct"></a>

### __construct()
```php
__construct(swt\UIComposite $owner): void
```
UIBrowser constructor.
If browser is not available on OS than will be an ui exception.