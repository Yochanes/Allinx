package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class GTCaptcha4Config implements NoProguard {

    /* JADX INFO: renamed from: a */
    public final boolean f42157a;

    /* JADX INFO: renamed from: b */
    public final String f42158b;

    /* JADX INFO: renamed from: c */
    public final String f42159c;

    /* JADX INFO: renamed from: d */
    public final String[] f42160d;

    /* JADX INFO: renamed from: e */
    public final String[] f42161e;

    /* JADX INFO: renamed from: f */
    public final Map<String, Object> f42162f;

    /* JADX INFO: renamed from: g */
    public final boolean f42163g;

    /* JADX INFO: renamed from: h */
    public final int f42164h;

    /* JADX INFO: renamed from: i */
    public final int f42165i;

    /* JADX INFO: renamed from: j */
    public final String f42166j;

    /* JADX INFO: renamed from: k */
    public final GTCaptcha4Client.OnDialogShowListener f42167k;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder implements NoProguard {

        /* JADX INFO: renamed from: d */
        public String[] f42171d;

        /* JADX INFO: renamed from: e */
        public String[] f42172e;

        /* JADX INFO: renamed from: a */
        public boolean f42168a = false;

        /* JADX INFO: renamed from: b */
        public String f42169b = null;

        /* JADX INFO: renamed from: c */
        public String f42170c = "file:///android_asset/gt4-index.html";

        /* JADX INFO: renamed from: f */
        public Map<String, Object> f42173f = null;

        /* JADX INFO: renamed from: g */
        public boolean f42174g = true;

        /* JADX INFO: renamed from: h */
        public int f42175h = 10000;

        /* JADX INFO: renamed from: i */
        public int f42176i = 0;

        /* JADX INFO: renamed from: j */
        public String f42177j = null;

        /* JADX INFO: renamed from: k */
        public GTCaptcha4Client.OnDialogShowListener f42178k = null;

        public static /* synthetic */ boolean access$000(Builder builder) {
            return builder.f42168a;
        }

        public static /* synthetic */ String access$100(Builder builder) {
            return builder.f42169b;
        }

        public static /* synthetic */ String[] access$1000(Builder builder) {
            return builder.f42172e;
        }

        public static /* synthetic */ String access$200(Builder builder) {
            return builder.f42170c;
        }

        public static /* synthetic */ Map access$300(Builder builder) {
            return builder.f42173f;
        }

        public static /* synthetic */ boolean access$400(Builder builder) {
            return builder.f42174g;
        }

        public static /* synthetic */ int access$500(Builder builder) {
            return builder.f42175h;
        }

        public static /* synthetic */ int access$600(Builder builder) {
            return builder.f42176i;
        }

        public static /* synthetic */ String access$700(Builder builder) {
            return builder.f42177j;
        }

        public static /* synthetic */ GTCaptcha4Client.OnDialogShowListener access$800(Builder builder) {
            return builder.f42178k;
        }

        public static /* synthetic */ String[] access$900(Builder builder) {
            return builder.f42171d;
        }

        public GTCaptcha4Config build() {
            return new GTCaptcha4Config(this, null);
        }

        public void setApiServers(String[] strArr) {
            this.f42171d = strArr;
        }

        public Builder setBackgroundColor(int i) {
            this.f42176i = i;
            return this;
        }

        public Builder setCanceledOnTouchOutside(boolean z2) {
            this.f42174g = z2;
            return this;
        }

        public Builder setDebug(boolean z2) {
            this.f42168a = z2;
            return this;
        }

        public void setDialogShowListener(GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
            this.f42178k = onDialogShowListener;
        }

        public Builder setDialogStyle(String str) {
            this.f42177j = str;
            return this;
        }

        public Builder setLanguage(String str) {
            this.f42169b = str;
            return this;
        }

        public Builder setParams(Map<String, Object> map) {
            this.f42173f = map;
            return this;
        }

        public Builder setResourcePath(String str) {
            this.f42170c = str;
            return this;
        }

        public void setStaticServers(String[] strArr) {
            this.f42172e = strArr;
        }

        public Builder setTimeOut(int i) {
            this.f42175h = i;
            return this;
        }
    }

    public /* synthetic */ GTCaptcha4Config(Builder builder, C3571a c3571a) {
        this(builder);
    }

    public String[] getApiServers() {
        return this.f42160d;
    }

    public int getBackgroundColor() {
        return this.f42165i;
    }

    public GTCaptcha4Client.OnDialogShowListener getDialogShowListener() {
        return this.f42167k;
    }

    public String getDialogStyle() {
        return this.f42166j;
    }

    public String getHtml() {
        return this.f42159c;
    }

    public String getLanguage() {
        return this.f42158b;
    }

    public Map<String, Object> getParams() {
        return this.f42162f;
    }

    public String[] getStaticServers() {
        return this.f42161e;
    }

    public int getTimeOut() {
        return this.f42164h;
    }

    public boolean isCanceledOnTouchOutside() {
        return this.f42163g;
    }

    public boolean isDebug() {
        return this.f42157a;
    }

    public GTCaptcha4Config(Builder builder) {
        this.f42157a = Builder.access$000(builder);
        this.f42158b = Builder.access$100(builder);
        this.f42159c = Builder.access$200(builder);
        this.f42162f = Builder.access$300(builder);
        this.f42163g = Builder.access$400(builder);
        this.f42164h = Builder.access$500(builder);
        this.f42165i = Builder.access$600(builder);
        this.f42166j = Builder.access$700(builder);
        this.f42167k = Builder.access$800(builder);
        this.f42160d = Builder.access$900(builder);
        this.f42161e = Builder.access$1000(builder);
    }
}
