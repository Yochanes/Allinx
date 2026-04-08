package com.exchange.allin.p024ui.dialog.trades.futures;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.futures.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2719a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36520b;

    public /* synthetic */ C2719a(Object obj, int i) {
        this.f36519a = i;
        this.f36520b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f36519a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                ((MutableState) this.f36520b).setValue(it);
                break;
            default:
                Intrinsics.m18599g(it, "it");
                ((MutableState) ((Ref.ObjectRef) this.f36520b).f51659a).setValue(it);
                break;
        }
        return Unit.f51459a;
    }
}
