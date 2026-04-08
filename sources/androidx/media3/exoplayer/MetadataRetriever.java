package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MetadataRetriever {

    /* JADX INFO: compiled from: Proguard */
    public static final class SharedWorkerThread {
        static {
            new AtomicInteger(5);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MetadataRetrieverInternal {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f26297a = 0;

        static {
            new ArrayDeque();
        }

        /* JADX INFO: compiled from: Proguard */
        public final class MediaSourceHandlerCallback implements Handler.Callback {
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    int i2 = MetadataRetrieverInternal.f26297a;
                    throw null;
                }
                if (i == 2) {
                    try {
                        throw null;
                    } catch (Exception unused) {
                        int i3 = MetadataRetrieverInternal.f26297a;
                        throw null;
                    }
                }
                if (i == 3 || i == 4) {
                    throw null;
                }
                return false;
            }

            /* JADX INFO: compiled from: Proguard */
            public final class MediaSourceCaller implements MediaSource.MediaSourceCaller {

                /* JADX INFO: compiled from: Proguard */
                public final class MediaPeriodCallback implements MediaPeriod.Callback {
                    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                    /* JADX INFO: renamed from: b */
                    public final void mo9903b(MediaPeriod mediaPeriod) {
                        throw null;
                    }

                    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                    /* JADX INFO: renamed from: d */
                    public final void mo9907d(SequenceableLoader sequenceableLoader) {
                        throw null;
                    }
                }

                @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
                /* JADX INFO: renamed from: a */
                public final void mo10015a(BaseMediaSource baseMediaSource, Timeline timeline) {
                }
            }
        }
    }
}
