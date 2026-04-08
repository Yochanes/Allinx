package androidx.compose.p013ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidUiDispatcher$dispatchCallback$1 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AndroidUiDispatcher f19299a;

    public AndroidUiDispatcher$dispatchCallback$1(AndroidUiDispatcher androidUiDispatcher) {
        this.f19299a = androidUiDispatcher;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f19299a.f19289d.removeCallbacks(this);
        AndroidUiDispatcher.m6094a1(this.f19299a);
        AndroidUiDispatcher androidUiDispatcher = this.f19299a;
        synchronized (androidUiDispatcher.f19290f) {
            if (androidUiDispatcher.f19295o) {
                androidUiDispatcher.f19295o = false;
                ArrayList arrayList = androidUiDispatcher.f19292i;
                androidUiDispatcher.f19292i = androidUiDispatcher.f19293j;
                androidUiDispatcher.f19293j = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidUiDispatcher.m6094a1(this.f19299a);
        AndroidUiDispatcher androidUiDispatcher = this.f19299a;
        synchronized (androidUiDispatcher.f19290f) {
            if (androidUiDispatcher.f19292i.isEmpty()) {
                androidUiDispatcher.f19288c.removeFrameCallback(this);
                androidUiDispatcher.f19295o = false;
            }
        }
    }
}
