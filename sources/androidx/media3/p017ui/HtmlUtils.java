package androidx.media3.p017ui;

import android.graphics.Color;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class HtmlUtils {
    /* JADX INFO: renamed from: a */
    public static String m11108a(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = Util.f25665a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }
}
