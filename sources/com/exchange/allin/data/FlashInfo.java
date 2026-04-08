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
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m18302d2 = {"Lcom/exchange/allin/data/FlashInfo;", "", "name", "", "identify", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIdentify", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FlashInfo {
    public static final int $stable = 0;

    @NotNull
    private final String identify;

    @NotNull
    private final String name;

    public FlashInfo(@NotNull String name, @NotNull String identify) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(identify, "identify");
        this.name = name;
        this.identify = identify;
    }

    public static /* synthetic */ FlashInfo copy$default(FlashInfo flashInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flashInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = flashInfo.identify;
        }
        return flashInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIdentify() {
        return this.identify;
    }

    @NotNull
    public final FlashInfo copy(@NotNull String name, @NotNull String identify) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(identify, "identify");
        return new FlashInfo(name, identify);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashInfo)) {
            return false;
        }
        FlashInfo flashInfo = (FlashInfo) other;
        return Intrinsics.m18594b(this.name, flashInfo.name) && Intrinsics.m18594b(this.identify, flashInfo.identify);
    }

    @NotNull
    public final String getIdentify() {
        return this.identify;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.identify.hashCode() + (this.name.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FlashInfo(name=");
        sb.append(this.name);
        sb.append(", identify=");
        return AbstractC0455a.m2241p(sb, this.identify, ')');
    }
}
