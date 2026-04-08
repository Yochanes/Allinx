package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.ReportFragment;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/lifecycle/LifecycleDispatcher;", "", "DispatcherActivityCallback", "lifecycle-process_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class LifecycleDispatcher {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f24891a = new AtomicBoolean(false);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m18302d2 = {"Landroidx/lifecycle/LifecycleDispatcher$DispatcherActivityCallback;", "Landroidx/lifecycle/EmptyActivityLifecycleCallbacks;", "<init>", "()V", "onActivityCreated", "", MTCommonConstants.Lifecycle.KEY_ACTIVITY, "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "lifecycle-process_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @VisibleForTesting
    public static final class DispatcherActivityCallback extends EmptyActivityLifecycleCallbacks {
        @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            ReportFragment.Companion.m9160b(activity);
        }
    }
}
