package com.google.accompanist.insets;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.accompanist.insets.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020$R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8W@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0006R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u000f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, m18302d2 = {"Lcom/google/accompanist/insets/MutableWindowInsetsType;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "()V", "animatedInsets", "Lcom/google/accompanist/insets/MutableInsets;", "getAnimatedInsets", "()Lcom/google/accompanist/insets/MutableInsets;", "<set-?>", "", "animationFraction", "getAnimationFraction", "()F", "setAnimationFraction", "(F)V", "animationFraction$delegate", "Landroidx/compose/runtime/MutableState;", "animationInProgress", "", "getAnimationInProgress", "()Z", "animationInProgress$delegate", "Landroidx/compose/runtime/State;", "isVisible", "setVisible", "(Z)V", "isVisible$delegate", "layoutInsets", "getLayoutInsets", "", "ongoingAnimationsCount", "getOngoingAnimationsCount", "()I", "setOngoingAnimationsCount", "(I)V", "ongoingAnimationsCount$delegate", "onAnimationEnd", "", "onAnimationStart", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableWindowInsetsType implements WindowInsets.Type {

    /* JADX INFO: renamed from: ongoingAnimationsCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState ongoingAnimationsCount = SnapshotStateKt.m4525g(0);

    @NotNull
    private final MutableInsets layoutInsets = new MutableInsets(0, 0, 0, 0, 15, null);

    @NotNull
    private final MutableInsets animatedInsets = new MutableInsets(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: isVisible$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isVisible = SnapshotStateKt.m4525g(Boolean.TRUE);

    /* JADX INFO: renamed from: animationInProgress$delegate, reason: from kotlin metadata */
    @NotNull
    private final State animationInProgress = SnapshotStateKt.m4523e(new MutableWindowInsetsType$animationInProgress$2(this));

    /* JADX INFO: renamed from: animationFraction$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationFraction = SnapshotStateKt.m4525g(Float.valueOf(0.0f));

    public static final /* synthetic */ int access$getOngoingAnimationsCount(MutableWindowInsetsType mutableWindowInsetsType) {
        return mutableWindowInsetsType.getOngoingAnimationsCount();
    }

    private final int getOngoingAnimationsCount() {
        return ((Number) this.ongoingAnimationsCount.getF20325a()).intValue();
    }

    private final void setOngoingAnimationsCount(int i) {
        this.ongoingAnimationsCount.setValue(Integer.valueOf(i));
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public /* bridge */ /* synthetic */ Insets getAnimatedInsets() {
        return getAnimatedInsets();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @FloatRange
    public float getAnimationFraction() {
        return ((Number) this.animationFraction.getF20325a()).floatValue();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public boolean getAnimationInProgress() {
        return ((Boolean) this.animationInProgress.getF20325a()).booleanValue();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public /* bridge */ /* synthetic */ Insets getLayoutInsets() {
        return getLayoutInsets();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        return ((Boolean) this.isVisible.getF20325a()).booleanValue();
    }

    public final void onAnimationEnd() {
        setOngoingAnimationsCount(getOngoingAnimationsCount() - 1);
        if (getOngoingAnimationsCount() == 0) {
            getAnimatedInsets().reset();
            setAnimationFraction(0.0f);
        }
    }

    public final void onAnimationStart() {
        setOngoingAnimationsCount(getOngoingAnimationsCount() + 1);
    }

    public void setAnimationFraction(float f) {
        this.animationFraction.setValue(Float.valueOf(f));
    }

    public void setVisible(boolean z2) {
        this.isVisible.setValue(Boolean.valueOf(z2));
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public MutableInsets getAnimatedInsets() {
        return this.animatedInsets;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public MutableInsets getLayoutInsets() {
        return this.layoutInsets;
    }
}
