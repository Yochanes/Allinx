package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/AbstractMutableCollection;", "E", "", "Ljava/util/AbstractCollection;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements Collection<E>, KMutableCollection {
    /* JADX INFO: renamed from: c */
    public abstract int mo4661c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo4661c();
    }
}
