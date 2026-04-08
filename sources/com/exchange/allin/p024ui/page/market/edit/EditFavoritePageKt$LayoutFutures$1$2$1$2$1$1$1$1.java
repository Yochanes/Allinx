package com.exchange.allin.p024ui.page.market.edit;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class EditFavoritePageKt$LayoutFutures$1$2$1$2$1$1$1$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SnapshotStateList f40032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40033b;

    public EditFavoritePageKt$LayoutFutures$1$2$1$2$1$1$1$1(SnapshotStateList snapshotStateList, String str) {
        this.f40032a = snapshotStateList;
        this.f40033b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SnapshotStateList snapshotStateList = this.f40032a;
        String str = this.f40033b;
        if (snapshotStateList.contains(str)) {
            snapshotStateList.remove(str);
        } else {
            snapshotStateList.add(str);
        }
        return Unit.f51459a;
    }
}
