package androidx.compose.p013ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m18302d2 = {"", "widthVal", "heightVal", "", "k", "(II)V", "size", "", "l", "(I)Ljava/lang/Void;", "ui-unit_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConstraintsKt {
    /* JADX INFO: renamed from: a */
    public static final long m6627a(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            InlineClassHelperKt.m6648a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m6634h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m6628b(int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return m6627a(0, i, 0, i2);
    }

    /* JADX INFO: renamed from: c */
    public static final int m6629c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: d */
    public static final long m6630d(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iM6619j = Constraints.m6619j(j);
        int iM6617h = Constraints.m6617h(j);
        if (i < iM6619j) {
            i = iM6619j;
        }
        if (i <= iM6617h) {
            iM6617h = i;
        }
        int i2 = (int) (j2 & 4294967295L);
        int iM6618i = Constraints.m6618i(j);
        int iM6616g = Constraints.m6616g(j);
        if (i2 < iM6618i) {
            i2 = iM6618i;
        }
        if (i2 <= iM6616g) {
            iM6616g = i2;
        }
        return (((long) iM6617h) << 32) | (((long) iM6616g) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m6631e(long j, long j2) {
        int iM6619j = Constraints.m6619j(j);
        int iM6617h = Constraints.m6617h(j);
        int iM6618i = Constraints.m6618i(j);
        int iM6616g = Constraints.m6616g(j);
        int iM6619j2 = Constraints.m6619j(j2);
        if (iM6619j2 < iM6619j) {
            iM6619j2 = iM6619j;
        }
        if (iM6619j2 > iM6617h) {
            iM6619j2 = iM6617h;
        }
        int iM6617h2 = Constraints.m6617h(j2);
        if (iM6617h2 >= iM6619j) {
            iM6619j = iM6617h2;
        }
        if (iM6619j <= iM6617h) {
            iM6617h = iM6619j;
        }
        int iM6618i2 = Constraints.m6618i(j2);
        if (iM6618i2 < iM6618i) {
            iM6618i2 = iM6618i;
        }
        if (iM6618i2 > iM6616g) {
            iM6618i2 = iM6616g;
        }
        int iM6616g2 = Constraints.m6616g(j2);
        if (iM6616g2 >= iM6618i) {
            iM6618i = iM6616g2;
        }
        if (iM6618i <= iM6616g) {
            iM6616g = iM6618i;
        }
        return m6627a(iM6619j2, iM6617h, iM6618i2, iM6616g);
    }

    /* JADX INFO: renamed from: f */
    public static final int m6632f(int i, long j) {
        int iM6618i = Constraints.m6618i(j);
        int iM6616g = Constraints.m6616g(j);
        if (i < iM6618i) {
            i = iM6618i;
        }
        return i > iM6616g ? iM6616g : i;
    }

    /* JADX INFO: renamed from: g */
    public static final int m6633g(int i, long j) {
        int iM6619j = Constraints.m6619j(j);
        int iM6617h = Constraints.m6617h(j);
        if (i < iM6619j) {
            i = iM6619j;
        }
        return i > iM6617h ? iM6617h : i;
    }

    /* JADX INFO: renamed from: h */
    public static final long m6634h(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int iM6629c = m6629c(i5);
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iM6629c2 = m6629c(i6);
        if (iM6629c + iM6629c2 > 31) {
            m6637k(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iM6629c2 - 13;
        return (((long) (i7 & (~(i7 >> 31)))) << 33) | ((long) ((i9 >> 1) + (i9 & 1))) | (((long) i) << 2) | (((long) i3) << (iM6629c2 + 2)) | (((long) (i8 & (~(i8 >> 31)))) << (iM6629c2 + 33));
    }

    /* JADX INFO: renamed from: i */
    public static final long m6635i(long j, int i, int i2) {
        int iM6619j = Constraints.m6619j(j) + i;
        if (iM6619j < 0) {
            iM6619j = 0;
        }
        int iM6617h = Constraints.m6617h(j);
        if (iM6617h != Integer.MAX_VALUE && (iM6617h = iM6617h + i) < 0) {
            iM6617h = 0;
        }
        int iM6618i = Constraints.m6618i(j) + i2;
        if (iM6618i < 0) {
            iM6618i = 0;
        }
        int iM6616g = Constraints.m6616g(j);
        return m6627a(iM6619j, iM6617h, iM6618i, (iM6616g == Integer.MAX_VALUE || (iM6616g = iM6616g + i2) >= 0) ? iM6616g : 0);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ long m6636j(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m6635i(j, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public static final void m6637k(int i, int i2) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i2 + " in Constraints");
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final Void m6638l(int i) {
        throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Can't represent a size of ", " in Constraints"));
    }
}
