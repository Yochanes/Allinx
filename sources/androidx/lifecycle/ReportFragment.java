package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC1477j;
import androidx.lifecycle.Lifecycle;
import com.engagelab.privates.common.constants.MTCommonConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m18302d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "ActivityInitializationListener", "LifecycleCallbacks", "Companion", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@RestrictTo
public class ReportFragment extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f24972b = 0;

    /* JADX INFO: renamed from: a */
    public ProcessLifecycleOwner$initializationListener$1 f24973a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/lifecycle/ReportFragment$ActivityInitializationListener;", "", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface ActivityInitializationListener {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/lifecycle/ReportFragment$Companion;", "", "", "REPORT_FRAGMENT_TAG", "Ljava/lang/String;", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static void m9159a(Activity activity, Lifecycle.Event event) {
            Intrinsics.m18599g(event, "event");
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).getLifecycle().m9132f(event);
            } else if (activity instanceof LifecycleOwner) {
                Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) lifecycle).m9132f(event);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m9160b(Activity activity) {
            if (Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.INSTANCE.getClass();
                AbstractC1477j.m8139j(activity, new LifecycleCallbacks());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0018"}, m18302d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "onActivityCreated", "", MTCommonConstants.Lifecycle.KEY_ACTIVITY, "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "onActivityPostCreated", "savedInstanceState", "onActivityStarted", "onActivityPostStarted", "onActivityResumed", "onActivityPostResumed", "onActivityPrePaused", "onActivityPaused", "onActivityPreStopped", "onActivityStopped", "onActivitySaveInstanceState", "onActivityPreDestroyed", "onActivityDestroyed", "Companion", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @RequiresApi
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/ReportFragment$LifecycleCallbacks$Companion;", "", "lifecycle-runtime_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }

        @JvmStatic
        public static final void registerIn(@NotNull Activity activity) {
            INSTANCE.getClass();
            Intrinsics.m18599g(activity, "activity");
            AbstractC1477j.m8139j(activity, new LifecycleCallbacks());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.m18599g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            Companion.m9159a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            Companion.m9159a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            Companion.m9159a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            Companion.m9159a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            Companion.m9159a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
            int i = ReportFragment.f24972b;
            Companion.m9159a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            Intrinsics.m18599g(activity, "activity");
            Intrinsics.m18599g(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.m18599g(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9158a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Intrinsics.m18598f(activity, "getActivity(...)");
            Companion.m9159a(activity, event);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m9158a(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m9158a(Lifecycle.Event.ON_DESTROY);
        this.f24973a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m9158a(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        ProcessLifecycleOwner$initializationListener$1 processLifecycleOwner$initializationListener$1 = this.f24973a;
        if (processLifecycleOwner$initializationListener$1 != null) {
            processLifecycleOwner$initializationListener$1.f24941a.m9155a();
        }
        m9158a(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        ProcessLifecycleOwner$initializationListener$1 processLifecycleOwner$initializationListener$1 = this.f24973a;
        if (processLifecycleOwner$initializationListener$1 != null) {
            ProcessLifecycleOwner processLifecycleOwner = processLifecycleOwner$initializationListener$1.f24941a;
            int i = processLifecycleOwner.f24933a + 1;
            processLifecycleOwner.f24933a = i;
            if (i == 1 && processLifecycleOwner.f24936d) {
                processLifecycleOwner.f24938g.m9132f(Lifecycle.Event.ON_START);
                processLifecycleOwner.f24936d = false;
            }
        }
        m9158a(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m9158a(Lifecycle.Event.ON_STOP);
    }
}
