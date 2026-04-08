package com.geetest.captcha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.geetest.captcha.d0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3580d0 {
    WEB_VIEW_NEW("0"),
    PARAM("1"),
    WEB_VIEW_HTTP("2"),
    WEB_VIEW_SSL("3"),
    USER_ERROR("4"),
    WEB_CALLBACK_ERROR("5"),
    NET("6");


    @NotNull
    public String type;

    EnumC3580d0(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.type = str;
    }
}
