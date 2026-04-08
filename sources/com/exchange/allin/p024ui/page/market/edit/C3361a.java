package com.exchange.allin.p024ui.page.market.edit;

import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.burnoutcrew.reorderable.ItemPosition;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.edit.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3361a implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f40058b;

    public /* synthetic */ C3361a(MutableState mutableState, int i) {
        this.f40057a = i;
        this.f40058b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ItemPosition from = (ItemPosition) obj;
        ItemPosition to = (ItemPosition) obj2;
        switch (this.f40057a) {
            case 0:
                Intrinsics.m18599g(from, "from");
                Intrinsics.m18599g(to, "to");
                MutableState mutableState = this.f40058b;
                ArrayList arrayListM18469z0 = CollectionsKt.m18469z0((Collection) mutableState.getF20325a());
                arrayListM18469z0.add(to.f58055a, arrayListM18469z0.remove(from.f58055a));
                mutableState.setValue(arrayListM18469z0);
                break;
            default:
                Intrinsics.m18599g(from, "from");
                Intrinsics.m18599g(to, "to");
                MutableState mutableState2 = this.f40058b;
                ArrayList arrayListM18469z02 = CollectionsKt.m18469z0((Collection) mutableState2.getF20325a());
                arrayListM18469z02.add(to.f58055a, arrayListM18469z02.remove(from.f58055a));
                mutableState2.setValue(arrayListM18469z02);
                break;
        }
        return Unit.f51459a;
    }
}
