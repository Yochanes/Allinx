package androidx.compose.p013ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/platform/AccessibilityManager;", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidAccessibilityManager implements AccessibilityManager {

    /* JADX INFO: renamed from: a */
    public final AccessibilityManager f19038a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidAccessibilityManager$Companion;", "", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public AndroidAccessibilityManager(Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f19038a = (AccessibilityManager) systemService;
    }

    @Override // androidx.compose.p013ui.platform.AccessibilityManager
    /* JADX INFO: renamed from: a */
    public final long mo5992a(long j, boolean z2) {
        if (j >= 2147483647L) {
            return j;
        }
        int i = z2 ? 7 : 3;
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f19038a;
        if (i2 >= 29) {
            int iM6100a = Api29Impl.m6100a(accessibilityManager, (int) j, i);
            if (iM6100a != Integer.MAX_VALUE) {
                return iM6100a;
            }
        } else if (!z2 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j;
        }
        return Long.MAX_VALUE;
    }
}
