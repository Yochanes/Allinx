package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final /* data */ class ThreadLocalKey implements CoroutineContext.Key<ThreadLocalElement<?>> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadLocalKey)) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
