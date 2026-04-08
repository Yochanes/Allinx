package com.exchange.allin.p024ui.page.market.edit;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.edit.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3364d implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SnapshotStateList f40067b;

    public /* synthetic */ C3364d(SnapshotStateList snapshotStateList, int i) {
        this.f40066a = i;
        this.f40067b = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f40066a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                break;
            default:
                Intrinsics.m18599g(it, "it");
                break;
        }
        return Boolean.valueOf(this.f40067b.contains(it));
    }
}
