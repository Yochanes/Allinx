package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/serialization/internal/CollectionSerializer;", "E", "", "C", "B", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: c */
    public final Iterator mo20984c(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.m18599g(collection, "<this>");
        return collection.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: d */
    public final int mo20985d(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.m18599g(collection, "<this>");
        return collection.size();
    }
}
