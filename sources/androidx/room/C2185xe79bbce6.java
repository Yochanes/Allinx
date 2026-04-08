package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "obj", "Landroidx/sqlite/db/SupportSQLiteStatement;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteStatement;)Ljava/lang/Long;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C2185xe79bbce6 extends Lambda implements Function1<SupportSQLiteStatement, Long> {
    static {
        new C2185xe79bbce6(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSQLiteStatement obj2 = (SupportSQLiteStatement) obj;
        Intrinsics.m18599g(obj2, "obj");
        return Long.valueOf(obj2.mo11782W0());
    }
}
