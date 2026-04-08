package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3721g implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f42381a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LogEventDropped.Reason f42382b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f42383c;

    public /* synthetic */ C3721g(long j, LogEventDropped.Reason reason, String str) {
        this.f42381a = str;
        this.f42382b = reason;
        this.f42383c = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        return SQLiteEventStore.m14441S(this.f42381a, this.f42382b, this.f42383c, (SQLiteDatabase) obj);
    }
}
