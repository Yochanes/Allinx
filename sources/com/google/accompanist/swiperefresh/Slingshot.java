package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u0006\u001f"}, m18302d2 = {"Lcom/google/accompanist/swiperefresh/Slingshot;", "", "()V", "<set-?>", "", "arrowScale", "getArrowScale", "()F", "setArrowScale", "(F)V", "arrowScale$delegate", "Landroidx/compose/runtime/MutableState;", "endTrim", "getEndTrim", "setEndTrim", "endTrim$delegate", "", "offset", "getOffset", "()I", "setOffset", "(I)V", "offset$delegate", "rotation", "getRotation", "setRotation", "rotation$delegate", "startTrim", "getStartTrim", "setStartTrim", "startTrim$delegate", "swiperefresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Slingshot {

    /* JADX INFO: renamed from: arrowScale$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState arrowScale;

    /* JADX INFO: renamed from: endTrim$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState endTrim;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState offset = SnapshotStateKt.m4525g(0);

    /* JADX INFO: renamed from: rotation$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState rotation;

    /* JADX INFO: renamed from: startTrim$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState startTrim;

    public Slingshot() {
        Float fValueOf = Float.valueOf(0.0f);
        this.startTrim = SnapshotStateKt.m4525g(fValueOf);
        this.endTrim = SnapshotStateKt.m4525g(fValueOf);
        this.rotation = SnapshotStateKt.m4525g(fValueOf);
        this.arrowScale = SnapshotStateKt.m4525g(fValueOf);
    }

    public final float getArrowScale() {
        return ((Number) this.arrowScale.getF20325a()).floatValue();
    }

    public final float getEndTrim() {
        return ((Number) this.endTrim.getF20325a()).floatValue();
    }

    public final int getOffset() {
        return ((Number) this.offset.getF20325a()).intValue();
    }

    public final float getRotation() {
        return ((Number) this.rotation.getF20325a()).floatValue();
    }

    public final float getStartTrim() {
        return ((Number) this.startTrim.getF20325a()).floatValue();
    }

    public final void setArrowScale(float f) {
        this.arrowScale.setValue(Float.valueOf(f));
    }

    public final void setEndTrim(float f) {
        this.endTrim.setValue(Float.valueOf(f));
    }

    public final void setOffset(int i) {
        this.offset.setValue(Integer.valueOf(i));
    }

    public final void setRotation(float f) {
        this.rotation.setValue(Float.valueOf(f));
    }

    public final void setStartTrim(float f) {
        this.startTrim.setValue(Float.valueOf(f));
    }
}
