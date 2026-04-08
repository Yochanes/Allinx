package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class C2180xff8530fc extends MutablePropertyReference1Impl {

    /* JADX INFO: renamed from: a */
    public static final C2180xff8530fc f31853a = new C2180xff8530fc(SupportSQLiteDatabase.class, "version", "getVersion()I", 0);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
    }
}
