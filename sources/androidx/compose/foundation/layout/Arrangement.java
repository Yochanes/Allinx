package androidx.compose.foundation.layout;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Arrangement {

    /* JADX INFO: renamed from: a */
    public static final Arrangement$Start$1 f6257a = new Arrangement$Start$1();

    /* JADX INFO: renamed from: b */
    public static final Arrangement$End$1 f6258b = new Arrangement$End$1();

    /* JADX INFO: renamed from: c */
    public static final Arrangement$Top$1 f6259c = new Arrangement$Top$1();

    /* JADX INFO: renamed from: d */
    public static final Arrangement$Bottom$1 f6260d = new Arrangement$Bottom$1();

    /* JADX INFO: renamed from: e */
    public static final Arrangement$Center$1 f6261e = new Arrangement$Center$1();

    /* JADX INFO: renamed from: f */
    public static final Arrangement$SpaceEvenly$1 f6262f = new Arrangement$SpaceEvenly$1();

    /* JADX INFO: renamed from: g */
    public static final Arrangement$SpaceBetween$1 f6263g = new Arrangement$SpaceBetween$1();

    /* JADX INFO: renamed from: h */
    public static final Arrangement$SpaceAround$1 f6264h = new Arrangement$SpaceAround$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final class Absolute {

        /* JADX INFO: renamed from: a */
        public static final Arrangement$Absolute$Left$1 f6265a = new Arrangement$Absolute$Left$1();

        /* JADX INFO: renamed from: b */
        public static final Arrangement$Absolute$Center$1 f6266b = new Arrangement$Absolute$Center$1();

        /* JADX INFO: renamed from: c */
        public static final Arrangement$Absolute$Right$1 f6267c = new Arrangement$Absolute$Right$1();

        /* JADX INFO: renamed from: a */
        public static SpacedAligned m2731a(float f) {
            return new SpacedAligned(f, false, new Arrangement$Absolute$spacedBy$1(2));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Stable
    @SourceDebugExtension
    public interface Horizontal {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class DefaultImpls {
        }

        /* JADX INFO: renamed from: a */
        void mo2732a(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getF6275d() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Stable
    @SourceDebugExtension
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getF6275d() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Immutable
    @SourceDebugExtension
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {

        /* JADX INFO: renamed from: a */
        public final float f6272a;

        /* JADX INFO: renamed from: b */
        public final boolean f6273b;

        /* JADX INFO: renamed from: c */
        public final Lambda f6274c;

        /* JADX INFO: renamed from: d */
        public final float f6275d;

        /* JADX WARN: Multi-variable type inference failed */
        public SpacedAligned(float f, boolean z2, Function2 function2) {
            this.f6272a = f;
            this.f6273b = z2;
            this.f6274c = (Lambda) function2;
            this.f6275d = f;
        }

        /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        /* JADX INFO: renamed from: a */
        public final void mo2732a(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            if (iArr.length == 0) {
                return;
            }
            int iMo2554k1 = density.mo2554k1(this.f6272a);
            boolean z2 = this.f6273b && layoutDirection == LayoutDirection.f20570b;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f6257a;
            if (z2) {
                int length = iArr.length - 1;
                i2 = 0;
                i3 = 0;
                while (-1 < length) {
                    int i4 = iArr[length];
                    int iMin = Math.min(i2, i - i4);
                    iArr2[length] = iMin;
                    int iMin2 = Math.min(iMo2554k1, (i - iMin) - i4);
                    int i5 = iArr2[length] + i4 + iMin2;
                    length--;
                    i3 = iMin2;
                    i2 = i5;
                }
            } else {
                int length2 = iArr.length;
                int i6 = 0;
                i2 = 0;
                i3 = 0;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = iArr[i6];
                    int iMin3 = Math.min(i2, i - i8);
                    iArr2[i7] = iMin3;
                    int iMin4 = Math.min(iMo2554k1, (i - iMin3) - i8);
                    int i9 = iArr2[i7] + i8 + iMin4;
                    i6++;
                    i3 = iMin4;
                    i2 = i9;
                    i7++;
                }
            }
            int i10 = i2 - i3;
            ?? r11 = this.f6274c;
            if (r11 == 0 || i10 >= i) {
                return;
            }
            int iIntValue = ((Number) r11.invoke(Integer.valueOf(i - i10), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public final void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            mo2732a(density, i, iArr, LayoutDirection.f20569a, iArr2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return C1338Dp.m6641a(this.f6272a, spacedAligned.f6272a) && this.f6273b == spacedAligned.f6273b && Intrinsics.m18594b(this.f6274c, spacedAligned.f6274c);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public final float getF6275d() {
            return this.f6275d;
        }

        public final int hashCode() {
            int iM2230e = AbstractC0455a.m2230e(Float.hashCode(this.f6272a) * 31, 31, this.f6273b);
            Lambda lambda = this.f6274c;
            return iM2230e + (lambda == null ? 0 : lambda.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6273b ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            AbstractC0455a.m2248w(this.f6272a, ", ", sb);
            sb.append(this.f6274c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @Stable
    @SourceDebugExtension
    public interface Vertical {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
        public static final class DefaultImpls {
        }

        void arrange(Density density, int i, int[] iArr, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float getF6275d() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Arrangement$SpaceBetween$1 m2721a() {
        return f6263g;
    }

    /* JADX INFO: renamed from: b */
    public static void m2722b(int i, int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2;
        if (!z2) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2723c(int[] iArr, int[] iArr2, boolean z2) {
        int i = 0;
        if (!z2) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2724d(int i, int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m2725e(int i, int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i3) / iArr.length;
        float f = length / 2;
        if (!z2) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i7 + length;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m2726f(int i, int[] iArr, int[] iArr2, boolean z2) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z2 && iArr.length == 1) ? fMax : 0.0f;
        if (z2) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + fMax;
            i2++;
            i6++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2727g(int i, int[] iArr, int[] iArr2, boolean z2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z2) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    /* JADX INFO: renamed from: h */
    public static SpacedAligned m2728h(float f) {
        return new SpacedAligned(f, true, Arrangement$spacedBy$1.f6276a);
    }

    /* JADX INFO: renamed from: i */
    public static SpacedAligned m2729i(float f, BiasAlignment.Horizontal horizontal) {
        return new SpacedAligned(f, true, new Arrangement$spacedBy$2(horizontal));
    }

    /* JADX INFO: renamed from: j */
    public static SpacedAligned m2730j(float f, BiasAlignment.Vertical vertical) {
        return new SpacedAligned(f, false, new Arrangement$spacedBy$3(vertical));
    }
}
