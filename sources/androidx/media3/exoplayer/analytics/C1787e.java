package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1787e implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f26462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f26463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f26464c;

    public /* synthetic */ C1787e(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.f26462a = eventTime;
        this.f26463b = i;
        this.f26464c = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).mo10107o(this.f26463b, this.f26464c, this.f26462a);
    }
}
