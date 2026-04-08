package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public abstract class BinaryVersion {

    /* JADX INFO: renamed from: a */
    public final int[] f53865a;

    /* JADX INFO: renamed from: b */
    public final int f53866b;

    /* JADX INFO: renamed from: c */
    public final int f53867c;

    /* JADX INFO: renamed from: d */
    public final int f53868d;

    /* JADX INFO: renamed from: e */
    public final List f53869e;

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class Companion {
    }

    public BinaryVersion(int... numbers) {
        List listM18465x0;
        Intrinsics.m18599g(numbers, "numbers");
        this.f53865a = numbers;
        Integer numM18340G = ArraysKt.m18340G(0, numbers);
        this.f53866b = numM18340G != null ? numM18340G.intValue() : -1;
        Integer numM18340G2 = ArraysKt.m18340G(1, numbers);
        this.f53867c = numM18340G2 != null ? numM18340G2.intValue() : -1;
        Integer numM18340G3 = ArraysKt.m18340G(2, numbers);
        this.f53868d = numM18340G3 != null ? numM18340G3.intValue() : -1;
        if (numbers.length <= 3) {
            listM18465x0 = EmptyList.f51496a;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(AbstractC0000a.m17n(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listM18465x0 = CollectionsKt.m18465x0(new ArraysKt___ArraysJvmKt$asList$3(numbers).subList(3, numbers.length));
        }
        this.f53869e = listM18465x0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19525a(int i, int i2, int i3) {
        int i4 = this.f53866b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.f53867c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.f53868d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.f53866b == binaryVersion.f53866b && this.f53867c == binaryVersion.f53867c && this.f53868d == binaryVersion.f53868d && Intrinsics.m18594b(this.f53869e, binaryVersion.f53869e);
    }

    public final int hashCode() {
        int i = this.f53866b;
        int i2 = (i * 31) + this.f53867c + i;
        int i3 = (i2 * 31) + this.f53868d + i2;
        return this.f53869e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f53865a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : CollectionsKt.m18409J(arrayList, ".", null, null, null, 62);
    }
}
