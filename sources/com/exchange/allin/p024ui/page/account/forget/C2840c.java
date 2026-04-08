package com.exchange.allin.p024ui.page.account.forget;

import android.text.TextUtils;
import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.account.forget.ForgetPasswordViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.forget.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2840c implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ForgetPasswordViewModel f37127b;

    public /* synthetic */ C2840c(ForgetPasswordViewModel forgetPasswordViewModel, int i) {
        this.f37126a = i;
        this.f37127b = forgetPasswordViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37126a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                if (TextUtils.isDigitsOnly(it) || it.length() == 0) {
                    this.f37127b.m13646f(new ForgetPasswordViewModel.UiAction.ChangeAccount(it));
                }
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                this.f37127b.m13646f(new ForgetPasswordViewModel.UiAction.ChangeAccount(it2));
                break;
            default:
                Country it3 = (Country) obj;
                Intrinsics.m18599g(it3, "it");
                this.f37127b.m13646f(new ForgetPasswordViewModel.UiAction.ChangeCountry(it3));
                break;
        }
        return Unit.f51459a;
    }
}
