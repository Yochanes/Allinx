package com.exchange.allin.p024ui.dialog.trades.futures;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.futures.r */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2736r implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36611a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref.ObjectRef f36612b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f36613c;

    public /* synthetic */ C2736r(Ref.ObjectRef objectRef, List list, int i) {
        this.f36611a = i;
        this.f36612b = objectRef;
        this.f36613c = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36611a) {
            case 0:
                Ref.ObjectRef objectRef = this.f36612b;
                Object f20325a = ((MutableState) objectRef.f51659a).getF20325a();
                List list = this.f36613c;
                if (!Intrinsics.m18594b(f20325a, CollectionsKt.m18398B(list))) {
                    ((MutableState) objectRef.f51659a).setValue(list.get(list.indexOf(r0.getF20325a()) - 1));
                }
                break;
            default:
                Ref.ObjectRef objectRef2 = this.f36612b;
                Object f20325a2 = ((MutableState) objectRef2.f51659a).getF20325a();
                List list2 = this.f36613c;
                if (!Intrinsics.m18594b(f20325a2, CollectionsKt.m18411L(list2))) {
                    MutableState mutableState = (MutableState) objectRef2.f51659a;
                    mutableState.setValue(list2.get(list2.indexOf(mutableState.getF20325a()) + 1));
                }
                break;
        }
        return Unit.f51459a;
    }
}
