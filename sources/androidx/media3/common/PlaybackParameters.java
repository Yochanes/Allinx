package androidx.media3.common;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters {

    /* JADX INFO: renamed from: d */
    public static final PlaybackParameters f25321d = new PlaybackParameters(1.0f, 1.0f);

    /* JADX INFO: renamed from: a */
    public final float f25322a;

    /* JADX INFO: renamed from: b */
    public final float f25323b;

    /* JADX INFO: renamed from: c */
    public final int f25324c;

    static {
        Util.m9594D(0);
        Util.m9594D(1);
    }

    public PlaybackParameters(float f, float f2) {
        Assertions.m9460a(f > 0.0f);
        Assertions.m9460a(f2 > 0.0f);
        this.f25322a = f;
        this.f25323b = f2;
        this.f25324c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PlaybackParameters.class == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.f25322a == playbackParameters.f25322a && this.f25323b == playbackParameters.f25323b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f25323b) + ((Float.floatToRawIntBits(this.f25322a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f25322a), Float.valueOf(this.f25323b)};
        int i = Util.f25665a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
