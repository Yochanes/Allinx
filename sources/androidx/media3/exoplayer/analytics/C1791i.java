package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1791i implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AnalyticsListener.EventTime f26475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f26476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26477c;

    public /* synthetic */ C1791i(AnalyticsListener.EventTime eventTime, boolean z2, int i) {
        this.f26475a = eventTime;
        this.f26476b = z2;
        this.f26477c = i;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).mo10110r(this.f26475a, this.f26476b, this.f26477c);
    }
}
