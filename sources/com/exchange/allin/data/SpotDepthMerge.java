package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m18302d2 = {"Lcom/exchange/allin/data/SpotDepthMerge;", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class SpotDepthMerge {
    public static final int $stable = 0;

    @NotNull
    private final String key;

    @NotNull
    private final String value;

    public SpotDepthMerge(@NotNull String key, @NotNull String value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        this.key = key;
        this.value = value;
    }

    public static /* synthetic */ SpotDepthMerge copy$default(SpotDepthMerge spotDepthMerge, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotDepthMerge.key;
        }
        if ((i & 2) != 0) {
            str2 = spotDepthMerge.value;
        }
        return spotDepthMerge.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final SpotDepthMerge copy(@NotNull String key, @NotNull String value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        return new SpotDepthMerge(key, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotDepthMerge)) {
            return false;
        }
        SpotDepthMerge spotDepthMerge = (SpotDepthMerge) other;
        return Intrinsics.m18594b(this.key, spotDepthMerge.key) && Intrinsics.m18594b(this.value, spotDepthMerge.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpotDepthMerge(key=");
        sb.append(this.key);
        sb.append(", value=");
        return AbstractC0455a.m2241p(sb, this.value, ')');
    }
}
