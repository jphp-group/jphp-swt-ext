# UIWidget

- **класс** `UIWidget` (`swt\UIWidget`)
- **исходники** `swt/UIWidget.php`

**Классы наследники**

> [UIControl](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIControl.ru.md)

**Описание**

Базовый класс для всех UI виджетов (компонентов).

---

#### Свойства

- `->`[`display`](#prop-display) : [`UIDisplay`](https://github.com/jphp-compiler/jphp/blob/master/api-docs/classes/swt/UIDisplay.ru.md)

---

#### Методы

- `->`[`free()`](#method-free) - _Уничтожить виджет._
- `->`[`isFree()`](#method-isfree) - _Проверить, уничтожен ли виджет._
- `->`[`data()`](#method-data) - _Задать или достать дополнительные данные из виджета._
- `->`[`bind()`](#method-bind) - _Добавить обработчик события виджету._
- `->`[`unbind()`](#method-unbind) - _Удалить все обработчики события виджета._
- `->`[`trigger()`](#method-trigger) - _Вызвать все обработчики события виджета._

---
# Методы

<a name="method-free"></a>

### free()
```php
free(): void
```
Уничтожить виджет.

---

<a name="method-isfree"></a>

### isFree()
```php
isFree(): bool
```
Проверить, уничтожен ли виджет.

---

<a name="method-data"></a>

### data()
```php
data(string $name, mixed $value): void|mixed
```
Задать или достать дополнительные данные из виджета.

---

<a name="method-bind"></a>

### bind()
```php
bind(string $event, callable $handler): void
```
Добавить обработчик события виджету.

---

<a name="method-unbind"></a>

### unbind()
```php
unbind(string $event): void
```
Удалить все обработчики события виджета.

---

<a name="method-trigger"></a>

### trigger()
```php
trigger(string $event): void
```
Вызвать все обработчики события виджета.