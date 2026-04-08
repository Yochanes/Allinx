package kotlin.text;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmName
public final class UStringsKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte m20459a(String str) {
        UByte uByte;
        Intrinsics.m18599g(str, "<this>");
        UInt uIntM20461c = m20461c(str);
        if (uIntM20461c != null) {
            int i = uIntM20461c.f51446a;
            uByte = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new UByte((byte) i);
        }
        if (uByte != null) {
            return uByte.f51442a;
        }
        StringsKt__StringNumberConversionsKt.m20451a(str);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final int m20460b(String str) {
        Intrinsics.m18599g(str, "<this>");
        UInt uIntM20461c = m20461c(str);
        if (uIntM20461c != null) {
            return uIntM20461c.f51446a;
        }
        StringsKt__StringNumberConversionsKt.m20451a(str);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final UInt m20461c(String str) {
        int i;
        Intrinsics.m18599g(str, "<this>");
        CharsKt.m20380b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.m18601i(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int i3 = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            int i4 = i2 ^ Integer.MIN_VALUE;
            if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i4, i3 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i5 = i2 * 10;
            int i6 = iDigit + i5;
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i++;
            i2 = i6;
        }
        return new UInt(i2);
    }

    /* JADX INFO: renamed from: d */
    public static final long m20462d(String str) {
        Intrinsics.m18599g(str, "<this>");
        ULong uLongM20463e = m20463e(str);
        if (uLongM20463e != null) {
            return uLongM20463e.f51450a;
        }
        StringsKt__StringNumberConversionsKt.m20451a(str);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static final ULong m20463e(String str) {
        int i;
        long j;
        Intrinsics.m18599g(str, "<this>");
        int i2 = 10;
        CharsKt.m20380b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i3 = 1;
        if (Intrinsics.m18601i(cCharAt, 48) >= 0) {
            i = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i = 1;
        }
        long j2 = 10;
        long j3 = 0;
        long j4 = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), i2);
            if (iDigit < 0) {
                return null;
            }
            int i4 = length;
            long j5 = j3 ^ Long.MIN_VALUE;
            int i5 = i;
            if (Long.compare(j5, j4 ^ Long.MIN_VALUE) <= 0) {
                j = j2;
            } else {
                if (j4 != 512409557603043100L) {
                    return null;
                }
                if (j2 >= 0) {
                    long j6 = (Long.MAX_VALUE / j2) << i3;
                    j = j2;
                    j4 = j6 + ((long) ((((-1) - (j6 * j2)) ^ Long.MIN_VALUE) >= (j2 ^ Long.MIN_VALUE) ? i3 : 0));
                } else if (Long.MAX_VALUE < (j2 ^ Long.MIN_VALUE)) {
                    j = j2;
                    j4 = 0;
                } else {
                    j4 = 1;
                    j = j2;
                }
                if (Long.compare(j5, j4 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j7 = j3 * j;
            long j8 = (((long) iDigit) & 4294967295L) + j7;
            if (Long.compare(j8 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i = i5 + 1;
            j3 = j8;
            length = i4;
            j2 = j;
            i2 = 10;
            i3 = 1;
        }
        return new ULong(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short m20464f(String str) {
        UShort uShort;
        Intrinsics.m18599g(str, "<this>");
        UInt uIntM20461c = m20461c(str);
        if (uIntM20461c != null) {
            int i = uIntM20461c.f51446a;
            uShort = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new UShort((short) i);
        }
        if (uShort != null) {
            return uShort.f51455a;
        }
        StringsKt__StringNumberConversionsKt.m20451a(str);
        throw null;
    }
}
