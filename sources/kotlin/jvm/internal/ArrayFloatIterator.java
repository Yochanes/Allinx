package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.FloatIterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/ArrayFloatIterator;", "Lkotlin/collections/FloatIterator;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ArrayFloatIterator extends FloatIterator {

    /* JADX INFO: renamed from: a */
    public final float[] f51639a;

    /* JADX INFO: renamed from: b */
    public int f51640b;

    public ArrayFloatIterator(float[] array) {
        Intrinsics.m18599g(array, "array");
        this.f51639a = array;
    }

    @Override // kotlin.collections.FloatIterator
    /* JADX INFO: renamed from: c */
    public final float mo18479c() {
        try {
            float[] fArr = this.f51639a;
            int i = this.f51640b;
            this.f51640b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f51640b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f51640b < this.f51639a.length;
    }
}
