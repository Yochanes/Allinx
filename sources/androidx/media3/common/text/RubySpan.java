package androidx.media3.common.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RubySpan implements LanguageFeatureSpan {

    /* JADX INFO: renamed from: c */
    public static final String f25560c;

    /* JADX INFO: renamed from: d */
    public static final String f25561d;

    /* JADX INFO: renamed from: a */
    public final String f25562a;

    /* JADX INFO: renamed from: b */
    public final int f25563b;

    static {
        int i = Util.f25665a;
        f25560c = Integer.toString(0, 36);
        f25561d = Integer.toString(1, 36);
    }

    public RubySpan(String str, int i) {
        this.f25562a = str;
        this.f25563b = i;
    }
}
