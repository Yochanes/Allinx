package com.exchange.allin.p024ui.page.futures;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.futures.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3159b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f39185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ double f39186c;

    public /* synthetic */ C3159b(Function1 function1, double d, int i) {
        this.f39184a = i;
        this.f39185b = function1;
        this.f39186c = d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f39184a) {
            case 0:
                this.f39185b.invoke(Double.valueOf(this.f39186c));
                break;
            default:
                this.f39185b.invoke(Double.valueOf(this.f39186c));
                break;
        }
        return Unit.f51459a;
    }
}
