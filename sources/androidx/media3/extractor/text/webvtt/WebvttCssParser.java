package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.ParsableByteArray;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WebvttCssParser {

    /* JADX INFO: renamed from: c */
    public static final Pattern f29317c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d */
    public static final Pattern f29318d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f29319a = new ParsableByteArray();

    /* JADX INFO: renamed from: b */
    public final StringBuilder f29320b = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public static String m11027a(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z2 = false;
        sb.setLength(0);
        int i = parsableByteArray.f25645b;
        int i2 = parsableByteArray.f25646c;
        while (i < i2 && !z2) {
            char c2 = (char) parsableByteArray.f25644a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z2 = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        parsableByteArray.m9547H(i - parsableByteArray.f25645b);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m11028b(ParsableByteArray parsableByteArray, StringBuilder sb) {
        m11029c(parsableByteArray);
        if (parsableByteArray.m9548a() == 0) {
            return null;
        }
        String strM11027a = m11027a(parsableByteArray, sb);
        if (!"".equals(strM11027a)) {
            return strM11027a;
        }
        return "" + ((char) parsableByteArray.m9568u());
    }

    /* JADX INFO: renamed from: c */
    public static void m11029c(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z2 = true; parsableByteArray.m9548a() > 0 && z2; z2 = false) {
                int i = parsableByteArray.f25645b;
                byte[] bArr = parsableByteArray.f25644a;
                byte b2 = bArr[i];
                char c2 = (char) b2;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    parsableByteArray.m9547H(1);
                } else {
                    int i2 = parsableByteArray.f25646c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b2 == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            parsableByteArray.m9547H(i2 - parsableByteArray.f25645b);
                        }
                    }
                }
            }
            return;
        }
    }
}
