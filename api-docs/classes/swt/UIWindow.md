# UIWindow

- **class** `UIWindow` (`swt\UIWindow`) **extends** [`UIComposite`](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIComposite.md)
- **source** `swt/UIWindow.php`

**Description**

Window

---

#### Properties

- `->`[`title`](#prop-title) : `string` - _Title text of the window._
- `->`[`maximized`](#prop-maximized) : `bool`
- `->`[`fullscreen`](#prop-fullscreen) : `bool`
- `->`[`opacity`](#prop-opacity) : `float` - _Alpha of window, from 0.0 to 1.0_
- *See also in the parent class* [UIComposite](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIComposite.md).

---

#### Methods

- `->`[`__construct()`](#method-__construct) - _UIWindow constructor._
- `->`[`center()`](#method-center) - _Set center position on monitor._
- `->`[`open()`](#method-open) - _Open the window._
- `->`[`close()`](#method-close) - _Close the window._
- See also in the parent class [UIComposite](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIComposite.md)

---
# Methods

<a name="method-__construct"></a>

### __construct()
```php
__construct([ swt\UIDisplay $display): void
```
UIWindow constructor.

---

<a name="method-center"></a>

### center()
```php
center(): void
```
Set center position on monitor.

---

<a name="method-open"></a>

### open()
```php
open(): void
```
Open the window.

---

<a name="method-close"></a>

### close()
```php
close(): void
```
Close the window.