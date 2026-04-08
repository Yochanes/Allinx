package androidx.room;

import android.util.Pair;
import androidx.sqlite.p018db.SupportSQLiteDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "Landroid/util/Pair;", "", "obj", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C2159x882a29d5 extends Lambda implements Function1<SupportSQLiteDatabase, List<? extends Pair<String, String>>> {

    /* JADX INFO: renamed from: a */
    public static final C2159x882a29d5 f31846a = new C2159x882a29d5(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSQLiteDatabase obj2 = (SupportSQLiteDatabase) obj;
        Intrinsics.m18599g(obj2, "obj");
        return obj2.mo11774p();
    }
}
