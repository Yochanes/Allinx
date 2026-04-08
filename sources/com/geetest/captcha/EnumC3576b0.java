package com.geetest.captcha;

import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.geetest.captcha.b0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3576b0 {
    CENTER("center"),
    BOTTOM(VerticalAlignment.BOTTOM);


    @NotNull
    public String value;

    EnumC3576b0(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.value = str;
    }
}
