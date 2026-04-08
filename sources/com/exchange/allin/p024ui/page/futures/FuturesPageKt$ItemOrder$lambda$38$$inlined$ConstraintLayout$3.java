package com.exchange.allin.p024ui.page.futures;

import androidx.compose.runtime.MutableState;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "androidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1"}, m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FuturesPageKt$ItemOrder$lambda$38$$inlined$ConstraintLayout$3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f38875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ConstraintSetForInlineDsl f38876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesPageKt$ItemOrder$lambda$38$$inlined$ConstraintLayout$3(MutableState mutableState, ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(0);
        this.f38875a = mutableState;
        this.f38876b = constraintSetForInlineDsl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f38875a.setValue(Boolean.valueOf(!((Boolean) r0.getF20325a()).booleanValue()));
        this.f38876b.f20892d = true;
        return Unit.f51459a;
    }
}
