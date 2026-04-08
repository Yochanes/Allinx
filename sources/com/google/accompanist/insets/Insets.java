package com.google.accompanist.insets;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Stable;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Stable
@Deprecated
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0016J\u0011\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m18302d2 = {"Lcom/google/accompanist/insets/Insets;", "", VerticalAlignment.BOTTOM, "", "getBottom", "()I", BlockAlignment.LEFT, "getLeft", BlockAlignment.RIGHT, "getRight", VerticalAlignment.TOP, "getTop", "copy", "minus", "other", "plus", "Companion", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface Insets {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m18302d2 = {"Lcom/google/accompanist/insets/Insets$Companion;", "", "()V", "Empty", "Lcom/google/accompanist/insets/Insets;", "getEmpty", "()Lcom/google/accompanist/insets/Insets;", "Insets", BlockAlignment.LEFT, "", VerticalAlignment.TOP, BlockAlignment.RIGHT, VerticalAlignment.BOTTOM, "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Insets Empty = new ImmutableInsets(0, 0, 0, 0, 15, null);

        private Companion() {
        }

        public static /* synthetic */ Insets Insets$default(Companion companion, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.Insets(i, i2, i3, i4);
        }

        @NotNull
        public final Insets Insets(int left, int top, int right, int bottom) {
            return new ImmutableInsets(left, top, right, bottom);
        }

        @NotNull
        public final Insets getEmpty() {
            return Empty;
        }
    }

    static /* synthetic */ Insets copy$default(Insets insets, int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i5 & 1) != 0) {
            i = insets.getLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = insets.getTop();
        }
        if ((i5 & 4) != 0) {
            i3 = insets.getRight();
        }
        if ((i5 & 8) != 0) {
            i4 = insets.getBottom();
        }
        return insets.copy(i, i2, i3, i4);
    }

    @NotNull
    default Insets copy(int left, int top, int right, int bottom) {
        return new ImmutableInsets(left, top, right, bottom);
    }

    @IntRange
    int getBottom();

    @IntRange
    int getLeft();

    @IntRange
    int getRight();

    @IntRange
    int getTop();

    @NotNull
    default Insets minus(@NotNull Insets other) {
        Intrinsics.m18599g(other, "other");
        return copy(getLeft() - other.getLeft(), getTop() - other.getTop(), getRight() - other.getRight(), getBottom() - other.getBottom());
    }

    @NotNull
    default Insets plus(@NotNull Insets other) {
        Intrinsics.m18599g(other, "other");
        return copy(other.getLeft() + getLeft(), other.getTop() + getTop(), other.getRight() + getRight(), other.getBottom() + getBottom());
    }
}
