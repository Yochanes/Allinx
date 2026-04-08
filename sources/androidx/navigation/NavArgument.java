package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavArgument;", "", "Builder", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class NavArgument {

    /* JADX INFO: renamed from: a */
    public final NavType f30165a;

    /* JADX INFO: renamed from: b */
    public final boolean f30166b;

    /* JADX INFO: renamed from: c */
    public final boolean f30167c;

    /* JADX INFO: renamed from: d */
    public final Object f30168d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavArgument$Builder;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public NavType f30169a;

        /* JADX INFO: renamed from: b */
        public boolean f30170b;

        /* JADX INFO: renamed from: c */
        public Object f30171c;

        /* JADX INFO: renamed from: d */
        public boolean f30172d;
    }

    public NavArgument(NavType navType, boolean z2, Object obj, boolean z3) {
        if (!navType.getIsNullableAllowed() && z2) {
            throw new IllegalArgumentException((navType.getName() + " does not allow nullable values").toString());
        }
        if (!z2 && z3 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + navType.getName() + " has null value but is not nullable.").toString());
        }
        this.f30165a = navType;
        this.f30166b = z2;
        this.f30168d = obj;
        this.f30167c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NavArgument.class != obj.getClass()) {
            return false;
        }
        NavArgument navArgument = (NavArgument) obj;
        if (this.f30166b != navArgument.f30166b || this.f30167c != navArgument.f30167c || !Intrinsics.m18594b(this.f30165a, navArgument.f30165a)) {
            return false;
        }
        Object obj2 = navArgument.f30168d;
        Object obj3 = this.f30168d;
        return obj3 != null ? obj3.equals(obj2) : obj2 == null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f30165a.hashCode() * 31) + (this.f30166b ? 1 : 0)) * 31) + (this.f30167c ? 1 : 0)) * 31;
        Object obj = this.f30168d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.f51660a.mo18612b(NavArgument.class).mo18588i());
        sb.append(" Type: " + this.f30165a);
        sb.append(" Nullable: " + this.f30166b);
        if (this.f30167c) {
            sb.append(" DefaultValue: " + this.f30168d);
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
