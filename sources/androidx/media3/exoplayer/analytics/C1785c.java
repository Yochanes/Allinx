package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1785c implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f26456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f26457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f26459d;

    public /* synthetic */ C1785c(AnalyticsListener.EventTime eventTime, int i, int i2, boolean z2) {
        this.f26456a = eventTime;
        this.f26457b = i;
        this.f26458c = i2;
        this.f26459d = z2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).mo10109q(this.f26456a, this.f26457b, this.f26458c, this.f26459d);
    }
}
