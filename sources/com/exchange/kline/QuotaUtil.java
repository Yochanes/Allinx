package com.exchange.kline;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/QuotaUtil;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class QuotaUtil {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f42113a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static double m14296a(List list) {
        if (list.isEmpty()) {
            return -1.0d;
        }
        Iterator it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((KData) it.next()).f41814c;
        }
        return d / ((double) list.size());
    }

    /* JADX INFO: renamed from: b */
    public static double m14297b(List list) {
        if (list.isEmpty()) {
            return -1.0d;
        }
        Iterator it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((KData) it.next()).f41817f;
        }
        return d / ((double) list.size());
    }

    /* JADX INFO: renamed from: c */
    public static void m14298c(List list, boolean z2) {
        int i;
        double d;
        double dPow;
        List dataList = list;
        Intrinsics.m18599g(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        int i2 = 26;
        if (26 > dataList.size() - 1) {
            return;
        }
        int size = dataList.size();
        double d2 = 0.0d;
        int i3 = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        while (i3 < size) {
            if (((KData) dataList.get(i3)).f41827p != d2 && !z2) {
                return;
            }
            KData kData = (KData) dataList.get(i3);
            double d5 = kData.f41814c;
            double d6 = d3 + d5;
            d4 += d5;
            if (i3 > 25) {
                d6 -= ((KData) dataList.get(i3 - 26)).f41814c;
            }
            if (i3 > 24) {
                d4 -= ((KData) dataList.get(i3 - 25)).f41814c;
            }
            if (i3 >= 25) {
                double d7 = i2;
                double d8 = d6 / d7;
                double d9 = d4 / ((double) 25);
                int i4 = i3 - 25;
                if (i4 <= i3) {
                    dPow = 0.0d;
                    while (true) {
                        i = size;
                        d = d6;
                        dPow = Math.pow(((KData) dataList.get(i4)).f41814c - d8, 2.0d) + dPow;
                        if (i4 == i3) {
                            break;
                        }
                        i4++;
                        dataList = list;
                        size = i;
                        d6 = d;
                    }
                } else {
                    i = size;
                    d = d6;
                    dPow = 0.0d;
                }
                double dSqrt = ((double) 2) * Math.sqrt(dPow / d7);
                kData.f41827p = d9;
                kData.f41828q = d9 + dSqrt;
                kData.f41829r = d9 - dSqrt;
            } else {
                i = size;
                d = d6;
            }
            i3++;
            i2 = 26;
            dataList = list;
            size = i;
            d3 = d;
            d2 = 0.0d;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14299d(List dataList, boolean z2) {
        Intrinsics.m18599g(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        double d = ((KData) dataList.get(0)).f41814c;
        double d2 = ((KData) dataList.get(0)).f41814c;
        double d3 = ((KData) dataList.get(0)).f41814c;
        ((KData) dataList.get(0)).f41822k = d;
        ((KData) dataList.get(0)).f41823l = d2;
        ((KData) dataList.get(0)).f41824m = d3;
        int size = dataList.size();
        for (int i = 1; i < size; i++) {
            if (((KData) dataList.get(i)).f41824m != 0.0d && !z2) {
                return;
            }
            double d4 = 2;
            d += ((((KData) dataList.get(i)).f41814c - d) * d4) / ((double) 6);
            d2 += ((((KData) dataList.get(i)).f41814c - d2) * d4) / ((double) 11);
            d3 += ((((KData) dataList.get(i)).f41814c - d3) * d4) / ((double) 31);
            ((KData) dataList.get(i)).f41822k = d;
            ((KData) dataList.get(i)).f41823l = d2;
            ((KData) dataList.get(i)).f41824m = d3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m14300e(List dataList, boolean z2) {
        double[] dArr;
        double[] dArr2;
        double d;
        int i;
        Intrinsics.m18599g(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        double[] dArr3 = new double[dataList.size()];
        double[] dArr4 = new double[dataList.size()];
        char c2 = 0;
        double d2 = ((KData) dataList.get(0)).f41815d;
        double d3 = ((KData) dataList.get(0)).f41816e;
        int size = dataList.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        double d4 = 0.0d;
        while (i2 < size) {
            char c3 = c2;
            if (((KData) dataList.get(i2)).f41833v != 0.0d && !z2) {
                return;
            }
            if (i2 == 0) {
                d = 50.0d;
                dArr3[c3] = 50.0d;
                dArr4[c3] = 50.0d;
                dArr = dArr3;
                dArr2 = dArr4;
            } else {
                if (d2 <= ((KData) dataList.get(i2)).f41815d) {
                    d2 = ((KData) dataList.get(i2)).f41815d;
                    i3 = i2;
                }
                if (d3 >= ((KData) dataList.get(i2)).f41816e) {
                    d3 = ((KData) dataList.get(i2)).f41816e;
                    i4 = i2;
                }
                if (i2 > 8) {
                    if (d2 > ((KData) dataList.get(i2)).f41815d && i3 < i2 - 8) {
                        d2 = ((KData) dataList.get(i)).f41815d;
                        int i5 = i2 - 7;
                        if (i5 <= i2) {
                            while (true) {
                                if (d2 <= ((KData) dataList.get(i5)).f41815d) {
                                    d2 = ((KData) dataList.get(i5)).f41815d;
                                    i3 = i5;
                                }
                                if (i5 == i2) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    if (d3 < ((KData) dataList.get(i2)).f41816e && i4 < i2 - 8) {
                        d3 = ((KData) dataList.get(i2)).f41816e;
                        int i6 = i2 - 7;
                        if (i6 <= i2) {
                            while (true) {
                                if (d3 >= ((KData) dataList.get(i6)).f41816e) {
                                    d3 = ((KData) dataList.get(i6)).f41816e;
                                    i4 = i6;
                                }
                                if (i6 == i2) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                }
                if (d2 != d3) {
                    d4 = ((double) 100) * ((((KData) dataList.get(i2)).f41814c - d3) / (d2 - d3));
                }
                int i7 = i2 - 1;
                double d5 = dArr3[i7];
                dArr = dArr3;
                dArr2 = dArr4;
                double d6 = 2;
                double d7 = (d5 * d6) + d4;
                double d8 = 3;
                double d9 = d7 / d8;
                dArr[i2] = d9;
                double d10 = ((dArr2[i7] * d6) + d9) / d8;
                dArr2[i2] = d10;
                d = (d8 * dArr[i2]) - (d6 * d10);
            }
            ((KData) dataList.get(i2)).f41833v = dArr[i2];
            ((KData) dataList.get(i2)).f41834w = dArr2[i2];
            ((KData) dataList.get(i2)).f41835x = d;
            i2++;
            dArr3 = dArr;
            c2 = c3;
            dArr4 = dArr2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14301f(List dataList, boolean z2) {
        Intrinsics.m18599g(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        int size = dataList.size();
        double d = 0.0d;
        int i = 0;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        while (i < size) {
            if (((KData) dataList.get(i)).f41830s != d && !z2) {
                return;
            }
            double d5 = 13;
            double d6 = 2;
            d2 = ((d2 * ((double) 11)) / d5) + ((((KData) dataList.get(i)).f41814c * d6) / d5);
            double d7 = 27;
            d3 = ((d3 * ((double) 25)) / d7) + ((((KData) dataList.get(i)).f41814c * d6) / d7);
            double d8 = d2 - d3;
            double d9 = 10;
            d4 = ((d8 * d6) / d9) + ((d4 * ((double) 8)) / d9);
            ((KData) dataList.get(i)).f41830s = (d8 - d4) * d6;
            ((KData) dataList.get(i)).f41831t = d4;
            ((KData) dataList.get(i)).f41832u = d8;
            i++;
            d = 0.0d;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m14302g(List dataList, boolean z2) {
        Intrinsics.m18599g(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        ArrayList arrayList = f42113a;
        arrayList.clear();
        arrayList.addAll(dataList);
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            int i2 = i + 5;
            if (i2 <= size) {
                int i3 = i + 4;
                ((KData) dataList.get(i3)).f41819h = m14296a(arrayList.subList(i, i2));
                ((KData) dataList.get(i3)).f41825n = m14297b(arrayList.subList(i, i2));
            }
            int i4 = i + 10;
            if (i4 <= size) {
                int i5 = i + 9;
                ((KData) dataList.get(i5)).f41820i = m14296a(arrayList.subList(i, i4));
                ((KData) dataList.get(i5)).f41826o = m14297b(arrayList.subList(i, i4));
            }
            int i6 = i + 30;
            if (i6 <= size) {
                int i7 = i + 29;
                if (((KData) dataList.get(i7)).f41821j != 0.0d && !z2) {
                    return;
                }
                ((KData) dataList.get(i7)).f41821j = m14296a(arrayList.subList(i, i6));
            }
            ((KData) dataList.get(i)).f41811G = true;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m14303h(List dataList, boolean z2) {
        double dM14256b;
        double dM14256b2;
        double dM14256b3;
        double dM14256b4;
        double dM14256b5;
        double dM14256b6;
        Intrinsics.m18599g(dataList, "dataList");
        if (dataList.isEmpty()) {
            return;
        }
        int size = dataList.size();
        for (int i = 0; i < size; i++) {
            if (((KData) dataList.get(i)).f41805A != 0.0d && !z2) {
                return;
            }
            if (i >= 5) {
                int i2 = i - 5;
                int i3 = 0;
                int i4 = 0;
                if (i2 <= i) {
                    int i5 = i;
                    dM14256b5 = 0.0d;
                    dM14256b6 = 0.0d;
                    while (true) {
                        if (((KData) dataList.get(i5)).m14256b() >= 0.0d) {
                            dM14256b6 += ((KData) dataList.get(i5)).m14256b();
                            i4++;
                        } else {
                            dM14256b5 += ((KData) dataList.get(i5)).m14256b();
                            i3++;
                        }
                        if (i5 == i2) {
                            break;
                        } else {
                            i5--;
                        }
                    }
                } else {
                    dM14256b5 = 0.0d;
                    dM14256b6 = 0.0d;
                }
                double d = dM14256b6 > 0.0d ? dM14256b6 / ((double) i4) : 0.0d;
                ((KData) dataList.get(i)).f41836y = (d / (Math.abs(dM14256b5 < 0.0d ? dM14256b5 / ((double) i3) : 0.0d) + d)) * ((double) 100);
            }
            if (i >= 11) {
                int i6 = i - 11;
                int i7 = 0;
                int i8 = 0;
                if (i6 <= i) {
                    int i9 = i;
                    dM14256b3 = 0.0d;
                    dM14256b4 = 0.0d;
                    while (true) {
                        if (((KData) dataList.get(i9)).m14256b() >= 0.0d) {
                            dM14256b4 += ((KData) dataList.get(i9)).m14256b();
                            i8++;
                        } else {
                            dM14256b3 += ((KData) dataList.get(i9)).m14256b();
                            i7++;
                        }
                        if (i9 == i6) {
                            break;
                        } else {
                            i9--;
                        }
                    }
                } else {
                    dM14256b3 = 0.0d;
                    dM14256b4 = 0.0d;
                }
                double d2 = dM14256b4 > 0.0d ? dM14256b4 / ((double) i8) : 0.0d;
                ((KData) dataList.get(i)).f41837z = (d2 / (Math.abs(dM14256b3 < 0.0d ? dM14256b3 / ((double) i7) : 0.0d) + d2)) * ((double) 100);
            }
            if (i >= 23) {
                int i10 = i - 23;
                int i11 = 0;
                int i12 = 0;
                if (i10 <= i) {
                    int i13 = i;
                    dM14256b = 0.0d;
                    dM14256b2 = 0.0d;
                    while (true) {
                        if (((KData) dataList.get(i13)).m14256b() >= 0.0d) {
                            dM14256b2 += ((KData) dataList.get(i13)).m14256b();
                            i12++;
                        } else {
                            dM14256b += ((KData) dataList.get(i13)).m14256b();
                            i11++;
                        }
                        if (i13 == i10) {
                            break;
                        } else {
                            i13--;
                        }
                    }
                } else {
                    dM14256b = 0.0d;
                    dM14256b2 = 0.0d;
                }
                double d3 = dM14256b2 > 0.0d ? dM14256b2 / ((double) i12) : 0.0d;
                ((KData) dataList.get(i)).f41805A = (d3 / (Math.abs(dM14256b < 0.0d ? dM14256b / ((double) i11) : 0.0d) + d3)) * ((double) 100);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m14304i(CopyOnWriteArrayList pointList, Path path) {
        Path path2;
        Intrinsics.m18599g(pointList, "pointList");
        if (path == null) {
            return;
        }
        path.reset();
        if (pointList.isEmpty()) {
            return;
        }
        path.moveTo(((Pointer) pointList.get(0)).f42109a, ((Pointer) pointList.get(0)).f42110b);
        Pointer pointer = new Pointer();
        Pointer pointer2 = new Pointer();
        int size = pointList.size();
        int i = 0;
        while (i < size) {
            if (i != 0 || size <= 2) {
                int i2 = size - 2;
                if (i == i2 && i > 1) {
                    int i3 = i + 1;
                    int i4 = i - 1;
                    pointer.f42109a = AbstractC0000a.m4a(((Pointer) pointList.get(i3)).f42109a, ((Pointer) pointList.get(i4)).f42109a, 0.16f, ((Pointer) pointList.get(i)).f42109a);
                    pointer.f42110b = AbstractC0000a.m4a(((Pointer) pointList.get(i3)).f42110b, ((Pointer) pointList.get(i4)).f42110b, 0.16f, ((Pointer) pointList.get(i)).f42110b);
                    pointer2.f42109a = ((Pointer) pointList.get(i3)).f42109a - ((((Pointer) pointList.get(i3)).f42109a - ((Pointer) pointList.get(i)).f42109a) * 0.16f);
                    pointer2.f42110b = ((Pointer) pointList.get(i3)).f42110b - ((((Pointer) pointList.get(i3)).f42110b - ((Pointer) pointList.get(i)).f42110b) * 0.16f);
                } else if (i > 0 && i < i2) {
                    int i5 = i + 1;
                    int i6 = i - 1;
                    pointer.f42109a = AbstractC0000a.m4a(((Pointer) pointList.get(i5)).f42109a, ((Pointer) pointList.get(i6)).f42109a, 0.16f, ((Pointer) pointList.get(i)).f42109a);
                    pointer.f42110b = AbstractC0000a.m4a(((Pointer) pointList.get(i5)).f42110b, ((Pointer) pointList.get(i6)).f42110b, 0.16f, ((Pointer) pointList.get(i)).f42110b);
                    int i7 = i + 2;
                    pointer2.f42109a = ((Pointer) pointList.get(i5)).f42109a - ((((Pointer) pointList.get(i7)).f42109a - ((Pointer) pointList.get(i)).f42109a) * 0.16f);
                    pointer2.f42110b = ((Pointer) pointList.get(i5)).f42110b - ((((Pointer) pointList.get(i7)).f42110b - ((Pointer) pointList.get(i)).f42110b) * 0.16f);
                }
            } else {
                int i8 = i + 1;
                pointer.f42109a = AbstractC0000a.m4a(((Pointer) pointList.get(i8)).f42109a, ((Pointer) pointList.get(0)).f42109a, 0.16f, ((Pointer) pointList.get(i)).f42109a);
                pointer.f42110b = AbstractC0000a.m4a(((Pointer) pointList.get(i8)).f42110b, ((Pointer) pointList.get(0)).f42110b, 0.16f, ((Pointer) pointList.get(i)).f42110b);
                int i9 = i + 2;
                pointer2.f42109a = ((Pointer) pointList.get(i8)).f42109a - ((((Pointer) pointList.get(i9)).f42109a - ((Pointer) pointList.get(i)).f42109a) * 0.16f);
                pointer2.f42110b = ((Pointer) pointList.get(i8)).f42110b - ((((Pointer) pointList.get(i9)).f42110b - ((Pointer) pointList.get(i)).f42110b) * 0.16f);
            }
            if (i < size - 1) {
                int i10 = i + 1;
                path2 = path;
                path2.cubicTo(pointer.f42109a, pointer.f42110b, pointer2.f42109a, pointer2.f42110b, ((Pointer) pointList.get(i10)).f42109a, ((Pointer) pointList.get(i10)).f42110b);
            } else {
                path2 = path;
            }
            i++;
            path = path2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m14305j(CopyOnWriteArrayList copyOnWriteArrayList, Path path) {
        if (path == null || copyOnWriteArrayList == null) {
            return;
        }
        if (copyOnWriteArrayList.size() <= 1) {
            return;
        }
        path.moveTo(((Pointer) copyOnWriteArrayList.get(0)).f42109a, ((Pointer) copyOnWriteArrayList.get(0)).f42110b);
        int size = copyOnWriteArrayList.size();
        for (int i = 1; i < size; i++) {
            path.lineTo(((Pointer) copyOnWriteArrayList.get(i)).f42109a, ((Pointer) copyOnWriteArrayList.get(i)).f42110b);
        }
    }
}
