package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1786d implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnalyticsListener.EventTime f26461b;

    public /* synthetic */ C1786d(AnalyticsListener.EventTime eventTime, int i) {
        this.f26460a = i;
        this.f26461b = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f26460a) {
            case 0:
                analyticsListener.mo10114v(this.f26461b);
                break;
            case 1:
                analyticsListener.mo10097e(this.f26461b);
                break;
            case 2:
                analyticsListener.mo10113u(this.f26461b);
                break;
            case 3:
                analyticsListener.mo10116x(this.f26461b);
                break;
            case 4:
                analyticsListener.mo10087L(this.f26461b);
                break;
            default:
                analyticsListener.mo10117y(this.f26461b);
                break;
        }
    }

    public /* synthetic */ C1786d(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i) {
        this.f26460a = i;
        this.f26461b = eventTime;
    }
}
