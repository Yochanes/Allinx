package androidx.compose.p013ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.p013ui.unit.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/unit/fontscaling/FontScaleConverterFactory;", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public final class FontScaleConverterFactory {

    /* JADX INFO: renamed from: a */
    public static final float[] f20579a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile SparseArrayCompat f20580b = new SparseArrayCompat(0);

    /* JADX INFO: renamed from: c */
    public static final Object[] f20581c;

    static {
        Object[] objArr = new Object[0];
        f20581c = objArr;
        synchronized (objArr) {
            f20580b.m2136e((int) 115.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f20580b.m2136e((int) 130.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f20580b.m2136e((int) 150.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f20580b.m2136e((int) 180.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f20580b.m2136e((int) 200.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f20580b.m2135d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        InlineClassHelperKt.m6649b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: a */
    public static FontScaleConverter m6692a(float f) {
        float fM2135d;
        FontScaleConverter fontScaleConverterTable;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        FontScaleConverter fontScaleConverter = (FontScaleConverter) f20580b.m2134c(i);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        SparseArrayCompat sparseArrayCompat = f20580b;
        if (sparseArrayCompat.f3885a) {
            SparseArrayCompatKt.m2139a(sparseArrayCompat);
        }
        int iM2141a = ContainerHelpersKt.m2141a(sparseArrayCompat.f3888d, i, sparseArrayCompat.f3886b);
        if (iM2141a >= 0) {
            return (FontScaleConverter) f20580b.m2138h(iM2141a);
        }
        int i2 = -(iM2141a + 1);
        int i3 = i2 - 1;
        if (i2 >= f20580b.m2137f()) {
            FontScaleConverterTable fontScaleConverterTable2 = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f});
            m6693b(f, fontScaleConverterTable2);
            return fontScaleConverterTable2;
        }
        float[] fArr = f20579a;
        if (i3 < 0) {
            fontScaleConverterTable = new FontScaleConverterTable(fArr, fArr);
            fM2135d = 1.0f;
        } else {
            fM2135d = f20580b.m2135d(i3) / 100.0f;
            fontScaleConverterTable = (FontScaleConverter) f20580b.m2138h(i3);
        }
        float fM2135d2 = f20580b.m2135d(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fM2135d == fM2135d2 ? 0.0f : (f - fM2135d) / (fM2135d2 - fM2135d))) * 1.0f) + 0.0f;
        FontScaleConverter fontScaleConverter2 = (FontScaleConverter) f20580b.m2138h(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fMo6672b = fontScaleConverterTable.mo6672b(f2);
            fArr2[i4] = ((fontScaleConverter2.mo6672b(f2) - fMo6672b) * fMax) + fMo6672b;
        }
        FontScaleConverterTable fontScaleConverterTable3 = new FontScaleConverterTable(fArr, fArr2);
        m6693b(f, fontScaleConverterTable3);
        return fontScaleConverterTable3;
    }

    /* JADX INFO: renamed from: b */
    public static void m6693b(float f, FontScaleConverterTable fontScaleConverterTable) {
        synchronized (f20581c) {
            SparseArrayCompat sparseArrayCompatM2133b = f20580b.m2133b();
            sparseArrayCompatM2133b.m2136e((int) (f * 100.0f), fontScaleConverterTable);
            f20580b = sparseArrayCompatM2133b;
        }
    }
}
