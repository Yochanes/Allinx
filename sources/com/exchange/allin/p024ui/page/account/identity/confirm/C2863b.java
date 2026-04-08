package com.exchange.allin.p024ui.page.account.identity.confirm;

import androidx.compose.runtime.MutableState;
import com.exchange.allin.p024ui.page.account.identity.confirm.IdentityVerificationConfirmViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.identity.confirm.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2863b implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37287a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IdentityVerificationConfirmViewModel f37288b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutableState f37289c;

    public /* synthetic */ C2863b(IdentityVerificationConfirmViewModel identityVerificationConfirmViewModel, MutableState mutableState, int i) {
        this.f37287a = i;
        this.f37288b = identityVerificationConfirmViewModel;
        this.f37289c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f37287a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                if (new File(it).exists()) {
                    boolean zBooleanValue = ((Boolean) this.f37289c.getF20325a()).booleanValue();
                    IdentityVerificationConfirmViewModel identityVerificationConfirmViewModel = this.f37288b;
                    if (zBooleanValue) {
                        identityVerificationConfirmViewModel.m13656f(new IdentityVerificationConfirmViewModel.UiAction.ChangeFrontPhotoPath(it));
                    } else {
                        identityVerificationConfirmViewModel.m13656f(new IdentityVerificationConfirmViewModel.UiAction.ChangeHandPhotoPath(it));
                    }
                }
                break;
            default:
                Intrinsics.m18599g(it, "it");
                if (new File(it).exists()) {
                    boolean zBooleanValue2 = ((Boolean) this.f37289c.getF20325a()).booleanValue();
                    IdentityVerificationConfirmViewModel identityVerificationConfirmViewModel2 = this.f37288b;
                    if (zBooleanValue2) {
                        identityVerificationConfirmViewModel2.m13656f(new IdentityVerificationConfirmViewModel.UiAction.ChangeFrontPhotoPath(it));
                    } else {
                        identityVerificationConfirmViewModel2.m13656f(new IdentityVerificationConfirmViewModel.UiAction.ChangeHandPhotoPath(it));
                    }
                }
                break;
        }
        return Unit.f51459a;
    }
}
