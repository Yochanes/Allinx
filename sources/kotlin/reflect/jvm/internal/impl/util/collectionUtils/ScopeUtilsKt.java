package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ScopeUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final Collection m20334a(Collection collection, Collection collection2) {
        Intrinsics.m18599g(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public static final SmartList m20335b(ArrayList arrayList) {
        SmartList smartList = new SmartList();
        for (Object obj : arrayList) {
            MemberScope memberScope = (MemberScope) obj;
            if (memberScope != null && memberScope != MemberScope.Empty.f54457b) {
                smartList.add(obj);
            }
        }
        return smartList;
    }
}
