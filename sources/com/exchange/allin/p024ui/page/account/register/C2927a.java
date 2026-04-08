package com.exchange.allin.p024ui.page.account.register;

import android.text.TextUtils;
import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.account.register.RegisterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.register.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2927a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RegisterViewModel f37680b;

    public /* synthetic */ C2927a(RegisterViewModel registerViewModel, int i) {
        this.f37679a = i;
        this.f37680b = registerViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37679a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                this.f37680b.m13694f(new RegisterViewModel.UiAction.ChangePassword(it));
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                if (TextUtils.isDigitsOnly(it2) || it2.length() == 0) {
                    this.f37680b.m13694f(new RegisterViewModel.UiAction.ChangeAccount(it2));
                }
                break;
            case 2:
                String it3 = (String) obj;
                Intrinsics.m18599g(it3, "it");
                this.f37680b.m13694f(new RegisterViewModel.UiAction.ChangePassword(it3));
                break;
            case 3:
                String it4 = (String) obj;
                Intrinsics.m18599g(it4, "it");
                this.f37680b.m13694f(new RegisterViewModel.UiAction.ChangeAccount(it4));
                break;
            case 4:
                String it5 = (String) obj;
                Intrinsics.m18599g(it5, "it");
                this.f37680b.m13694f(new RegisterViewModel.UiAction.ChangeInviteCode(it5));
                break;
            default:
                Country it6 = (Country) obj;
                Intrinsics.m18599g(it6, "it");
                this.f37680b.m13694f(new RegisterViewModel.UiAction.ChangeCountry(it6));
                break;
        }
        return Unit.f51459a;
    }
}
