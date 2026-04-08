package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class Stack<T> {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Stack)) {
            return false;
        }
        ((Stack) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Stack(backing=null)";
    }
}
