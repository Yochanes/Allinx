package com.exchange.allin.p024ui.widgets;

import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.H */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3508H implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f41151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutableState f41152c;

    public /* synthetic */ C3508H(int i, MutableState mutableState, MutableState mutableState2) {
        this.f41150a = i;
        this.f41151b = mutableState;
        this.f41152c = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusState focusState = (FocusState) obj;
        switch (this.f41150a) {
            case 0:
                Intrinsics.m18599g(focusState, "focusState");
                if (focusState.mo5010b()) {
                    this.f41151b.setValue(Boolean.TRUE);
                }
                this.f41152c.setValue(Boolean.valueOf(focusState.mo5010b()));
                break;
            default:
                Intrinsics.m18599g(focusState, "focusState");
                if (focusState.mo5010b()) {
                    this.f41151b.setValue(Boolean.TRUE);
                }
                this.f41152c.setValue(Boolean.valueOf(focusState.mo5010b()));
                break;
        }
        return Unit.f51459a;
    }
}
