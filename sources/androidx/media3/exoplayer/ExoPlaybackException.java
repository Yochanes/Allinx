package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: c */
    public final int f26046c;

    /* JADX INFO: renamed from: d */
    public final String f26047d;

    /* JADX INFO: renamed from: f */
    public final int f26048f;

    /* JADX INFO: renamed from: g */
    public final Format f26049g;

    /* JADX INFO: renamed from: i */
    public final int f26050i;

    /* JADX INFO: renamed from: j */
    public final MediaSource.MediaPeriodId f26051j;

    /* JADX INFO: renamed from: n */
    public final boolean f26052n;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface Type {
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    /* JADX INFO: renamed from: a */
    public final ExoPlaybackException m9819a(MediaSource.MediaPeriodId mediaPeriodId) {
        String message = getMessage();
        int i = Util.f25665a;
        return new ExoPlaybackException(message, getCause(), this.f25319a, this.f26046c, this.f26047d, this.f26048f, this.f26049g, this.f26050i, mediaPeriodId, this.f25320b, this.f26052n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, Format format, int i4, MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z2) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        Assertions.m9460a(!z2 || i2 == 1);
        Assertions.m9460a(th != null || i2 == 3);
        this.f26046c = i2;
        this.f26047d = str2;
        this.f26048f = i3;
        this.f26049g = format;
        this.f26050i = i4;
        this.f26051j = mediaPeriodId;
        this.f26052n = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, Format format, int i4, boolean z2) {
        String str2;
        int i5;
        Format format2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            format2 = format;
            string = "Source error";
        } else if (i != 1) {
            if (i != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i5 = i3;
            format2 = format;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            format2 = format;
            sb.append(format2);
            sb.append(", format_supported=");
            sb.append(Util.m9630u(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : AbstractC0000a.m2C(string, ": null"), th, i2, i, str2, i5, format2, i4, null, SystemClock.elapsedRealtime(), z2);
    }
}
