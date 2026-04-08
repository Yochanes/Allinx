package androidx.media3.common.text;

import android.os.Bundle;
import android.text.Spanned;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class CustomSpanBundler {

    /* JADX INFO: renamed from: a */
    public static final String f25555a;

    /* JADX INFO: renamed from: b */
    public static final String f25556b;

    /* JADX INFO: renamed from: c */
    public static final String f25557c;

    /* JADX INFO: renamed from: d */
    public static final String f25558d;

    /* JADX INFO: renamed from: e */
    public static final String f25559e;

    static {
        int i = Util.f25665a;
        f25555a = Integer.toString(0, 36);
        f25556b = Integer.toString(1, 36);
        f25557c = Integer.toString(2, 36);
        f25558d = Integer.toString(3, 36);
        f25559e = Integer.toString(4, 36);
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m9458a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f25555a, spanned.getSpanStart(obj));
        bundle2.putInt(f25556b, spanned.getSpanEnd(obj));
        bundle2.putInt(f25557c, spanned.getSpanFlags(obj));
        bundle2.putInt(f25558d, i);
        if (bundle != null) {
            bundle2.putBundle(f25559e, bundle);
        }
        return bundle2;
    }
}
