package com.exchange.allin.p024ui.page.market.edit;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class EditFavoritePageKt$LayoutSpot$1$2$1$2$1$1$3$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f40048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40049b;

    public EditFavoritePageKt$LayoutSpot$1$2$1$2$1$1$3$1(MutableState mutableState, String str) {
        this.f40048a = mutableState;
        this.f40049b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableState mutableState = this.f40048a;
        ArrayList arrayListM18469z0 = CollectionsKt.m18469z0((Collection) mutableState.getF20325a());
        String str = this.f40049b;
        arrayListM18469z0.remove(str);
        arrayListM18469z0.add(0, str);
        mutableState.setValue(arrayListM18469z0);
        return Unit.f51459a;
    }
}
