package com.exchange.allin.p024ui.page.account.forget.setting;

import com.exchange.allin.utils.ext.StringExtKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ForgetPasswordSettingPageKt$LayoutContent$1$10$1 implements Function1<String, String> {

    /* JADX INFO: renamed from: a */
    public static final ForgetPasswordSettingPageKt$LayoutContent$1$10$1 f37162a = new ForgetPasswordSettingPageKt$LayoutContent$1$10$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.m18599g(it, "it");
        return it.length() > 0 ? "" : StringExtKt.m14217f("forget_edit_error_password_again");
    }
}
