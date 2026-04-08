package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3717c implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteEventStore f42372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42373c;

    public /* synthetic */ C3717c(SQLiteEventStore sQLiteEventStore, Object obj, int i) {
        this.f42371a = i;
        this.f42372b = sQLiteEventStore;
        this.f42373c = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        switch (this.f42371a) {
            case 0:
                return SQLiteEventStore.m14455k(this.f42372b, (TransportContext) this.f42373c, sQLiteDatabase);
            case 1:
                return SQLiteEventStore.m14445b(this.f42372b, (TransportContext) this.f42373c, sQLiteDatabase);
            default:
                return SQLiteEventStore.m14453j(this.f42372b, (String) this.f42373c, sQLiteDatabase);
        }
    }
}
