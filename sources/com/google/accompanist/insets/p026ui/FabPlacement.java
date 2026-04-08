package com.google.accompanist.insets.p026ui;

import androidx.compose.runtime.Immutable;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, m18302d2 = {"Lcom/google/accompanist/insets/ui/FabPlacement;", "", "isDocked", "", BlockAlignment.LEFT, "", "width", "height", "(ZIII)V", "getHeight", "()I", "()Z", "getLeft", "getWidth", "insets-ui_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class FabPlacement {
    private final int height;
    private final boolean isDocked;
    private final int left;
    private final int width;

    public FabPlacement(boolean z2, int i, int i2, int i3) {
        this.isDocked = z2;
        this.left = i;
        this.width = i2;
        this.height = i3;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: isDocked, reason: from getter */
    public final boolean getIsDocked() {
        return this.isDocked;
    }
}
