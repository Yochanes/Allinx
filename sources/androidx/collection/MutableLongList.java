package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableLongList;", "Landroidx/collection/LongList;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableLongList extends LongList {
    public MutableLongList(int i) {
        this.f3709a = i == 0 ? LongSetKt.f3721a : new long[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m2037a(long j) {
        int i = this.f3710b + 1;
        long[] jArr = this.f3709a;
        if (jArr.length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            Intrinsics.m18598f(jArrCopyOf, "copyOf(...)");
            this.f3709a = jArrCopyOf;
        }
        long[] jArr2 = this.f3709a;
        int i2 = this.f3710b;
        jArr2[i2] = j;
        this.f3710b = i2 + 1;
    }
}
