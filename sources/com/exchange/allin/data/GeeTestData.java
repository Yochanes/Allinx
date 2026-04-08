package com.exchange.allin.data;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, m18302d2 = {"Lcom/exchange/allin/data/GeeTestData;", "", "captchaId", "", "lotNumber", "passToken", "genTime", "captchaOutput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaptchaId", "()Ljava/lang/String;", "getLotNumber", "getPassToken", "getGenTime", "getCaptchaOutput", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class GeeTestData {
    public static final int $stable = 0;

    @SerializedName("captcha_id")
    @NotNull
    private final String captchaId;

    @SerializedName("captcha_output")
    @NotNull
    private final String captchaOutput;

    @SerializedName("gen_time")
    @NotNull
    private final String genTime;

    @SerializedName("lot_number")
    @NotNull
    private final String lotNumber;

    @SerializedName("pass_token")
    @NotNull
    private final String passToken;

    public GeeTestData(@NotNull String captchaId, @NotNull String lotNumber, @NotNull String passToken, @NotNull String genTime, @NotNull String captchaOutput) {
        Intrinsics.m18599g(captchaId, "captchaId");
        Intrinsics.m18599g(lotNumber, "lotNumber");
        Intrinsics.m18599g(passToken, "passToken");
        Intrinsics.m18599g(genTime, "genTime");
        Intrinsics.m18599g(captchaOutput, "captchaOutput");
        this.captchaId = captchaId;
        this.lotNumber = lotNumber;
        this.passToken = passToken;
        this.genTime = genTime;
        this.captchaOutput = captchaOutput;
    }

    public static /* synthetic */ GeeTestData copy$default(GeeTestData geeTestData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = geeTestData.captchaId;
        }
        if ((i & 2) != 0) {
            str2 = geeTestData.lotNumber;
        }
        if ((i & 4) != 0) {
            str3 = geeTestData.passToken;
        }
        if ((i & 8) != 0) {
            str4 = geeTestData.genTime;
        }
        if ((i & 16) != 0) {
            str5 = geeTestData.captchaOutput;
        }
        String str6 = str5;
        String str7 = str3;
        return geeTestData.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCaptchaId() {
        return this.captchaId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLotNumber() {
        return this.lotNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassToken() {
        return this.passToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGenTime() {
        return this.genTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCaptchaOutput() {
        return this.captchaOutput;
    }

    @NotNull
    public final GeeTestData copy(@NotNull String captchaId, @NotNull String lotNumber, @NotNull String passToken, @NotNull String genTime, @NotNull String captchaOutput) {
        Intrinsics.m18599g(captchaId, "captchaId");
        Intrinsics.m18599g(lotNumber, "lotNumber");
        Intrinsics.m18599g(passToken, "passToken");
        Intrinsics.m18599g(genTime, "genTime");
        Intrinsics.m18599g(captchaOutput, "captchaOutput");
        return new GeeTestData(captchaId, lotNumber, passToken, genTime, captchaOutput);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeeTestData)) {
            return false;
        }
        GeeTestData geeTestData = (GeeTestData) other;
        return Intrinsics.m18594b(this.captchaId, geeTestData.captchaId) && Intrinsics.m18594b(this.lotNumber, geeTestData.lotNumber) && Intrinsics.m18594b(this.passToken, geeTestData.passToken) && Intrinsics.m18594b(this.genTime, geeTestData.genTime) && Intrinsics.m18594b(this.captchaOutput, geeTestData.captchaOutput);
    }

    @NotNull
    public final String getCaptchaId() {
        return this.captchaId;
    }

    @NotNull
    public final String getCaptchaOutput() {
        return this.captchaOutput;
    }

    @NotNull
    public final String getGenTime() {
        return this.genTime;
    }

    @NotNull
    public final String getLotNumber() {
        return this.lotNumber;
    }

    @NotNull
    public final String getPassToken() {
        return this.passToken;
    }

    public int hashCode() {
        return this.captchaOutput.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.captchaId.hashCode() * 31, 31, this.lotNumber), 31, this.passToken), 31, this.genTime);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GeeTestData(captchaId=");
        sb.append(this.captchaId);
        sb.append(", lotNumber=");
        sb.append(this.lotNumber);
        sb.append(", passToken=");
        sb.append(this.passToken);
        sb.append(", genTime=");
        sb.append(this.genTime);
        sb.append(", captchaOutput=");
        return AbstractC0455a.m2241p(sb, this.captchaOutput, ')');
    }
}
