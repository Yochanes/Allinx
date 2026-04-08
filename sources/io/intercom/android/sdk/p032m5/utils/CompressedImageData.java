package io.intercom.android.sdk.p032m5.utils;

import android.net.Uri;
import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m18302d2 = {"Lio/intercom/android/sdk/m5/utils/CompressedImageData;", "", "uri", "Landroid/net/Uri;", "width", "", "height", "size", "", "<init>", "(Landroid/net/Uri;IIJ)V", "getUri", "()Landroid/net/Uri;", "getWidth", "()I", "getHeight", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* data */ class CompressedImageData {
    private final int height;
    private final long size;

    @NotNull
    private final Uri uri;
    private final int width;

    public CompressedImageData(@NotNull Uri uri, int i, int i2, long j) {
        Intrinsics.m18599g(uri, "uri");
        this.uri = uri;
        this.width = i;
        this.height = i2;
        this.size = j;
    }

    public static /* synthetic */ CompressedImageData copy$default(CompressedImageData compressedImageData, Uri uri, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            uri = compressedImageData.uri;
        }
        if ((i3 & 2) != 0) {
            i = compressedImageData.width;
        }
        if ((i3 & 4) != 0) {
            i2 = compressedImageData.height;
        }
        if ((i3 & 8) != 0) {
            j = compressedImageData.size;
        }
        int i4 = i2;
        return compressedImageData.copy(uri, i, i4, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final CompressedImageData copy(@NotNull Uri uri, int width, int height, long size) {
        Intrinsics.m18599g(uri, "uri");
        return new CompressedImageData(uri, width, height, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompressedImageData)) {
            return false;
        }
        CompressedImageData compressedImageData = (CompressedImageData) other;
        return Intrinsics.m18594b(this.uri, compressedImageData.uri) && this.width == compressedImageData.width && this.height == compressedImageData.height && this.size == compressedImageData.size;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + AbstractC0455a.m2228c(this.height, AbstractC0455a.m2228c(this.width, this.uri.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CompressedImageData(uri=");
        sb.append(this.uri);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", size=");
        return AbstractC0455a.m2240o(sb, this.size, ')');
    }
}
