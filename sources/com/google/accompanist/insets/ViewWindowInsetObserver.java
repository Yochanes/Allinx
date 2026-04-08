package com.google.accompanist.insets;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.analytics.C1789g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Deprecated
@Metadata(m18301d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0017\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m18302d2 = {"Lcom/google/accompanist/insets/ViewWindowInsetObserver;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "attachListener", "com/google/accompanist/insets/ViewWindowInsetObserver$attachListener$1", "Lcom/google/accompanist/insets/ViewWindowInsetObserver$attachListener$1;", "<set-?>", "", "isObserving", "isObserving$annotations", "()V", "()Z", "observeInto", "", "windowInsets", "Lcom/google/accompanist/insets/RootWindowInsets;", "consumeWindowInsets", "windowInsetsAnimationsEnabled", "observeInto$insets_release", OpsMetricTracker.START, "Lcom/google/accompanist/insets/WindowInsets;", "stop", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ViewWindowInsetObserver {
    public static final int $stable = 8;

    @NotNull
    private final ViewWindowInsetObserver$attachListener$1 attachListener;
    private boolean isObserving;

    @NotNull
    private final View view;

    public ViewWindowInsetObserver(@NotNull View view) {
        Intrinsics.m18599g(view, "view");
        this.view = view;
        this.attachListener = new ViewWindowInsetObserver$attachListener$1();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WindowInsetsCompat m14405a(RootWindowInsets rootWindowInsets, boolean z2, View view, WindowInsetsCompat windowInsetsCompat) {
        return observeInto$lambda$7(rootWindowInsets, z2, view, windowInsetsCompat);
    }

    private static final WindowInsetsCompat observeInto$lambda$7(RootWindowInsets windowInsets, boolean z2, View view, WindowInsetsCompat wic) {
        Intrinsics.m18599g(windowInsets, "$windowInsets");
        Intrinsics.m18599g(view, "<anonymous parameter 0>");
        Intrinsics.m18599g(wic, "wic");
        MutableWindowInsetsType statusBars = windowInsets.getStatusBars();
        MutableInsets layoutInsets = statusBars.getLayoutInsets();
        androidx.core.graphics.Insets insetsM7898e = wic.m7898e(1);
        Intrinsics.m18598f(insetsM7898e, "wic.getInsets(WindowInse…Compat.Type.statusBars())");
        InsetsKt.updateFrom(layoutInsets, insetsM7898e);
        statusBars.setVisible(wic.m7909q(1));
        MutableWindowInsetsType navigationBars = windowInsets.getNavigationBars();
        MutableInsets layoutInsets2 = navigationBars.getLayoutInsets();
        androidx.core.graphics.Insets insetsM7898e2 = wic.m7898e(2);
        Intrinsics.m18598f(insetsM7898e2, "wic.getInsets(WindowInse…at.Type.navigationBars())");
        InsetsKt.updateFrom(layoutInsets2, insetsM7898e2);
        navigationBars.setVisible(wic.m7909q(2));
        MutableWindowInsetsType systemGestures = windowInsets.getSystemGestures();
        MutableInsets layoutInsets3 = systemGestures.getLayoutInsets();
        androidx.core.graphics.Insets insetsM7898e3 = wic.m7898e(16);
        Intrinsics.m18598f(insetsM7898e3, "wic.getInsets(WindowInse…at.Type.systemGestures())");
        InsetsKt.updateFrom(layoutInsets3, insetsM7898e3);
        systemGestures.setVisible(wic.m7909q(16));
        MutableWindowInsetsType ime = windowInsets.getIme();
        MutableInsets layoutInsets4 = ime.getLayoutInsets();
        androidx.core.graphics.Insets insetsM7898e4 = wic.m7898e(8);
        Intrinsics.m18598f(insetsM7898e4, "wic.getInsets(WindowInsetsCompat.Type.ime())");
        InsetsKt.updateFrom(layoutInsets4, insetsM7898e4);
        ime.setVisible(wic.m7909q(8));
        MutableWindowInsetsType displayCutout = windowInsets.getDisplayCutout();
        MutableInsets layoutInsets5 = displayCutout.getLayoutInsets();
        androidx.core.graphics.Insets insetsM7898e5 = wic.m7898e(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        Intrinsics.m18598f(insetsM7898e5, "wic.getInsets(WindowInse…pat.Type.displayCutout())");
        InsetsKt.updateFrom(layoutInsets5, insetsM7898e5);
        displayCutout.setVisible(wic.m7909q(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
        return z2 ? WindowInsetsCompat.f23464b : wic;
    }

    public static /* synthetic */ WindowInsets start$default(ViewWindowInsetObserver viewWindowInsetObserver, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 2) != 0) {
            z3 = true;
        }
        return viewWindowInsetObserver.start(z2, z3);
    }

    /* JADX INFO: renamed from: isObserving, reason: from getter */
    public final boolean getIsObserving() {
        return this.isObserving;
    }

    public final void observeInto$insets_release(@NotNull RootWindowInsets windowInsets, boolean consumeWindowInsets, boolean windowInsetsAnimationsEnabled) {
        Intrinsics.m18599g(windowInsets, "windowInsets");
        if (this.isObserving) {
            throw new IllegalArgumentException("start() called, but this ViewWindowInsetObserver is already observing");
        }
        ViewCompat.m7773I(this.view, new C1789g(windowInsets, consumeWindowInsets, 4));
        this.view.addOnAttachStateChangeListener(this.attachListener);
        if (windowInsetsAnimationsEnabled) {
            ViewCompat.m7780P(this.view, new InnerWindowInsetsAnimationCallback(windowInsets));
        } else {
            ViewCompat.m7780P(this.view, null);
        }
        if (this.view.isAttachedToWindow()) {
            this.view.requestApplyInsets();
        }
        this.isObserving = true;
    }

    @NotNull
    public final WindowInsets start(boolean consumeWindowInsets, boolean windowInsetsAnimationsEnabled) {
        RootWindowInsets rootWindowInsets = new RootWindowInsets();
        observeInto$insets_release(rootWindowInsets, consumeWindowInsets, windowInsetsAnimationsEnabled);
        return rootWindowInsets;
    }

    public final void stop() {
        if (!this.isObserving) {
            throw new IllegalArgumentException("stop() called, but this ViewWindowInsetObserver is not currently observing");
        }
        this.view.removeOnAttachStateChangeListener(this.attachListener);
        ViewCompat.m7773I(this.view, null);
        this.isObserving = false;
    }

    public static /* synthetic */ void isObserving$annotations() {
    }
}
