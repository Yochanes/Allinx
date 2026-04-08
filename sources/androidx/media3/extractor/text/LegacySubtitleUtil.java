package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.SubtitleParser;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class LegacySubtitleUtil {
    /* JADX INFO: renamed from: a */
    public static void m10956a(Subtitle subtitle, int i, Consumer consumer) {
        long jMo10950b = subtitle.mo10950b(i);
        List listMo10951c = subtitle.mo10951c(jMo10950b);
        if (listMo10951c.isEmpty()) {
            return;
        }
        if (i == subtitle.mo10952d() - 1) {
            throw new IllegalStateException();
        }
        long jMo10950b2 = subtitle.mo10950b(i + 1) - subtitle.mo10950b(i);
        if (jMo10950b2 > 0) {
            consumer.accept(new CuesWithTiming(jMo10950b, jMo10950b2, listMo10951c));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m10957b(Subtitle subtitle, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        int iMo10949a;
        boolean z2;
        long j = outputOptions.f29001a;
        if (j == -9223372036854775807L) {
            iMo10949a = 0;
        } else {
            iMo10949a = subtitle.mo10949a(j);
            if (iMo10949a == -1) {
                iMo10949a = subtitle.mo10952d();
            }
            if (iMo10949a > 0 && subtitle.mo10950b(iMo10949a - 1) == j) {
                iMo10949a--;
            }
        }
        if (j == -9223372036854775807L || iMo10949a >= subtitle.mo10952d()) {
            z2 = false;
        } else {
            List listMo10951c = subtitle.mo10951c(j);
            long jMo10950b = subtitle.mo10950b(iMo10949a);
            if (!listMo10951c.isEmpty()) {
                long j2 = outputOptions.f29001a;
                if (j2 < jMo10950b) {
                    consumer.accept(new CuesWithTiming(j2, jMo10950b - j2, listMo10951c));
                    z2 = true;
                }
            }
        }
        for (int i = iMo10949a; i < subtitle.mo10952d(); i++) {
            m10956a(subtitle, i, consumer);
        }
        if (outputOptions.f29002b) {
            if (z2) {
                iMo10949a--;
            }
            for (int i2 = 0; i2 < iMo10949a; i2++) {
                m10956a(subtitle, i2, consumer);
            }
            if (z2) {
                consumer.accept(new CuesWithTiming(subtitle.mo10950b(iMo10949a), j - subtitle.mo10950b(iMo10949a), subtitle.mo10951c(j)));
            }
        }
    }
}
