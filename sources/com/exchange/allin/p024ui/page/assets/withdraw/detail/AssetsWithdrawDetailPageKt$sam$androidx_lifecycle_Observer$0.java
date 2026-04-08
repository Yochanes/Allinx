package com.exchange.allin.p024ui.page.assets.withdraw.detail;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AssetsWithdrawDetailPageKt$sam$androidx_lifecycle_Observer$0 implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3080a f38685a;

    public AssetsWithdrawDetailPageKt$sam$androidx_lifecycle_Observer$0(C3080a c3080a) {
        this.f38685a = c3080a;
    }

    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo1166a(Object obj) {
        this.f38685a.invoke(obj);
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    /* JADX INFO: renamed from: b */
    public final Function mo3595b() {
        return this.f38685a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return this.f38685a.equals(((FunctionAdapter) obj).mo3595b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f38685a.hashCode();
    }
}
