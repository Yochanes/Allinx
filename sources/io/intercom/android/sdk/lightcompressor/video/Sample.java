package io.intercom.android.sdk.lightcompressor.video;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Sample;", "", "offset", "", "size", "<init>", "(JJ)V", "getOffset", "()J", "setOffset", "(J)V", "getSize", "setSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class Sample {
    private long offset;
    private long size;

    public Sample(long j, long j2) {
        this.offset = j;
        this.size = j2;
    }

    public static /* synthetic */ Sample copy$default(Sample sample, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sample.offset;
        }
        if ((i & 2) != 0) {
            j2 = sample.size;
        }
        return sample.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final Sample copy(long offset, long size) {
        return new Sample(offset, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sample)) {
            return false;
        }
        Sample sample = (Sample) other;
        return this.offset == sample.offset && this.size == sample.size;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + (Long.hashCode(this.offset) * 31);
    }

    public final void setOffset(long j) {
        this.offset = j;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Sample(offset=");
        sb.append(this.offset);
        sb.append(", size=");
        return AbstractC0455a.m2240o(sb, this.size, ')');
    }
}
