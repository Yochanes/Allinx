package com.exchange.allin.p024ui.page.account.forget.setting;

import com.exchange.allin.p024ui.page.account.forget.setting.ForgetPasswordSettingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ForgetPasswordSettingPageKt$LayoutContent$1$9$1$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ForgetPasswordSettingViewModel f37178a;

    public ForgetPasswordSettingPageKt$LayoutContent$1$9$1$1(ForgetPasswordSettingViewModel forgetPasswordSettingViewModel) {
        this.f37178a = forgetPasswordSettingViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f37178a.m13650f(ForgetPasswordSettingViewModel.UiAction.ToggleHideRePassword.f37185a);
        return Unit.f51459a;
    }
}
