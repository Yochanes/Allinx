package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class BidiFormatter {

    /* JADX INFO: renamed from: c */
    public static final TextDirectionHeuristicCompat f23312c = TextDirectionHeuristicsCompat.f23332c;

    /* JADX INFO: renamed from: d */
    public static final String f23313d = Character.toString(8206);

    /* JADX INFO: renamed from: e */
    public static final String f23314e = Character.toString(8207);

    /* JADX INFO: renamed from: f */
    public static final BidiFormatter f23315f = new BidiFormatter(false);

    /* JADX INFO: renamed from: g */
    public static final BidiFormatter f23316g = new BidiFormatter(true);

    /* JADX INFO: renamed from: a */
    public final boolean f23317a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristicCompat f23318b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class DirectionalityEstimator {

        /* JADX INFO: renamed from: e */
        public static final byte[] f23319e = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f23320a;

        /* JADX INFO: renamed from: b */
        public final int f23321b;

        /* JADX INFO: renamed from: c */
        public int f23322c;

        /* JADX INFO: renamed from: d */
        public char f23323d;

        static {
            for (int i = 0; i < 1792; i++) {
                f23319e[i] = Character.getDirectionality(i);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence) {
            this.f23320a = charSequence;
            this.f23321b = charSequence.length();
        }

        /* JADX INFO: renamed from: a */
        public final byte m7672a() {
            int i = this.f23322c - 1;
            CharSequence charSequence = this.f23320a;
            char cCharAt = charSequence.charAt(i);
            this.f23323d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f23322c);
                this.f23322c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f23322c--;
            char c2 = this.f23323d;
            return c2 < 1792 ? f23319e[c2] : Character.getDirectionality(c2);
        }
    }

    public BidiFormatter(boolean z2) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f23332c;
        this.f23317a = z2;
        this.f23318b = textDirectionHeuristicCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0.f23322c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        switch(r0.m7672a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m7668a(CharSequence charSequence) {
        byte directionality;
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.f23322c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = directionalityEstimator.f23322c;
            if (i4 < directionalityEstimator.f23321b && i == 0) {
                CharSequence charSequence2 = directionalityEstimator.f23320a;
                char cCharAt = charSequence2.charAt(i4);
                directionalityEstimator.f23323d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, directionalityEstimator.f23322c);
                    directionalityEstimator.f23322c = Character.charCount(iCodePointAt) + directionalityEstimator.f23322c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    directionalityEstimator.f23322c++;
                    char c2 = directionalityEstimator.f23323d;
                    directionality = c2 < 1792 ? DirectionalityEstimator.f23319e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        return 1;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m7669b(CharSequence charSequence) {
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.f23322c = directionalityEstimator.f23321b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (directionalityEstimator.f23322c > 0) {
                byte bM7672a = directionalityEstimator.m7672a();
                if (bM7672a == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                } else if (bM7672a == 1 || bM7672a == 2) {
                    if (i != 0) {
                        if (i2 == 0) {
                            break;
                        }
                    }
                } else if (bM7672a != 9) {
                    switch (bM7672a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static BidiFormatter m7670c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f23316g : f23315f;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m7671d(CharSequence charSequence) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f23332c;
        if (charSequence == null) {
            return null;
        }
        boolean zMo7674a = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) textDirectionHeuristicCompat).mo7674a(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zMo7674a2 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zMo7674a ? TextDirectionHeuristicsCompat.f23331b : TextDirectionHeuristicsCompat.f23330a)).mo7674a(charSequence, charSequence.length());
        String str = "";
        String str2 = f23314e;
        String str3 = f23313d;
        boolean z2 = this.f23317a;
        spannableStringBuilder.append((CharSequence) ((z2 || !(zMo7674a2 || m7668a(charSequence) == 1)) ? (!z2 || (zMo7674a2 && m7668a(charSequence) != -1)) ? "" : str2 : str3));
        if (zMo7674a != z2) {
            spannableStringBuilder.append(zMo7674a ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zMo7674a3 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zMo7674a ? TextDirectionHeuristicsCompat.f23331b : TextDirectionHeuristicsCompat.f23330a)).mo7674a(charSequence, charSequence.length());
        if (!z2 && (zMo7674a3 || m7669b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!zMo7674a3 || m7669b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
