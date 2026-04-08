package com.exchange.allin.net.p023ws.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000e\u0010\u0016\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0011J>\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m18302d2 = {"Lcom/exchange/allin/net/ws/data/WebSocketResult;", "T", "", "id", "", FirebaseAnalytics.Param.METHOD, "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "result", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()I", "getMethod", "()Ljava/lang/String;", "getError", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/exchange/allin/net/ws/data/WebSocketResult;", "equals", "", "other", "hashCode", "toString", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public final /* data */ class WebSocketResult<T> {
    public static final int $stable = 0;

    @Nullable
    private final String error;
    private final int id;

    @NotNull
    private final String method;
    private final T result;

    public WebSocketResult(int i, @NotNull String method, @Nullable String str, T t) {
        Intrinsics.m18599g(method, "method");
        this.id = i;
        this.method = method;
        this.error = str;
        this.result = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebSocketResult copy$default(WebSocketResult webSocketResult, int i, String str, String str2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = webSocketResult.id;
        }
        if ((i2 & 2) != 0) {
            str = webSocketResult.method;
        }
        if ((i2 & 4) != 0) {
            str2 = webSocketResult.error;
        }
        if ((i2 & 8) != 0) {
            obj = webSocketResult.result;
        }
        return webSocketResult.copy(i, str, str2, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final T component4() {
        return this.result;
    }

    @NotNull
    public final WebSocketResult<T> copy(int id, @NotNull String method, @Nullable String error, T result) {
        Intrinsics.m18599g(method, "method");
        return new WebSocketResult<>(id, method, error, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketResult)) {
            return false;
        }
        WebSocketResult webSocketResult = (WebSocketResult) other;
        return this.id == webSocketResult.id && Intrinsics.m18594b(this.method, webSocketResult.method) && Intrinsics.m18594b(this.error, webSocketResult.error) && Intrinsics.m18594b(this.result, webSocketResult.result);
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(Integer.hashCode(this.id) * 31, 31, this.method);
        String str = this.error;
        int iHashCode = (iM5b + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.result;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WebSocketResult(id=" + this.id + ", method=" + this.method + ", error=" + this.error + ", result=" + this.result + ')';
    }
}
