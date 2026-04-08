package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface BandwidthMeter {

    /* JADX INFO: compiled from: Proguard */
    public interface EventListener {

        /* JADX INFO: compiled from: Proguard */
        public static final class EventDispatcher {

            /* JADX INFO: renamed from: a */
            public final CopyOnWriteArrayList f27684a = new CopyOnWriteArrayList();

            /* JADX INFO: compiled from: Proguard */
            public static final class HandlerAndListener {

                /* JADX INFO: renamed from: a */
                public final Handler f27685a;

                /* JADX INFO: renamed from: b */
                public final EventListener f27686b;

                /* JADX INFO: renamed from: c */
                public boolean f27687c;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.f27685a = handler;
                    this.f27686b = eventListener;
                }
            }
        }

        /* JADX INFO: renamed from: Y */
        void mo10121Y(long j, long j2, int i);
    }

    /* JADX INFO: renamed from: a */
    void mo10439a(EventListener eventListener);

    /* JADX INFO: renamed from: e */
    void mo10440e(Handler handler, EventListener eventListener);

    /* JADX INFO: renamed from: f */
    TransferListener mo10441f();
}
