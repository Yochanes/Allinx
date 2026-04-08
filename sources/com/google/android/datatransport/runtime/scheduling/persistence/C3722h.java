package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3722h implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f42385b;

    public /* synthetic */ C3722h(long j, int i) {
        this.f42384a = i;
        this.f42385b = j;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f42384a) {
            case 0:
                return SQLiteEventStore.m14457r0(this.f42385b, (SQLiteDatabase) obj);
            default:
                return SQLiteEventStore.m14444a(this.f42385b, (Cursor) obj);
        }
    }
}
