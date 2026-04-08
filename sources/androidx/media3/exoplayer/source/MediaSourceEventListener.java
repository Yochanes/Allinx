package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface MediaSourceEventListener {

    /* JADX INFO: compiled from: Proguard */
    public static class EventDispatcher {

        /* JADX INFO: renamed from: a */
        public final int f27235a;

        /* JADX INFO: renamed from: b */
        public final MediaSource.MediaPeriodId f27236b;

        /* JADX INFO: renamed from: c */
        public final CopyOnWriteArrayList f27237c;

        /* JADX INFO: compiled from: Proguard */
        public static final class ListenerAndHandler {

            /* JADX INFO: renamed from: a */
            public Handler f27238a;

            /* JADX INFO: renamed from: b */
            public Object f27239b;
        }

        public EventDispatcher(CopyOnWriteArrayList copyOnWriteArrayList, int i, MediaSource.MediaPeriodId mediaPeriodId) {
            this.f27237c = copyOnWriteArrayList;
            this.f27235a = i;
            this.f27236b = mediaPeriodId;
        }

        /* JADX INFO: renamed from: a */
        public final void m10519a(Consumer consumer) {
            for (ListenerAndHandler listenerAndHandler : this.f27237c) {
                Util.m9601K(listenerAndHandler.f27238a, new RunnableC1891j(1, consumer, listenerAndHandler.f27239b));
            }
        }
    }

    /* JADX INFO: renamed from: L */
    default void mo10005L(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    /* JADX INFO: renamed from: K */
    default void mo10004K(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    /* JADX INFO: renamed from: l0 */
    default void mo10014l0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    /* JADX INFO: renamed from: b0 */
    default void mo10009b0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
    }

    /* JADX INFO: renamed from: h0 */
    default void mo10012h0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
    }
}
