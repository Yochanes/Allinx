package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler;", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "Landroidx/compose/runtime/RememberObserver;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "Companion", "PrefetchRequestScopeImpl", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@ExperimentalFoundationApi
@SourceDebugExtension
public final class AndroidPrefetchScheduler implements PrefetchScheduler, RememberObserver, Runnable, Choreographer.FrameCallback {

    /* JADX INFO: renamed from: i */
    public static long f7168i;

    /* JADX INFO: renamed from: a */
    public final View f7169a;

    /* JADX INFO: renamed from: c */
    public boolean f7171c;

    /* JADX INFO: renamed from: f */
    public boolean f7173f;

    /* JADX INFO: renamed from: g */
    public long f7174g;

    /* JADX INFO: renamed from: b */
    public final MutableVector f7170b = new MutableVector(new PrefetchRequest[16], 0);

    /* JADX INFO: renamed from: d */
    public final Choreographer f7172d = Choreographer.getInstance();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$Companion;", "", "", "frameIntervalNs", "J", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/AndroidPrefetchScheduler$PrefetchRequestScopeImpl;", "Landroidx/compose/foundation/lazy/layout/PrefetchRequestScope;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class PrefetchRequestScopeImpl implements PrefetchRequestScope {

        /* JADX INFO: renamed from: a */
        public final long f7175a;

        public PrefetchRequestScopeImpl(long j) {
            this.f7175a = j;
        }

        /* JADX INFO: renamed from: a */
        public final long m3023a() {
            return Math.max(0L, this.f7175a - System.nanoTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidPrefetchScheduler(View view) {
        float refreshRate;
        this.f7169a = view;
        if (f7168i == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
            }
            f7168i = (long) (1000000000 / refreshRate);
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.PrefetchScheduler
    /* JADX INFO: renamed from: a */
    public final void mo3022a(PrefetchRequest prefetchRequest) {
        this.f7170b.m4568b(prefetchRequest);
        if (this.f7171c) {
            return;
        }
        this.f7171c = true;
        this.f7169a.post(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f7173f) {
            this.f7174g = j;
            this.f7169a.post(this);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        this.f7173f = false;
        this.f7169a.removeCallbacks(this);
        this.f7172d.removeFrameCallback(this);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f7173f = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MutableVector mutableVector = this.f7170b;
        if (mutableVector.f16736c == 0 || !this.f7171c || !this.f7173f || this.f7169a.getWindowVisibility() != 0) {
            this.f7171c = false;
            return;
        }
        PrefetchRequestScopeImpl prefetchRequestScopeImpl = new PrefetchRequestScopeImpl(this.f7174g + f7168i);
        boolean z2 = false;
        while (mutableVector.f16736c != 0 && !z2) {
            if (prefetchRequestScopeImpl.m3023a() <= 0 || ((PrefetchRequest) mutableVector.f16734a[0]).mo3091a(prefetchRequestScopeImpl)) {
                z2 = true;
            } else {
                mutableVector.m4577k(0);
            }
        }
        if (z2) {
            this.f7172d.postFrameCallback(this);
        } else {
            this.f7171c = false;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }
}
