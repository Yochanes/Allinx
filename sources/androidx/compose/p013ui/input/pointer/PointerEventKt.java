package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PointerEventKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m5551a(PointerInputChange pointerInputChange) {
        return !pointerInputChange.f18304h && pointerInputChange.f18300d;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m5552b(PointerInputChange pointerInputChange) {
        return (pointerInputChange.m5563b() || !pointerInputChange.f18304h || pointerInputChange.f18300d) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m5553c(PointerInputChange pointerInputChange) {
        return pointerInputChange.f18304h && !pointerInputChange.f18300d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m5554d(PointerInputChange pointerInputChange, long j, long j2) {
        int i = pointerInputChange.f18305i == 1 ? 1 : 0;
        long j3 = pointerInputChange.f18299c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX INFO: renamed from: e */
    public static final long m5555e(PointerInputChange pointerInputChange, boolean z2) {
        long jM5057g = Offset.m5057g(pointerInputChange.f18299c, pointerInputChange.f18303g);
        if (z2 || !pointerInputChange.m5563b()) {
            return jM5057g;
        }
        return 0L;
    }
}
