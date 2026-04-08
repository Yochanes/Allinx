package androidx.navigation;

import androidx.navigation.NavOptions;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"navigation-common_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NavOptionsBuilderKt {
    /* JADX INFO: renamed from: a */
    public static final NavOptions m11244a(Function1 optionsBuilder) {
        Intrinsics.m18599g(optionsBuilder, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        optionsBuilder.invoke(navOptionsBuilder);
        boolean z2 = navOptionsBuilder.f30269b;
        NavOptions.Builder builder = navOptionsBuilder.f30268a;
        builder.f30260a = z2;
        builder.f30261b = navOptionsBuilder.f30270c;
        String str = navOptionsBuilder.f30272e;
        if (str != null) {
            boolean z3 = navOptionsBuilder.f30273f;
            boolean z4 = navOptionsBuilder.f30274g;
            builder.f30263d = str;
            builder.f30262c = -1;
            builder.f30264e = z3;
            builder.f30265f = z4;
        } else {
            int i = navOptionsBuilder.f30271d;
            boolean z5 = navOptionsBuilder.f30273f;
            boolean z6 = navOptionsBuilder.f30274g;
            builder.f30262c = i;
            builder.f30263d = null;
            builder.f30264e = z5;
            builder.f30265f = z6;
        }
        return builder.m11242a();
    }
}
