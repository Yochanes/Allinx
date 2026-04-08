package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

/* JADX INFO: renamed from: com.google.android.datatransport.runtime.scheduling.persistence.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3723i implements SchemaManager.Migration {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42386a;

    public /* synthetic */ C3723i(int i) {
        this.f42386a = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    public final void upgrade(SQLiteDatabase sQLiteDatabase) {
        switch (this.f42386a) {
            case 0:
                SchemaManager.m14461a(sQLiteDatabase);
                break;
            case 1:
                SchemaManager.m14466i(sQLiteDatabase);
                break;
            case 2:
                SchemaManager.m14463d(sQLiteDatabase);
                break;
            case 3:
                SchemaManager.m14467j(sQLiteDatabase);
                break;
            case 4:
                SchemaManager.m14464g(sQLiteDatabase);
                break;
            case 5:
                SchemaManager.m14465h(sQLiteDatabase);
                break;
            default:
                SchemaManager.m14462b(sQLiteDatabase);
                break;
        }
    }
}
