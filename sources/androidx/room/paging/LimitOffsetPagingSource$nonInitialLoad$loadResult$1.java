package androidx.room.paging;

import android.database.Cursor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* synthetic */ class LimitOffsetPagingSource$nonInitialLoad$loadResult$1 extends FunctionReferenceImpl implements Function1<Cursor, List<Object>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Cursor p0 = (Cursor) obj;
        Intrinsics.m18599g(p0, "p0");
        return ((LimitOffsetPagingSource) this.receiver).m11851b();
    }
}
