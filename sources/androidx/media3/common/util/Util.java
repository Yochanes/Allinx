package androidx.media3.common.util;

import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.AbstractC0455a;
import androidx.media3.common.Player;
import com.engagelab.privates.common.observer.MTObservable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import me.jessyan.retrofiturlmanager.BuildConfig;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Util {

    /* JADX INFO: renamed from: a */
    public static final int f25665a;

    /* JADX INFO: renamed from: b */
    public static final String f25666b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f25667c;

    /* JADX INFO: renamed from: d */
    public static final long[] f25668d;

    /* JADX INFO: renamed from: e */
    public static final Pattern f25669e;

    /* JADX INFO: renamed from: f */
    public static HashMap f25670f;

    /* JADX INFO: renamed from: g */
    public static final String[] f25671g;

    /* JADX INFO: renamed from: h */
    public static final String[] f25672h;

    /* JADX INFO: renamed from: i */
    public static final int[] f25673i;

    /* JADX INFO: renamed from: j */
    public static final int[] f25674j;

    /* JADX INFO: renamed from: k */
    public static final int[] f25675k;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29 {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f25665a = i;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f25666b = str + ", " + Build.MODEL + ", " + str2 + ", " + i;
        f25667c = new byte[0];
        f25668d = new long[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f25669e = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f25671g = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f25672h = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f25673i = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f25674j = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f25675k = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, MTObservable.WHAT_OBSERVER, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, ModuleDescriptor.MODULE_VERSION, 137, 142, 135, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m9591A(Player player) {
        boolean z2 = false;
        if (player == null) {
            return false;
        }
        int iMo9289z = player.mo9289z();
        if (iMo9289z != 1 || !player.mo9215H(2)) {
            if (iMo9289z == 4 && player.mo9215H(4)) {
                player.mo9229q();
            }
            if (player.mo9215H(1)) {
                return z2;
            }
            player.mo9214E();
            return true;
        }
        player.mo9272c();
        z2 = true;
        if (player.mo9215H(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: B */
    public static int m9592B(Uri uri, String str) {
        int i;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String lowerCase = Ascii.toLowerCase(lastPathSegment.substring(iLastIndexOf + 1));
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case 104579:
                        if (lowerCase.equals("ism")) {
                        }
                        break;
                    case 108321:
                        if (lowerCase.equals("mpd")) {
                        }
                        break;
                    case 3242057:
                        if (lowerCase.equals("isml")) {
                        }
                        break;
                    case 3299913:
                        if (lowerCase.equals("m3u8")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.Util.m9592B(android.net.Uri, java.lang.String):int");
            }

            /* JADX INFO: renamed from: C */
            public static boolean m9593C(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
                if (parsableByteArray.m9548a() <= 0) {
                    return false;
                }
                if (parsableByteArray2.f25644a.length < parsableByteArray.m9548a()) {
                    parsableByteArray2.m9549b(parsableByteArray.m9548a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(parsableByteArray.f25644a, parsableByteArray.f25645b, parsableByteArray.m9548a());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr = parsableByteArray2.f25644a;
                        iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break;
                            }
                            byte[] bArr2 = parsableByteArray2.f25644a;
                            if (iInflate == bArr2.length) {
                                parsableByteArray2.m9549b(bArr2.length * 2);
                            }
                        } else {
                            parsableByteArray2.m9545F(iInflate);
                            inflater.reset();
                            return true;
                        }
                    } catch (DataFormatException unused) {
                        return false;
                    } finally {
                        inflater.reset();
                    }
                }
                return false;
            }

            /* JADX INFO: renamed from: D */
            public static void m9594D(int i) {
                Integer.toString(i, 36);
            }

            /* JADX INFO: renamed from: E */
            public static boolean m9595E(int i) {
                return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
            }

            /* JADX INFO: renamed from: F */
            public static boolean m9596F(Context context) {
                int i = f25665a;
                if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                    return true;
                }
                if (i == 30) {
                    String str = Build.MODEL;
                    if (Ascii.equalsIgnoreCase(str, "moto g(20)") || Ascii.equalsIgnoreCase(str, "rmx3231")) {
                        return true;
                    }
                }
                return i == 34 && Ascii.equalsIgnoreCase(Build.MODEL, "sm-x200");
            }

            /* JADX INFO: renamed from: G */
            public static boolean m9597G(Context context) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            }

            /* JADX INFO: renamed from: H */
            public static long m9598H(long j) {
                return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
            }

            /* JADX INFO: renamed from: I */
            public static String m9599I(String str) {
                if (str == null) {
                    return null;
                }
                String strReplace = str.replace('_', '-');
                if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                    str = strReplace;
                }
                String lowerCase = Ascii.toLowerCase(str);
                int i = 0;
                String str2 = lowerCase.split("-", 2)[0];
                if (f25670f == null) {
                    String[] iSOLanguages = Locale.getISOLanguages();
                    int length = iSOLanguages.length;
                    String[] strArr = f25671g;
                    HashMap map = new HashMap(length + strArr.length);
                    for (String str3 : iSOLanguages) {
                        try {
                            String iSO3Language = new Locale(str3).getISO3Language();
                            if (!TextUtils.isEmpty(iSO3Language)) {
                                map.put(iSO3Language, str3);
                            }
                        } catch (MissingResourceException unused) {
                        }
                    }
                    for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                        map.put(strArr[i2], strArr[i2 + 1]);
                    }
                    f25670f = map;
                }
                String str4 = (String) f25670f.get(str2);
                if (str4 != null) {
                    StringBuilder sbM2244s = AbstractC0455a.m2244s(str4);
                    sbM2244s.append(lowerCase.substring(str2.length()));
                    lowerCase = sbM2244s.toString();
                    str2 = str4;
                }
                if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                    return lowerCase;
                }
                while (true) {
                    String[] strArr2 = f25672h;
                    if (i >= strArr2.length) {
                        return lowerCase;
                    }
                    if (lowerCase.startsWith(strArr2[i])) {
                        return strArr2[i + 1] + lowerCase.substring(strArr2[i].length());
                    }
                    i += 2;
                }
            }

            /* JADX INFO: renamed from: J */
            public static Object[] m9600J(int i, Object[] objArr) {
                Assertions.m9460a(i <= objArr.length);
                return Arrays.copyOf(objArr, i);
            }

            /* JADX INFO: renamed from: K */
            public static void m9601K(Handler handler, Runnable runnable) {
                Looper looper = handler.getLooper();
                if (looper.getThread().isAlive()) {
                    if (looper == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            /* JADX INFO: renamed from: L */
            public static long m9602L(int i, long j) {
                return m9604N(j, 1000000L, i, RoundingMode.DOWN);
            }

            /* JADX INFO: renamed from: M */
            public static void m9603M(long[] jArr, long j) {
                long j2;
                RoundingMode roundingMode = RoundingMode.DOWN;
                int i = 0;
                if (j >= 1000000 && j % 1000000 == 0) {
                    long jDivide = LongMath.divide(j, 1000000L, RoundingMode.UNNECESSARY);
                    while (i < jArr.length) {
                        jArr[i] = LongMath.divide(jArr[i], jDivide, roundingMode);
                        i++;
                    }
                    return;
                }
                if (j < 1000000 && 1000000 % j == 0) {
                    long jDivide2 = LongMath.divide(1000000L, j, RoundingMode.UNNECESSARY);
                    while (i < jArr.length) {
                        jArr[i] = LongMath.saturatedMultiply(jArr[i], jDivide2);
                        i++;
                    }
                    return;
                }
                int i2 = 0;
                while (i2 < jArr.length) {
                    long j3 = jArr[i2];
                    if (j3 != 0) {
                        if (j >= j3 && j % j3 == 0) {
                            jArr[i2] = LongMath.divide(1000000L, LongMath.divide(j, j3, RoundingMode.UNNECESSARY), roundingMode);
                        } else if (j >= j3 || j3 % j != 0) {
                            j2 = j;
                            jArr[i2] = m9605O(j3, 1000000L, j2, roundingMode);
                        } else {
                            jArr[i2] = LongMath.saturatedMultiply(1000000L, LongMath.divide(j3, j, RoundingMode.UNNECESSARY));
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                    }
                    i2++;
                    j = j2;
                }
            }

            /* JADX INFO: renamed from: N */
            public static long m9604N(long j, long j2, long j3, RoundingMode roundingMode) {
                if (j == 0 || j2 == 0) {
                    return 0L;
                }
                return (j3 < j2 || j3 % j2 != 0) ? (j3 >= j2 || j2 % j3 != 0) ? (j3 < j || j3 % j != 0) ? (j3 >= j || j % j3 != 0) ? m9605O(j, j2, j3, roundingMode) : LongMath.saturatedMultiply(j2, LongMath.divide(j, j3, RoundingMode.UNNECESSARY)) : LongMath.divide(j2, LongMath.divide(j3, j, RoundingMode.UNNECESSARY), roundingMode) : LongMath.saturatedMultiply(j, LongMath.divide(j2, j3, RoundingMode.UNNECESSARY)) : LongMath.divide(j, LongMath.divide(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
            }

            /* JADX INFO: renamed from: O */
            public static long m9605O(long j, long j2, long j3, RoundingMode roundingMode) {
                long jSaturatedMultiply = LongMath.saturatedMultiply(j, j2);
                if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
                    return LongMath.divide(jSaturatedMultiply, j3, roundingMode);
                }
                long jGcd = LongMath.gcd(Math.abs(j2), Math.abs(j3));
                RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                long jDivide = LongMath.divide(j2, jGcd, roundingMode2);
                long jDivide2 = LongMath.divide(j3, jGcd, roundingMode2);
                long jGcd2 = LongMath.gcd(Math.abs(j), Math.abs(jDivide2));
                long jDivide3 = LongMath.divide(j, jGcd2, roundingMode2);
                long jDivide4 = LongMath.divide(jDivide2, jGcd2, roundingMode2);
                long jSaturatedMultiply2 = LongMath.saturatedMultiply(jDivide3, jDivide);
                if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
                    return LongMath.divide(jSaturatedMultiply2, jDivide4, roundingMode);
                }
                double d = jDivide3 * (jDivide / jDivide4);
                if (d > 9.223372036854776E18d) {
                    return Long.MAX_VALUE;
                }
                if (d < -9.223372036854776E18d) {
                    return Long.MIN_VALUE;
                }
                return DoubleMath.roundToLong(d, roundingMode);
            }

            /* JADX INFO: renamed from: P */
            public static boolean m9606P(Player player, boolean z2) {
                return player == null || !player.mo9278j() || player.mo9289z() == 1 || player.mo9289z() == 4 || (z2 && player.mo9260M() != 0);
            }

            /* JADX INFO: renamed from: Q */
            public static String[] m9607Q(String str) {
                return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            }

            /* JADX INFO: renamed from: R */
            public static String m9608R(byte[] bArr) {
                StringBuilder sb = new StringBuilder(bArr.length * 2);
                for (int i = 0; i < bArr.length; i++) {
                    sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i] & Ascii.f42543SI, 16));
                }
                return sb.toString();
            }

            /* JADX INFO: renamed from: S */
            public static long m9609S(long j) {
                return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
            }

            /* JADX INFO: renamed from: a */
            public static int m9610a(long[] jArr, long j, boolean z2) {
                int i;
                int iBinarySearch = Arrays.binarySearch(jArr, j);
                if (iBinarySearch < 0) {
                    return ~iBinarySearch;
                }
                while (true) {
                    i = iBinarySearch + 1;
                    if (i >= jArr.length || jArr[i] != j) {
                        break;
                    }
                    iBinarySearch = i;
                }
                return z2 ? iBinarySearch : i;
            }

            /* JADX INFO: renamed from: b */
            public static int m9611b(LongArray longArray, long j) {
                int i = longArray.f25620a - 1;
                int i2 = 0;
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    if (longArray.m9515c(i3) < j) {
                        i2 = i3 + 1;
                    } else {
                        i = i3 - 1;
                    }
                }
                int i4 = i + 1;
                if (i4 < longArray.f25620a && longArray.m9515c(i4) == j) {
                    return i4;
                }
                if (i == -1) {
                    return 0;
                }
                return i;
            }

            /* JADX INFO: renamed from: c */
            public static int m9612c(int[] iArr, int i, boolean z2, boolean z3) {
                int i2;
                int i3;
                int iBinarySearch = Arrays.binarySearch(iArr, i);
                if (iBinarySearch < 0) {
                    i3 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        i2 = iBinarySearch - 1;
                        if (i2 < 0 || iArr[i2] != i) {
                            break;
                        }
                        iBinarySearch = i2;
                    }
                    i3 = z2 ? iBinarySearch : i2;
                }
                return z3 ? Math.max(0, i3) : i3;
            }

            /* JADX INFO: renamed from: d */
            public static int m9613d(long[] jArr, long j, boolean z2) {
                int i;
                int iBinarySearch = Arrays.binarySearch(jArr, j);
                if (iBinarySearch < 0) {
                    i = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i2 = iBinarySearch - 1;
                        if (i2 < 0 || jArr[i2] != j) {
                            break;
                        }
                        iBinarySearch = i2;
                    }
                    i = iBinarySearch;
                }
                return z2 ? Math.max(0, i) : i;
            }

            /* JADX INFO: renamed from: e */
            public static int m9614e(int i, int i2) {
                return ((i + i2) - 1) / i2;
            }

            /* JADX INFO: renamed from: f */
            public static void m9615f(Closeable closeable) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }

            /* JADX INFO: renamed from: g */
            public static int m9616g(long j, long j2) {
                if (j < j2) {
                    return -1;
                }
                return j == j2 ? 0 : 1;
            }

            /* JADX INFO: renamed from: h */
            public static float m9617h(float f, float f2, float f3) {
                return Math.max(f2, Math.min(f, f3));
            }

            /* JADX INFO: renamed from: i */
            public static int m9618i(int i, int i2, int i3) {
                return Math.max(i2, Math.min(i, i3));
            }

            /* JADX INFO: renamed from: j */
            public static long m9619j(long j, long j2, long j3) {
                return Math.max(j2, Math.min(j, j3));
            }

            /* JADX INFO: renamed from: k */
            public static boolean m9620k(SparseArray sparseArray, int i) {
                return sparseArray.indexOfKey(i) >= 0;
            }

            /* JADX INFO: renamed from: l */
            public static int m9621l(int i, byte[] bArr, int i2, int i3) {
                while (i < i2) {
                    i3 = f25673i[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
                    i++;
                }
                return i3;
            }

            /* JADX INFO: renamed from: m */
            public static Handler m9622m(Handler.Callback callback) {
                Looper looperMyLooper = Looper.myLooper();
                Assertions.m9466g(looperMyLooper);
                return new Handler(looperMyLooper, callback);
            }

            /* JADX INFO: renamed from: n */
            public static String m9623n(byte[] bArr) {
                return new String(bArr, StandardCharsets.UTF_8);
            }

            /* JADX INFO: renamed from: o */
            public static int m9624o(int i) {
                if (i == 20) {
                    return 30;
                }
                if (i == 22) {
                    return 31;
                }
                if (i == 30) {
                    return 34;
                }
                switch (i) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case TYPE_BYTES_VALUE:
                        return 28;
                    default:
                        switch (i) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }

            /* JADX INFO: renamed from: p */
            public static AudioFormat m9625p(int i, int i2, int i3) {
                return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
            }

            /* JADX INFO: renamed from: q */
            public static int m9626q(int i) {
                int i2 = f25665a;
                if (i == 10) {
                    return i2 >= 32 ? 737532 : 6396;
                }
                if (i == 12) {
                    return 743676;
                }
                if (i == 24) {
                    return i2 >= 32 ? 67108860 : 0;
                }
                switch (i) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        return 0;
                }
            }

            /* JADX INFO: renamed from: r */
            public static int m9627r(int i) {
                if (i != 2) {
                    if (i == 3) {
                        return 1;
                    }
                    if (i != 4) {
                        if (i != 21) {
                            if (i != 22) {
                                if (i != 268435456) {
                                    if (i != 1342177280) {
                                        if (i != 1610612736) {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                }
                            }
                        }
                        return 3;
                    }
                    return 4;
                }
                return 2;
            }

            /* JADX INFO: renamed from: s */
            public static int m9628s(int i) {
                if (i == 2 || i == 4) {
                    return 6005;
                }
                if (i == 10) {
                    return 6004;
                }
                if (i == 7) {
                    return 6005;
                }
                if (i == 8) {
                    return 6003;
                }
                switch (i) {
                    case 15:
                        return 6003;
                    case 16:
                    case 18:
                        return 6005;
                    case 17:
                    case 19:
                    case 20:
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    case 22:
                        return 6004;
                    default:
                        switch (i) {
                            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            case BuildConfig.VERSION_CODE /* 25 */:
                            case 26:
                            case 27:
                            case 28:
                                return 6002;
                            default:
                                return 6006;
                        }
                }
            }

            /* JADX INFO: renamed from: t */
            public static int m9629t(String str) {
                String[] strArrSplit;
                int length;
                int i = 0;
                if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                    return 0;
                }
                String str2 = strArrSplit[length - 1];
                boolean z2 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                try {
                    str2.getClass();
                    i = Integer.parseInt(str2);
                    if (z2) {
                        return -i;
                    }
                } catch (NumberFormatException unused) {
                }
                return i;
            }

            /* JADX INFO: renamed from: u */
            public static String m9630u(int i) {
                if (i == 0) {
                    return "NO";
                }
                if (i == 1) {
                    return "NO_UNSUPPORTED_TYPE";
                }
                if (i == 2) {
                    return "NO_UNSUPPORTED_DRM";
                }
                if (i == 3) {
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                if (i == 4) {
                    return "YES";
                }
                throw new IllegalStateException();
            }

            /* JADX INFO: renamed from: v */
            public static long m9631v(float f, long j) {
                return f == 1.0f ? j : Math.round(j * ((double) f));
            }

            /* JADX INFO: renamed from: w */
            public static int m9632w(int i) {
                if (i == 8) {
                    return 3;
                }
                if (i == 16) {
                    return 2;
                }
                if (i != 24) {
                    return i != 32 ? 0 : 22;
                }
                return 21;
            }

            /* JADX INFO: renamed from: x */
            public static String m9633x(StringBuilder sb, Formatter formatter, long j) {
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                String str = j < 0 ? "-" : "";
                long jAbs = (Math.abs(j) + 500) / 1000;
                long j2 = jAbs % 60;
                long j3 = (jAbs / 60) % 60;
                long j4 = jAbs / 3600;
                sb.setLength(0);
                return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
            }

            /* JADX INFO: renamed from: y */
            public static String m9634y(String str) {
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    return (String) cls.getMethod("get", String.class).invoke(cls, str);
                } catch (Exception e) {
                    Log.m9508d("Util", "Failed to read system property ".concat(str), e);
                    return null;
                }
            }

            /* JADX INFO: renamed from: z */
            public static String m9635z(int i) {
                switch (i) {
                    case -2:
                        return "none";
                    case -1:
                        return "unknown";
                    case 0:
                        return "default";
                    case 1:
                        return "audio";
                    case 2:
                        return "video";
                    case 3:
                        return AttributeType.TEXT;
                    case 4:
                        return AppearanceType.IMAGE;
                    case 5:
                        return "metadata";
                    case 6:
                        return "camera motion";
                    default:
                        return i >= 10000 ? AbstractC0000a.m10g(i, "custom (", ")") : "?";
                }
            }
        }
