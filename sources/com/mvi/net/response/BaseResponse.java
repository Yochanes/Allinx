package com.mvi.net.response;

import com.mvi.base.IgnoredOnProguard;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&J\r\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\n\u0010\r\u001a\u0004\u0018\u00010\fH&J\b\u0010\u000e\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u0006H&¨\u0006\u0010"}, m18302d2 = {"Lcom/mvi/net/response/BaseResponse;", "T", "", "<init>", "()V", "isSuccess", "", "getResponseData", "()Ljava/lang/Object;", "getResponseCode", "", "getResponseMsg", "", "getResponseError", "getResponseCount", "isNoLogin", "mvi_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@IgnoredOnProguard
public abstract class BaseResponse<T> {
    public abstract int getResponseCode();

    public abstract int getResponseCount();

    public abstract T getResponseData();

    @Nullable
    public abstract String getResponseError();

    @Nullable
    public abstract String getResponseMsg();

    public abstract boolean isNoLogin();

    public abstract boolean isSuccess();
}
