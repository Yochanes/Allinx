package com.exchange.allin.p024ui.page.market.edit;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.edit.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3365e implements Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f40069b;

    public /* synthetic */ C3365e(Function1 function1, int i) {
        this.f40068a = i;
        this.f40069b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f40068a) {
        }
        return ((Boolean) ((C3364d) this.f40069b).invoke(obj)).booleanValue();
    }
}
