package com.exchange.allin.p024ui.page.account.forget.setting;

import com.exchange.allin.p024ui.page.account.forget.setting.ForgetPasswordSettingViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ForgetPasswordSettingPageKt$LayoutContent$1$3$1 implements Function1<String, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ForgetPasswordSettingViewModel f37168a;

    public ForgetPasswordSettingPageKt$LayoutContent$1$3$1(ForgetPasswordSettingViewModel forgetPasswordSettingViewModel) {
        this.f37168a = forgetPasswordSettingViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.m18599g(it, "it");
        this.f37168a.m13650f(new ForgetPasswordSettingViewModel.UiAction.ChangePassword(it));
        return Unit.f51459a;
    }
}
