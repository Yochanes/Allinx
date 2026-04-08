package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerCompat {

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public interface AccessibilityStateChangeListener {
    }

    /* JADX INFO: compiled from: Proguard */
    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AccessibilityStateChangeListenerWrapper implements AccessibilityManager.AccessibilityStateChangeListener {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccessibilityStateChangeListenerWrapper)) {
                return false;
            }
            ((AccessibilityStateChangeListenerWrapper) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z2) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z2);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TouchExplorationStateChangeListenerWrapper implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final TouchExplorationStateChangeListener f23502a;

        public TouchExplorationStateChangeListenerWrapper(TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f23502a = touchExplorationStateChangeListener;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TouchExplorationStateChangeListenerWrapper) {
                return this.f23502a.equals(((TouchExplorationStateChangeListenerWrapper) obj).f23502a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f23502a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z2) {
            this.f23502a.onTouchExplorationStateChanged(z2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m8002a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        accessibilityManager.addTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
    }

    /* JADX INFO: renamed from: b */
    public static void m8003b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new TouchExplorationStateChangeListenerWrapper(touchExplorationStateChangeListener));
    }
}
