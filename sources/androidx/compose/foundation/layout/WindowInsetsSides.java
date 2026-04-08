package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "Companion", "value", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class WindowInsetsSides {

    /* JADX INFO: renamed from: a */
    public static final int f6697a = 9;

    /* JADX INFO: renamed from: b */
    public static final int f6698b = 6;

    /* JADX INFO: renamed from: c */
    public static final int f6699c = 10;

    /* JADX INFO: renamed from: d */
    public static final int f6700d = 5;

    /* JADX INFO: renamed from: e */
    public static final int f6701e = 15;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "foundation-layout_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public static String m2862a(int i) {
        StringBuilder sb = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb2 = new StringBuilder();
        int i2 = f6697a;
        if ((i & i2) == i2) {
            m2863b("Start", sb2);
        }
        int i3 = f6699c;
        if ((i & i3) == i3) {
            m2863b("Left", sb2);
        }
        if ((i & 16) == 16) {
            m2863b("Top", sb2);
        }
        int i4 = f6698b;
        if ((i & i4) == i4) {
            m2863b("End", sb2);
        }
        int i5 = f6700d;
        if ((i & i5) == i5) {
            m2863b("Right", sb2);
        }
        if ((i & 32) == 32) {
            m2863b("Bottom", sb2);
        }
        String string = sb2.toString();
        Intrinsics.m18598f(string, "toString(...)");
        sb.append(string);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final void m2863b(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WindowInsetsSides)) {
            return false;
        }
        ((WindowInsetsSides) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return m2862a(0);
    }
}
