package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3719e implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SQLiteEventStore f42378b;

    public /* synthetic */ C3719e(SQLiteEventStore sQLiteEventStore, int i) {
        this.f42377a = i;
        this.f42378b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f42377a) {
            case 0:
                return SQLiteEventStore.m14449g0(this.f42378b, (SQLiteDatabase) obj);
            case 1:
                return SQLiteEventStore.m14452i(this.f42378b, (Cursor) obj);
            default:
                return SQLiteEventStore.m14448g(this.f42378b, (Cursor) obj);
        }
    }
}
