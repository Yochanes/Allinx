package androidx.media3.common;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f25319a;

    /* JADX INFO: renamed from: b */
    public final long f25320b;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
        AbstractC1610a.m8737o(0, 1, 2, 3, 4);
        Util.m9594D(5);
    }

    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.f25319a = i;
        this.f25320b = j;
    }
}
