package com.exchange.allin.p024ui.page.account.security.password;

import com.exchange.allin.p024ui.page.account.security.password.ModifyPasswordViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ModifyPasswordPageKt$LayoutContent$1$2$2$1$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ModifyPasswordViewModel f37854a;

    public ModifyPasswordPageKt$LayoutContent$1$2$2$1$1(ModifyPasswordViewModel modifyPasswordViewModel) {
        this.f37854a = modifyPasswordViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f37854a.m13731f(ModifyPasswordViewModel.UiAction.ToggleHideCurPassword.f37875a);
        return Unit.f51459a;
    }
}
