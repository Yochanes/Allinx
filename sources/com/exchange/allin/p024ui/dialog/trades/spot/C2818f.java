package com.exchange.allin.p024ui.dialog.trades.spot;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.trades.spot.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2818f implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f36789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutableState f36790c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MutableState f36791d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MutableState f36792f;

    public /* synthetic */ C2818f(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.f36788a = i;
        this.f36789b = mutableState;
        this.f36790c = mutableState2;
        this.f36791d = mutableState3;
        this.f36792f = mutableState4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36788a) {
            case 0:
                this.f36789b.setValue(0);
                this.f36790c.setValue(0);
                MutableState mutableState = this.f36791d;
                int iIntValue = ((Number) mutableState.getValue()).intValue();
                mutableState.setValue(Integer.valueOf(iIntValue != 0 ? iIntValue != 1 ? 0 : -1 : 1));
                this.f36792f.setValue(0);
                break;
            default:
                int i = 0;
                this.f36789b.setValue(0);
                this.f36790c.setValue(0);
                this.f36791d.setValue(0);
                MutableState mutableState2 = this.f36792f;
                int iIntValue2 = ((Number) mutableState2.getValue()).intValue();
                if (iIntValue2 == 0) {
                    i = 1;
                } else if (iIntValue2 == 1) {
                    i = -1;
                }
                mutableState2.setValue(Integer.valueOf(i));
                break;
        }
        return Unit.f51459a;
    }
}
