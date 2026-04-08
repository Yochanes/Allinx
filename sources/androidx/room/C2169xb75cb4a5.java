package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class C2169xb75cb4a5 extends PropertyReference1Impl {

    /* JADX INFO: renamed from: a */
    public static final C2169xb75cb4a5 f31850a = new C2169xb75cb4a5(SupportSQLiteDatabase.class, "maximumSize", "getMaximumSize()J", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Long.valueOf(((SupportSQLiteDatabase) obj).mo11767T());
    }
}
