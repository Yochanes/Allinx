package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1889h implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoadEventInfo f27487b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MediaLoadData f27488c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IOException f27489d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f27490f;

    public /* synthetic */ C1889h(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        this.f27486a = eventDispatcher;
        this.f27487b = loadEventInfo;
        this.f27488c = mediaLoadData;
        this.f27489d = iOException;
        this.f27490f = z2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27486a;
        mediaSourceEventListener.mo10012h0(eventDispatcher.f27235a, eventDispatcher.f27236b, this.f27487b, this.f27488c, this.f27489d, this.f27490f);
    }
}
