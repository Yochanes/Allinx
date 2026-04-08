package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavOptions;", "", "Builder", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NavOptions {

    /* JADX INFO: renamed from: a */
    public final boolean f30252a;

    /* JADX INFO: renamed from: b */
    public final boolean f30253b;

    /* JADX INFO: renamed from: c */
    public final int f30254c;

    /* JADX INFO: renamed from: d */
    public final boolean f30255d;

    /* JADX INFO: renamed from: e */
    public final boolean f30256e;

    /* JADX INFO: renamed from: f */
    public final int f30257f;

    /* JADX INFO: renamed from: g */
    public final int f30258g;

    /* JADX INFO: renamed from: h */
    public String f30259h;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavOptions$Builder;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public boolean f30260a;

        /* JADX INFO: renamed from: b */
        public boolean f30261b;

        /* JADX INFO: renamed from: d */
        public String f30263d;

        /* JADX INFO: renamed from: e */
        public boolean f30264e;

        /* JADX INFO: renamed from: f */
        public boolean f30265f;

        /* JADX INFO: renamed from: c */
        public int f30262c = -1;

        /* JADX INFO: renamed from: g */
        public int f30266g = -1;

        /* JADX INFO: renamed from: h */
        public int f30267h = -1;

        /* JADX INFO: renamed from: a */
        public final NavOptions m11242a() {
            String str = this.f30263d;
            if (str == null) {
                return new NavOptions(this.f30260a, this.f30261b, this.f30262c, this.f30264e, this.f30265f, this.f30266g, this.f30267h);
            }
            boolean z2 = this.f30260a;
            boolean z3 = this.f30261b;
            boolean z4 = this.f30264e;
            boolean z5 = this.f30265f;
            int i = this.f30266g;
            int i2 = this.f30267h;
            int i3 = NavDestination.f30230f;
            NavOptions navOptions = new NavOptions(z2, z3, "android-app://androidx.navigation/".concat(str).hashCode(), z4, z5, i, i2);
            navOptions.f30259h = str;
            return navOptions;
        }
    }

    public NavOptions(boolean z2, boolean z3, int i, boolean z4, boolean z5, int i2, int i3) {
        this.f30252a = z2;
        this.f30253b = z3;
        this.f30254c = i;
        this.f30255d = z4;
        this.f30256e = z5;
        this.f30257f = i2;
        this.f30258g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavOptions)) {
            return false;
        }
        NavOptions navOptions = (NavOptions) obj;
        return this.f30252a == navOptions.f30252a && this.f30253b == navOptions.f30253b && this.f30254c == navOptions.f30254c && Intrinsics.m18594b(this.f30259h, navOptions.f30259h) && this.f30255d == navOptions.f30255d && this.f30256e == navOptions.f30256e && this.f30257f == navOptions.f30257f && this.f30258g == navOptions.f30258g;
    }

    public final int hashCode() {
        int i = (((((this.f30252a ? 1 : 0) * 31) + (this.f30253b ? 1 : 0)) * 31) + this.f30254c) * 31;
        return ((((((((((((i + (this.f30259h != null ? r1.hashCode() : 0)) * 29791) + (this.f30255d ? 1 : 0)) * 31) + (this.f30256e ? 1 : 0)) * 31) + this.f30257f) * 31) + this.f30258g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavOptions(");
        if (this.f30252a) {
            sb.append("launchSingleTop ");
        }
        if (this.f30253b) {
            sb.append("restoreState ");
        }
        String str = this.f30259h;
        if ((str != null || this.f30254c != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.f30255d) {
                sb.append(" inclusive");
            }
            if (this.f30256e) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.f30258g;
        int i2 = this.f30257f;
        if (i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(-1));
            sb.append(")");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
