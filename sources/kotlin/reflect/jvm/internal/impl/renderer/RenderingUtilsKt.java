package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class RenderingUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final String m19806a(Name name) {
        Intrinsics.m18599g(name, "<this>");
        String strM19608b = name.m19608b();
        Intrinsics.m18598f(strM19608b, "asString()");
        if (!KeywordStringsGenerated.f54306a.contains(strM19608b)) {
            for (int i = 0; i < strM19608b.length(); i++) {
                char cCharAt = strM19608b.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strM19608b2 = name.m19608b();
            Intrinsics.m18598f(strM19608b2, "asString()");
            return strM19608b2;
        }
        StringBuilder sb = new StringBuilder();
        String strM19608b3 = name.m19608b();
        Intrinsics.m18598f(strM19608b3, "asString()");
        sb.append("`".concat(strM19608b3));
        sb.append('`');
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final String m19807b(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Name name = (Name) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m19806a(name));
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static final String m19808c(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        Intrinsics.m18599g(lowerRendered, "lowerRendered");
        Intrinsics.m18599g(lowerPrefix, "lowerPrefix");
        Intrinsics.m18599g(upperRendered, "upperRendered");
        Intrinsics.m18599g(upperPrefix, "upperPrefix");
        Intrinsics.m18599g(foldedPrefix, "foldedPrefix");
        if (!StringsKt.m20416N(lowerRendered, lowerPrefix, false) || !StringsKt.m20416N(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        Intrinsics.m18598f(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!m19809d(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m19809d(String lower, String upper) {
        Intrinsics.m18599g(lower, "lower");
        Intrinsics.m18599g(upper, "upper");
        if (lower.equals(StringsKt.m20411I(upper, "?", ""))) {
            return true;
        }
        if (StringsKt.m20439o(upper, "?", false) && Intrinsics.m18594b(lower.concat("?"), upper)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(lower);
        sb.append(")?");
        return Intrinsics.m18594b(sb.toString(), upper);
    }
}
