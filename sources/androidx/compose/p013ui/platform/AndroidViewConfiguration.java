package androidx.compose.p013ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidViewConfiguration;", "Landroidx/compose/ui/platform/ViewConfiguration;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidViewConfiguration implements ViewConfiguration {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f19309a;

    public AndroidViewConfiguration(ViewConfiguration viewConfiguration) {
        this.f19309a = viewConfiguration;
    }

    @Override // androidx.compose.p013ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: a */
    public final long mo5828a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.p013ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: b */
    public final long mo5829b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.p013ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: c */
    public final float mo6097c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1315k.m6248a(this.f19309a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.p013ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: e */
    public final float mo6098e() {
        return this.f19309a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.p013ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: f */
    public final float mo5831f() {
        return this.f19309a.getScaledTouchSlop();
    }

    @Override // androidx.compose.p013ui.platform.ViewConfiguration
    /* JADX INFO: renamed from: g */
    public final float mo6099g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC1315k.m6249b(this.f19309a);
        }
        return 16.0f;
    }
}
