package com.exchange.allin.utils.ext;

import android.net.Uri;
import com.exchange.allin.p024ui.helper.ConfigHelper;
import com.exchange.allin.utils.NumberFormaterKt;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class StringExtKt {
    /* JADX INFO: renamed from: a */
    public static final String m14212a(int i, int i2, double d) {
        return d > 0.0d ? Marker.ANY_NON_NULL_MARKER.concat(NumberFormaterKt.m14182a(d, i, i2, false, 0.0d, 60)) : NumberFormaterKt.m14182a(d, i, i2, false, 0.0d, 60);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m14213b(int i, int i2, double d) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return m14212a(0, i, d);
    }

    /* JADX INFO: renamed from: c */
    public static final String m14214c(String str, boolean z2) {
        int i;
        IntRange intRangeM18664k;
        Intrinsics.m18599g(str, "<this>");
        if (str.length() == 0) {
            return "";
        }
        int i2 = 3;
        if (z2) {
            int length = str.length();
            int i3 = 0;
            while (true) {
                i = -1;
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (str.charAt(i3) == '@') {
                    break;
                }
                i3++;
            }
            if (i3 < 3) {
                int length2 = str.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (str.charAt(i4) == '@') {
                        break;
                    }
                    i4++;
                }
                i2 = i4 - 1;
            }
            int length3 = str.length();
            int i5 = 0;
            while (true) {
                if (i5 >= length3) {
                    break;
                }
                if (str.charAt(i5) == '@') {
                    i = i5;
                    break;
                }
                i5++;
            }
            intRangeM18664k = RangesKt.m18664k(i2, i);
        } else {
            intRangeM18664k = str.length() > 7 ? RangesKt.m18664k(3, 7) : RangesKt.m18664k(3, str.length() - 1);
        }
        String replacement = StringsKt.m20409G(Marker.ANY_MARKER, CollectionsKt.m18458u(intRangeM18664k));
        Intrinsics.m18599g(replacement, "replacement");
        return StringsKt.m20412J(str, intRangeM18664k.f51685a, intRangeM18664k.f51686b + 1, replacement).toString();
    }

    /* JADX INFO: renamed from: d */
    public static final int m14215d(String str) {
        Intrinsics.m18599g(str, "<this>");
        if (StringsKt.m20434j(str, ".", false)) {
            return (str.length() - StringsKt.m20446v(str, ".", 0, false, 6)) - 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static final String m14216e(String str) {
        Intrinsics.m18599g(str, "<this>");
        int identifier = ConfigExtKt.m14195d().getResources().getIdentifier(str, "string", ConfigExtKt.m14195d().getPackageName());
        if (identifier == 0) {
            return "--";
        }
        String string = ConfigExtKt.m14195d().getString(identifier);
        Intrinsics.m18598f(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static final String m14217f(String str) {
        Intrinsics.m18599g(str, "<this>");
        CharSequence charSequenceM14216e = (CharSequence) ((ConfigHelper.ViewState) ConfigHelper.f36904c.getValue()).f36919e.getOrDefault(str, "");
        if (charSequenceM14216e.length() == 0) {
            charSequenceM14216e = m14216e(str);
        }
        return StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I((String) charSequenceM14216e, "\\n", "\n"), "\\t", "\t"), "\\r", "\r"), "\\\"", "\""), "\\'", "'"), "\\\\", "\\");
    }

    /* JADX INFO: renamed from: g */
    public static final String m14218g(String str, Object... objArr) {
        CharSequence charSequenceM14216e = (CharSequence) ((ConfigHelper.ViewState) ConfigHelper.f36904c.getValue()).f36919e.getOrDefault(str, "");
        if (charSequenceM14216e.length() == 0) {
            charSequenceM14216e = m14216e(str);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(StringsKt.m20411I(String.format((String) charSequenceM14216e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "\\n", "\n"), "\\t", "\t"), "\\r", "\r"), "\\\"", "\""), "\\'", "'"), "\\\\", "\\");
    }

    /* JADX INFO: renamed from: h */
    public static String m14219h(String str, boolean z2) {
        return z2 ? StringsKt.m20409G(Marker.ANY_MARKER, 5) : str;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m14220i(String str) {
        Intrinsics.m18599g(str, "<this>");
        return Pattern.compile("^([a-zA-Z0-9_\\-\\.\\+]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m14221j(String str, boolean z2) {
        Intrinsics.m18599g(str, "<this>");
        if (z2) {
            str = StringsKt.m20411I(str, ",", "");
        }
        return (StringsKt.m20427Y(str) == null || StringsKt.m20416N(str, "00", false)) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m14222k(String str) {
        return m14221j(str, false);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m14223l(String str) {
        int length = str.length();
        return 8 <= length && length < 21 && new Regex(".*[a-z]+.*").m20398d(str) && new Regex(".*[A-Z]+.*").m20398d(str);
    }

    /* JADX INFO: renamed from: m */
    public static final double m14224m(String str) {
        Intrinsics.m18599g(str, "<this>");
        if (str.length() != 0 && m14221j(str, true)) {
            return Double.parseDouble(StringsKt.m20411I(str, ",", ""));
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: n */
    public static final String m14225n(Object obj) {
        Intrinsics.m18599g(obj, "<this>");
        String json = new Gson().toJson(obj);
        Intrinsics.m18598f(json, "toJson(...)");
        return json;
    }

    /* JADX INFO: renamed from: o */
    public static final String m14226o(String str) {
        Intrinsics.m18599g(str, "<this>");
        String strEncode = Uri.encode(str);
        Intrinsics.m18598f(strEncode, "encode(...)");
        return strEncode;
    }
}
