package com.exchange.allin.utils.ext;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TimeExtKt {
    /* JADX INFO: renamed from: a */
    public static final Pair m14227a(int i) {
        long j = 1000;
        long timeInMillis = Calendar.getInstance().getTimeInMillis() / j;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -i);
        return new Pair(Long.valueOf(calendar.getTimeInMillis() / j), Long.valueOf(timeInMillis));
    }

    /* JADX INFO: renamed from: b */
    public static final String m14228b(double d) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((long) (d * ((double) 1000)));
        Calendar calendar2 = Calendar.getInstance();
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            String str = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(calendar.getTime());
            Intrinsics.m18596d(str);
            return str;
        }
        if (calendar.get(1) == calendar2.get(1)) {
            String str2 = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault()).format(calendar.getTime());
            Intrinsics.m18596d(str2);
            return str2;
        }
        String str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.m18596d(str3);
        return str3;
    }

    /* JADX INFO: renamed from: c */
    public static final String m14229c(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * ((long) 1000));
        if (calendar.get(1) == Calendar.getInstance().get(1)) {
            String str = new SimpleDateFormat("MM/dd HH:mm:ss", Locale.getDefault()).format(calendar.getTime());
            Intrinsics.m18596d(str);
            return str;
        }
        String str2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(calendar.getTime());
        Intrinsics.m18596d(str2);
        return str2;
    }

    /* JADX INFO: renamed from: d */
    public static final String m14230d(long j) {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(Long.valueOf(j));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static final String m14231e(long j) {
        String str = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static final String m14232f(long j) {
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(j));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: g */
    public static final String m14233g(long j) {
        long j2 = 60;
        return String.format("%dH%dM%dS", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((j / ((long) 3600000)) % ((long) 24))), Integer.valueOf((int) ((j / ((long) 60000)) % j2)), Integer.valueOf((int) ((j / ((long) 1000)) % j2))}, 3));
    }

    /* JADX INFO: renamed from: h */
    public static final String m14234h(long j) {
        long j2 = 60;
        return String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((j / ((long) 3600000)) % ((long) 24))), Integer.valueOf((int) ((j / ((long) 60000)) % j2)), Integer.valueOf((int) ((j / ((long) 1000)) % j2))}, 3));
    }
}
