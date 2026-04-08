package io.ktor.client.features.cookies;

import com.google.firebase.sessions.settings.RemoteSettings;
import io.ktor.http.Cookie;
import io.ktor.http.IpParserKt;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.Url;
import io.ktor.http.parsing.regex.RegexParser;
import io.ktor.util.TextKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-client-core"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class CookiesStorageKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m16913a(Cookie matches, Url requestUrl) {
        CharSequence charSequenceSubSequence;
        Intrinsics.m18599g(matches, "$this$matches");
        Intrinsics.m18599g(requestUrl, "requestUrl");
        String str = matches.f45595f;
        if (str != null) {
            String strM17182b = TextKt.m17182b(str);
            char[] cArr = {'.'};
            int length = strM17182b.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                if (!ArraysKt.m18371h(cArr, strM17182b.charAt(i))) {
                    charSequenceSubSequence = strM17182b.subSequence(i, strM17182b.length());
                    break;
                }
                i++;
            }
            String string = charSequenceSubSequence.toString();
            if (string != null) {
                String strConcat = matches.f45596g;
                if (strConcat == null) {
                    throw new IllegalStateException("Path field should have the default value");
                }
                if (!StringsKt.m20440p(strConcat, '/')) {
                    strConcat = strConcat.concat(RemoteSettings.FORWARD_SLASH_STRING);
                }
                String strM17182b2 = TextKt.m17182b(requestUrl.f45710b);
                String strConcat2 = requestUrl.f45712d;
                if (!StringsKt.m20440p(strConcat2, '/')) {
                    strConcat2 = strConcat2.concat(RemoteSettings.FORWARD_SLASH_STRING);
                }
                if (!strM17182b2.equals(string)) {
                    RegexParser regexParser = IpParserKt.f45684a;
                    regexParser.getClass();
                    if (!regexParser.f45950a.m20398d(strM17182b2) && StringsKt.m20439o(strM17182b2, ".".concat(string), false)) {
                        if ((Intrinsics.m18594b(strConcat, RemoteSettings.FORWARD_SLASH_STRING) || Intrinsics.m18594b(strConcat2, strConcat) || StringsKt.m20416N(strConcat2, strConcat, false)) && (!matches.f45597h || URLProtocolKt.m16991a(requestUrl.f45709a))) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        throw new IllegalStateException("Domain field should have the default value");
    }
}
