package androidx.compose.p013ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidUiDispatcher extends CoroutineDispatcher {

    /* JADX INFO: renamed from: r */
    public static final Lazy f19286r = LazyKt.m18299b(AndroidUiDispatcher$Companion$Main$2.f19298a);

    /* JADX INFO: renamed from: s */
    public static final AndroidUiDispatcher$Companion$currentThread$1 f19287s = new AndroidUiDispatcher$Companion$currentThread$1();

    /* JADX INFO: renamed from: c */
    public final Choreographer f19288c;

    /* JADX INFO: renamed from: d */
    public final Handler f19289d;

    /* JADX INFO: renamed from: n */
    public boolean f19294n;

    /* JADX INFO: renamed from: o */
    public boolean f19295o;

    /* JADX INFO: renamed from: q */
    public final AndroidUiFrameClock f19297q;

    /* JADX INFO: renamed from: f */
    public final Object f19290f = new Object();

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f19291g = new ArrayDeque();

    /* JADX INFO: renamed from: i */
    public ArrayList f19292i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public ArrayList f19293j = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final AndroidUiDispatcher$dispatchCallback$1 f19296p = new AndroidUiDispatcher$dispatchCallback$1(this);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.f19288c = choreographer;
        this.f19289d = handler;
        this.f19297q = new AndroidUiFrameClock(choreographer, this);
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m6094a1(AndroidUiDispatcher androidUiDispatcher) {
        Runnable runnable;
        boolean z2;
        do {
            synchronized (androidUiDispatcher.f19290f) {
                ArrayDeque arrayDeque = androidUiDispatcher.f19291g;
                runnable = (Runnable) (arrayDeque.isEmpty() ? null : arrayDeque.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (androidUiDispatcher.f19290f) {
                    ArrayDeque arrayDeque2 = androidUiDispatcher.f19291g;
                    runnable = (Runnable) (arrayDeque2.isEmpty() ? null : arrayDeque2.removeFirst());
                }
            }
            synchronized (androidUiDispatcher.f19290f) {
                if (androidUiDispatcher.f19291g.isEmpty()) {
                    z2 = false;
                    androidUiDispatcher.f19294n = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: j0 */
    public final void mo6095j0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f19290f) {
            this.f19291g.addLast(runnable);
            if (!this.f19294n) {
                this.f19294n = true;
                this.f19289d.post(this.f19296p);
                if (!this.f19295o) {
                    this.f19295o = true;
                    this.f19288c.postFrameCallback(this.f19296p);
                }
            }
        }
    }
}
