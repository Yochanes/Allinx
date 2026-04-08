package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3716b implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42370a;

    public /* synthetic */ C3716b(int i) {
        this.f42370a = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f42370a) {
            case 0:
                return SQLiteEventStore.m14439N((Cursor) obj);
            case 1:
                return SQLiteEventStore.m14435C((Cursor) obj);
            case 2:
                return SQLiteEventStore.m14447d((Cursor) obj);
            case 3:
                return SQLiteEventStore.m14458u((Cursor) obj);
            case 4:
                return SQLiteEventStore.m14459x((SQLiteDatabase) obj);
            case 5:
                return SQLiteEventStore.m14454j0((Cursor) obj);
            case 6:
                return SQLiteEventStore.m14440R((Throwable) obj);
            case 7:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 8:
                return SQLiteEventStore.m14436H((SQLiteDatabase) obj);
            default:
                return SQLiteEventStore.m14450h((Throwable) obj);
        }
    }
}
