package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlin/collections/AbstractMap$keys$1", "Lkotlin/collections/AbstractSet;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AbstractMap$keys$1 extends AbstractSet<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractMap f51477a;

    public AbstractMap$keys$1(AbstractMap abstractMap) {
        this.f51477a = abstractMap;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c */
    public final int getF16756c() {
        return this.f51477a.getF16794d();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f51477a.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new AbstractMap$keys$1$iterator$1(this.f51477a.mo4645e().iterator());
    }
}
