package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerEvent;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TransformGestureDetectorKt {
    /* JADX INFO: renamed from: a */
    public static final float m2672a(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static final long m2673b(PointerEvent pointerEvent, boolean z2) {
        ?? r7 = pointerEvent.f18282a;
        int size = ((Collection) r7).size();
        long jM5058h = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r7.get(i2);
            if (pointerInputChange.f18300d && pointerInputChange.f18304h) {
                jM5058h = Offset.m5058h(jM5058h, z2 ? pointerInputChange.f18299c : pointerInputChange.f18303g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return Offset.m5052b(i, jM5058h);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static final float m2674c(PointerEvent pointerEvent, boolean z2) {
        long jM2673b = m2673b(pointerEvent, z2);
        float fM5054d = 0.0f;
        if (Offset.m5053c(jM2673b, 9205357640488583168L)) {
            return 0.0f;
        }
        ?? r8 = pointerEvent.f18282a;
        int size = ((Collection) r8).size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r8.get(i2);
            if (pointerInputChange.f18300d && pointerInputChange.f18304h) {
                i++;
                fM5054d = Offset.m5054d(Offset.m5057g(z2 ? pointerInputChange.f18299c : pointerInputChange.f18303g, jM2673b)) + fM5054d;
            }
        }
        return fM5054d / i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public static final float m2675d(PointerEvent pointerEvent) {
        ?? r0 = pointerEvent.f18282a;
        int size = ((Collection) r0).size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) r0.get(i);
            if (!pointerInputChange.f18304h || !pointerInputChange.f18300d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jM2673b = m2673b(pointerEvent, true);
            long jM2673b2 = m2673b(pointerEvent, false);
            int size2 = ((Collection) r0).size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) r0.get(i4);
                if (pointerInputChange2.f18300d && pointerInputChange2.f18304h) {
                    long jM5057g = Offset.m5057g(pointerInputChange2.f18303g, jM2673b2);
                    long jM5057g2 = Offset.m5057g(pointerInputChange2.f18299c, jM2673b);
                    float fM2672a = m2672a(jM5057g2) - m2672a(jM5057g);
                    float fM5054d = Offset.m5054d(Offset.m5058h(jM5057g2, jM5057g)) / 2.0f;
                    if (fM2672a > 180.0f) {
                        fM2672a -= 360.0f;
                    } else if (fM2672a < -180.0f) {
                        fM2672a += 360.0f;
                    }
                    f2 += fM2672a * fM5054d;
                    f += fM5054d;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }
}
