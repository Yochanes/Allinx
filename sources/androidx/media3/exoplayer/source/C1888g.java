package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1888g implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MediaSourceEventListener.EventDispatcher f27483b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LoadEventInfo f27484c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MediaLoadData f27485d;

    public /* synthetic */ C1888g(MediaSourceEventListener.EventDispatcher eventDispatcher, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f27482a = i;
        this.f27483b = eventDispatcher;
        this.f27484c = loadEventInfo;
        this.f27485d = mediaLoadData;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        MediaSourceEventListener mediaSourceEventListener = (MediaSourceEventListener) obj;
        switch (this.f27482a) {
            case 0:
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27483b;
                mediaSourceEventListener.mo10004K(eventDispatcher.f27235a, eventDispatcher.f27236b, this.f27484c, this.f27485d);
                break;
            default:
                MediaSourceEventListener.EventDispatcher eventDispatcher2 = this.f27483b;
                mediaSourceEventListener.mo10014l0(eventDispatcher2.f27235a, eventDispatcher2.f27236b, this.f27484c, this.f27485d);
                break;
        }
    }
}
