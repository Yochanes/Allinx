package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class C2166xa0ea6de extends PropertyReference1Impl {
    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).mo11772m0());
    }
}
