package kotlin.collections.unsigned;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<UByte> implements RandomAccess {
    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c */
    public final int getF16765c() {
        throw null;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof UByte)) {
            return false;
        }
        ArraysKt.m18369g(null, ((UByte) obj).f51442a);
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof UByte)) {
            return -1;
        }
        ArraysKt.m18342I(null, ((UByte) obj).f51442a);
        throw null;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof UByte)) {
            return -1;
        }
        byte b2 = ((UByte) obj).f51442a;
        Intrinsics.m18599g(null, "<this>");
        throw null;
    }
}
