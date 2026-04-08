package com.exchange.allin.net.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.annotations.SerializedName;
import com.mvi.base.IgnoredOnProguard;
import com.mvi.net.response.BaseResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\r\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000e\u0010\u001d\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J<\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0004HÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, m18302d2 = {"Lcom/exchange/allin/net/response/ApiResponse;", "T", "Lcom/mvi/net/response/BaseResponse;", "code", "", "msg", "", "data", MTPushConstants.Geofence.KEY_COUNT, "<init>", "(ILjava/lang/String;Ljava/lang/Object;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCount", "isSuccess", "", "getResponseData", "getResponseCode", "getResponseMsg", "getResponseError", "getResponseCount", "isNoLogin", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Object;I)Lcom/exchange/allin/net/response/ApiResponse;", "equals", "other", "", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class ApiResponse<T> extends BaseResponse<T> {
    public static final int $stable = 0;
    private final int code;

    @SerializedName(alternate = {"total"}, value = MTPushConstants.Geofence.KEY_COUNT)
    private final int count;
    private final T data;

    @SerializedName(alternate = {"reason"}, value = "msg")
    @NotNull
    private final String msg;

    public ApiResponse(int i, @NotNull String msg, T t, int i2) {
        Intrinsics.m18599g(msg, "msg");
        this.code = i;
        this.msg = msg;
        this.data = t;
        this.count = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, int i, String str, Object obj, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = apiResponse.code;
        }
        if ((i3 & 2) != 0) {
            str = apiResponse.msg;
        }
        if ((i3 & 4) != 0) {
            obj = apiResponse.data;
        }
        if ((i3 & 8) != 0) {
            i2 = apiResponse.count;
        }
        return apiResponse.copy(i, str, obj, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final T component3() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final ApiResponse<T> copy(int code, @NotNull String msg, T data, int count) {
        Intrinsics.m18599g(msg, "msg");
        return new ApiResponse<>(code, msg, data, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) other;
        return this.code == apiResponse.code && Intrinsics.m18594b(this.msg, apiResponse.msg) && Intrinsics.m18594b(this.data, apiResponse.data) && this.count == apiResponse.count;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getCount() {
        return this.count;
    }

    public final T getData() {
        return this.data;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @Override // com.mvi.net.response.BaseResponse
    public int getResponseCode() {
        return this.code;
    }

    @Override // com.mvi.net.response.BaseResponse
    public int getResponseCount() {
        return this.count;
    }

    @Override // com.mvi.net.response.BaseResponse
    public T getResponseData() {
        return this.data;
    }

    @Override // com.mvi.net.response.BaseResponse
    @NotNull
    public String getResponseError() {
        return this.msg;
    }

    @Override // com.mvi.net.response.BaseResponse
    @NotNull
    public String getResponseMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(Integer.hashCode(this.code) * 31, 31, this.msg);
        T t = this.data;
        return Integer.hashCode(this.count) + ((iM5b + (t == null ? 0 : t.hashCode())) * 31);
    }

    @Override // com.mvi.net.response.BaseResponse
    public boolean isNoLogin() {
        return this.code == 11011;
    }

    @Override // com.mvi.net.response.BaseResponse
    public boolean isSuccess() {
        int i = this.code;
        return i == 200 || i == 888 || i == 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ApiResponse(code=");
        sb.append(this.code);
        sb.append(", msg=");
        sb.append(this.msg);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", count=");
        return AbstractC0000a.m17n(sb, this.count, ')');
    }
}
