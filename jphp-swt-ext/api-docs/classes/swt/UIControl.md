# UIControl

- **class** `UIControl` (`swt\UIControl`) **extends** [`UIWidget`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIWidget.md)
- **source** `swt/UIControl.php`

**Child Classes**

> [UIBrowser](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIBrowser.md), [UIButton](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIButton.md), [UIComposite](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.md)

---

#### Properties

- `->`[`visible`](#prop-visible) : `bool` - _Visible_
- `->`[`enabled`](#prop-enabled) : `bool` - _Enabled_
- `->`[`size`](#prop-size) : `array` - _Size (Width and Height)_
- `->`[`position`](#prop-position) : `array` - _Position X, Y_
- `->`[`focused`](#prop-focused) : `bool` - _Is focused control?_
- `->`[`parent`](#prop-parent) : [`UIComposite`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.md)
- *See also in the parent class* [UIWidget](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIWidget.md).

---

#### Methods

- `->`[`pack()`](#method-pack) - _Causes the receiver to be resized to its preferred size._
- `->`[`requestFocus()`](#method-requestfocus) - _Causes the receiver to have the keyboard focus, such that all keyboard events will be delivered to it._
- See also in the parent class [UIWidget](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIWidget.md)

---
# Methods

<a name="method-pack"></a>

### pack()
```php
pack(): void
```
Causes the receiver to be resized to its preferred size.

---

<a name="method-requestfocus"></a>

### requestFocus()
```php
requestFocus(): void
```
Causes the receiver to have the keyboard focus, such that all keyboard events will be delivered to it.