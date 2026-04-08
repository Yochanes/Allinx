package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TrieNodeIterator<E> {

    /* JADX INFO: renamed from: a */
    public Object[] f16844a = TrieNode.f16840d.f16842b;

    /* JADX INFO: renamed from: b */
    public int f16845b;

    /* JADX INFO: renamed from: a */
    public final boolean m4714a() {
        int i = this.f16845b;
        Object[] objArr = this.f16844a;
        return i < objArr.length && !(objArr[i] instanceof TrieNode);
    }
}
