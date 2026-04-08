package com.exchange.allin.p024ui.page.account.identity;

import com.exchange.allin.data.Country;
import com.exchange.allin.p024ui.page.account.identity.IdentityVerificationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.identity.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2857b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityVerificationViewModel f37238b;

    public /* synthetic */ C2857b(IdentityVerificationViewModel identityVerificationViewModel, int i) {
        this.f37237a = i;
        this.f37238b = identityVerificationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37237a) {
            case 0:
                String it = (String) obj;
                Intrinsics.m18599g(it, "it");
                this.f37238b.m13653f(new IdentityVerificationViewModel.UiAction.ChangeName(it));
                break;
            case 1:
                String it2 = (String) obj;
                Intrinsics.m18599g(it2, "it");
                this.f37238b.m13653f(new IdentityVerificationViewModel.UiAction.ChangeIdNumber(it2));
                break;
            case 2:
                Country it3 = (Country) obj;
                Intrinsics.m18599g(it3, "it");
                this.f37238b.m13653f(new IdentityVerificationViewModel.UiAction.ChangeCountry(it3));
                break;
            default:
                String it4 = (String) obj;
                Intrinsics.m18599g(it4, "it");
                this.f37238b.m13653f(new IdentityVerificationViewModel.UiAction.ChangeType(it4));
                break;
        }
        return Unit.f51459a;
    }
}
