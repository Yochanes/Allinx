package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class StringsKt extends StringsKt___StringsKt {
    /* JADX INFO: renamed from: A */
    public static int m20403A(CharSequence charSequence, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = m20444t(charSequence);
        }
        Intrinsics.m18599g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        char[] cArr = {c2};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ArraysKt.m18356W(cArr), i);
        }
        int iM20444t = m20444t(charSequence);
        if (i > iM20444t) {
            i = iM20444t;
        }
        while (-1 < i) {
            if (CharsKt__CharKt.m20382a(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: B */
    public static String m20404B(int i, String str) {
        CharSequence charSequenceSubSequence;
        Intrinsics.m18599g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: C */
    public static boolean m20405C(int i, int i2, int i3, String str, String other, boolean z2) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(other, "other");
        return !z2 ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z2, i, other, i2, i3);
    }

    /* JADX INFO: renamed from: D */
    public static String m20406D(String str, String prefix) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(prefix, "prefix");
        if (!StringsKt__StringsKt.m20458h(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: E */
    public static String m20407E(String str, String str2) {
        if (!m20441q(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: F */
    public static String m20408F(String str) {
        Intrinsics.m18599g(str, "<this>");
        if (str.length() < 2 || !StringsKt__StringsKt.m20458h(str, "\"") || !m20441q(str, "\"")) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: G */
    public static String m20409G(String str, int i) {
        Intrinsics.m18599g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.m18596d(string);
        return string;
    }

    /* JADX INFO: renamed from: H */
    public static String m20410H(String str, char c2, char c3) {
        Intrinsics.m18599g(str, "<this>");
        String strReplace = str.replace(c2, c3);
        Intrinsics.m18598f(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX INFO: renamed from: I */
    public static String m20411I(String str, String oldValue, String newValue) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(oldValue, "oldValue");
        Intrinsics.m18599g(newValue, "newValue");
        int iM20452b = StringsKt__StringsKt.m20452b(str, oldValue, 0, false);
        if (iM20452b < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM20452b);
            sb.append(newValue);
            i2 = iM20452b + length;
            if (iM20452b >= str.length()) {
                break;
            }
            iM20452b = StringsKt__StringsKt.m20452b(str, oldValue, iM20452b + i, false);
        } while (iM20452b > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: J */
    public static StringBuilder m20412J(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        Intrinsics.m18599g(charSequence, "<this>");
        Intrinsics.m18599g(replacement, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(replacement);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    /* JADX INFO: renamed from: K */
    public static List m20413K(CharSequence charSequence, String[] strArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        Intrinsics.m18599g(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return StringsKt__StringsKt.m20457g(charSequence, i2, str);
            }
        }
        StringsKt__StringsKt.m20456f(i2);
        DelimitedRangesSequence<IntRange> delimitedRangesSequence = new DelimitedRangesSequence(charSequence, i2, new C6251b(ArraysKt.m18365e(strArr), 1));
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(delimitedRangesSequence), 10));
        for (IntRange range : delimitedRangesSequence) {
            Intrinsics.m18599g(range, "range");
            arrayList.add(charSequence.subSequence(range.f51685a, range.f51686b + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L */
    public static List m20414L(String str, char[] cArr) {
        Intrinsics.m18599g(str, "<this>");
        if (cArr.length == 1) {
            return StringsKt__StringsKt.m20457g(str, 0, String.valueOf(cArr[0]));
        }
        StringsKt__StringsKt.m20456f(0);
        DelimitedRangesSequence<IntRange> delimitedRangesSequence = new DelimitedRangesSequence(str, 0, new C6251b(cArr, 0));
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(delimitedRangesSequence), 10));
        for (IntRange range : delimitedRangesSequence) {
            Intrinsics.m18599g(range, "range");
            arrayList.add(str.subSequence(range.f51685a, range.f51686b + 1).toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m20415M(int i, String str, String str2, boolean z2) {
        Intrinsics.m18599g(str, "<this>");
        return !z2 ? str.startsWith(str2, i) : m20405C(i, 0, str2.length(), str, str2, z2);
    }

    /* JADX INFO: renamed from: N */
    public static boolean m20416N(String str, String prefix, boolean z2) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : m20405C(0, 0, prefix.length(), str, prefix, z2);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m20417O(String str, char c2) {
        Intrinsics.m18599g(str, "<this>");
        return str.length() > 0 && CharsKt__CharKt.m20382a(str.charAt(0), c2, false);
    }

    /* JADX INFO: renamed from: P */
    public static String m20418P(char c2, String str, String str2) {
        int iM20445u = m20445u(str, c2, 0, 6);
        if (iM20445u == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM20445u + 1, str.length());
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Q */
    public static String m20419Q(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(delimiter, "delimiter");
        Intrinsics.m18599g(missingDelimiterValue, "missingDelimiterValue");
        int iM20446v = m20446v(str, delimiter, 0, false, 6);
        if (iM20446v == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iM20446v, str.length());
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: R */
    public static String m20420R(char c2, String str, String missingDelimiterValue) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(missingDelimiterValue, "missingDelimiterValue");
        int iM20403A = m20403A(str, c2, 0, 6);
        if (iM20403A == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM20403A + 1, str.length());
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: S */
    public static String m20421S(String str, String str2, String missingDelimiterValue) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(missingDelimiterValue, "missingDelimiterValue");
        int iM20450z = m20450z(0, 6, str, str2);
        if (iM20450z == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(str2.length() + iM20450z, str.length());
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: T */
    public static String m20422T(String missingDelimiterValue, char c2) {
        Intrinsics.m18599g(missingDelimiterValue, "<this>");
        Intrinsics.m18599g(missingDelimiterValue, "missingDelimiterValue");
        int iM20445u = m20445u(missingDelimiterValue, c2, 0, 6);
        if (iM20445u == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM20445u);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: U */
    public static String m20423U(String missingDelimiterValue, String str) {
        Intrinsics.m18599g(missingDelimiterValue, "<this>");
        Intrinsics.m18599g(missingDelimiterValue, "missingDelimiterValue");
        int iM20446v = m20446v(missingDelimiterValue, str, 0, false, 6);
        if (iM20446v == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM20446v);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: V */
    public static String m20424V(String missingDelimiterValue, char c2) {
        Intrinsics.m18599g(missingDelimiterValue, "<this>");
        Intrinsics.m18599g(missingDelimiterValue, "missingDelimiterValue");
        int iM20403A = m20403A(missingDelimiterValue, c2, 0, 6);
        if (iM20403A == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM20403A);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: W */
    public static String m20425W(int i, String str) {
        Intrinsics.m18599g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: X */
    public static String m20426X(int i, String str) {
        Intrinsics.m18599g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(length - i);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Y */
    public static Double m20427Y(String str) {
        Intrinsics.m18599g(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.f55208a.m20398d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static Integer m20428Z(String str) {
        boolean z2;
        int i;
        int i2;
        Intrinsics.m18599g(str, "<this>");
        CharsKt.m20380b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (Intrinsics.m18601i(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z2 ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* JADX INFO: renamed from: a0 */
    public static Long m20429a0(String str) {
        boolean z2;
        Intrinsics.m18599g(str, "<this>");
        CharsKt.m20380b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.m18601i(cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z2 = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) 10);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) 10);
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z2 ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    /* JADX INFO: renamed from: b0 */
    public static CharSequence m20430b0(CharSequence charSequence) {
        Intrinsics.m18599g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z2 = false;
        while (i <= length) {
            boolean zM20381c = CharsKt.m20381c(charSequence.charAt(!z2 ? i : length));
            if (z2) {
                if (!zM20381c) {
                    break;
                }
                length--;
            } else if (zM20381c) {
                i++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: c0 */
    public static String m20431c0(String str) {
        int length;
        Comparable comparable;
        Intrinsics.m18599g(str, "<this>");
        List listM20376r = SequencesKt.m20376r(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str));
        List list = listM20376r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!m20448x((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.m20381c(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM20376r.size();
        int iM18405F = CollectionsKt.m18405F(listM20376r);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i = length + 1;
            if (length < 0) {
                CollectionsKt.m18455s0();
                throw null;
            }
            String str3 = (String) obj2;
            String strM20438n = ((length == 0 || length == iM18405F) && m20448x(str3)) ? null : m20438n(iIntValue, str3);
            if (strM20438n != null) {
                arrayList3.add(strM20438n);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        CollectionsKt.m18408I(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d0 */
    public static String m20432d0(String str) {
        Intrinsics.m18599g(str, "<this>");
        if (m20448x("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listM20376r = SequencesKt.m20376r(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str));
        int length = str.length();
        listM20376r.size();
        int iM18405F = CollectionsKt.m18405F(listM20376r);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listM20376r) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                CollectionsKt.m18455s0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iM18405F) || !m20448x(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.m20381c(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && m20415M(i3, str2, "|", false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    Intrinsics.m18598f(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.m18408I(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m20433i(StringBuilder sb, Object obj, Function1 function1) {
        Intrinsics.m18599g(sb, "<this>");
        if (function1 != null) {
            sb.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m20434j(CharSequence charSequence, CharSequence other, boolean z2) {
        Intrinsics.m18599g(charSequence, "<this>");
        Intrinsics.m18599g(other, "other");
        if (other instanceof String) {
            if (m20446v(charSequence, (String) other, 0, z2, 2) >= 0) {
                return true;
            }
        } else if (StringsKt__StringsKt.m20453c(charSequence, other, 0, charSequence.length(), z2, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m20435k(CharSequence charSequence, char c2) {
        Intrinsics.m18599g(charSequence, "<this>");
        return m20445u(charSequence, c2, 0, 2) >= 0;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ boolean m20436l(CharSequence charSequence, String str) {
        return m20434j(charSequence, str, false);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m20437m(CharSequence charSequence, CharSequence charSequence2) {
        boolean z2 = charSequence instanceof String;
        if (z2 && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z2 && (charSequence2 instanceof String)) {
            return Intrinsics.m18594b(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == charSequence2.charAt(i)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static String m20438n(int i, String str) {
        Intrinsics.m18599g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m20439o(String str, String suffix, boolean z2) {
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : m20405C(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m20440p(CharSequence charSequence, char c2) {
        Intrinsics.m18599g(charSequence, "<this>");
        return charSequence.length() > 0 && CharsKt__CharKt.m20382a(charSequence.charAt(m20444t(charSequence)), c2, false);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m20441q(CharSequence charSequence, String str) {
        Intrinsics.m18599g(charSequence, "<this>");
        return charSequence instanceof String ? m20439o((String) charSequence, str, false) : StringsKt__StringsKt.m20455e(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m20442r(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: s */
    public static char m20443s(CharSequence charSequence) {
        Intrinsics.m18599g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: t */
    public static int m20444t(CharSequence charSequence) {
        Intrinsics.m18599g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: u */
    public static int m20445u(CharSequence charSequence, char c2, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        Intrinsics.m18599g(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.m20454d(charSequence, new char[]{c2}, i, false) : ((String) charSequence).indexOf(c2, i);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ int m20446v(CharSequence charSequence, String str, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return StringsKt__StringsKt.m20452b(charSequence, str, i, z2);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ int m20447w(String str, char[] cArr, int i) {
        return StringsKt__StringsKt.m20454d(str, cArr, i, false);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m20448x(CharSequence charSequence) {
        Intrinsics.m18599g(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharsKt.m20381c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static char m20449y(CharSequence charSequence) {
        Intrinsics.m18599g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m20444t(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: z */
    public static int m20450z(int i, int i2, String str, String string) {
        if ((i2 & 2) != 0) {
            i = m20444t(str);
        }
        Intrinsics.m18599g(str, "<this>");
        Intrinsics.m18599g(string, "string");
        return str.lastIndexOf(string, i);
    }
}
