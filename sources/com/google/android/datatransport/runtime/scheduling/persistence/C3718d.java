package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3718d implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42374a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f42375b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42376c;

    public /* synthetic */ C3718d(TransportContext transportContext, long j) {
        this.f42375b = j;
        this.f42376c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        switch (this.f42374a) {
            case 0:
                return SQLiteEventStore.m14456n(this.f42375b, (TransportContext) this.f42376c, sQLiteDatabase);
            default:
                return SQLiteEventStore.m14443W((SQLiteEventStore) this.f42376c, this.f42375b, sQLiteDatabase);
        }
    }

    public /* synthetic */ C3718d(SQLiteEventStore sQLiteEventStore, long j) {
        this.f42376c = sQLiteEventStore;
        this.f42375b = j;
    }
}
