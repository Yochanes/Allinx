package com.google.firebase.crashlytics.internal.send;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.send.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4703b implements TransportScheduleCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReportQueue f42810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TaskCompletionSource f42811b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f42812c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CrashlyticsReportWithSessionId f42813d;

    public /* synthetic */ C4703b(ReportQueue reportQueue, TaskCompletionSource taskCompletionSource, boolean z2, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        this.f42810a = reportQueue;
        this.f42811b = taskCompletionSource;
        this.f42812c = z2;
        this.f42813d = crashlyticsReportWithSessionId;
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public final void onSchedule(Exception exc) {
        ReportQueue.m15202a(this.f42810a, this.f42811b, this.f42812c, this.f42813d, exc);
    }
}
