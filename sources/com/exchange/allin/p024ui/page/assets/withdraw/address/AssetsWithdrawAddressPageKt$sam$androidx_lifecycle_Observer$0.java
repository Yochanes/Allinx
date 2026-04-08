package com.exchange.allin.p024ui.page.assets.withdraw.address;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AssetsWithdrawAddressPageKt$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f38617a;

    public AssetsWithdrawAddressPageKt$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        this.f38617a = function1;
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo1166a(Object obj) {
        this.f38617a.invoke(obj);
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: b */
    public final Function mo3595b() {
        return this.f38617a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return this.f38617a.equals(((FunctionAdapter) obj).mo3595b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f38617a.hashCode();
    }
}
