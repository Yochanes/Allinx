package okio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokio/Segment;", "", "Companion", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Segment {

    /* JADX INFO: renamed from: a */
    public final byte[] f57899a;

    /* JADX INFO: renamed from: b */
    public int f57900b;

    /* JADX INFO: renamed from: c */
    public int f57901c;

    /* JADX INFO: renamed from: d */
    public boolean f57902d;

    /* JADX INFO: renamed from: e */
    public final boolean f57903e;

    /* JADX INFO: renamed from: f */
    public Segment f57904f;

    /* JADX INFO: renamed from: g */
    public Segment f57905g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Lokio/Segment$Companion;", "", "", "SHARE_MINIMUM", "I", "SIZE", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public Segment() {
        this.f57899a = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        this.f57903e = true;
        this.f57902d = false;
    }

    /* JADX INFO: renamed from: a */
    public final Segment m21706a() {
        Segment segment = this.f57904f;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.f57905g;
        Intrinsics.m18596d(segment2);
        segment2.f57904f = this.f57904f;
        Segment segment3 = this.f57904f;
        Intrinsics.m18596d(segment3);
        segment3.f57905g = this.f57905g;
        this.f57904f = null;
        this.f57905g = null;
        return segment;
    }

    /* JADX INFO: renamed from: b */
    public final void m21707b(Segment segment) {
        Intrinsics.m18599g(segment, "segment");
        segment.f57905g = this;
        segment.f57904f = this.f57904f;
        Segment segment2 = this.f57904f;
        Intrinsics.m18596d(segment2);
        segment2.f57905g = segment;
        this.f57904f = segment;
    }

    /* JADX INFO: renamed from: c */
    public final Segment m21708c() {
        this.f57902d = true;
        return new Segment(this.f57899a, this.f57900b, this.f57901c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m21709d(Segment sink, int i) {
        Intrinsics.m18599g(sink, "sink");
        if (!sink.f57903e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.f57901c;
        int i3 = i2 + i;
        byte[] bArr = sink.f57899a;
        if (i3 > 8192) {
            if (sink.f57902d) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f57900b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            ArraysKt.m18380o(bArr, 0, bArr, i4, i2);
            sink.f57901c -= sink.f57900b;
            sink.f57900b = 0;
        }
        int i5 = sink.f57901c;
        int i6 = this.f57900b;
        ArraysKt.m18380o(this.f57899a, i5, bArr, i6, i6 + i);
        sink.f57901c += i;
        this.f57900b += i;
    }

    public Segment(byte[] data, int i, int i2, boolean z2, boolean z3) {
        Intrinsics.m18599g(data, "data");
        this.f57899a = data;
        this.f57900b = i;
        this.f57901c = i2;
        this.f57902d = z2;
        this.f57903e = z3;
    }
}
