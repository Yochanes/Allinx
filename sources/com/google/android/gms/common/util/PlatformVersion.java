package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.core.os.BuildCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastLollipopMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastM() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastU() {
        if (!isAtLeastT()) {
            return false;
        }
        int i = BuildCompat.f23252a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            return true;
        }
        if (i2 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        Intrinsics.m18598f(CODENAME, "CODENAME");
        return BuildCompat.m7631a("UpsideDownCake");
    }

    @ChecksSdkIntAtLeast
    @KeepForSdk
    public static boolean isAtLeastV() {
        if (isAtLeastU()) {
            return BuildCompat.m7632b();
        }
        return false;
    }
}
