package androidx.navigation;

import androidx.navigation.NavArgument;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@NavDestinationDsl
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavArgumentBuilder;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NavArgumentBuilder {

    /* JADX INFO: renamed from: a */
    public final NavArgument.Builder f30173a = new NavArgument.Builder();

    /* JADX INFO: renamed from: b */
    public Object f30174b;

    /* JADX INFO: renamed from: a */
    public final void m11194a(Object obj) {
        this.f30174b = obj;
        NavArgument.Builder builder = this.f30173a;
        builder.f30171c = obj;
        builder.f30172d = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m11195b(NavType value) {
        Intrinsics.m18599g(value, "value");
        NavArgument.Builder builder = this.f30173a;
        builder.getClass();
        builder.f30169a = value;
    }
}
