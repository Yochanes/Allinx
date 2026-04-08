package com.geetest.captcha;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.geetest.captcha.x */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m18302d2 = {"Lcom/geetest/captcha/model/StatusEnum;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "FLOWING", "SUCCESS", "END", "FAIL", "CANCEL", "NONE", "PreLoadStatusEnum", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public enum EnumC3610x {
    FLOWING("-10"),
    SUCCESS("-11"),
    END("-12"),
    FAIL("-13"),
    CANCEL("-14"),
    NONE("-15");


    @NotNull
    public String type;

    /* JADX INFO: renamed from: com.geetest.captcha.x$a */
    /* JADX INFO: compiled from: Proguard */
    public enum a {
        FLOWING("-16"),
        SUCCESS("-17"),
        FAIL("-18"),
        NONE("-19");


        @NotNull
        public String type;

        a(String str) {
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

    EnumC3610x(String str) {
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
