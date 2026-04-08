package com.google.accompanist.insets;

import androidx.annotation.FloatRange;
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
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bg\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012J:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m18302d2 = {"Lcom/google/accompanist/insets/WindowInsets;", "", "displayCutout", "Lcom/google/accompanist/insets/WindowInsets$Type;", "getDisplayCutout", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "ime", "getIme", "navigationBars", "getNavigationBars", "statusBars", "getStatusBars", "systemBars", "getSystemBars", "systemGestures", "getSystemGestures", "copy", "Companion", "Type", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface WindowInsets {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/google/accompanist/insets/WindowInsets$Companion;", "", "()V", "Empty", "Lcom/google/accompanist/insets/WindowInsets;", "getEmpty", "()Lcom/google/accompanist/insets/WindowInsets;", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final WindowInsets Empty = new ImmutableWindowInsets(null, null, null, null, null, 31, null);

        private Companion() {
        }

        @NotNull
        public final WindowInsets getEmpty() {
            return Empty;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aR\u0012\u0010\u0002\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0012\u0010\u0012\u001a\u00020\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m18302d2 = {"Lcom/google/accompanist/insets/WindowInsets$Type;", "Lcom/google/accompanist/insets/Insets;", "animatedInsets", "getAnimatedInsets", "()Lcom/google/accompanist/insets/Insets;", "animationFraction", "", "getAnimationFraction", "()F", "animationInProgress", "", "getAnimationInProgress", "()Z", VerticalAlignment.BOTTOM, "", "getBottom", "()I", "isVisible", "layoutInsets", "getLayoutInsets", BlockAlignment.LEFT, "getLeft", BlockAlignment.RIGHT, "getRight", VerticalAlignment.TOP, "getTop", "Companion", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @Stable
    @Deprecated
    public interface Type extends Insets {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/google/accompanist/insets/WindowInsets$Type$Companion;", "", "()V", "Empty", "Lcom/google/accompanist/insets/WindowInsets$Type;", "getEmpty", "()Lcom/google/accompanist/insets/WindowInsets$Type;", "insets_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final Type Empty = new ImmutableWindowInsetsType(null, null, false, false, 0.0f, 31, null);

            private Companion() {
            }

            @NotNull
            public final Type getEmpty() {
                return Empty;
            }
        }

        @NotNull
        Insets getAnimatedInsets();

        @FloatRange
        float getAnimationFraction();

        boolean getAnimationInProgress();

        @Override // com.google.accompanist.insets.Insets
        default int getBottom() {
            return (getAnimationInProgress() ? getAnimatedInsets() : getLayoutInsets()).getBottom();
        }

        @NotNull
        Insets getLayoutInsets();

        @Override // com.google.accompanist.insets.Insets
        default int getLeft() {
            return (getAnimationInProgress() ? getAnimatedInsets() : getLayoutInsets()).getLeft();
        }

        @Override // com.google.accompanist.insets.Insets
        default int getRight() {
            return (getAnimationInProgress() ? getAnimatedInsets() : getLayoutInsets()).getRight();
        }

        @Override // com.google.accompanist.insets.Insets
        default int getTop() {
            return (getAnimationInProgress() ? getAnimatedInsets() : getLayoutInsets()).getTop();
        }

        /* JADX INFO: renamed from: isVisible */
        boolean getIsVisible();
    }

    static /* synthetic */ WindowInsets copy$default(WindowInsets windowInsets, Type type, Type type2, Type type3, Type type4, Type type5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            type = windowInsets.getNavigationBars();
        }
        if ((i & 2) != 0) {
            type2 = windowInsets.getStatusBars();
        }
        if ((i & 4) != 0) {
            type3 = windowInsets.getSystemGestures();
        }
        if ((i & 8) != 0) {
            type4 = windowInsets.getIme();
        }
        if ((i & 16) != 0) {
            type5 = windowInsets.getDisplayCutout();
        }
        Type type6 = type5;
        Type type7 = type3;
        return windowInsets.copy(type, type2, type7, type4, type6);
    }

    @NotNull
    default WindowInsets copy(@NotNull Type navigationBars, @NotNull Type statusBars, @NotNull Type systemGestures, @NotNull Type ime, @NotNull Type displayCutout) {
        Intrinsics.m18599g(navigationBars, "navigationBars");
        Intrinsics.m18599g(statusBars, "statusBars");
        Intrinsics.m18599g(systemGestures, "systemGestures");
        Intrinsics.m18599g(ime, "ime");
        Intrinsics.m18599g(displayCutout, "displayCutout");
        return new ImmutableWindowInsets(systemGestures, navigationBars, statusBars, ime, displayCutout);
    }

    @NotNull
    Type getDisplayCutout();

    @NotNull
    Type getIme();

    @NotNull
    Type getNavigationBars();

    @NotNull
    Type getStatusBars();

    @NotNull
    Type getSystemBars();

    @NotNull
    Type getSystemGestures();
}
