package com.exchange.allin.p024ui.page.market.edit;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class EditFavoritePageKt$LayoutSpot$1$2$1$2$1$1$1$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SnapshotStateList f40046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40047b;

    public EditFavoritePageKt$LayoutSpot$1$2$1$2$1$1$1$1(SnapshotStateList snapshotStateList, String str) {
        this.f40046a = snapshotStateList;
        this.f40047b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapshotStateList snapshotStateList = this.f40046a;
        String str = this.f40047b;
        if (snapshotStateList.contains(str)) {
            snapshotStateList.remove(str);
        } else {
            snapshotStateList.add(str);
        }
        return Unit.f51459a;
    }
}
