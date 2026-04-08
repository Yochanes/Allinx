package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.s */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3549s implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f41563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f41564b;

    public /* synthetic */ C3549s(float f, int i) {
        this.f41563a = f;
        this.f41564b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iM4417a = RecomposeScopeImplKt.m4417a(this.f41564b | 1);
        SpacerKt.m14149d(this.f41563a, (Composer) obj, iM4417a);
        return Unit.f51459a;
    }
}
