package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry$register$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "activity-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {

    /* JADX INFO: renamed from: a */
    public final ActivityResultLauncherHolder f156a;

    /* JADX INFO: renamed from: b */
    public final MutableState f157b;

    public ManagedActivityResultLauncher(ActivityResultLauncherHolder activityResultLauncherHolder, MutableState mutableState) {
        this.f156a = activityResultLauncherHolder;
        this.f157b = mutableState;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    /* JADX INFO: renamed from: a */
    public final void mo180a(Object obj) {
        Unit unit;
        ActivityResultRegistry$register$3 activityResultRegistry$register$3 = this.f156a.f128a;
        if (activityResultRegistry$register$3 != null) {
            activityResultRegistry$register$3.mo180a(obj);
            unit = Unit.f51459a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
