package com.google.accompanist.insets;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m18302d2 = {"coerceEachDimensionAtLeast", "Lcom/google/accompanist/insets/Insets;", "minimumValue", "updateFrom", "", "Lcom/google/accompanist/insets/MutableInsets;", "insets", "Landroidx/core/graphics/Insets;", "insets_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class InsetsKt {
    @Deprecated
    @NotNull
    public static final Insets coerceEachDimensionAtLeast(@NotNull Insets insets, @NotNull Insets minimumValue) {
        Intrinsics.m18599g(insets, "<this>");
        Intrinsics.m18599g(minimumValue, "minimumValue");
        Insets mutableInsets = (insets.getLeft() < minimumValue.getLeft() || insets.getTop() < minimumValue.getTop() || insets.getRight() < minimumValue.getRight() || insets.getBottom() < minimumValue.getBottom()) ? null : insets;
        if (mutableInsets == null) {
            int left = insets.getLeft();
            int left2 = minimumValue.getLeft();
            if (left < left2) {
                left = left2;
            }
            int top = insets.getTop();
            int top2 = minimumValue.getTop();
            if (top < top2) {
                top = top2;
            }
            int right = insets.getRight();
            int right2 = minimumValue.getRight();
            if (right < right2) {
                right = right2;
            }
            int bottom = insets.getBottom();
            int bottom2 = minimumValue.getBottom();
            if (bottom < bottom2) {
                bottom = bottom2;
            }
            mutableInsets = new MutableInsets(left, top, right, bottom);
        }
        return mutableInsets;
    }

    public static final void updateFrom(@NotNull MutableInsets mutableInsets, @NotNull androidx.core.graphics.Insets insets) {
        Intrinsics.m18599g(mutableInsets, "<this>");
        Intrinsics.m18599g(insets, "insets");
        mutableInsets.setLeft(insets.f23200a);
        mutableInsets.setTop(insets.f23201b);
        mutableInsets.setRight(insets.f23202c);
        mutableInsets.setBottom(insets.f23203d);
    }
}
