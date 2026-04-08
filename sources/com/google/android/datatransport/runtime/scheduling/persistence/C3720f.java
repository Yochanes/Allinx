package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3720f implements SQLiteEventStore.Function, SQLiteEventStore.Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42380b;

    public /* synthetic */ C3720f(Object obj, int i) {
        this.f42379a = i;
        this.f42380b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.m14442V((HashMap) this.f42380b, (Cursor) obj);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public Object produce() {
        switch (this.f42379a) {
            case 1:
                return SQLiteEventStore.m14438M((SQLiteDatabase) this.f42380b);
            default:
                return ((SchemaManager) this.f42380b).getWritableDatabase();
        }
    }
}
