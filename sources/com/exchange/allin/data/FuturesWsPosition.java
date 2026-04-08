package com.exchange.allin.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesWsPosition;", "", "event", "", "position", "Lcom/exchange/allin/data/FuturesPosition;", "<init>", "(ILcom/exchange/allin/data/FuturesPosition;)V", "getEvent", "()I", "getPosition", "()Lcom/exchange/allin/data/FuturesPosition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesWsPosition {
    public static final int $stable = 0;
    private final int event;

    @NotNull
    private final FuturesPosition position;

    public FuturesWsPosition(int i, @NotNull FuturesPosition position) {
        Intrinsics.m18599g(position, "position");
        this.event = i;
        this.position = position;
    }

    public static /* synthetic */ FuturesWsPosition copy$default(FuturesWsPosition futuresWsPosition, int i, FuturesPosition futuresPosition, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = futuresWsPosition.event;
        }
        if ((i2 & 2) != 0) {
            futuresPosition = futuresWsPosition.position;
        }
        return futuresWsPosition.copy(i, futuresPosition);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEvent() {
        return this.event;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FuturesPosition getPosition() {
        return this.position;
    }

    @NotNull
    public final FuturesWsPosition copy(int event, @NotNull FuturesPosition position) {
        Intrinsics.m18599g(position, "position");
        return new FuturesWsPosition(event, position);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesWsPosition)) {
            return false;
        }
        FuturesWsPosition futuresWsPosition = (FuturesWsPosition) other;
        return this.event == futuresWsPosition.event && Intrinsics.m18594b(this.position, futuresWsPosition.position);
    }

    public final int getEvent() {
        return this.event;
    }

    @NotNull
    public final FuturesPosition getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.position.hashCode() + (Integer.hashCode(this.event) * 31);
    }

    @NotNull
    public String toString() {
        return "FuturesWsPosition(event=" + this.event + ", position=" + this.position + ')';
    }
}
