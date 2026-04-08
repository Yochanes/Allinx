package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/CacheEntry;", "T", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class CacheEntry<T> {

    /* JADX INFO: renamed from: a */
    public final KSerializer f56657a;

    public CacheEntry(KSerializer kSerializer) {
        this.f56657a = kSerializer;
    }
}
