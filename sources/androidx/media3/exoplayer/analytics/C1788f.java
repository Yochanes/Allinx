package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: renamed from: androidx.media3.exoplayer.analytics.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1788f implements ListenerSet.Event {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AnalyticsListener.EventTime f26466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Format f26467c;

    public /* synthetic */ C1788f(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i) {
        this.f26465a = i;
        this.f26466b = eventTime;
        this.f26467c = format;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f26465a) {
            case 0:
                analyticsListener.mo10115w(this.f26466b, this.f26467c);
                break;
            default:
                analyticsListener.mo10111s(this.f26466b, this.f26467c);
                break;
        }
    }
}
