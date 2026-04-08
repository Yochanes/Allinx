package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6184x410e6287 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SmartSet f54358a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6184x410e6287(SmartSet smartSet) {
        super(1);
        this.f54358a = smartSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        Intrinsics.m18598f(it, "it");
        this.f54358a.add(it);
        return Unit.f51459a;
    }
}
