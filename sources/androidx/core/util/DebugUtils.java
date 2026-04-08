package androidx.core.util;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DebugUtils {
    /* JADX INFO: renamed from: a */
    public static void m7691a(StringBuilder sb, Object obj) {
        int iLastIndexOf;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
