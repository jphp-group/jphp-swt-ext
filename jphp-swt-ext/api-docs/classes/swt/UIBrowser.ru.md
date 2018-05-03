# UIBrowser

- **класс** `UIBrowser` (`swt\UIBrowser`) **унаследован от** [`UIControl`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIControl.ru.md)
- **исходники** `swt/UIBrowser.php`

**Описание**

Браузер для просмотра web страниц, базируется на системном браузере операционной системы:

- Для Windows это Internet Explorer.
- Для Linux это Mozilla.
- Для MacOS это WebKit.

---

#### Свойства

- `->`[`browserType`](#prop-browsertype) : `string` - _Browser Type, eg: `ie` - internet explorer._
- `->`[`url`](#prop-url) : `string` - _Текущий url браузера._
- `->`[`html`](#prop-html) : `string` - _Html контент в виде строки._
- *См. также в родительском классе* [UIControl](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIControl.ru.md).

---

#### Методы

- `->`[`__construct()`](#method-__construct) - _UIBrowser constructor._
- См. также в родительском классе [UIControl](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIControl.ru.md)

---
# Методы

<a name="method-__construct"></a>

### __construct()
```php
__construct(swt\UIComposite $owner): void
```
UIBrowser constructor.
If browser is not available on OS than will be an ui exception.