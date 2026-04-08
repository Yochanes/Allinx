package androidx.compose.p013ui.graphics;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"Landroid/graphics/Shader;", "Shader", "ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidShader_androidKt {
    /* JADX INFO: renamed from: a */
    public static final int m5164a(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iM18405F = CollectionsKt.m18405F(list);
        for (int i2 = 1; i2 < iM18405F; i2++) {
            if (Color.m5182d(((Color) list.get(i2)).f17585a) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static final int[] m5165b(int i, List list) {
        int i2;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ColorKt.m5201j(((Color) list.get(i3)).f17585a);
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int iM18405F = CollectionsKt.m18405F(list);
        int size2 = list.size();
        int i4 = 0;
        while (i3 < size2) {
            long j = ((Color) list.get(i3)).f17585a;
            if (Color.m5182d(j) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m5201j(Color.m5180b(0.0f, ((Color) list.get(1)).f17585a));
                } else if (i3 == iM18405F) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m5201j(Color.m5180b(0.0f, ((Color) list.get(i3 - 1)).f17585a));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = ColorKt.m5201j(Color.m5180b(0.0f, ((Color) list.get(i3 - 1)).f17585a));
                    i4 += 2;
                    iArr2[i5] = ColorKt.m5201j(Color.m5180b(0.0f, ((Color) list.get(i3 + 1)).f17585a));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m5201j(j);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: c */
    public static final float[] m5166c(ArrayList arrayList, List list, int i) {
        if (i == 0) {
            if (arrayList != null) {
                return CollectionsKt.m18459u0(arrayList);
            }
            return null;
        }
        float[] fArr = new float[list.size() + i];
        fArr[0] = arrayList != null ? ((Number) arrayList.get(0)).floatValue() : 0.0f;
        int iM18405F = CollectionsKt.m18405F(list);
        int i2 = 1;
        for (int i3 = 1; i3 < iM18405F; i3++) {
            long j = ((Color) list.get(i3)).f17585a;
            float fFloatValue = arrayList != null ? ((Number) arrayList.get(i3)).floatValue() : i3 / CollectionsKt.m18405F(list);
            int i4 = i2 + 1;
            fArr[i2] = fFloatValue;
            if (Color.m5182d(j) == 0.0f) {
                i2 += 2;
                fArr[i4] = fFloatValue;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = arrayList != null ? ((Number) arrayList.get(CollectionsKt.m18405F(list))).floatValue() : 1.0f;
        return fArr;
    }

    /* JADX INFO: renamed from: d */
    public static final void m5167d(List list, ArrayList arrayList) {
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != arrayList.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
