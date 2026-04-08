package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1783a implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnalyticsListener.EventTime f26451b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26452c;

    public /* synthetic */ C1783a(AnalyticsListener.EventTime eventTime, String str, int i) {
        this.f26450a = i;
        this.f26451b = eventTime;
        this.f26452c = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f26450a) {
            case 0:
                AnalyticsListener.EventTime eventTime = this.f26451b;
                analyticsListener.getClass();
                analyticsListener.mo10088M(eventTime, this.f26452c);
                break;
            case 1:
                analyticsListener.mo10101i(this.f26451b, this.f26452c);
                break;
            case 2:
                AnalyticsListener.EventTime eventTime2 = this.f26451b;
                analyticsListener.getClass();
                analyticsListener.mo10099g(eventTime2, this.f26452c);
                break;
            default:
                analyticsListener.mo10098f(this.f26451b, this.f26452c);
                break;
        }
    }

    public /* synthetic */ C1783a(AnalyticsListener.EventTime eventTime, String str, long j, long j2, int i) {
        this.f26450a = i;
        this.f26451b = eventTime;
        this.f26452c = str;
    }
}
