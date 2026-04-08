package androidx.core.os;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {

    /* JADX INFO: renamed from: b */
    public static final LocaleListCompat f23258b = m7652f(new LocaleList(new Locale[0]));

    /* JADX INFO: renamed from: a */
    public final LocaleListPlatformWrapper f23259a;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f23260a = 0;

        static {
            new Locale("en", "XA");
            new Locale("ar", "XB");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    public LocaleListCompat(LocaleListPlatformWrapper localeListPlatformWrapper) {
        this.f23259a = localeListPlatformWrapper;
    }

    /* JADX INFO: renamed from: a */
    public static LocaleListCompat m7651a(String str) {
        if (str == null || str.isEmpty()) {
            return f23258b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = Api21Impl.f23260a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return m7652f(new LocaleList(localeArr));
    }

    /* JADX INFO: renamed from: f */
    public static LocaleListCompat m7652f(LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }

    /* JADX INFO: renamed from: b */
    public final Locale m7653b(int i) {
        return this.f23259a.f23261a.get(i);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7654c() {
        return this.f23259a.f23261a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final int m7655d() {
        return this.f23259a.f23261a.size();
    }

    /* JADX INFO: renamed from: e */
    public final String m7656e() {
        return this.f23259a.f23261a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocaleListCompat) {
            return this.f23259a.equals(((LocaleListCompat) obj).f23259a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23259a.f23261a.hashCode();
    }

    public final String toString() {
        return this.f23259a.f23261a.toString();
    }
}
