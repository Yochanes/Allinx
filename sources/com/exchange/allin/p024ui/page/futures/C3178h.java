package com.exchange.allin.p024ui.page.futures;

import androidx.compose.p013ui.focus.FocusState;
import com.exchange.allin.p024ui.page.futures.FuturesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.futures.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3178h implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FuturesViewModel f39291b;

    public /* synthetic */ C3178h(FuturesViewModel futuresViewModel, int i) {
        this.f39290a = i;
        this.f39291b = futuresViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39290a) {
            case 0:
                FocusState it = (FocusState) obj;
                Intrinsics.m18599g(it, "it");
                if (it.mo5010b()) {
                    this.f39291b.m13858l(new FuturesViewModel.UiAction.ChangeSize(""));
                }
                break;
            case 1:
                this.f39291b.m13858l(new FuturesViewModel.UiAction.ChangeLeverage(((Integer) obj).intValue()));
                break;
            default:
                this.f39291b.m13858l(new FuturesViewModel.UiAction.ChangeEntrust(((Integer) obj).intValue()));
                break;
        }
        return Unit.f51459a;
    }
}
