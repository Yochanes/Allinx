package androidx.compose.material;

import androidx.compose.p013ui.graphics.TransformOriginKt;
import androidx.compose.p013ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m18302d2 = {"", "scale", "alpha", "material_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MenuKt {

    /* JADX INFO: renamed from: a */
    public static final float f10702a = 48;

    /* JADX INFO: renamed from: b */
    public static final float f10703b = 16;

    /* JADX INFO: renamed from: c */
    public static final float f10704c = 8;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m3759a(IntRect intRect, IntRect intRect2) {
        float fMin;
        float fMin2 = 1.0f;
        if (intRect2.f20564a < intRect.f20566c) {
            if (intRect2.f20566c <= intRect.f20564a) {
                fMin = 1.0f;
            } else if (intRect2.m6661d() == 0) {
                fMin = 0.0f;
            } else {
                int i = intRect2.f20564a;
                fMin = (((Math.min(intRect.f20566c, r0) + Math.max(r1, i)) / 2) - i) / intRect2.m6661d();
            }
        }
        if (intRect2.f20565b < intRect.f20567d) {
            if (intRect2.f20567d > intRect.f20565b) {
                if (intRect2.m6659b() == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(r4, r5) + Math.max(r6, r1)) / 2) - r1) / intRect2.m6659b();
                }
            }
        }
        return TransformOriginKt.m5252a(fMin, fMin2);
    }
}
