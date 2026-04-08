package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.SampleQueue;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1893l implements Consumer {
    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        ((SampleQueue.SharedSampleMetadata) obj).f27395b.release();
    }
}
