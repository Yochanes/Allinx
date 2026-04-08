package com.engagelab.privates.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.compose.animation.AbstractC0455a;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.utilities.AbstractC5852a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Locale;
import java.util.TimeZone;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DeviceUtil {
    private static final FileFilter CPU_FILTER = new C2495a();
    private static String CPU_HARDWARE = "";
    private static String CPU_INFO = "";
    private static final String TAG = "DeviceUtil";

    /* JADX INFO: renamed from: com.engagelab.privates.common.utils.DeviceUtil$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C2495a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    private static int extractValue(byte[] bArr, int i) {
        byte b2;
        byte b3;
        while (i < bArr.length && (b2 = bArr[i]) != 10) {
            try {
                if (b2 >= 48 && b2 <= 57) {
                    int i2 = i + 1;
                    while (i2 < bArr.length && (b3 = bArr[i2]) >= 48 && b3 <= 57) {
                        i2++;
                    }
                    return Integer.parseInt(new String(bArr, 0, i, i2 - i));
                }
                i++;
            } catch (Throwable unused) {
            }
            return -1;
        }
        return -1;
    }

    public static String getAndroidId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String getBrand() {
        return String.format(Locale.ENGLISH, Build.BRAND, new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if ((-1) != r4.read(r1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r5 = r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r5 < 48) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r5 > 57) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r0 = java.lang.Integer.parseInt(new java.lang.String(r1, 0, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r0 = new java.io.FileInputStream("/proc/cpuinfo");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r1 = parseFileForValue("cpu MHz", r0) * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        if (r3 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r1 = new byte[com.google.firebase.crashlytics.internal.metadata.UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];
        r4 = new java.io.FileInputStream(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCPUMaxFreqKHz() {
        int fileForValue;
        FileInputStream fileInputStream;
        int i;
        int i2 = 0;
        while (true) {
            FileInputStream fileInputStream2 = null;
            try {
                if (i2 >= getCpuCoreCount()) {
                    break;
                }
                try {
                    File file = new File("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
                    if (file.exists()) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    th = th;
                }
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            } catch (Throwable unused2) {
            }
        }
        return fileForValue;
        try {
            fileInputStream.close();
        } catch (Throwable unused3) {
        }
        return i;
        try {
            fileInputStream.close();
        } catch (Throwable unused4) {
        }
        return -1;
        return i;
        return -1;
    }

    public static String getCarrier(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(AttributeType.PHONE)).getNetworkOperatorName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getCpuCoreCount() {
        File[] fileArrListFiles;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists() && (fileArrListFiles = file.listFiles(CPU_FILTER)) != null && fileArrListFiles.length != 0) {
                return fileArrListFiles.length;
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getCpuHardwareInfo() {
        if (!TextUtils.isEmpty(CPU_HARDWARE)) {
            return CPU_HARDWARE;
        }
        matchCpuInfo();
        return CPU_HARDWARE;
    }

    public static String getCpuInfo() {
        if (!TextUtils.isEmpty(CPU_INFO)) {
            return CPU_INFO;
        }
        matchCpuInfo();
        return CPU_INFO;
    }

    public static String getLanguage(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String getManufacturer() {
        return String.format(Locale.ENGLISH, Build.MANUFACTURER, new Object[0]);
    }

    public static String getModel() {
        return String.format(Locale.ENGLISH, Build.MODEL, new Object[0]);
    }

    public static String getProduct() {
        return String.format(Locale.ENGLISH, Build.PRODUCT, new Object[0]);
    }

    public static long getRamSize(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
            activityManager.getProcessMemoryInfo(new int[]{0});
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static String getResolution(Context context) {
        DisplayMetrics displayMetrics;
        try {
            if (context.getResources() == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
                return "0*0";
            }
            return displayMetrics.widthPixels + Marker.ANY_MARKER + displayMetrics.heightPixels;
        } catch (Throwable unused) {
            return "0*0";
        }
    }

    public static long getRomSize(Context context) {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1024;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static double getScreenSize(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static String getSystemDevice() {
        return Build.DEVICE.toLowerCase();
    }

    public static String getSystemVersionRelease() {
        return String.format(Locale.ENGLISH, Build.VERSION.RELEASE, new Object[0]);
    }

    public static int getSystemVersionSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static String getTimeZone() {
        long rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        return (rawOffset > 0 ? AbstractC0455a.m2238m(rawOffset, Marker.ANY_NON_NULL_MARKER) : rawOffset < 0 ? AbstractC0455a.m2238m(rawOffset, "-") : AbstractC0455a.m2238m(rawOffset, "")).replace("--", "-");
    }

    public static String getTimeZoneId() {
        return Build.VERSION.SDK_INT >= 26 ? AbstractC5852a.m16777k(AbstractC5852a.m16788v()) : TimeZone.getDefault().getID();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void matchCpuInfo() {
        BufferedReader bufferedReader;
        File file;
        try {
            file = new File("/proc/cpuinfo");
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            if (file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (line.contains("Processor")) {
                                StringBuilder sb = new StringBuilder();
                                int iIndexOf = line.indexOf(":");
                                if (iIndexOf >= 0 && iIndexOf < line.length() - 1) {
                                    sb.append(line.substring(iIndexOf + 1).trim());
                                }
                                CPU_INFO = sb.toString();
                            }
                            if (line.contains("Hardware")) {
                                CPU_HARDWARE = line.substring(line.indexOf(":") + 1).trim();
                            }
                        }
                    } catch (Throwable unused2) {
                        if (bufferedReader == null) {
                        }
                    }
                    bufferedReader.close();
                    return;
                }
            }
            return;
            bufferedReader.close();
            return;
        } catch (Throwable unused3) {
            return;
        }
        if (bufferedReader == null) {
        }
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr;
        int i;
        int i2;
        try {
            bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
            i = fileInputStream.read(bArr);
            i2 = 0;
        } catch (Throwable unused) {
        }
        while (i2 < i) {
            byte b2 = bArr[i2];
            if (b2 == 10 || i2 == 0) {
                if (b2 == 10) {
                    i2++;
                }
                for (int i3 = i2; i3 < i; i3++) {
                    int i4 = i3 - i2;
                    if (bArr[i3] != str.charAt(i4)) {
                        break;
                    }
                    if (i4 == str.length() - 1) {
                        return extractValue(bArr, i3);
                    }
                    return -1;
                }
            }
            i2++;
        }
        return -1;
    }
}
