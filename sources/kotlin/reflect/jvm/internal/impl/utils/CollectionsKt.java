package kotlin.reflect.jvm.internal.impl.utils;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class CollectionsKt {
    /* JADX INFO: renamed from: a */
    public static final void m20336a(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final List m20337b(ArrayList arrayList) {
        Intrinsics.m18599g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return EmptyList.f51496a;
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.m18413N(kotlin.collections.CollectionsKt.m18398B(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
