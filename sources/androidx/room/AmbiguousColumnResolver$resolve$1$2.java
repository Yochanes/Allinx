package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "indices", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class AmbiguousColumnResolver$resolve$1$2 extends Lambda implements Function1<List<? extends Integer>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List indices = (List) obj;
        Intrinsics.m18599g(indices, "indices");
        List list = indices;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue = ((Number) it.next()).intValue();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue > iIntValue2) {
                iIntValue = iIntValue2;
            }
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int iIntValue3 = ((Number) it2.next()).intValue();
        while (it2.hasNext()) {
            int iIntValue4 = ((Number) it2.next()).intValue();
            if (iIntValue3 < iIntValue4) {
                iIntValue3 = iIntValue4;
            }
        }
        throw null;
    }
}
