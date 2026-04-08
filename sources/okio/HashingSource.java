package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "Companion", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class HashingSource extends ForwardingSource implements Source {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/HashingSource$Companion;", "", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // okio.ForwardingSource, okio.Source
    /* JADX INFO: renamed from: J0 */
    public final long mo12415J0(Buffer sink, long j) {
        Intrinsics.m18599g(sink, "sink");
        long jMo12415J0 = super.mo12415J0(sink, j);
        if (jMo12415J0 != -1) {
            long j2 = sink.f57830b;
            long j3 = j2 - jMo12415J0;
            Segment segment = sink.f57829a;
            Intrinsics.m18596d(segment);
            while (j2 > j3) {
                segment = segment.f57905g;
                Intrinsics.m18596d(segment);
                j2 -= (long) (segment.f57901c - segment.f57900b);
            }
            if (j2 < sink.f57830b) {
                Intrinsics.m18596d(null);
                throw null;
            }
        }
        return jMo12415J0;
    }
}
