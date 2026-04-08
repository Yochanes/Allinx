package androidx.navigation;

import androidx.navigation.NavOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@NavOptionsDsl
@SourceDebugExtension
public final class NavOptionsBuilder {

    /* JADX INFO: renamed from: b */
    public boolean f30269b;

    /* JADX INFO: renamed from: c */
    public boolean f30270c;

    /* JADX INFO: renamed from: e */
    public String f30272e;

    /* JADX INFO: renamed from: f */
    public boolean f30273f;

    /* JADX INFO: renamed from: g */
    public boolean f30274g;

    /* JADX INFO: renamed from: a */
    public final NavOptions.Builder f30268a = new NavOptions.Builder();

    /* JADX INFO: renamed from: d */
    public int f30271d = -1;

    /* JADX INFO: renamed from: a */
    public final void m11243a(String route, Function1 function1) {
        Intrinsics.m18599g(route, "route");
        if (StringsKt.m20448x(route)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f30272e = route;
        this.f30271d = -1;
        this.f30273f = false;
        PopUpToBuilder popUpToBuilder = new PopUpToBuilder();
        function1.invoke(popUpToBuilder);
        this.f30273f = popUpToBuilder.f30290a;
        this.f30274g = popUpToBuilder.f30291b;
    }
}
