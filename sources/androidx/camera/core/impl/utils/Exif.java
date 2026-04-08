package androidx.camera.core.impl.utils;

import android.location.Location;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.exifinterface.media.ExifInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Exif {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f2851b = new C02821();

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f2852c = new C02832();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f2853d = new C02843();

    /* JADX INFO: renamed from: e */
    public static final List f2854e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");

    /* JADX INFO: renamed from: f */
    public static final List f2855f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a */
    public final ExifInterface f2856a;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.Exif$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C02821 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.Exif$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C02832 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.Exif$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C02843 extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Speed {

        /* JADX INFO: compiled from: Proguard */
        public static final class Converter {
        }
    }

    public Exif(ExifInterface exifInterface) {
        this.f2856a = exifInterface;
    }

    /* JADX INFO: renamed from: a */
    public final void m1591a(Exif exif) {
        ArrayList<String> arrayList = new ArrayList(f2854e);
        arrayList.removeAll(f2855f);
        for (String str : arrayList) {
            String strM8856c = this.f2856a.m8856c(str);
            ExifInterface exifInterface = exif.f2856a;
            String strM8856c2 = exifInterface.m8856c(str);
            if (strM8856c != null && !strM8856c.equals(strM8856c2)) {
                exifInterface.m8850A(str, strM8856c);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1592b() {
        return this.f2856a.m8858e(0, "Orientation");
    }

    /* JADX INFO: renamed from: c */
    public final int m1593c() {
        switch (m1592b()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1594d(int i) {
        int i2 = i % 90;
        ExifInterface exifInterface = this.f2856a;
        if (i2 != 0) {
            Locale locale = Locale.US;
            Logger.m1288i("Exif", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            exifInterface.m8850A("Orientation", String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int iM1592b = m1592b();
        while (i3 < 0) {
            i3 += 90;
            switch (iM1592b) {
                case 2:
                    iM1592b = 5;
                    break;
                case 3:
                case 8:
                    iM1592b = 6;
                    break;
                case 4:
                    iM1592b = 7;
                    break;
                case 5:
                    iM1592b = 4;
                    break;
                case 6:
                    iM1592b = 1;
                    break;
                case 7:
                    iM1592b = 2;
                    break;
                default:
                    iM1592b = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (iM1592b) {
                case 2:
                    iM1592b = 7;
                    break;
                case 3:
                    iM1592b = 8;
                    break;
                case 4:
                    iM1592b = 5;
                    break;
                case 5:
                    iM1592b = 2;
                    break;
                case 6:
                    iM1592b = 3;
                    break;
                case 7:
                    iM1592b = 4;
                    break;
                case 8:
                    iM1592b = 1;
                    break;
                default:
                    iM1592b = 6;
                    break;
            }
        }
        exifInterface.m8850A("Orientation", String.valueOf(iM1592b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc A[Catch: ParseException -> 0x00f4, TRY_ENTER, TryCatch #2 {ParseException -> 0x00f4, blocks: (B:44:0x00fc, B:47:0x0116), top: B:126:0x00fa }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.location.Location] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [long] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        byte b2;
        double[] dArr;
        double dM8857d;
        double d;
        String strM8856c;
        double[] dArr2;
        String strM8856c2;
        String strM8856c3;
        ?? r27;
        long time;
        Integer num;
        ?? r6;
        long time2;
        Integer num2;
        Integer num3;
        Integer num4;
        ?? r12;
        byte b3;
        String strM8856c4;
        long time3;
        Locale locale = Locale.ENGLISH;
        ExifInterface exifInterface = this.f2856a;
        Integer numValueOf = Integer.valueOf(exifInterface.m8858e(0, "ImageWidth"));
        Integer numValueOf2 = Integer.valueOf(exifInterface.m8858e(0, "ImageLength"));
        Integer numValueOf3 = Integer.valueOf(m1593c());
        int iM1592b = m1592b();
        Boolean boolValueOf = Boolean.valueOf(iM1592b == 4 || iM1592b == 5 || iM1592b == 7);
        Boolean boolValueOf2 = Boolean.valueOf(m1592b() == 2);
        ?? M8856c = exifInterface.m8856c("GPSProcessingMethod");
        String strM8856c5 = exifInterface.m8856c("GPSLatitude");
        String strM8856c6 = exifInterface.m8856c("GPSLatitudeRef");
        String strM8856c7 = exifInterface.m8856c("GPSLongitude");
        String strM8856c8 = exifInterface.m8856c("GPSLongitudeRef");
        if (strM8856c5 != null && strM8856c6 != null && strM8856c7 != null && strM8856c8 != null) {
            try {
                b2 = 0;
            } catch (IllegalArgumentException unused) {
                b2 = 0;
            }
            try {
                dArr = new double[]{ExifInterface.m8847b(strM8856c5, strM8856c6), ExifInterface.m8847b(strM8856c7, strM8856c8)};
            } catch (IllegalArgumentException unused2) {
                StringBuilder sbM25v = AbstractC0000a.m25v("latValue=", strM8856c5, ", latRef=", strM8856c6, ", lngValue=");
                sbM25v.append(strM8856c7);
                sbM25v.append(", lngRef=");
                sbM25v.append(strM8856c8);
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbM25v.toString()));
                dArr = null;
            }
            dM8857d = exifInterface.m8857d("GPSAltitude", -1.0d);
            int iM8858e = exifInterface.m8858e(-1, "GPSAltitudeRef");
            if (dM8857d >= 0.0d || iM8858e < 0) {
                d = 0.0d;
            } else {
                d = dM8857d * ((double) (iM8858e == 1 ? -1 : 1));
            }
            double dM8857d2 = exifInterface.m8857d("GPSSpeed", 0.0d);
            strM8856c = exifInterface.m8856c("GPSSpeedRef");
            if (strM8856c == null) {
                strM8856c = "K";
            }
            dArr2 = dArr;
            strM8856c2 = exifInterface.m8856c("GPSDateStamp");
            strM8856c3 = exifInterface.m8856c("GPSTimeStamp");
            ThreadLocal threadLocal = f2853d;
            long j = -1;
            if (strM8856c2 == null || strM8856c3 != null) {
                try {
                    if (strM8856c3 != null) {
                        time2 = ((SimpleDateFormat) f2851b.get()).parse(strM8856c2).getTime();
                    } else if (strM8856c2 == null) {
                        time2 = ((SimpleDateFormat) f2852c.get()).parse(strM8856c3).getTime();
                    } else {
                        r27 = M8856c;
                        String strM14k = AbstractC0000a.m14k(strM8856c2, " ", strM8856c3);
                        if (strM14k == null) {
                            time = -1;
                            num = numValueOf;
                            r6 = time;
                        } else {
                            try {
                                time = ((SimpleDateFormat) threadLocal.get()).parse(strM14k).getTime();
                            } catch (ParseException unused3) {
                                time = -1;
                            }
                            num = numValueOf;
                            r6 = time;
                        }
                    }
                    num = numValueOf;
                    long j2 = time2;
                    r27 = M8856c;
                    M8856c = j2;
                    r6 = M8856c;
                } catch (ParseException unused4) {
                    r27 = M8856c;
                    num = numValueOf;
                    r6 = -1;
                }
            } else {
                r27 = M8856c;
                num = numValueOf;
                r6 = -1;
            }
            if (dArr2 != null) {
                num3 = numValueOf2;
                num4 = numValueOf3;
                r12 = 0;
                num2 = num;
            } else {
                num2 = num;
                ?? location = new Location((String) (r27 == 0 ? "Exif" : r27));
                num3 = numValueOf2;
                num4 = numValueOf3;
                location.setLatitude(dArr2[b2]);
                location.setLongitude(dArr2[1]);
                if (d != 0.0d) {
                    location.setAltitude(d);
                }
                if (dM8857d2 != 0.0d) {
                    int iHashCode = strM8856c.hashCode();
                    if (iHashCode == 75) {
                        if (strM8856c.equals("K")) {
                            b3 = 2;
                        }
                        if (b3 != 0) {
                        }
                        location.setSpeed((float) (dM8857d2 / 2.23694d));
                    } else if (iHashCode != 77) {
                        b3 = (iHashCode == 78 && strM8856c.equals("N")) ? (byte) 1 : (byte) -1;
                        if (b3 != 0) {
                            dM8857d2 *= b3 != 1 ? 0.621371d : 1.15078d;
                        }
                        location.setSpeed((float) (dM8857d2 / 2.23694d));
                    } else {
                        if (strM8856c.equals("M")) {
                            b3 = b2;
                        }
                        if (b3 != 0) {
                        }
                        location.setSpeed((float) (dM8857d2 / 2.23694d));
                    }
                }
                if (r6 != -1) {
                    location.setTime(r6);
                }
                r12 = location;
            }
            strM8856c4 = exifInterface.m8856c("DateTimeOriginal");
            if (strM8856c4 != null) {
                time3 = -1;
            } else {
                try {
                    time3 = ((SimpleDateFormat) threadLocal.get()).parse(strM8856c4).getTime();
                } catch (ParseException unused5) {
                    time3 = -1;
                }
            }
            if (time3 != -1) {
                String strM8856c9 = exifInterface.m8856c("SubSecTimeOriginal");
                if (strM8856c9 != null) {
                    try {
                        long j3 = Long.parseLong(strM8856c9);
                        while (j3 > 1000) {
                            j3 /= 10;
                        }
                        j = time3 + j3;
                    } catch (NumberFormatException unused6) {
                        j = time3;
                    }
                } else {
                    j = time3;
                }
            }
            return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, boolValueOf, boolValueOf2, r12, Long.valueOf(j), exifInterface.m8856c("ImageDescription"));
        }
        b2 = 0;
        dArr = null;
        dM8857d = exifInterface.m8857d("GPSAltitude", -1.0d);
        int iM8858e2 = exifInterface.m8858e(-1, "GPSAltitudeRef");
        if (dM8857d >= 0.0d) {
            d = 0.0d;
        }
        double dM8857d22 = exifInterface.m8857d("GPSSpeed", 0.0d);
        strM8856c = exifInterface.m8856c("GPSSpeedRef");
        if (strM8856c == null) {
        }
        dArr2 = dArr;
        strM8856c2 = exifInterface.m8856c("GPSDateStamp");
        strM8856c3 = exifInterface.m8856c("GPSTimeStamp");
        ThreadLocal threadLocal2 = f2853d;
        long j4 = -1;
        if (strM8856c2 == null) {
            if (strM8856c3 != null) {
            }
            num = numValueOf;
            long j22 = time2;
            r27 = M8856c;
            M8856c = j22;
            r6 = M8856c;
        }
        if (dArr2 != null) {
        }
        strM8856c4 = exifInterface.m8856c("DateTimeOriginal");
        if (strM8856c4 != null) {
        }
        if (time3 != -1) {
        }
        return String.format(locale, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", num2, num3, num4, boolValueOf, boolValueOf2, r12, Long.valueOf(j4), exifInterface.m8856c("ImageDescription"));
    }
}
