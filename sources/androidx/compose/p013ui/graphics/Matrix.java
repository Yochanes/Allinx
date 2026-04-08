package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.MutableRect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "Companion", "values", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
@SourceDebugExtension
public final class Matrix {

    /* JADX INFO: renamed from: a */
    public final float[] f17611a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, m18302d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "", "Perspective0", "I", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public /* synthetic */ Matrix(float[] fArr) {
        this.f17611a = fArr;
    }

    /* JADX INFO: renamed from: a */
    public static float[] m5228a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX INFO: renamed from: b */
    public static final long m5229b(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1 / (((f6 * fIntBitsToFloat2) + (f3 * fIntBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits((((f4 * fIntBitsToFloat2) + (f * fIntBitsToFloat)) + f7) * f10)) << 32) | (((long) Float.floatToRawIntBits(((f5 * fIntBitsToFloat2) + (f2 * fIntBitsToFloat) + f8) * f10)) & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static final void m5230c(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = mutableRect.f17520a;
        float f11 = mutableRect.f17521b;
        float f12 = mutableRect.f17522c;
        float f13 = mutableRect.f17523d;
        float f14 = f3 * f10;
        float f15 = f6 * f11;
        float f16 = 1.0f / ((f14 + f15) + f9);
        if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
            f16 = 0.0f;
        }
        float f17 = f * f10;
        float f18 = f4 * f11;
        float f19 = (f17 + f18 + f7) * f16;
        float f20 = f10 * f2;
        float f21 = f11 * f5;
        float f22 = (f20 + f21 + f8) * f16;
        float f23 = f6 * f13;
        float f24 = 1.0f / ((f14 + f23) + f9);
        if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
            f24 = 0.0f;
        }
        float f25 = f4 * f13;
        float f26 = (f17 + f25 + f7) * f24;
        float f27 = f5 * f13;
        float f28 = (f20 + f27 + f8) * f24;
        float f29 = f3 * f12;
        float f30 = 1.0f / ((f15 + f29) + f9);
        if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
            f30 = 0.0f;
        }
        float f31 = f * f12;
        float f32 = (f31 + f18 + f7) * f30;
        float f33 = f12 * f2;
        float f34 = (f21 + f33 + f8) * f30;
        float f35 = 1.0f / ((f29 + f23) + f9);
        float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
        float f37 = (f31 + f25 + f7) * f36;
        float f38 = (f33 + f27 + f8) * f36;
        mutableRect.f17520a = Math.min(f19, Math.min(f26, Math.min(f32, f37)));
        mutableRect.f17521b = Math.min(f22, Math.min(f28, Math.min(f34, f38)));
        mutableRect.f17522c = Math.max(f19, Math.max(f26, Math.max(f32, f37)));
        mutableRect.f17523d = Math.max(f22, Math.max(f28, Math.max(f34, f38)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m5231d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public static final void m5232e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[4];
            float f5 = fArr[2];
            float f6 = fArr2[8];
            float f7 = f5 * f6;
            float f8 = fArr[3];
            float f9 = fArr2[12];
            float f10 = f8 * f9;
            float f11 = f10 + f7 + (f3 * f4) + (f * f2);
            float f12 = fArr2[1];
            float f13 = fArr2[5];
            float f14 = fArr2[9];
            float f15 = f5 * f14;
            float f16 = fArr2[13];
            float f17 = f8 * f16;
            float f18 = f17 + f15 + (f3 * f13) + (f * f12);
            float f19 = fArr2[2];
            float f20 = fArr2[6];
            float f21 = fArr2[10];
            float f22 = f5 * f21;
            float f23 = fArr2[14];
            float f24 = f8 * f23;
            float f25 = f24 + f22 + (f3 * f20) + (f * f19);
            float f26 = fArr2[3];
            float f27 = fArr2[7];
            float f28 = fArr2[11];
            float f29 = f5 * f28;
            float f30 = fArr2[15];
            float f31 = f8 * f30;
            float f32 = f31 + f29 + (f3 * f27) + (f * f26);
            float f33 = fArr[4];
            float f34 = fArr[5];
            float f35 = fArr[6];
            float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
            float f37 = fArr[7];
            float f38 = (f37 * f9) + f36;
            float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
            float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
            float f41 = f35 * f28;
            float f42 = f37 * f30;
            float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
            float f44 = fArr[8];
            float f45 = fArr[9];
            float f46 = fArr[10];
            float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
            float f48 = fArr[11];
            float f49 = (f48 * f9) + f47;
            float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
            float f51 = (f48 * f23) + (f46 * f21) + (f45 * f20) + (f44 * f19);
            float f52 = f46 * f28;
            float f53 = f48 * f30;
            float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
            float f55 = fArr[12];
            float f56 = fArr[13];
            float f57 = (f4 * f56) + (f2 * f55);
            float f58 = fArr[14];
            float f59 = (f6 * f58) + f57;
            float f60 = fArr[15];
            float f61 = (f9 * f60) + f59;
            float f62 = f14 * f58;
            float f63 = f16 * f60;
            float f64 = f63 + f62 + (f13 * f56) + (f12 * f55);
            float f65 = f21 * f58;
            float f66 = f23 * f60;
            float f67 = f66 + f65 + (f20 * f56) + (f19 * f55);
            float f68 = f58 * f28;
            float f69 = f60 * f30;
            fArr[0] = f11;
            fArr[1] = f18;
            fArr[2] = f25;
            fArr[3] = f32;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f43;
            fArr[8] = f49;
            fArr[9] = f50;
            fArr[10] = f51;
            fArr[11] = f54;
            fArr[12] = f61;
            fArr[13] = f64;
            fArr[14] = f67;
            fArr[15] = f69 + f68 + (f56 * f27) + (f55 * f26);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m5233f(float[] fArr, float f, float f2) {
        if (fArr.length < 16) {
            return;
        }
        float f3 = (fArr[8] * 0.0f) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f4 = (fArr[9] * 0.0f) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f5 = (fArr[10] * 0.0f) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f6 = (fArr[11] * 0.0f) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Matrix) {
            return Intrinsics.m18594b(this.f17611a, ((Matrix) obj).f17611a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17611a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f17611a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return StringsKt.m20431c0(sb.toString());
    }
}
