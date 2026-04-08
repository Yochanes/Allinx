package androidx.compose.p013ui.unit;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "Companion", "value", "", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension
public final class Constraints {

    /* JADX INFO: renamed from: a */
    public final long f20553a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "", "Infinity", "I", "ui-unit_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static long m6622a(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int iMin = Math.min(i3, 262142);
            int iMin2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.m6638l(i6);
                        throw new KotlinNothingValueException();
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.m6627a(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, iMin, iMin2);
        }

        /* JADX INFO: renamed from: b */
        public static long m6623b(int i, int i2, int i3, int i4) {
            int i5 = 262142;
            int iMin = Math.min(i, 262142);
            int iMin2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
            int i6 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i6 >= 8191) {
                if (i6 < 32767) {
                    i5 = 65534;
                } else if (i6 < 65535) {
                    i5 = 32766;
                } else {
                    if (i6 >= 262143) {
                        ConstraintsKt.m6638l(i6);
                        throw new KotlinNothingValueException();
                    }
                    i5 = 8190;
                }
            }
            return ConstraintsKt.m6627a(iMin, iMin2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: c */
        public static long m6624c(int i, int i2) {
            if (!((i2 >= 0) & (i >= 0))) {
                InlineClassHelperKt.m6648a("width and height must be >= 0");
            }
            return ConstraintsKt.m6634h(i, i, i2, i2);
        }

        /* JADX INFO: renamed from: d */
        public static long m6625d(int i) {
            if (i < 0) {
                InlineClassHelperKt.m6648a("height must be >= 0");
            }
            return ConstraintsKt.m6634h(0, Integer.MAX_VALUE, i, i);
        }

        /* JADX INFO: renamed from: e */
        public static long m6626e(int i) {
            if (i < 0) {
                InlineClassHelperKt.m6648a("width must be >= 0");
            }
            return ConstraintsKt.m6634h(i, i, 0, Integer.MAX_VALUE);
        }
    }

    public /* synthetic */ Constraints(long j) {
        this.f20553a = j;
    }

    /* JADX INFO: renamed from: a */
    public static long m6610a(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = m6619j(j);
        }
        if ((i5 & 2) != 0) {
            i2 = m6617h(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m6618i(j);
        }
        if ((i5 & 8) != 0) {
            i4 = m6616g(j);
        }
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            InlineClassHelperKt.m6648a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.m6634h(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m6611b(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m6612c(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m6613d(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m6614e(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m6615f(long j) {
        int i = (int) (3 & j);
        int i2 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i3 = ((int) (j >> 2)) & i2;
        int i4 = ((int) (j >> 33)) & i2;
        return i3 == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final int m6616g(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: h */
    public static final int m6617h(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int i3 = i2 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m6618i(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    /* JADX INFO: renamed from: j */
    public static final int m6619j(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m6620k(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    /* JADX INFO: renamed from: l */
    public static String m6621l(long j) {
        int iM6617h = m6617h(j);
        String strValueOf = iM6617h == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM6617h);
        int iM6616g = m6616g(j);
        String strValueOf2 = iM6616g != Integer.MAX_VALUE ? String.valueOf(iM6616g) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m6619j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m6618i(j));
        sb.append(", maxHeight = ");
        return AbstractC0455a.m2241p(sb, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Constraints) {
            return this.f20553a == ((Constraints) obj).f20553a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20553a);
    }

    public final String toString() {
        return m6621l(this.f20553a);
    }
}
