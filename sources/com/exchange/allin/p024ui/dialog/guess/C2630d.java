package com.exchange.allin.p024ui.dialog.guess;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.guess.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2630d implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f36300a;

    public /* synthetic */ C2630d(MutableState mutableState) {
        this.f36300a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope launchEx = (CoroutineScope) obj;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Intrinsics.m18599g(launchEx, "$this$launchEx");
        this.f36300a.setValue(bool);
        return Unit.f51459a;
    }
}
