package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.vector.PathNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PathParserKt {
    /* JADX INFO: renamed from: a */
    public static final void m5499a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z2, boolean z3) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            m5499a(path, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z2, z3);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z2 == z3) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan22 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        double d29 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d29) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d30 = dAtan22;
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d6 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d6 * dCos2;
        double d37 = (dCos3 * d36) + (dSin3 * d35);
        double d38 = d30 / ((double) iCeil);
        double d39 = dAtan2;
        double d40 = d34;
        int i = 0;
        double d41 = d;
        double d42 = d37;
        double d43 = d2;
        while (i < iCeil) {
            double d44 = d39 + d38;
            double dSin4 = Math.sin(d44);
            double dCos4 = Math.cos(d44);
            int i2 = i;
            double d45 = (((d10 * dCos2) * dCos4) + d27) - (d33 * dSin4);
            int i3 = iCeil;
            double d46 = (d36 * dSin4) + (d10 * dSin2 * dCos4) + d28;
            double d47 = (d32 * dSin4) - (d33 * dCos4);
            double d48 = (dCos4 * d36) + (dSin4 * d35);
            double d49 = d44 - d39;
            double dTan = Math.tan(d49 / d18);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d29) - ((double) 1)) * Math.sin(d49)) / ((double) 3);
            path.mo5150l((float) ((d40 * dSqrt3) + d41), (float) ((d42 * dSqrt3) + d43), (float) (d45 - (dSqrt3 * d47)), (float) (d46 - (dSqrt3 * d48)), (float) d45, (float) d46);
            d41 = d45;
            i = i2 + 1;
            d27 = d27;
            dSin2 = dSin2;
            d29 = d29;
            d39 = d44;
            d42 = d48;
            d40 = d47;
            d43 = d46;
            d10 = d5;
            iCeil = i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m5500b(List list, Path path) {
        int i;
        float f;
        int i2;
        PathNode pathNode;
        PathNode pathNode2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        List list2 = list;
        Path path2 = path;
        int iMo5147i = path2.mo5147i();
        path2.mo5151n();
        path2.mo5145g(iMo5147i);
        PathNode pathNode3 = list2.isEmpty() ? PathNode.Close.f18027c : (PathNode) list2.get(0);
        int size = list2.size();
        float f11 = 0.0f;
        int i3 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        while (i3 < size) {
            PathNode pathNode4 = (PathNode) list2.get(i3);
            if (pathNode4 instanceof PathNode.Close) {
                path2.close();
                i = size;
                f = f11;
                i2 = i3;
                pathNode2 = pathNode4;
                f12 = f16;
                f14 = f12;
                f13 = f17;
            } else {
                if (pathNode4 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode4;
                    float f18 = relativeMoveTo.f18065c;
                    f14 += f18;
                    float f19 = relativeMoveTo.f18066d;
                    f15 += f19;
                    path2.mo5141c(f18, f19);
                    i = size;
                    f = f11;
                    i2 = i3;
                    f16 = f14;
                    f17 = f15;
                } else {
                    if (pathNode4 instanceof PathNode.MoveTo) {
                        PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode4;
                        float f20 = moveTo.f18037c;
                        float f21 = moveTo.f18038d;
                        path2.mo5149k(f20, f21);
                        f15 = f21;
                        f17 = f15;
                        f14 = f20;
                        f16 = f14;
                    } else if (pathNode4 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode4;
                        float f22 = relativeLineTo.f18063c;
                        float f23 = relativeLineTo.f18064d;
                        path2.mo5154q(f22, f23);
                        f14 += relativeLineTo.f18063c;
                        f15 += f23;
                    } else {
                        if (pathNode4 instanceof PathNode.LineTo) {
                            PathNode.LineTo lineTo = (PathNode.LineTo) pathNode4;
                            float f24 = lineTo.f18035c;
                            f5 = lineTo.f18036d;
                            path2.mo5155s(f24, f5);
                            f14 = lineTo.f18035c;
                        } else if (pathNode4 instanceof PathNode.RelativeHorizontalTo) {
                            PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode4;
                            path2.mo5154q(relativeHorizontalTo.f18062c, f11);
                            f14 += relativeHorizontalTo.f18062c;
                        } else if (pathNode4 instanceof PathNode.HorizontalTo) {
                            PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode4;
                            path2.mo5155s(horizontalTo.f18034c, f15);
                            f14 = horizontalTo.f18034c;
                        } else if (pathNode4 instanceof PathNode.RelativeVerticalTo) {
                            PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode4;
                            path2.mo5154q(f11, relativeVerticalTo.f18077c);
                            f15 += relativeVerticalTo.f18077c;
                        } else if (pathNode4 instanceof PathNode.VerticalTo) {
                            PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode4;
                            path2.mo5155s(f14, verticalTo.f18078c);
                            f15 = verticalTo.f18078c;
                        } else {
                            if (pathNode4 instanceof PathNode.RelativeCurveTo) {
                                PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode4;
                                path2.mo5142d(relativeCurveTo.f18056c, relativeCurveTo.f18057d, relativeCurveTo.f18058e, relativeCurveTo.f18059f, relativeCurveTo.f18060g, relativeCurveTo.f18061h);
                                f8 = relativeCurveTo.f18058e + f14;
                                f9 = relativeCurveTo.f18059f + f15;
                                f14 += relativeCurveTo.f18060g;
                                f10 = relativeCurveTo.f18061h;
                            } else {
                                if (pathNode4 instanceof PathNode.CurveTo) {
                                    PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode4;
                                    path.mo5150l(curveTo.f18028c, curveTo.f18029d, curveTo.f18030e, curveTo.f18031f, curveTo.f18032g, curveTo.f18033h);
                                    float f25 = curveTo.f18030e;
                                    float f26 = curveTo.f18031f;
                                    float f27 = curveTo.f18032g;
                                    float f28 = curveTo.f18033h;
                                    f14 = f27;
                                    f15 = f28;
                                    i = size;
                                    f = f11;
                                    i2 = i3;
                                    pathNode2 = pathNode4;
                                    f12 = f25;
                                    f13 = f26;
                                } else if (pathNode4 instanceof PathNode.RelativeReflectiveCurveTo) {
                                    if (pathNode3.f18018a) {
                                        float f29 = f14 - f12;
                                        f7 = f15 - f13;
                                        f6 = f29;
                                    } else {
                                        f6 = f11;
                                        f7 = f6;
                                    }
                                    PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode4;
                                    path.mo5142d(f6, f7, relativeReflectiveCurveTo.f18071c, relativeReflectiveCurveTo.f18072d, relativeReflectiveCurveTo.f18073e, relativeReflectiveCurveTo.f18074f);
                                    f8 = relativeReflectiveCurveTo.f18071c + f14;
                                    f9 = relativeReflectiveCurveTo.f18072d + f15;
                                    f14 += relativeReflectiveCurveTo.f18073e;
                                    f10 = relativeReflectiveCurveTo.f18074f;
                                } else {
                                    if (pathNode4 instanceof PathNode.ReflectiveCurveTo) {
                                        if (pathNode3.f18018a) {
                                            float f30 = 2;
                                            f14 = (f14 * f30) - f12;
                                            f15 = (f30 * f15) - f13;
                                        }
                                        PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode4;
                                        path.mo5150l(f14, f15, reflectiveCurveTo.f18043c, reflectiveCurveTo.f18044d, reflectiveCurveTo.f18045e, reflectiveCurveTo.f18046f);
                                        f4 = reflectiveCurveTo.f18043c;
                                        float f31 = reflectiveCurveTo.f18044d;
                                        float f32 = reflectiveCurveTo.f18045e;
                                        float f33 = reflectiveCurveTo.f18046f;
                                        f14 = f32;
                                        f15 = f33;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        pathNode2 = pathNode4;
                                        f13 = f31;
                                    } else if (pathNode4 instanceof PathNode.RelativeQuadTo) {
                                        PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode4;
                                        float f34 = relativeQuadTo.f18067c;
                                        float f35 = relativeQuadTo.f18068d;
                                        float f36 = relativeQuadTo.f18069e;
                                        float f37 = relativeQuadTo.f18070f;
                                        path.mo5139a(f34, f35, f36, f37);
                                        float f38 = relativeQuadTo.f18067c + f14;
                                        f13 = f35 + f15;
                                        f14 += f36;
                                        f15 += f37;
                                        f12 = f38;
                                    } else if (pathNode4 instanceof PathNode.QuadTo) {
                                        PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode4;
                                        float f39 = quadTo.f18039c;
                                        f13 = quadTo.f18040d;
                                        float f40 = quadTo.f18041e;
                                        f5 = quadTo.f18042f;
                                        path.mo5146h(f39, f13, f40, f5);
                                        f12 = quadTo.f18039c;
                                        f14 = f40;
                                    } else if (pathNode4 instanceof PathNode.RelativeReflectiveQuadTo) {
                                        if (pathNode3.f18019b) {
                                            f2 = f14 - f12;
                                            f3 = f15 - f13;
                                        } else {
                                            f2 = f11;
                                            f3 = f2;
                                        }
                                        PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode4;
                                        float f41 = relativeReflectiveQuadTo.f18075c;
                                        float f42 = relativeReflectiveQuadTo.f18076d;
                                        path.mo5139a(f2, f3, f41, f42);
                                        f4 = f2 + f14;
                                        float f43 = f3 + f15;
                                        f14 += relativeReflectiveQuadTo.f18075c;
                                        f15 += f42;
                                        f13 = f43;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        pathNode2 = pathNode4;
                                    } else if (pathNode4 instanceof PathNode.ReflectiveQuadTo) {
                                        if (pathNode3.f18019b) {
                                            float f44 = 2;
                                            f14 = (f14 * f44) - f12;
                                            f15 = (f44 * f15) - f13;
                                        }
                                        PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode4;
                                        float f45 = reflectiveQuadTo.f18047c;
                                        float f46 = reflectiveQuadTo.f18048d;
                                        path.mo5146h(f14, f15, f45, f46);
                                        float f47 = f15;
                                        f15 = f46;
                                        f13 = f47;
                                        i = size;
                                        f = f11;
                                        i2 = i3;
                                        f12 = f14;
                                        pathNode2 = pathNode4;
                                        f14 = reflectiveQuadTo.f18047c;
                                    } else {
                                        if (pathNode4 instanceof PathNode.RelativeArcTo) {
                                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode4;
                                            float f48 = relativeArcTo.f18054h + f14;
                                            float f49 = relativeArcTo.f18055i + f15;
                                            pathNode = pathNode4;
                                            i = size;
                                            i2 = i3;
                                            f = f11;
                                            m5499a(path, f14, f15, f48, f49, relativeArcTo.f18049c, relativeArcTo.f18050d, relativeArcTo.f18051e, relativeArcTo.f18052f, relativeArcTo.f18053g);
                                            f12 = f48;
                                            f14 = f12;
                                            f13 = f49;
                                            f15 = f13;
                                        } else {
                                            i = size;
                                            f = f11;
                                            i2 = i3;
                                            pathNode = pathNode4;
                                            if (pathNode instanceof PathNode.ArcTo) {
                                                PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode;
                                                double d = arcTo.f18025h;
                                                float f50 = arcTo.f18026i;
                                                pathNode2 = pathNode;
                                                m5499a(path, f14, f15, d, f50, arcTo.f18020c, arcTo.f18021d, arcTo.f18022e, arcTo.f18023f, arcTo.f18024g);
                                                f12 = arcTo.f18025h;
                                                f14 = f12;
                                                f13 = f50;
                                            }
                                        }
                                        pathNode2 = pathNode;
                                    }
                                    f12 = f4;
                                }
                                i3 = i2 + 1;
                                list2 = list;
                                path2 = path;
                                f11 = f;
                                size = i;
                                pathNode3 = pathNode2;
                            }
                            f15 += f10;
                            f12 = f8;
                            f13 = f9;
                        }
                        f15 = f5;
                    }
                    i = size;
                    f = f11;
                    i2 = i3;
                }
                pathNode2 = pathNode4;
                i3 = i2 + 1;
                list2 = list;
                path2 = path;
                f11 = f;
                size = i;
                pathNode3 = pathNode2;
            }
            f15 = f13;
            i3 = i2 + 1;
            list2 = list;
            path2 = path;
            f11 = f;
            size = i;
            pathNode3 = pathNode2;
        }
    }
}
