package androidx.appcompat.view;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class WindowCallbackWrapper implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f727a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m428a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static android.view.ActionMode m429b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m430a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m431a(Window.Callback callback, boolean z2) {
            callback.onPointerCaptureChanged(z2);
        }
    }

    public WindowCallbackWrapper(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f727a = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f727a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f727a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f727a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f727a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f727a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f727a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode actionMode) {
        this.f727a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode actionMode) {
        this.f727a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f727a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f727a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f727a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f727a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f727a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f727a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f727a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f727a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        Api26Impl.m431a(this.f727a, z2);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f727a.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        Api24Impl.m430a(this.f727a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return Api23Impl.m428a(this.f727a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f727a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f727a.onWindowFocusChanged(z2);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f727a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f727a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return Api23Impl.m429b(this.f727a, callback, i);
    }
}
