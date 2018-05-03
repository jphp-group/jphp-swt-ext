# UIControl

- **класс** `UIControl` (`swt\UIControl`) **унаследован от** [`UIWidget`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIWidget.ru.md)
- **исходники** `swt/UIControl.php`

**Классы наследники**

> [UIBrowser](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIBrowser.ru.md), [UIButton](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIButton.ru.md), [UIComposite](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.ru.md)

---

#### Свойства

- `->`[`visible`](#prop-visible) : `bool` - _Видимость_
- `->`[`enabled`](#prop-enabled) : `bool` - _Доступность_
- `->`[`size`](#prop-size) : `array` - _Размеры (Ширина и Высота)_
- `->`[`position`](#prop-position) : `array` - _Позиция X и Y_
- `->`[`focused`](#prop-focused) : `bool` - _Находится ли фокус на компоненте._
- `->`[`parent`](#prop-parent) : [`UIComposite`](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIComposite.ru.md)
- *См. также в родительском классе* [UIWidget](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIWidget.ru.md).

---

#### Методы

- `->`[`pack()`](#method-pack) - _Пересчитать предпочитаемые размеры._
- `->`[`requestFocus()`](#method-requestfocus) - _Causes the receiver to have the keyboard focus, such that all keyboard events will be delivered to it._
- См. также в родительском классе [UIWidget](https://github.com/jphp-compiler/jphp-swt-ext/blob/master/jphp-swt-ext/api-docs/classes/swt/UIWidget.ru.md)

---
# Методы

<a name="method-pack"></a>

### pack()
```php
pack(): void
```
Пересчитать предпочитаемые размеры.

---

<a name="method-requestfocus"></a>

### requestFocus()
```php
requestFocus(): void
```
Causes the receiver to have the keyboard focus, such that all keyboard events will be delivered to it.