package okio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/SegmentPool;", "", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SegmentPool {

    /* JADX INFO: renamed from: a */
    public static final Segment f57906a = new Segment(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b */
    public static final int f57907b;

    /* JADX INFO: renamed from: c */
    public static final AtomicReference[] f57908c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f57907b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f57908c = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m21710a(Segment segment) {
        Intrinsics.m18599g(segment, "segment");
        if (segment.f57904f != null || segment.f57905g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f57902d) {
            return;
        }
        AtomicReference atomicReference = f57908c[(int) (Thread.currentThread().getId() & (((long) f57907b) - 1))];
        Segment segment2 = f57906a;
        Segment segment3 = (Segment) atomicReference.getAndSet(segment2);
        if (segment3 == segment2) {
            return;
        }
        int i = segment3 != null ? segment3.f57901c : 0;
        if (i >= 65536) {
            atomicReference.set(segment3);
            return;
        }
        segment.f57904f = segment3;
        segment.f57900b = 0;
        segment.f57901c = i + UserMetadata.MAX_INTERNAL_KEY_SIZE;
        atomicReference.set(segment);
    }

    /* JADX INFO: renamed from: b */
    public static final Segment m21711b() {
        AtomicReference atomicReference = f57908c[(int) (Thread.currentThread().getId() & (((long) f57907b) - 1))];
        Segment segment = f57906a;
        Segment segment2 = (Segment) atomicReference.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            atomicReference.set(null);
            return new Segment();
        }
        atomicReference.set(segment2.f57904f);
        segment2.f57904f = null;
        segment2.f57901c = 0;
        return segment2;
    }
}
