package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", "", "holder", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class InlineList<E> {
    /* JADX INFO: renamed from: a */
    public static final Object m20823a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InlineList)) {
            return false;
        }
        ((InlineList) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "InlineList(holder=null)";
    }
}
