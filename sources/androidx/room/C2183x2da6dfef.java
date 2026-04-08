package androidx.room;

import androidx.sqlite.p018db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class C2183x2da6dfef extends FunctionReferenceImpl implements Function1<SupportSQLiteDatabase, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase p0 = (SupportSQLiteDatabase) obj;
        Intrinsics.m18599g(p0, "p0");
        return Boolean.valueOf(p0.mo11770d0());
    }
}
