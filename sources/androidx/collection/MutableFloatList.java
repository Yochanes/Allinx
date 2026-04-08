package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MutableFloatList extends FloatList {
    public MutableFloatList(int i) {
        this.f3665a = i == 0 ? FloatSetKt.f3668a : new float[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m2014a(float f) {
        int i = this.f3666b + 1;
        float[] fArr = this.f3665a;
        if (fArr.length < i) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            Intrinsics.m18598f(fArrCopyOf, "copyOf(...)");
            this.f3665a = fArrCopyOf;
        }
        float[] fArr2 = this.f3665a;
        int i2 = this.f3666b;
        fArr2[i2] = f;
        this.f3666b = i2 + 1;
    }
}
