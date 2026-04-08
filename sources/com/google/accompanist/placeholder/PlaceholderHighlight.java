package com.google.accompanist.placeholder;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Stable
@Deprecated
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H'J$\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m18302d2 = {"Lcom/google/accompanist/placeholder/PlaceholderHighlight;", "", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "", "getAnimationSpec", "()Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "alpha", "progress", "brush", "Landroidx/compose/ui/graphics/Brush;", "size", "Landroidx/compose/ui/geometry/Size;", "brush-d16Qtg0", "(FJ)Landroidx/compose/ui/graphics/Brush;", "Companion", "placeholder_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PlaceholderHighlight {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/google/accompanist/placeholder/PlaceholderHighlight$Companion;", "", "()V", "placeholder_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @FloatRange
    float alpha(float progress);

    @NotNull
    /* JADX INFO: renamed from: brush-d16Qtg0 */
    Brush mo21990brushd16Qtg0(@FloatRange float progress, long size);

    @Nullable
    InfiniteRepeatableSpec<Float> getAnimationSpec();
}
