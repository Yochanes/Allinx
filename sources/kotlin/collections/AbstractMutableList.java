package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/collections/AbstractMutableList;", "E", "", "Ljava/util/AbstractList;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements List<E>, KMutableList {
    /* JADX INFO: renamed from: c */
    public abstract int getF51486c();

    /* JADX INFO: renamed from: e */
    public abstract Object mo4621e(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo4621e(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getF51486c();
    }
}
