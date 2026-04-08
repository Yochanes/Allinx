package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {

    /* JADX INFO: renamed from: a */
    public final AccessibilityWindowInfo f23531a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
        /* JADX INFO: renamed from: a */
        public static LocaleList m8035a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        /* JADX INFO: renamed from: b */
        public static long m8036b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat(AccessibilityWindowInfo accessibilityWindowInfo) {
        this.f23531a = accessibilityWindowInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        return this.f23531a.equals(((AccessibilityWindowInfoCompat) obj).f23531a);
    }

    public final int hashCode() {
        return this.f23531a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        AccessibilityWindowInfo accessibilityWindowInfo = this.f23531a;
        accessibilityWindowInfo.getBoundsInScreen(rect);
        sb.append(accessibilityWindowInfo.getId());
        sb.append(", type=");
        int type = accessibilityWindowInfo.getType();
        sb.append(type != 1 ? type != 2 ? type != 3 ? type != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION");
        sb.append(", layer=");
        sb.append(accessibilityWindowInfo.getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(accessibilityWindowInfo.isFocused());
        sb.append(", active=");
        sb.append(accessibilityWindowInfo.isActive());
        sb.append(", hasParent=");
        AccessibilityWindowInfo parent = accessibilityWindowInfo.getParent();
        sb.append((parent != null ? new AccessibilityWindowInfoCompat(parent) : null) != null);
        sb.append(", hasChildren=");
        sb.append(accessibilityWindowInfo.getChildCount() > 0);
        sb.append(", transitionTime=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 34 ? Api34Impl.m8036b(accessibilityWindowInfo) : 0L);
        sb.append(", locales=");
        sb.append(i >= 34 ? LocaleListCompat.m7652f(Api34Impl.m8035a(accessibilityWindowInfo)) : LocaleListCompat.f23258b);
        sb.append(']');
        return sb.toString();
    }
}
