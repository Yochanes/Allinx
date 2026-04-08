package com.exchange.allin.p024ui.page.account.security.password;

import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ModifyPasswordPageKt$LayoutContent$1$10$1 implements Function1<FocusState, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f37841a;

    public ModifyPasswordPageKt$LayoutContent$1$10$1(MutableState mutableState) {
        this.f37841a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FocusState it = (FocusState) obj;
        Intrinsics.m18599g(it, "it");
        this.f37841a.setValue(Boolean.valueOf(it.mo5010b()));
        return Unit.f51459a;
    }
}
