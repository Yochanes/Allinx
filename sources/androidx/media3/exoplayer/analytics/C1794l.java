package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.l */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1794l implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnalyticsListener.EventTime f26486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AudioSink.AudioTrackConfig f26487c;

    public /* synthetic */ C1794l(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i) {
        this.f26485a = i;
        this.f26486b = eventTime;
        this.f26487c = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f26485a) {
            case 0:
                analyticsListener.mo10095c(this.f26486b, this.f26487c);
                break;
            default:
                analyticsListener.mo10100h(this.f26486b, this.f26487c);
                break;
        }
    }
}
