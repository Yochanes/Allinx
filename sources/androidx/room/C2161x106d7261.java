package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C2161x106d7261 extends Lambda implements Function1<SupportSQLiteDatabase, Object> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase db = (SupportSQLiteDatabase) obj;
        Intrinsics.m18599g(db, "db");
        db.mo11776r(null);
        return null;
    }
}
