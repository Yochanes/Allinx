package io.ktor.http;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class HttpHeaderValueParserKt {
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        r17 = r1;
        r7.m16970a(r6, r10, r18, "");
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m16968a(String str) {
        EmptyList emptyList;
        EmptyList emptyList2;
        Pair pair;
        char c2;
        EmptyList emptyList3 = EmptyList.f51496a;
        if (str == null) {
            return emptyList3;
        }
        Lazy lazyM18298a = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, HttpHeaderValueParserKt$parseHeaderValue$items$1.f45658a);
        int i = 0;
        while (i <= StringsKt.m20444t(str)) {
            Lazy lazyM18298a2 = LazyKt.m18298a(LazyThreadSafetyMode.f51423c, HttpHeaderValueParserKt$parseHeaderValueItem$parameters$1.f45659a);
            Integer numValueOf = null;
            int i2 = i;
            while (true) {
                if (i2 <= StringsKt.m20444t(str)) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ',') {
                        if (cCharAt != ';') {
                            i2++;
                            emptyList2 = emptyList3;
                        } else {
                            if (numValueOf == null) {
                                numValueOf = Integer.valueOf(i2);
                            }
                            int i3 = i2 + 1;
                            HttpHeaderValueParserKt$parseHeaderValueParameter$1 httpHeaderValueParserKt$parseHeaderValueParameter$1 = new HttpHeaderValueParserKt$parseHeaderValueParameter$1(lazyM18298a2);
                            int i4 = i3;
                            while (true) {
                                if (i4 > StringsKt.m20444t(str)) {
                                    emptyList2 = emptyList3;
                                    httpHeaderValueParserKt$parseHeaderValueParameter$1.m16970a(i3, i4, str, "");
                                    break;
                                }
                                char cCharAt2 = str.charAt(i4);
                                if (cCharAt2 == ',' || cCharAt2 == ';') {
                                    break;
                                }
                                if (cCharAt2 != '=') {
                                    i4++;
                                } else {
                                    int i5 = i4 + 1;
                                    if (str.length() == i5) {
                                        pair = new Pair(Integer.valueOf(i5), "");
                                        emptyList2 = emptyList3;
                                    } else {
                                        char c3 = '\"';
                                        if (str.charAt(i5) == '\"') {
                                            int i6 = i4 + 2;
                                            StringBuilder sb = new StringBuilder();
                                            while (i6 <= StringsKt.m20444t(str)) {
                                                char cCharAt3 = str.charAt(i6);
                                                if (cCharAt3 == c3) {
                                                    int i7 = i6 + 1;
                                                    c2 = c3;
                                                    int i8 = i7;
                                                    while (true) {
                                                        if (i8 >= str.length()) {
                                                            emptyList2 = emptyList3;
                                                            break;
                                                        }
                                                        emptyList2 = emptyList3;
                                                        if (str.charAt(i8) != ' ') {
                                                            break;
                                                        }
                                                        i8++;
                                                        emptyList3 = emptyList2;
                                                    }
                                                    if (i8 == str.length() || str.charAt(i8) == ';') {
                                                        Integer numValueOf2 = Integer.valueOf(i7);
                                                        String string = sb.toString();
                                                        Intrinsics.m18598f(string, "builder.toString()");
                                                        pair = new Pair(numValueOf2, string);
                                                        break;
                                                    }
                                                } else {
                                                    emptyList2 = emptyList3;
                                                    c2 = c3;
                                                }
                                                if (cCharAt3 != '\\' || i6 >= StringsKt.m20444t(str) - 2) {
                                                    sb.append(cCharAt3);
                                                    i6++;
                                                } else {
                                                    sb.append(str.charAt(i6 + 1));
                                                    i6 += 2;
                                                }
                                                c3 = c2;
                                                emptyList3 = emptyList2;
                                            }
                                            emptyList2 = emptyList3;
                                            Integer numValueOf3 = Integer.valueOf(i6);
                                            String string2 = sb.toString();
                                            Intrinsics.m18598f(string2, "builder.toString()");
                                            pair = new Pair(numValueOf3, String.valueOf(c3) + string2);
                                        } else {
                                            emptyList2 = emptyList3;
                                            int i9 = i5;
                                            while (i9 <= StringsKt.m20444t(str)) {
                                                char cCharAt4 = str.charAt(i9);
                                                if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                    pair = new Pair(Integer.valueOf(i9), m16969b(i5, i9, str));
                                                    break;
                                                }
                                                i9++;
                                            }
                                            pair = new Pair(Integer.valueOf(i9), m16969b(i5, i9, str));
                                        }
                                    }
                                    int iIntValue = ((Number) pair.f51426a).intValue();
                                    httpHeaderValueParserKt$parseHeaderValueParameter$1.m16970a(i3, i4, str, (String) pair.f51427b);
                                    i4 = iIntValue;
                                }
                            }
                            i2 = i4;
                        }
                        emptyList3 = emptyList2;
                    } else {
                        emptyList = emptyList3;
                        ((ArrayList) lazyM18298a.getValue()).add(new HeaderValue(m16969b(i, numValueOf != null ? numValueOf.intValue() : i2, str), lazyM18298a2.isInitialized() ? (List) lazyM18298a2.getValue() : emptyList));
                        i2++;
                    }
                } else {
                    emptyList = emptyList3;
                    ((ArrayList) lazyM18298a.getValue()).add(new HeaderValue(m16969b(i, numValueOf != null ? numValueOf.intValue() : i2, str), lazyM18298a2.isInitialized() ? (List) lazyM18298a2.getValue() : emptyList));
                }
            }
            i = i2;
            emptyList3 = emptyList;
        }
        return lazyM18298a.isInitialized() ? (List) lazyM18298a.getValue() : emptyList3;
    }

    /* JADX INFO: renamed from: b */
    public static final String m16969b(int i, int i2, String str) {
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.m18598f(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return StringsKt.m20430b0(strSubstring).toString();
    }
}
