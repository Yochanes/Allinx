package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Links {

    /* JADX INFO: renamed from: a */
    public final Object f16879a;

    /* JADX INFO: renamed from: b */
    public final Object f16880b;

    public Links(Object obj, Object obj2) {
        this.f16879a = obj;
        this.f16880b = obj2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Links() {
        EndOfChain endOfChain = EndOfChain.f16897a;
        this(endOfChain, endOfChain);
    }

    public Links(Object obj) {
        this(obj, EndOfChain.f16897a);
    }
}
