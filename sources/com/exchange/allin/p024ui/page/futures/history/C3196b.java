package com.exchange.allin.p024ui.page.futures.history;

import com.exchange.allin.p024ui.page.futures.history.FuturesHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.futures.history.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3196b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FuturesHistoryViewModel f39450b;

    public /* synthetic */ C3196b(FuturesHistoryViewModel futuresHistoryViewModel, int i) {
        this.f39449a = i;
        this.f39450b = futuresHistoryViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f39449a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                this.f39450b.m13896f(new FuturesHistoryViewModel.UiAction.ChangeType(1, it));
                break;
            case 1:
                Intrinsics.m18599g(it, "it");
                this.f39450b.m13896f(new FuturesHistoryViewModel.UiAction.ChangeType(2, it));
                break;
            case 2:
                Intrinsics.m18599g(it, "it");
                this.f39450b.m13896f(new FuturesHistoryViewModel.UiAction.ChangeContract(it));
                break;
            case 3:
                Intrinsics.m18599g(it, "it");
                this.f39450b.m13896f(new FuturesHistoryViewModel.UiAction.ChangeContract(it));
                break;
            case 4:
                Intrinsics.m18599g(it, "it");
                this.f39450b.m13896f(new FuturesHistoryViewModel.UiAction.ChangeContract(it));
                break;
            default:
                Intrinsics.m18599g(it, "it");
                this.f39450b.m13896f(new FuturesHistoryViewModel.UiAction.ChangeType(0, it));
                break;
        }
        return Unit.f51459a;
    }
}
