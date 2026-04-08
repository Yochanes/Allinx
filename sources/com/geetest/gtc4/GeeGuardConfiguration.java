package com.geetest.gtc4;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class GeeGuardConfiguration {

    /* JADX INFO: renamed from: a */
    public final String f42297a;

    /* JADX INFO: renamed from: b */
    public final boolean f42298b;

    /* JADX INFO: renamed from: c */
    public final boolean f42299c;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, Object> f42300d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, JSONObject> f42301e;

    /* JADX INFO: renamed from: f */
    public final int f42302f;

    /* JADX INFO: renamed from: g */
    public final String f42303g;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {

        /* JADX INFO: renamed from: a */
        public String f42304a = null;

        /* JADX INFO: renamed from: b */
        public boolean f42305b = false;

        /* JADX INFO: renamed from: c */
        public boolean f42306c = true;

        /* JADX INFO: renamed from: d */
        public HashMap<String, Object> f42307d = null;

        /* JADX INFO: renamed from: e */
        public HashMap<String, JSONObject> f42308e = null;

        /* JADX INFO: renamed from: f */
        public int f42309f = 1;

        /* JADX INFO: renamed from: g */
        public String f42310g = null;

        public static /* synthetic */ String access$000(Builder builder) {
            return builder.f42304a;
        }

        public static /* synthetic */ boolean access$100(Builder builder) {
            return builder.f42305b;
        }

        public static /* synthetic */ boolean access$200(Builder builder) {
            return builder.f42306c;
        }

        public static /* synthetic */ HashMap access$300(Builder builder) {
            return builder.f42307d;
        }

        public static /* synthetic */ HashMap access$400(Builder builder) {
            return builder.f42308e;
        }

        public static /* synthetic */ int access$500(Builder builder) {
            return builder.f42309f;
        }

        public static /* synthetic */ String access$600(Builder builder) {
            return builder.f42310g;
        }

        public Builder addSignature(String str) {
            this.f42310g = str;
            return this;
        }

        public GeeGuardConfiguration build() {
            return new GeeGuardConfiguration(this, null);
        }

        public Builder setAlInfo(boolean z2) {
            this.f42305b = z2;
            return this;
        }

        public Builder setAppId(String str) {
            this.f42304a = str;
            return this;
        }

        public Builder setDevInfo(boolean z2) {
            this.f42306c = z2;
            return this;
        }

        public Builder setExtraInfo(HashMap<String, JSONObject> map) {
            this.f42308e = map;
            return this;
        }

        public Builder setLevel(int i) {
            this.f42309f = i;
            return this;
        }

        public Builder setOuterInfo(HashMap<String, Object> map) {
            this.f42307d = map;
            return this;
        }
    }

    public /* synthetic */ GeeGuardConfiguration(Builder builder, C3613a c3613a) {
        this(builder);
    }

    public String getAppId() {
        return this.f42297a;
    }

    public String getContent() {
        return this.f42303g;
    }

    public HashMap<String, JSONObject> getExtraInfo() {
        return this.f42301e;
    }

    public int getLevel() {
        return this.f42302f;
    }

    public HashMap<String, Object> getOuterInfo() {
        return this.f42300d;
    }

    public boolean isAlInfo() {
        return this.f42298b;
    }

    public boolean isDevInfo() {
        return this.f42299c;
    }

    private GeeGuardConfiguration(Builder builder) {
        this.f42297a = Builder.access$000(builder);
        this.f42298b = Builder.access$100(builder);
        this.f42299c = Builder.access$200(builder);
        this.f42300d = Builder.access$300(builder);
        this.f42301e = Builder.access$400(builder);
        this.f42302f = Builder.access$500(builder);
        this.f42303g = Builder.access$600(builder);
    }
}
