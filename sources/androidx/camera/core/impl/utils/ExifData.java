package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.core.util.Preconditions;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ExifData {

    /* JADX INFO: renamed from: c */
    public static final ExifTag[] f2863c;

    /* JADX INFO: renamed from: d */
    public static final ExifTag[][] f2864d;

    /* JADX INFO: renamed from: e */
    public static final HashSet f2865e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f2866a;

    /* JADX INFO: renamed from: b */
    public final ByteOrder f2867b;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C02851 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2868a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f2869b;

        static {
            int[] iArr = new int[WhiteBalanceMode.values().length];
            f2869b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2869b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraCaptureMetaData.FlashState.values().length];
            f2868a = iArr2;
            try {
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2868a[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2868a[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: c */
        public static final Pattern f2870c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d */
        public static final Pattern f2871d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e */
        public static final Pattern f2872e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f */
        public static final ArrayList f2873f;

        /* JADX INFO: renamed from: a */
        public final ArrayList f2874a;

        /* JADX INFO: renamed from: b */
        public final ByteOrder f2875b;

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$Builder$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C02861 implements Enumeration<HashMap<String, ExifTag>> {

            /* JADX INFO: renamed from: a */
            public int f2876a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f2876a;
                ExifTag[] exifTagArr = ExifData.f2863c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> map = new HashMap<>();
                for (ExifTag exifTag : ExifData.f2864d[this.f2876a]) {
                    map.put(exifTag.f2890b, exifTag);
                }
                this.f2876a++;
                return map;
            }
        }

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$Builder$2 */
        /* JADX INFO: compiled from: Proguard */
        public class C02872 implements Enumeration<Map<String, ExifAttribute>> {

            /* JADX INFO: renamed from: a */
            public int f2877a;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f2877a;
                ExifTag[] exifTagArr = ExifData.f2863c;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, ExifAttribute> nextElement() {
                this.f2877a++;
                return new HashMap();
            }
        }

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$Builder$3 */
        /* JADX INFO: compiled from: Proguard */
        class C02883 implements Enumeration<Map<String, ExifAttribute>> {

            /* JADX INFO: renamed from: a */
            public final Enumeration f2878a;

            public C02883(Builder builder) {
                this.f2878a = Collections.enumeration(builder.f2874a);
            }

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                return this.f2878a.hasMoreElements();
            }

            @Override // java.util.Enumeration
            public final Map<String, ExifAttribute> nextElement() {
                return new HashMap((Map) this.f2878a.nextElement());
            }
        }

        static {
            C02861 c02861 = new C02861();
            c02861.f2876a = 0;
            f2873f = Collections.list(c02861);
        }

        public Builder() {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            C02872 c02872 = new C02872();
            c02872.f2877a = 0;
            this.f2874a = Collections.list(c02872);
            this.f2875b = byteOrder;
        }

        /* JADX INFO: renamed from: a */
        public static Pair m1599a(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair pairM1599a = m1599a(strArrSplit[0]);
                if (((Integer) pairM1599a.first).intValue() == 2) {
                    return pairM1599a;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair pairM1599a2 = m1599a(strArrSplit[i]);
                    int iIntValue = (((Integer) pairM1599a2.first).equals(pairM1599a.first) || ((Integer) pairM1599a2.second).equals(pairM1599a.first)) ? ((Integer) pairM1599a.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairM1599a.second).intValue() == -1 || !(((Integer) pairM1599a2.first).equals(pairM1599a.second) || ((Integer) pairM1599a2.second).equals(pairM1599a.second))) ? -1 : ((Integer) pairM1599a.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairM1599a = new Pair(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairM1599a = new Pair(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairM1599a;
            }
            if (!str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        return (j < 0 || j > 65535) ? j < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            }
            String[] strArrSplit2 = str.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 >= 0 && j3 >= 0) {
                        if (j2 <= 2147483647L && j3 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair(2, -1);
        }

        /* JADX INFO: renamed from: b */
        public final void m1600b(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            m1601c(str, str2, arrayList);
        }

        /* JADX INFO: renamed from: c */
        public final void m1601c(String str, String str2, List list) {
            int i;
            int i2;
            ExifAttribute exifAttribute;
            int i3;
            int i4;
            boolean z2;
            int i5;
            String str3 = str;
            String strReplaceAll = str2;
            int i6 = 1;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f2871d.matcher(strReplaceAll).find();
                boolean zFind2 = f2872e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Logger.m1288i("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i7 = 3;
            int i8 = 2;
            if (strReplaceAll != null && ExifData.f2865e.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f2870c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        Logger.m1288i("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    sb.append(Integer.parseInt(strGroup));
                    sb.append("/1,");
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    sb.append(Integer.parseInt(strGroup2));
                    sb.append("/1,");
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    sb.append(Integer.parseInt(strGroup3));
                    sb.append("/1");
                    strReplaceAll = sb.toString();
                } else {
                    try {
                        strReplaceAll = new LongRational((long) (Double.parseDouble(strReplaceAll) * 10000.0d), 10000L).toString();
                    } catch (NumberFormatException e) {
                        Logger.m1289j("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e);
                        return;
                    }
                }
            }
            int i9 = 0;
            while (true) {
                ExifTag[] exifTagArr = ExifData.f2863c;
                if (i9 >= 4) {
                    return;
                }
                ExifTag exifTag = (ExifTag) ((HashMap) f2873f.get(i9)).get(str4);
                if (exifTag == null) {
                    i = i8;
                    i2 = i7;
                } else {
                    if (strReplaceAll != null) {
                        Pair pairM1599a = m1599a(strReplaceAll);
                        int iIntValue = ((Integer) pairM1599a.first).intValue();
                        int i10 = -1;
                        int i11 = exifTag.f2891c;
                        if (i11 != iIntValue && i11 != ((Integer) pairM1599a.second).intValue()) {
                            int i12 = exifTag.f2892d;
                            if (i12 == -1 || !(i12 == ((Integer) pairM1599a.first).intValue() || i12 == ((Integer) pairM1599a.second).intValue())) {
                                if (i11 == i6 || i11 == 7 || i11 == i8) {
                                }
                                i = i8;
                                i2 = i7;
                            } else {
                                i11 = i12;
                            }
                        }
                        ByteOrder byteOrder = this.f2875b;
                        switch (i11) {
                            case 1:
                                i = i8;
                                i2 = i7;
                                Map map = (Map) list.get(i9);
                                Charset charset = ExifAttribute.f2857d;
                                i6 = i6;
                                if (strReplaceAll.length() != i6 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                    byte[] bytes = strReplaceAll.getBytes(ExifAttribute.f2857d);
                                    exifAttribute = new ExifAttribute(bytes, i6, bytes.length);
                                } else {
                                    byte[] bArr = new byte[i6];
                                    bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                    exifAttribute = new ExifAttribute(bArr, i6, i6);
                                }
                                map.put(str4, exifAttribute);
                                break;
                            case 2:
                            case 7:
                                i2 = i7;
                                Map map2 = (Map) list.get(i9);
                                Charset charset2 = ExifAttribute.f2857d;
                                byte[] bytes2 = strReplaceAll.concat("\u0000").getBytes(ExifAttribute.f2857d);
                                i = 2;
                                map2.put(str4, new ExifAttribute(bytes2, 2, bytes2.length));
                                i6 = i6;
                                break;
                            case 3:
                                int i13 = i7;
                                i3 = i6;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int length = strArrSplit.length;
                                int[] iArr = new int[length];
                                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                                    iArr[i14] = Integer.parseInt(strArrSplit[i14]);
                                }
                                Map map3 = (Map) list.get(i9);
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ExifAttribute.f2859f[i13] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (int i15 = 0; i15 < length; i15++) {
                                    byteBufferWrap.putShort((short) iArr[i15]);
                                }
                                i2 = i13;
                                map3.put(str4, new ExifAttribute(byteBufferWrap.array(), i2, length));
                                i6 = i3;
                                i = 2;
                                break;
                            case 4:
                                i4 = i7;
                                i3 = i6;
                                z2 = false;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i16 = 0; i16 < strArrSplit2.length; i16++) {
                                    jArr[i16] = Long.parseLong(strArrSplit2[i16]);
                                }
                                ((Map) list.get(i9)).put(str4, ExifAttribute.m1596b(jArr, byteOrder));
                                i2 = i4;
                                i6 = i3;
                                i = 2;
                                break;
                            case 5:
                                i4 = i7;
                                i3 = i6;
                                int i17 = -1;
                                z2 = false;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                int length2 = strArrSplit3.length;
                                LongRational[] longRationalArr = new LongRational[length2];
                                int i18 = 0;
                                while (i18 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i18].split(RemoteSettings.FORWARD_SLASH_STRING, i17);
                                    longRationalArr[i18] = new LongRational((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i3]));
                                    i18++;
                                    byteOrder = byteOrder;
                                    i17 = -1;
                                }
                                Map map4 = (Map) list.get(i9);
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[ExifAttribute.f2859f[5] * length2]);
                                byteBufferWrap2.order(byteOrder);
                                for (int i19 = 0; i19 < length2; i19++) {
                                    LongRational longRational = longRationalArr[i19];
                                    byteBufferWrap2.putInt((int) longRational.f2893a);
                                    byteBufferWrap2.putInt((int) longRational.f2894b);
                                }
                                map4.put(str4, new ExifAttribute(byteBufferWrap2.array(), 5, length2));
                                i2 = i4;
                                i6 = i3;
                                i = 2;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                i = i8;
                                i2 = i7;
                                break;
                            case 9:
                                i5 = i7;
                                int i20 = i6;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int length3 = strArrSplit5.length;
                                int[] iArr2 = new int[length3];
                                for (int i21 = 0; i21 < strArrSplit5.length; i21++) {
                                    iArr2[i21] = Integer.parseInt(strArrSplit5[i21]);
                                }
                                Map map5 = (Map) list.get(i9);
                                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[ExifAttribute.f2859f[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                for (int i22 = 0; i22 < length3; i22++) {
                                    byteBufferWrap3.putInt(iArr2[i22]);
                                }
                                map5.put(str4, new ExifAttribute(byteBufferWrap3.array(), 9, length3));
                                i = i8;
                                i6 = i20;
                                i2 = i5;
                                break;
                            case 10:
                                int i23 = i6;
                                int i24 = 0;
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                int length4 = strArrSplit6.length;
                                LongRational[] longRationalArr2 = new LongRational[length4];
                                int i25 = 0;
                                while (i25 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i25].split(RemoteSettings.FORWARD_SLASH_STRING, i10);
                                    int i26 = i24;
                                    LongRational[] longRationalArr3 = longRationalArr2;
                                    longRationalArr3[i25] = new LongRational((long) Double.parseDouble(strArrSplit7[i26]), (long) Double.parseDouble(strArrSplit7[i23]));
                                    i25++;
                                    i24 = i26;
                                    i7 = i7;
                                    strReplaceAll = strReplaceAll;
                                    longRationalArr2 = longRationalArr3;
                                    i10 = -1;
                                }
                                i5 = i7;
                                String str5 = strReplaceAll;
                                LongRational[] longRationalArr4 = longRationalArr2;
                                Map map6 = (Map) list.get(i9);
                                ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(new byte[ExifAttribute.f2859f[10] * length4]);
                                byteBufferWrap4.order(byteOrder);
                                for (int i27 = i24; i27 < length4; i27++) {
                                    LongRational longRational2 = longRationalArr4[i27];
                                    byteBufferWrap4.putInt((int) longRational2.f2893a);
                                    byteBufferWrap4.putInt((int) longRational2.f2894b);
                                }
                                map6.put(str4, new ExifAttribute(byteBufferWrap4.array(), 10, length4));
                                i = i8;
                                i6 = i23;
                                strReplaceAll = str5;
                                i2 = i5;
                                break;
                            case TYPE_BYTES_VALUE:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                int length5 = strArrSplit8.length;
                                double[] dArr = new double[length5];
                                for (int i28 = 0; i28 < strArrSplit8.length; i28 += i6) {
                                    dArr[i28] = Double.parseDouble(strArrSplit8[i28]);
                                }
                                Map map7 = (Map) list.get(i9);
                                ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(new byte[ExifAttribute.f2859f[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                int i29 = 0;
                                while (i29 < length5) {
                                    byteBufferWrap5.putDouble(dArr[i29]);
                                    i29++;
                                    i6 = i6;
                                }
                                map7.put(str4, new ExifAttribute(byteBufferWrap5.array(), 12, length5));
                                i = i8;
                                i6 = i6;
                                i2 = i7;
                                break;
                        }
                    } else {
                        ((Map) list.get(i9)).remove(str4);
                    }
                    i = i8;
                    i2 = i7;
                }
                i9 += i6;
                i7 = i2;
                i8 = i;
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m1602d(float f) {
            m1601c("FocalLength", new LongRational((long) (f * 1000.0f), 1000L).toString(), this.f2874a);
        }

        /* JADX INFO: renamed from: e */
        public final void m1603e(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                Logger.m1288i("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            m1601c("Orientation", String.valueOf(i2), this.f2874a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class WhiteBalanceMode {

        /* JADX INFO: renamed from: a */
        public static final WhiteBalanceMode f2879a;

        /* JADX INFO: renamed from: b */
        public static final WhiteBalanceMode f2880b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ WhiteBalanceMode[] f2881c;

        static {
            WhiteBalanceMode whiteBalanceMode = new WhiteBalanceMode("AUTO", 0);
            f2879a = whiteBalanceMode;
            WhiteBalanceMode whiteBalanceMode2 = new WhiteBalanceMode("MANUAL", 1);
            f2880b = whiteBalanceMode2;
            f2881c = new WhiteBalanceMode[]{whiteBalanceMode, whiteBalanceMode2};
        }

        public static WhiteBalanceMode valueOf(String str) {
            return (WhiteBalanceMode) Enum.valueOf(WhiteBalanceMode.class, str);
        }

        public static WhiteBalanceMode[] values() {
            return (WhiteBalanceMode[]) f2881c.clone();
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(256, 3, 4, "ImageWidth"), new ExifTag(257, 3, 4, "ImageLength"), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("Orientation", 274, 3), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("SensitivityType", 34864, 3), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag(40962, 3, 4, "PixelXDimension"), new ExifTag(40963, 3, 4, "PixelYDimension"), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag(2, 5, 10, "GPSLatitude"), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag(4, 5, 10, "GPSLongitude"), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestDistanceRef", 25, 2)};
        f2863c = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4)};
        f2864d = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, new ExifTag[]{new ExifTag("InteroperabilityIndex", 1, 2)}};
        f2865e = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public ExifData(ByteOrder byteOrder, ArrayList arrayList) {
        Preconditions.m7699f(arrayList.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.f2867b = byteOrder;
        this.f2866a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static ExifData m1597a(ImageProxy imageProxy, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        Builder builder = new Builder();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = builder.f2874a;
        builder.m1601c("Orientation", strValueOf, arrayList);
        builder.m1601c("XResolution", "72/1", arrayList);
        builder.m1601c("YResolution", "72/1", arrayList);
        builder.m1601c("ResolutionUnit", String.valueOf(2), arrayList);
        builder.m1601c("YCbCrPositioning", String.valueOf(1), arrayList);
        builder.m1601c("Make", Build.MANUFACTURER, arrayList);
        builder.m1601c("Model", Build.MODEL, arrayList);
        if (imageProxy.mo1180s0() != null) {
            imageProxy.mo1180s0().mo1269b(builder);
        }
        builder.m1603e(i);
        builder.m1601c("ImageWidth", String.valueOf(imageProxy.getWidth()), arrayList);
        builder.m1601c("ImageLength", String.valueOf(imageProxy.getHeight()), arrayList);
        ArrayList list = Collections.list(new Builder.C02883(builder));
        if (!((Map) list.get(1)).isEmpty()) {
            builder.m1600b("ExposureProgram", String.valueOf(0), list);
            builder.m1600b("ExifVersion", "0230", list);
            builder.m1600b("ComponentsConfiguration", "1,2,3,0", list);
            builder.m1600b("MeteringMode", String.valueOf(0), list);
            builder.m1600b("LightSource", String.valueOf(0), list);
            builder.m1600b("FlashpixVersion", "0100", list);
            builder.m1600b("FocalPlaneResolutionUnit", String.valueOf(2), list);
            builder.m1600b("FileSource", String.valueOf(3), list);
            builder.m1600b("SceneType", String.valueOf(1), list);
            builder.m1600b("CustomRendered", String.valueOf(0), list);
            builder.m1600b("SceneCaptureType", String.valueOf(0), list);
            builder.m1600b("Contrast", String.valueOf(0), list);
            builder.m1600b("Saturation", String.valueOf(0), list);
            builder.m1600b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(2)).isEmpty()) {
            builder.m1600b("GPSVersionID", "2300", list);
            builder.m1600b("GPSSpeedRef", "K", list);
            builder.m1600b("GPSTrackRef", "T", list);
            builder.m1600b("GPSImgDirectionRef", "T", list);
            builder.m1600b("GPSDestBearingRef", "T", list);
            builder.m1600b("GPSDestDistanceRef", "K", list);
        }
        return new ExifData(builder.f2875b, list);
    }

    /* JADX INFO: renamed from: b */
    public final Map m1598b(int i) {
        Preconditions.m7696c(i, 0, 4, AbstractC0000a.m10g(i, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.f2866a.get(i);
    }
}
