package kotlin.collections.builders;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ListBuilderKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m18527a(Object[] objArr, int i, int i2, List list) {
        if (i2 == list.size()) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (Intrinsics.m18594b(objArr[i + i3], list.get(i3))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18528b(Object[] objArr, int i, int i2, AbstractMutableList abstractMutableList) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractMutableList) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static final void m18529c(int i, int i2, Object[] objArr) {
        Intrinsics.m18599g(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
