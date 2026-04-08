package p001A;

import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.compose.runtime.ComposerImpl;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.aspectj.lang.JoinPoint;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;
import org.mp4parser.support.RequiresParseDetailAspect;

/* JADX INFO: renamed from: A.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0000a {
    /* JADX INFO: renamed from: A */
    public static void m0A(Scope scope, String str, ParametersHolder parametersHolder, String str2) {
        Intrinsics.m18599g(scope, str);
        Intrinsics.m18599g(parametersHolder, str2);
        Intrinsics.m18605m();
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public static float m1B(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    /* JADX INFO: renamed from: C */
    public static String m2C(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: D */
    public static String m3D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: a */
    public static float m4a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* JADX INFO: renamed from: b */
    public static int m5b(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: c */
    public static SurfaceCombination m6c(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, ArrayList arrayList, SurfaceCombination surfaceCombination2) {
        surfaceCombination.m1550a(SurfaceConfig.m1552a(configType, configSize));
        arrayList.add(surfaceCombination2);
        return new SurfaceCombination();
    }

    /* JADX INFO: renamed from: d */
    public static SurfaceCombination m7d(ArrayList arrayList, SurfaceCombination surfaceCombination) {
        arrayList.add(surfaceCombination);
        return new SurfaceCombination();
    }

    /* JADX INFO: renamed from: e */
    public static Object m8e(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    /* JADX INFO: renamed from: f */
    public static String m9f(int i, String str) {
        return str + i;
    }

    /* JADX INFO: renamed from: g */
    public static String m10g(int i, String str, String str2) {
        return str + i + str2;
    }

    /* JADX INFO: renamed from: h */
    public static String m11h(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m12i(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m13j(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m14k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: l */
    public static String m15l(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: m */
    public static String m16m(StringBuilder sb, float f, char c2) {
        sb.append(f);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m17n(StringBuilder sb, int i, char c2) {
        sb.append(i);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m18o(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m19p(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m20q(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: r */
    public static StringBuilder m21r(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m22s(String str, String str2, long j) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m23t(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: u */
    public static StringBuilder m24u(String str, String str2, String str3, int i, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: v */
    public static StringBuilder m25v(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    /* JADX INFO: renamed from: w */
    public static StringBuilder m26w(JoinPoint joinPoint, String str) {
        RequiresParseDetailAspect.m21845a().getClass();
        RequiresParseDetailAspect.m21846b(joinPoint);
        return new StringBuilder(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m27x(int i, ComposerImpl composerImpl, int i2, Function2 function2) {
        composerImpl.mo4214G(Integer.valueOf(i));
        composerImpl.mo4223a(Integer.valueOf(i2), function2);
    }

    /* JADX INFO: renamed from: y */
    public static void m28y(SurfaceConfig.ConfigType configType, SurfaceConfig.ConfigSize configSize, SurfaceCombination surfaceCombination, SurfaceConfig.ConfigType configType2, SurfaceConfig.ConfigSize configSize2) {
        surfaceCombination.m1550a(SurfaceConfig.m1552a(configType, configSize));
        surfaceCombination.m1550a(SurfaceConfig.m1552a(configType2, configSize2));
    }

    /* JADX INFO: renamed from: z */
    public static void m29z(JoinPoint joinPoint) {
        RequiresParseDetailAspect.m21845a().getClass();
        RequiresParseDetailAspect.m21846b(joinPoint);
    }
}
