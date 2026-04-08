package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsKt extends CollectionsKt__MutableCollectionsJVMKt {
    /* JADX INFO: renamed from: c */
    public static final boolean m18472c(Iterable iterable, Function1 function1, boolean z2) {
        Iterator it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z2) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }
}
