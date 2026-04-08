package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.w */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3553w implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f41581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f41582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f41583c;

    public /* synthetic */ C3553w(int i, long j, boolean z2) {
        this.f41581a = z2;
        this.f41582b = j;
        this.f41583c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iM4417a = RecomposeScopeImplKt.m4417a(this.f41583c | 1);
        SystemBarKt.m14151a(this.f41581a, this.f41582b, (Composer) obj, iM4417a);
        return Unit.f51459a;
    }
}
