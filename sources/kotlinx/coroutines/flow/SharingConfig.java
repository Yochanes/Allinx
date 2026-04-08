package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/flow/SharingConfig;", "T", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class SharingConfig<T> {

    /* JADX INFO: renamed from: a */
    public final Flow f56151a;

    /* JADX INFO: renamed from: b */
    public final int f56152b;

    /* JADX INFO: renamed from: c */
    public final BufferOverflow f56153c;

    /* JADX INFO: renamed from: d */
    public final CoroutineContext f56154d;

    public SharingConfig(int i, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, Flow flow) {
        this.f56151a = flow;
        this.f56152b = i;
        this.f56153c = bufferOverflow;
        this.f56154d = coroutineContext;
    }
}
