package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList<Integer> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int[] f51487a;

    public ArraysKt___ArraysJvmKt$asList$3(int[] iArr) {
        this.f51487a = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: c */
    public final int getF51513d() {
        return this.f51487a.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return ArraysKt.m18373i(this.f51487a, ((Number) obj).intValue());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.f51487a[i]);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ArraysKt.m18343J(this.f51487a, ((Number) obj).intValue());
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f51487a.length == 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f51487a;
        Intrinsics.m18599g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }
}
