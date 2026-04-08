package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/core/os/BuildCompat;", "", "Api30Impl", "PrereleaseSdkCheck", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BuildCompat {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f23252a = 0;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static void m7633a(int i) {
            SdkExtensions.getExtensionVersion(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Api30Impl.m7633a(30);
        }
        if (i >= 30) {
            Api30Impl.m7633a(31);
        }
        if (i >= 30) {
            Api30Impl.m7633a(33);
        }
        if (i >= 30) {
            Api30Impl.m7633a(1000000);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m7631a(String str) {
        String buildCodename = Build.VERSION.CODENAME;
        Intrinsics.m18599g(buildCodename, "buildCodename");
        if ("REL".equals(buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.m18598f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        Intrinsics.m18598f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7632b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.m18598f(CODENAME, "CODENAME");
        return m7631a("VanillaIceCream");
    }
}
