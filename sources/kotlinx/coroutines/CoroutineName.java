package kotlinx.coroutines;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Key", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class CoroutineName extends AbstractCoroutineContextElement {

    /* JADX INFO: renamed from: c */
    public static final Key f55279c = new Key();

    /* JADX INFO: renamed from: b */
    public final String f55280b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/CoroutineName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineName;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Key implements CoroutineContext.Key<CoroutineName> {
    }

    public CoroutineName(String str) {
        super(f55279c);
        this.f55280b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && Intrinsics.m18594b(this.f55280b, ((CoroutineName) obj).f55280b);
    }

    public final int hashCode() {
        return this.f55280b.hashCode();
    }

    public final String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("CoroutineName("), this.f55280b, ')');
    }
}
