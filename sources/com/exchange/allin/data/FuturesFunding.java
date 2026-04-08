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
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lcom/exchange/allin/data/FuturesFunding;", "", "time", "", "funding", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "getFunding", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class FuturesFunding {
    public static final int $stable = 0;

    @NotNull
    private final String funding;
    private final long time;

    public FuturesFunding(long j, @NotNull String funding) {
        Intrinsics.m18599g(funding, "funding");
        this.time = j;
        this.funding = funding;
    }

    public static /* synthetic */ FuturesFunding copy$default(FuturesFunding futuresFunding, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = futuresFunding.time;
        }
        if ((i & 2) != 0) {
            str = futuresFunding.funding;
        }
        return futuresFunding.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFunding() {
        return this.funding;
    }

    @NotNull
    public final FuturesFunding copy(long time, @NotNull String funding) {
        Intrinsics.m18599g(funding, "funding");
        return new FuturesFunding(time, funding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesFunding)) {
            return false;
        }
        FuturesFunding futuresFunding = (FuturesFunding) other;
        return this.time == futuresFunding.time && Intrinsics.m18594b(this.funding, futuresFunding.funding);
    }

    @NotNull
    public final String getFunding() {
        return this.funding;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.funding.hashCode() + (Long.hashCode(this.time) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FuturesFunding(time=");
        sb.append(this.time);
        sb.append(", funding=");
        return AbstractC0455a.m2241p(sb, this.funding, ')');
    }
}
