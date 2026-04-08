package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class DeviceInfo {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f25118c = 0;

    /* JADX INFO: renamed from: a */
    public final int f25119a;

    /* JADX INFO: renamed from: b */
    public final int f25120b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    static {
        new DeviceInfo(new Builder());
        Util.m9594D(0);
        Util.m9594D(1);
        Util.m9594D(2);
        Util.m9594D(3);
    }

    public DeviceInfo(Builder builder) {
        builder.getClass();
        this.f25119a = 0;
        this.f25120b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        deviceInfo.getClass();
        return this.f25119a == deviceInfo.f25119a && this.f25120b == deviceInfo.f25120b;
    }

    public final int hashCode() {
        return (((16337 + this.f25119a) * 31) + this.f25120b) * 31;
    }
}
