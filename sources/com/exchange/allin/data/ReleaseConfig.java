package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006/"}, m18302d2 = {"Lcom/exchange/allin/data/ReleaseConfig;", "", "grade", "", FirebaseAnalytics.Param.METHOD, "period", "value", "", "isComplete", "", "releaseAmount", "unReleaseAmount", "releasedAmount", "startTime", "", "endTime", "<init>", "(IIIDZDDDJJ)V", "getGrade", "()I", "getMethod", "getPeriod", "getValue", "()D", "()Z", "getReleaseAmount", "getUnReleaseAmount", "getReleasedAmount", "getStartTime", "()J", "getEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class ReleaseConfig {
    public static final int $stable = 0;

    @SerializedName("end_time")
    private final long endTime;
    private final int grade;

    @SerializedName("is_complete")
    private final boolean isComplete;
    private final int method;
    private final int period;

    @SerializedName("release_amount")
    private final double releaseAmount;

    @SerializedName("released_amount")
    private final double releasedAmount;

    @SerializedName("start_time")
    private final long startTime;

    @SerializedName("unrelease_amount")
    private final double unReleaseAmount;
    private final double value;

    public ReleaseConfig(int i, int i2, int i3, double d, boolean z2, double d2, double d3, double d4, long j, long j2) {
        this.grade = i;
        this.method = i2;
        this.period = i3;
        this.value = d;
        this.isComplete = z2;
        this.releaseAmount = d2;
        this.unReleaseAmount = d3;
        this.releasedAmount = d4;
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ ReleaseConfig copy$default(ReleaseConfig releaseConfig, int i, int i2, int i3, double d, boolean z2, double d2, double d3, double d4, long j, long j2, int i4, Object obj) {
        long j3;
        int i5;
        int i6 = (i4 & 1) != 0 ? releaseConfig.grade : i;
        int i7 = (i4 & 2) != 0 ? releaseConfig.method : i2;
        int i8 = (i4 & 4) != 0 ? releaseConfig.period : i3;
        double d5 = (i4 & 8) != 0 ? releaseConfig.value : d;
        boolean z3 = (i4 & 16) != 0 ? releaseConfig.isComplete : z2;
        double d6 = (i4 & 32) != 0 ? releaseConfig.releaseAmount : d2;
        double d7 = (i4 & 64) != 0 ? releaseConfig.unReleaseAmount : d3;
        double d8 = (i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? releaseConfig.releasedAmount : d4;
        long j4 = (i4 & 256) != 0 ? releaseConfig.startTime : j;
        if ((i4 & 512) != 0) {
            i5 = i6;
            j3 = releaseConfig.endTime;
        } else {
            j3 = j2;
            i5 = i6;
        }
        return releaseConfig.copy(i5, i7, i8, d5, z3, d6, d7, d8, j4, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getGrade() {
        return this.grade;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getReleaseAmount() {
        return this.releaseAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getUnReleaseAmount() {
        return this.unReleaseAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getReleasedAmount() {
        return this.releasedAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final ReleaseConfig copy(int grade, int method, int period, double value, boolean isComplete, double releaseAmount, double unReleaseAmount, double releasedAmount, long startTime, long endTime) {
        return new ReleaseConfig(grade, method, period, value, isComplete, releaseAmount, unReleaseAmount, releasedAmount, startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReleaseConfig)) {
            return false;
        }
        ReleaseConfig releaseConfig = (ReleaseConfig) other;
        return this.grade == releaseConfig.grade && this.method == releaseConfig.method && this.period == releaseConfig.period && Double.compare(this.value, releaseConfig.value) == 0 && this.isComplete == releaseConfig.isComplete && Double.compare(this.releaseAmount, releaseConfig.releaseAmount) == 0 && Double.compare(this.unReleaseAmount, releaseConfig.unReleaseAmount) == 0 && Double.compare(this.releasedAmount, releaseConfig.releasedAmount) == 0 && this.startTime == releaseConfig.startTime && this.endTime == releaseConfig.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getGrade() {
        return this.grade;
    }

    public final int getMethod() {
        return this.method;
    }

    public final int getPeriod() {
        return this.period;
    }

    public final double getReleaseAmount() {
        return this.releaseAmount;
    }

    public final double getReleasedAmount() {
        return this.releasedAmount;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final double getUnReleaseAmount() {
        return this.unReleaseAmount;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.endTime) + AbstractC0455a.m2231f(this.startTime, AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2230e(AbstractC0455a.m2227b(AbstractC0455a.m2228c(this.period, AbstractC0455a.m2228c(this.method, Integer.hashCode(this.grade) * 31, 31), 31), 31, this.value), 31, this.isComplete), 31, this.releaseAmount), 31, this.unReleaseAmount), 31, this.releasedAmount), 31);
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ReleaseConfig(grade=");
        sb.append(this.grade);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", isComplete=");
        sb.append(this.isComplete);
        sb.append(", releaseAmount=");
        sb.append(this.releaseAmount);
        sb.append(", unReleaseAmount=");
        sb.append(this.unReleaseAmount);
        sb.append(", releasedAmount=");
        sb.append(this.releasedAmount);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        return AbstractC0455a.m2240o(sb, this.endTime, ')');
    }
}
