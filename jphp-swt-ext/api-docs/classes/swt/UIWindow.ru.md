# UIWindow

- **класс** `UIWindow` (`swt\UIWindow`) **унаследован от** [`UIComposite`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.ru.md)
- **исходники** `swt/UIWindow.php`

**Описание**

Window

---

#### Свойства

- `->`[`title`](#prop-title) : `string` - _Title text of the window._
- `->`[`maximized`](#prop-maximized) : `bool`
- `->`[`fullscreen`](#prop-fullscreen) : `bool`
- `->`[`opacity`](#prop-opacity) : `float` - _Alpha of window, from 0.0 to 1.0_
- *См. также в родительском классе* [UIComposite](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.ru.md).

---

#### Методы

- `->`[`__construct()`](#method-__construct) - _UIWindow constructor._
- `->`[`center()`](#method-center) - _Set center position on monitor._
- `->`[`open()`](#method-open) - _Open the window._
- `->`[`close()`](#method-close) - _Close the window._
- См. также в родительском классе [UIComposite](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.ru.md)

---
# Методы

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