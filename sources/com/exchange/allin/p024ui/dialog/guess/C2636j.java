package com.exchange.allin.p024ui.dialog.guess;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.guess.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2636j implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f36316b;

    public /* synthetic */ C2636j(MutableState mutableState, int i) {
        this.f36315a = i;
        this.f36316b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36315a) {
            case 0:
                this.f36316b.setValue(Boolean.TRUE);
                break;
            default:
                this.f36316b.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f51459a;
    }
}
