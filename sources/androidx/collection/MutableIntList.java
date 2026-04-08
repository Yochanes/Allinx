package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableIntList;", "Landroidx/collection/IntList;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableIntList extends IntList {
    public MutableIntList(int i) {
        this.f3678a = i == 0 ? IntSetKt.f3691a : new int[i];
    }

    /* JADX INFO: renamed from: c */
    public final void m2019c(int i) {
        m2020d(this.f3679b + 1);
        int[] iArr = this.f3678a;
        int i2 = this.f3679b;
        iArr[i2] = i;
        this.f3679b = i2 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m2020d(int i) {
        int[] iArr = this.f3678a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            Intrinsics.m18598f(iArrCopyOf, "copyOf(...)");
            this.f3678a = iArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2021e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3679b)) {
            RuntimeHelpersKt.m2144b("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f3678a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            ArraysKt.m18379n(i, i + 1, iArr, iArr, i2);
        }
        this.f3679b--;
        return i3;
    }

    /* JADX INFO: renamed from: f */
    public final void m2022f(int i, int i2) {
        if (i < 0 || i >= this.f3679b) {
            RuntimeHelpersKt.m2144b("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f3678a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public /* synthetic */ MutableIntList() {
        this(16);
    }
}
