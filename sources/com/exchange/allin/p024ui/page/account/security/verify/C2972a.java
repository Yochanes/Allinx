package com.exchange.allin.p024ui.page.account.security.verify;

import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.account.security.verify.SecurityVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.security.verify.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2972a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SecurityVerifyViewModel f38003b;

    public /* synthetic */ C2972a(SecurityVerifyViewModel securityVerifyViewModel, int i) {
        this.f38002a = i;
        this.f38003b = securityVerifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38002a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                if (it.length() <= 6 || it.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeNewCode(it));
                }
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                if (it2.length() <= 6 || it2.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeCurCode(it2));
                }
                break;
            case 2:
                String it3 = (String) obj;
                Intrinsics.m18599g(it3, "it");
                if (it3.length() <= 6 || it3.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeNewCode(it3));
                }
                break;
            case 3:
                String it4 = (String) obj;
                Intrinsics.m18599g(it4, "it");
                if (it4.length() <= 6 || it4.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeCurCode(it4));
                }
                break;
            case 4:
                String it5 = (String) obj;
                Intrinsics.m18599g(it5, "it");
                if (it5.length() <= 6 || it5.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeNewCode(it5));
                }
                break;
            case 5:
                String it6 = (String) obj;
                Intrinsics.m18599g(it6, "it");
                if (it6.length() <= 6 || it6.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeCurCode(it6));
                }
                break;
            case 6:
                String it7 = (String) obj;
                Intrinsics.m18599g(it7, "it");
                if (it7.length() <= 6 || it7.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeCurCode(it7));
                }
                break;
            case 7:
                String it8 = (String) obj;
                Intrinsics.m18599g(it8, "it");
                this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeAccount(it8));
                break;
            case 8:
                String it9 = (String) obj;
                Intrinsics.m18599g(it9, "it");
                if (it9.length() <= 6 || it9.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeNewCode(it9));
                }
                break;
            case 9:
                String it10 = (String) obj;
                Intrinsics.m18599g(it10, "it");
                if (it10.length() <= 6 || it10.length() == 0) {
                    this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeCurCode(it10));
                }
                break;
            default:
                Country it11 = (Country) obj;
                Intrinsics.m18599g(it11, "it");
                this.f38003b.m13744f(new SecurityVerifyViewModel.UiAction.ChangeCountry(it11));
                break;
        }
        return Unit.f51459a;
    }
}
