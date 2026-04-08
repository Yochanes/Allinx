package com.engagelab.privates.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DateUtil {
    private static volatile C2494a dateFormatThreadLocal;
    private static final Object lock = new Object();
    private static ConcurrentHashMap<String, ThreadLocal<SimpleDateFormat>> sdfMap = new ConcurrentHashMap<>();
    public static String PATTERN_DATETIME_FILENAME = "yyyyMMdd_HHmm";

    /* JADX INFO: renamed from: com.engagelab.privates.common.utils.DateUtil$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2494a extends ThreadLocal<SimpleDateFormat> {

        /* JADX INFO: renamed from: a */
        public String f35159a;

        public C2494a(String str) {
            this.f35159a = str;
        }

        /* JADX INFO: renamed from: a */
        public SimpleDateFormat m13121a() {
            return new SimpleDateFormat(this.f35159a, Locale.ENGLISH);
        }

        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ SimpleDateFormat initialValue() {
            return m13121a();
        }
    }

    public static SimpleDateFormat getSdf(String str) {
        ThreadLocal<SimpleDateFormat> threadLocal = sdfMap.get(str);
        if (threadLocal == null) {
            synchronized (lock) {
                try {
                    threadLocal = sdfMap.get(str);
                    if (threadLocal == null) {
                        dateFormatThreadLocal = new C2494a(str);
                        sdfMap.put(str, dateFormatThreadLocal);
                        dateFormatThreadLocal = null;
                        threadLocal = sdfMap.get(str);
                    }
                } finally {
                }
            }
        }
        return threadLocal.get();
    }

    public static String getTodayDateTime() {
        return getSdf("yyyyMMddHHmmss").format(new Date());
    }

    public static String getTodayDateTimeForFilename() {
        return getSdf(PATTERN_DATETIME_FILENAME).format(new Date());
    }

    public static String getTodayDateTimeForReport() {
        return getSdf("yyyy-MM-dd_HH:mm:ss").format(new Date());
    }

    public static boolean isDaysAgo(Date date, int i) {
        if (date == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(date.getTime());
        calendar.roll(6, -i);
        return calendar.after(calendar2);
    }

    public static Date parseDateInFilename(String str) {
        try {
            return getSdf(PATTERN_DATETIME_FILENAME).parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
