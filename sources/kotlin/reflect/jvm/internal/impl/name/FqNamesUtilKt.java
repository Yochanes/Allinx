package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class FqNamesUtilKt {

    /* JADX INFO: compiled from: Proguard */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m19601a(String str) {
        if (str == null) {
            return false;
        }
        State state = State.f54068a;
        int i = 0;
        while (true) {
            int length = str.length();
            State state2 = State.f54070c;
            if (i >= length) {
                return state != state2;
            }
            char cCharAt = str.charAt(i);
            int iOrdinal = state.ordinal();
            if (iOrdinal == 0) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                state = State.f54069b;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    continue;
                }
            } else if (cCharAt == '.') {
                state = state2;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final FqName m19602b(FqName fqName, FqName prefix) {
        Intrinsics.m18599g(fqName, "<this>");
        Intrinsics.m18599g(prefix, "prefix");
        if (!fqName.equals(prefix) && !prefix.m19588d()) {
            String strM19586b = fqName.m19586b();
            String strM19586b2 = prefix.m19586b();
            if (StringsKt.m20416N(strM19586b, strM19586b2, false) && strM19586b.charAt(strM19586b2.length()) == '.') {
                if (!prefix.m19588d()) {
                    if (fqName.equals(prefix)) {
                        FqName ROOT = FqName.f54027c;
                        Intrinsics.m18598f(ROOT, "ROOT");
                        return ROOT;
                    }
                    String strSubstring = fqName.m19586b().substring(prefix.m19586b().length() + 1);
                    Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
                    return new FqName(strSubstring);
                }
            }
        }
        return fqName;
    }
}
