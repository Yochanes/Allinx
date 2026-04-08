package com.google.accompanist.insets;

import com.google.accompanist.insets.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, m18302d2 = {"Lcom/google/accompanist/insets/ImmutableWindowInsetsType;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "layoutInsets", "Lcom/google/accompanist/insets/Insets;", "animatedInsets", "isVisible", "", "animationInProgress", "animationFraction", "", "(Lcom/google/accompanist/insets/Insets;Lcom/google/accompanist/insets/Insets;ZZF)V", "getAnimatedInsets", "()Lcom/google/accompanist/insets/Insets;", "getAnimationFraction", "()F", "getAnimationInProgress", "()Z", "getLayoutInsets", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ImmutableWindowInsetsType implements WindowInsets.Type {

    @NotNull
    private final Insets animatedInsets;
    private final float animationFraction;
    private final boolean animationInProgress;
    private final boolean isVisible;

    @NotNull
    private final Insets layoutInsets;

    public ImmutableWindowInsetsType() {
        this(null, null, false, false, 0.0f, 31, null);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public Insets getAnimatedInsets() {
        return this.animatedInsets;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public boolean getAnimationInProgress() {
        return this.animationInProgress;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public Insets getLayoutInsets() {
        return this.layoutInsets;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    public ImmutableWindowInsetsType(@NotNull Insets layoutInsets, @NotNull Insets animatedInsets, boolean z2, boolean z3, float f) {
        Intrinsics.m18599g(layoutInsets, "layoutInsets");
        Intrinsics.m18599g(animatedInsets, "animatedInsets");
        this.layoutInsets = layoutInsets;
        this.animatedInsets = animatedInsets;
        this.isVisible = z2;
        this.animationInProgress = z3;
        this.animationFraction = f;
    }

    public /* synthetic */ ImmutableWindowInsetsType(Insets insets, Insets insets2, boolean z2, boolean z3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Insets.INSTANCE.getEmpty() : insets, (i & 2) != 0 ? Insets.INSTANCE.getEmpty() : insets2, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? 0.0f : f);
    }
}
