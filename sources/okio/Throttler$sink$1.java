package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okio/Throttler$sink$1", "Lokio/ForwardingSink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class Throttler$sink$1 extends ForwardingSink {
    @Override // okio.ForwardingSink, okio.Sink
    /* JADX INFO: renamed from: o0 */
    public final void mo12451o0(Buffer source, long j) {
        Intrinsics.m18599g(source, "source");
        if (j > 0) {
            throw null;
        }
    }
}
