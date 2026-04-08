package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.activity.RunnableC0048g;
import androidx.camera.core.processing.RunnableC0320d;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface DrmSessionEventListener {

    /* JADX INFO: compiled from: Proguard */
    public static class EventDispatcher {

        /* JADX INFO: renamed from: a */
        public final int f26820a;

        /* JADX INFO: renamed from: b */
        public final MediaSource.MediaPeriodId f26821b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList f26822c;

        /* JADX INFO: compiled from: Proguard */
        public static final class ListenerAndHandler {

            /* JADX INFO: renamed from: a */
            public Handler f26823a;

            /* JADX INFO: renamed from: b */
            public Object f26824b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f26822c = copyOnWriteArrayList;
            this.f26820a = i;
            this.f26821b = mediaPeriodId;
        }

        /* JADX INFO: renamed from: a */
        public final void m10311a(Handler handler, DrmSessionEventListener drmSessionEventListener) {
            handler.getClass();
            ListenerAndHandler listenerAndHandler = new ListenerAndHandler();
            listenerAndHandler.f26823a = handler;
            listenerAndHandler.f26824b = drmSessionEventListener;
            this.f26822c.add(listenerAndHandler);
        }

        /* JADX INFO: renamed from: b */
        public final void m10312b() {
            for (ListenerAndHandler listenerAndHandler : this.f26822c) {
                Util.m9601K(listenerAndHandler.f26823a, new RunnableC1823b(2, this, listenerAndHandler.f26824b));
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m10313c() {
            for (ListenerAndHandler listenerAndHandler : this.f26822c) {
                Util.m9601K(listenerAndHandler.f26823a, new RunnableC1823b(1, this, listenerAndHandler.f26824b));
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
        /* JADX INFO: renamed from: d */
        public final void m10314d(int i) {
            for (ListenerAndHandler listenerAndHandler : this.f26822c) {
                Util.m9601K(listenerAndHandler.f26823a, new RunnableC0048g(this, listenerAndHandler.f26824b, i));
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m10315e(Exception exc) {
            for (ListenerAndHandler listenerAndHandler : this.f26822c) {
                Util.m9601K(listenerAndHandler.f26823a, new RunnableC0320d(this, 4, listenerAndHandler.f26824b, exc));
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m10316f() {
            for (ListenerAndHandler listenerAndHandler : this.f26822c) {
                Util.m9601K(listenerAndHandler.f26823a, new RunnableC1823b(0, this, listenerAndHandler.f26824b));
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m10317g(DrmSessionEventListener drmSessionEventListener) {
            CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList = this.f26822c;
            for (ListenerAndHandler listenerAndHandler : copyOnWriteArrayList) {
                if (listenerAndHandler.f26824b == drmSessionEventListener) {
                    copyOnWriteArrayList.remove(listenerAndHandler);
                }
            }
        }
    }

    /* JADX INFO: renamed from: M */
    default void mo10006M(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* JADX INFO: renamed from: T */
    default void mo10007T(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* JADX INFO: renamed from: d0 */
    default void mo10010d0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    /* JADX INFO: renamed from: f0 */
    default void mo10011f0(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
    }

    /* JADX INFO: renamed from: k0 */
    default void mo10013k0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
    }
}
