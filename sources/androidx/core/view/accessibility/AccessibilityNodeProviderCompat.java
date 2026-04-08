package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeProvider f23529a;

    /* JADX INFO: compiled from: Proguard */
    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a */
        public final AccessibilityNodeProviderCompat f23530a;

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f23530a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatMo6066b = this.f23530a.mo6066b(i);
            if (accessibilityNodeInfoCompatMo6066b == null) {
                return null;
            }
            return accessibilityNodeInfoCompatMo6066b.f23504a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List findAccessibilityNodeInfosByText(String str, int i) {
            this.f23530a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatMo6067c = this.f23530a.mo6067c(i);
            if (accessibilityNodeInfoCompatMo6067c == null) {
                return null;
            }
            return accessibilityNodeInfoCompatMo6067c.f23504a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f23530a.mo6068d(i, i2, bundle);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f23530a.mo6065a(i, new AccessibilityNodeInfoCompat(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f23529a = new AccessibilityNodeProviderApi26(this);
        } else {
            this.f23529a = new AccessibilityNodeProviderApi19(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public AccessibilityNodeInfoCompat mo6066b(int i) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public AccessibilityNodeInfoCompat mo6067c(int i) {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo6068d(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f23529a = accessibilityNodeProvider;
    }

    /* JADX INFO: renamed from: a */
    public void mo6065a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }
}
