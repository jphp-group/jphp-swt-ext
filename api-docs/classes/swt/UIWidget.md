# UIWidget

- **class** `UIWidget` (`swt\UIWidget`)
- **source** `swt/UIWidget.php`

**Child Classes**

> [UIControl](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIControl.md)

**Description**

Basic class for all UI widgets.

---

#### Properties

- `->`[`display`](#prop-display) : [`UIDisplay`](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIDisplay.md)

---

#### Methods

- `->`[`free()`](#method-free) - _Dispose the widget._
- `->`[`isFree()`](#method-isfree) - _Check that the widget is disposed._
- `->`[`data()`](#method-data) - _Set or get additional data for the widget._
- `->`[`bind()`](#method-bind) - _Add event handler to widget._
- `->`[`unbind()`](#method-unbind) - _Remove all event handlers from widget._
- `->`[`trigger()`](#method-trigger) - _Trigger event with all its handlers._

---
# Methods

<a name="method-free"></a>

### free()
```php
free(): void
```
Dispose the widget.

---

<a name="method-isfree"></a>

### isFree()
```php
isFree(): bool
```
Check that the widget is disposed.

---

<a name="method-data"></a>

### data()
```php
data(string $name, mixed $value): void|mixed
```
Set or get additional data for the widget.

---

<a name="method-bind"></a>

### bind()
```php
bind(string $event, callable $handler): void
```
Add event handler to widget.

---

<a name="method-unbind"></a>

### unbind()
```php
unbind(string $event): void
```
Remove all event handlers from widget.

---

<a name="method-trigger"></a>

### trigger()
```php
trigger(string $event): void
```
Trigger event with all its handlers.