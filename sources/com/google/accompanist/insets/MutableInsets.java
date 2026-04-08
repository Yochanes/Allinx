package com.google.accompanist.insets;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0018\u001a\u00020\u0019R+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR+\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\f¨\u0006\u001a"}, m18302d2 = {"Lcom/google/accompanist/insets/MutableInsets;", "Lcom/google/accompanist/insets/Insets;", BlockAlignment.LEFT, "", VerticalAlignment.TOP, BlockAlignment.RIGHT, VerticalAlignment.BOTTOM, "(IIII)V", "<set-?>", "getBottom", "()I", "setBottom", "(I)V", "bottom$delegate", "Landroidx/compose/runtime/MutableState;", "getLeft", "setLeft", "left$delegate", "getRight", "setRight", "right$delegate", "getTop", "setTop", "top$delegate", MetricTracker.Object.RESET, "", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableInsets implements Insets {

    /* JADX INFO: renamed from: bottom$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bottom;

    /* JADX INFO: renamed from: left$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState left;

    /* JADX INFO: renamed from: right$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState right;

    /* JADX INFO: renamed from: top$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState top;

    public MutableInsets() {
        this(0, 0, 0, 0, 15, null);
    }

    @Override // com.google.accompanist.insets.Insets
    public int getBottom() {
        return ((Number) this.bottom.getF20325a()).intValue();
    }

    @Override // com.google.accompanist.insets.Insets
    public int getLeft() {
        return ((Number) this.left.getF20325a()).intValue();
    }

    @Override // com.google.accompanist.insets.Insets
    public int getRight() {
        return ((Number) this.right.getF20325a()).intValue();
    }

    @Override // com.google.accompanist.insets.Insets
    public int getTop() {
        return ((Number) this.top.getF20325a()).intValue();
    }

    public final void reset() {
        setLeft(0);
        setTop(0);
        setRight(0);
        setBottom(0);
    }

    public void setBottom(int i) {
        this.bottom.setValue(Integer.valueOf(i));
    }

    public void setLeft(int i) {
        this.left.setValue(Integer.valueOf(i));
    }

    public void setRight(int i) {
        this.right.setValue(Integer.valueOf(i));
    }

    public void setTop(int i) {
        this.top.setValue(Integer.valueOf(i));
    }

    public MutableInsets(int i, int i2, int i3, int i4) {
        this.left = SnapshotStateKt.m4525g(Integer.valueOf(i));
        this.top = SnapshotStateKt.m4525g(Integer.valueOf(i2));
        this.right = SnapshotStateKt.m4525g(Integer.valueOf(i3));
        this.bottom = SnapshotStateKt.m4525g(Integer.valueOf(i4));
    }

    public /* synthetic */ MutableInsets(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
