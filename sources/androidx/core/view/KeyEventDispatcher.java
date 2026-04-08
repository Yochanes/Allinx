package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.exchange.allin.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class KeyEventDispatcher {

    /* JADX INFO: renamed from: a */
    public static boolean f23371a = false;

    /* JADX INFO: renamed from: b */
    public static Method f23372b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f23373c = false;

    /* JADX INFO: renamed from: d */
    public static Field f23374d;

    /* JADX INFO: compiled from: Proguard */
    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7728a(View view, KeyEvent keyEvent) {
        int iIndexOfKey;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = ViewCompat.UnhandledKeyEventManager.f23419d;
        ViewCompat.UnhandledKeyEventManager unhandledKeyEventManager = (ViewCompat.UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (unhandledKeyEventManager == null) {
            unhandledKeyEventManager = new ViewCompat.UnhandledKeyEventManager();
            unhandledKeyEventManager.f23420a = null;
            unhandledKeyEventManager.f23421b = null;
            unhandledKeyEventManager.f23422c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
        }
        WeakReference weakReference2 = unhandledKeyEventManager.f23422c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        unhandledKeyEventManager.f23422c = new WeakReference(keyEvent);
        if (unhandledKeyEventManager.f23421b == null) {
            unhandledKeyEventManager.f23421b = new SparseArray();
        }
        SparseArray sparseArray = unhandledKeyEventManager.f23421b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            ViewCompat.UnhandledKeyEventManager.m7853b(view2, keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7729b(Component component, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (component != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return component.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f23371a) {
                            try {
                                f23372b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f23371a = true;
                        }
                        Method method = f23372b;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (ViewCompat.m7785d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f23373c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f23374d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f23373c = true;
                }
                Field field = f23374d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (ViewCompat.m7785d(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && ViewCompat.m7785d(view, keyEvent)) || component.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
