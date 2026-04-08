package com.exchange.allin.p024ui.page.account.security.password;

import com.exchange.allin.p024ui.page.account.security.password.ModifyPasswordViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ModifyPasswordPageKt$LayoutContent$1$2$1$1 implements Function1<String, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ModifyPasswordViewModel f37851a;

    public ModifyPasswordPageKt$LayoutContent$1$2$1$1(ModifyPasswordViewModel modifyPasswordViewModel) {
        this.f37851a = modifyPasswordViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.m18599g(it, "it");
        this.f37851a.m13731f(new ModifyPasswordViewModel.UiAction.ChangeCurPassword(it));
        return Unit.f51459a;
    }
}
