# UIDisplay

- **class** `UIDisplay` (`swt\UIDisplay`)
- **source** `swt/UIDisplay.php`

**Description**

Displays are parent for widgets.

---

#### Properties

- `->`[`cursorPosition`](#prop-cursorposition) : `array`

---

#### Static Methods

- `UIDisplay ::`[`getCurrent()`](#method-getcurrent) - _Returns the display which the currently running thread is the user-interface thread for,_
- `UIDisplay ::`[`getDefault()`](#method-getdefault) - _Returns the default display. One is created (making the thread that invokes this method its user-interface thread)_

---

#### Methods

- `->`[`beep()`](#method-beep) - _Play system beep sound._
- `->`[`isFree()`](#method-isfree) - _Returns true if the device has been disposed, and false otherwise._
- `->`[`free()`](#method-free) - _Free display._
- `->`[`close()`](#method-close) - _Requests that the connection between SWT and the underlying operating system be closed._
- `->`[`readAndDispatch()`](#method-readanddispatch) - _Reads an event from the operating system's event queue, dispatches it appropriately, and returns true if there_
- `->`[`sleep()`](#method-sleep) - _Causes the user-interface thread to sleep (that is, to be put in a state where it does not consume CPU cycles)_
- `->`[`wake()`](#method-wake) - _If the receiver's user-interface thread was sleeping, causes it to be awakened and start running again._
- `->`[`update()`](#method-update) - _Forces all outstanding paint requests for the display to be processed before this method returns._

---
# Static Methods

<a name="method-getcurrent"></a>

### getCurrent()
```php
UIDisplay::getCurrent(): swt\UIDisplay
```
Returns the display which the currently running thread is the user-interface thread for,
or null if the currently running thread is not a user-interface thread for any display.

---

<a name="method-getdefault"></a>

### getDefault()
```php
UIDisplay::getDefault(): swt\UIDisplay
```
Returns the default display. One is created (making the thread that invokes this method its user-interface thread)
if it did not already exist.

---
# Methods

<a name="method-beep"></a>

### beep()
```php
beep(): void
```
Play system beep sound.

---

<a name="method-isfree"></a>

### isFree()
```php
isFree(): bool
```
Returns true if the device has been disposed, and false otherwise.

---

<a name="method-free"></a>

### free()
```php
free(): void
```
Free display.

---

<a name="method-close"></a>

### close()
```php
close(): void
```
Requests that the connection between SWT and the underlying operating system be closed.

---

<a name="method-readanddispatch"></a>

### readAndDispatch()
```php
readAndDispatch(): bool
```
Reads an event from the operating system's event queue, dispatches it appropriately, and returns true if there
is potentially more work to do, or false if the caller can sleep until another event is placed on the event queue.

---

<a name="method-sleep"></a>

### sleep()
```php
sleep(): void
```
Causes the user-interface thread to sleep (that is, to be put in a state where it does not consume CPU cycles)
until an event is received or it is otherwise awakened.

---

<a name="method-wake"></a>

### wake()
```php
wake(): void
```
If the receiver's user-interface thread was sleeping, causes it to be awakened and start running again.
Note that this method may be called from any thread.

---

<a name="method-update"></a>

### update()
```php
update(): void
```
Forces all outstanding paint requests for the display to be processed before this method returns.