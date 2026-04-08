package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-utils"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class TextKt {
    /* JADX INFO: renamed from: a */
    public static final CaseInsensitiveString m17181a(String caseInsensitive) {
        Intrinsics.m18599g(caseInsensitive, "$this$caseInsensitive");
        return new CaseInsensitiveString(caseInsensitive);
    }

    /* JADX INFO: renamed from: b */
    public static final String m17182b(String toLowerCasePreservingASCIIRules) {
        Intrinsics.m18599g(toLowerCasePreservingASCIIRules, "$this$toLowerCasePreservingASCIIRules");
        int length = toLowerCasePreservingASCIIRules.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char cCharAt = toLowerCasePreservingASCIIRules.charAt(i);
            if ((('A' <= cCharAt && 'Z' >= cCharAt) ? (char) (cCharAt + ' ') : (cCharAt >= 0 && 127 >= cCharAt) ? cCharAt : Character.toLowerCase(cCharAt)) != cCharAt) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return toLowerCasePreservingASCIIRules;
        }
        StringBuilder sb = new StringBuilder(toLowerCasePreservingASCIIRules.length());
        sb.append((CharSequence) toLowerCasePreservingASCIIRules, 0, i);
        int iM20444t = StringsKt.m20444t(toLowerCasePreservingASCIIRules);
        if (i <= iM20444t) {
            while (true) {
                char cCharAt2 = toLowerCasePreservingASCIIRules.charAt(i);
                if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                } else if (cCharAt2 < 0 || 127 < cCharAt2) {
                    cCharAt2 = Character.toLowerCase(cCharAt2);
                }
                sb.append(cCharAt2);
                if (i == iM20444t) {
                    break;
                }
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
