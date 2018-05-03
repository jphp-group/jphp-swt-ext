<?php
namespace swt;

/**
 * Displays are parent for widgets.
 * @package swt
 */
class UIDisplay
{
    /**
     * @var array
     */
    public $cursorPosition = [0, 0];

    /**
     * Play system beep sound.
     */
    public function beep()
    {
    }

    /**
     * Returns the display which the currently running thread is the user-interface thread for,
     * or null if the currently running thread is not a user-interface thread for any display.
     * @return null|UIDisplay
     */
    public static function getCurrent(): ?UIDisplay
    {
    }

    /**
     * Returns the default display. One is created (making the thread that invokes this method its user-interface thread)
     * if it did not already exist.
     * @return UIDisplay
     */
    public static function getDefault(): UIDisplay
    {
    }

    /**
     * Returns true if the device has been disposed, and false otherwise.
     * @return bool
     */
    public function isFree(): bool
    {
    }

    /**
     * Free display.
     */
    public function free()
    {
    }

    /**
     * Requests that the connection between SWT and the underlying operating system be closed.
     */
    public function close()
    {
    }

    /**
     * Reads an event from the operating system's event queue, dispatches it appropriately, and returns true if there
     * is potentially more work to do, or false if the caller can sleep until another event is placed on the event queue.
     *
     * @return bool
     */
    public function readAndDispatch(): bool
    {
    }

    /**
     * Causes the user-interface thread to sleep (that is, to be put in a state where it does not consume CPU cycles)
     * until an event is received or it is otherwise awakened.
     */
    public function sleep()
    {
    }

    /**
     * If the receiver's user-interface thread was sleeping, causes it to be awakened and start running again.
     * Note that this method may be called from any thread.
     */
    public function wake()
    {
    }

    /**
     * Forces all outstanding paint requests for the display to be processed before this method returns.
     */
    public function update()
    {
    }
}