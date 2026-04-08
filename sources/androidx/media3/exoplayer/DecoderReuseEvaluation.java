package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DecoderReuseEvaluation {

    /* JADX INFO: renamed from: a */
    public final String f26006a;

    /* JADX INFO: renamed from: b */
    public final Format f26007b;

    /* JADX INFO: renamed from: c */
    public final Format f26008c;

    /* JADX INFO: renamed from: d */
    public final int f26009d;

    /* JADX INFO: renamed from: e */
    public final int f26010e;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderDiscardReasons {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        Assertions.m9460a(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f26006a = str;
        format.getClass();
        this.f26007b = format;
        format2.getClass();
        this.f26008c = format2;
        this.f26009d = i;
        this.f26010e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.f26009d == decoderReuseEvaluation.f26009d && this.f26010e == decoderReuseEvaluation.f26010e && this.f26006a.equals(decoderReuseEvaluation.f26006a) && this.f26007b.equals(decoderReuseEvaluation.f26007b) && this.f26008c.equals(decoderReuseEvaluation.f26008c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26008c.hashCode() + ((this.f26007b.hashCode() + AbstractC0000a.m5b((((527 + this.f26009d) * 31) + this.f26010e) * 31, 31, this.f26006a)) * 31);
    }
}
