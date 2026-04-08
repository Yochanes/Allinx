package androidx.media3.p017ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SubtitleViewUtils {
    /* JADX INFO: renamed from: a */
    public static void m11179a(Cue.Builder builder) {
        builder.f25546k = -3.4028235E38f;
        builder.f25545j = Integer.MIN_VALUE;
        CharSequence charSequence = builder.f25536a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                builder.f25536a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = builder.f25536a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static float m11180b(float f, int i, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }
}
