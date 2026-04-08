package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyGridMeasuredLine {

    /* JADX INFO: renamed from: a */
    public final int f7086a;

    /* JADX INFO: renamed from: b */
    public final LazyGridMeasuredItem[] f7087b;

    /* JADX INFO: renamed from: c */
    public final LazyGridSlots f7088c;

    /* JADX INFO: renamed from: d */
    public final Object f7089d;

    /* JADX INFO: renamed from: e */
    public final boolean f7090e;

    /* JADX INFO: renamed from: f */
    public final int f7091f;

    /* JADX INFO: renamed from: g */
    public final int f7092g;

    /* JADX INFO: renamed from: h */
    public final int f7093h;

    public LazyGridMeasuredLine(int i, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List list, boolean z2, int i2) {
        this.f7086a = i;
        this.f7087b = lazyGridMeasuredItemArr;
        this.f7088c = lazyGridSlots;
        this.f7089d = list;
        this.f7090e = z2;
        this.f7091f = i2;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.f7073p);
        }
        this.f7092g = iMax;
        int i3 = iMax + this.f7091f;
        this.f7093h = i3 >= 0 ? i3 : 0;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public final LazyGridMeasuredItem[] m3006a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.f7087b;
        int length = lazyGridMeasuredItemArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i8];
            int i11 = i9 + 1;
            int i12 = (int) ((GridItemSpan) this.f7089d.get(i9)).f6945a;
            int i13 = this.f7088c.f7107b[i10];
            int i14 = this.f7086a;
            boolean z2 = this.f7090e;
            int i15 = z2 ? i14 : i10;
            if (z2) {
                i4 = i10;
                i7 = i;
                i5 = i2;
                i6 = i3;
            } else {
                i4 = i14;
                i5 = i2;
                i6 = i3;
                i7 = i;
            }
            lazyGridMeasuredItem.m3004r(i7, i13, i5, i6, i15, i4);
            i10 += i12;
            i8++;
            i9 = i11;
        }
        return lazyGridMeasuredItemArr;
    }
}
