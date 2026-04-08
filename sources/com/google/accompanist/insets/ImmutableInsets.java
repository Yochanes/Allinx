package com.google.accompanist.insets;

import androidx.compose.runtime.Immutable;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, m18302d2 = {"Lcom/google/accompanist/insets/ImmutableInsets;", "Lcom/google/accompanist/insets/Insets;", BlockAlignment.LEFT, "", VerticalAlignment.TOP, BlockAlignment.RIGHT, VerticalAlignment.BOTTOM, "(IIII)V", "getBottom", "()I", "getLeft", "getRight", "getTop", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ImmutableInsets implements Insets {
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public ImmutableInsets() {
        this(0, 0, 0, 0, 15, null);
    }

    @Override // com.google.accompanist.insets.Insets
    public int getBottom() {
        return this.bottom;
    }

    @Override // com.google.accompanist.insets.Insets
    public int getLeft() {
        return this.left;
    }

    @Override // com.google.accompanist.insets.Insets
    public int getRight() {
        return this.right;
    }

    @Override // com.google.accompanist.insets.Insets
    public int getTop() {
        return this.top;
    }

    public ImmutableInsets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public /* synthetic */ ImmutableInsets(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
