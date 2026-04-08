package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LayoutCoordinatesKt {
    /* JADX INFO: renamed from: a */
    public static final Rect m5629a(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesMo5623Y = layoutCoordinates.mo5623Y();
        return layoutCoordinatesMo5623Y != null ? layoutCoordinatesMo5623Y.mo5620M(layoutCoordinates, true) : new Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo5624a() >> 32), (int) (layoutCoordinates.mo5624a() & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static final Rect m5630b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesM5631c = m5631c(layoutCoordinates);
        float fMo5624a = (int) (layoutCoordinatesM5631c.mo5624a() >> 32);
        float fMo5624a2 = (int) (layoutCoordinatesM5631c.mo5624a() & 4294967295L);
        Rect rectMo5620M = layoutCoordinatesM5631c.mo5620M(layoutCoordinates, true);
        float f = rectMo5620M.f17526a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > fMo5624a) {
            f = fMo5624a;
        }
        float f2 = rectMo5620M.f17527b;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fMo5624a2) {
            f2 = fMo5624a2;
        }
        float f3 = rectMo5620M.f17528c;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= fMo5624a) {
            fMo5624a = f3;
        }
        float f4 = rectMo5620M.f17529d;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= fMo5624a2) {
            fMo5624a2 = f5;
        }
        if (f == fMo5624a || f2 == fMo5624a2) {
            return Rect.f17525e;
        }
        long jMo5628z = layoutCoordinatesM5631c.mo5628z((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo5628z2 = layoutCoordinatesM5631c.mo5628z((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo5624a)) << 32));
        long jMo5628z3 = layoutCoordinatesM5631c.mo5628z((((long) Float.floatToRawIntBits(fMo5624a)) << 32) | (((long) Float.floatToRawIntBits(fMo5624a2)) & 4294967295L));
        long jMo5628z4 = layoutCoordinatesM5631c.mo5628z((((long) Float.floatToRawIntBits(fMo5624a2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo5628z >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo5628z2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo5628z4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo5628z3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo5628z & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo5628z2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo5628z4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo5628z3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: c */
    public static final LayoutCoordinates m5631c(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates layoutCoordinatesMo5623Y = layoutCoordinates.mo5623Y();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = layoutCoordinatesMo5623Y;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            layoutCoordinatesMo5623Y = layoutCoordinates.mo5623Y();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f18947v;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.f18947v;
        }
    }
}
