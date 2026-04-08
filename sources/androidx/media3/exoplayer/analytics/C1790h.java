package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1790h implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f26471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f26472b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f26473c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f26474d;

    public /* synthetic */ C1790h(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        this.f26471a = eventTime;
        this.f26472b = i;
        this.f26473c = j;
        this.f26474d = j2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).mo10091P(this.f26471a, this.f26472b, this.f26473c, this.f26474d);
    }
}
