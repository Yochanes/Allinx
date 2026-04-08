package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class C2171x65399d06 extends MutablePropertyReference1Impl {

    /* JADX INFO: renamed from: a */
    public static final C2171x65399d06 f31851a = new C2171x65399d06(SupportSQLiteDatabase.class, "pageSize", "getPageSize()J", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
    }
}
