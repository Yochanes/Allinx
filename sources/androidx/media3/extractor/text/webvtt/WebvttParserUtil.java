package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class WebvttParserUtil {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* JADX INFO: renamed from: a */
    public static float m11039a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* JADX INFO: renamed from: b */
    public static long m11040b(String str) {
        int i = Util.f25665a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j2 += Long.parseLong(strTrim);
        }
        return j2 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static void m11041c(ParsableByteArray parsableByteArray) throws ParserException {
        int i = parsableByteArray.f25645b;
        Charset charset = StandardCharsets.UTF_8;
        String strM9555h = parsableByteArray.m9555h(charset);
        if (strM9555h == null || !strM9555h.startsWith("WEBVTT")) {
            parsableByteArray.m9546G(i);
            throw ParserException.m9344a(null, "Expected WEBVTT. Got " + parsableByteArray.m9555h(charset));
        }
    }
}
