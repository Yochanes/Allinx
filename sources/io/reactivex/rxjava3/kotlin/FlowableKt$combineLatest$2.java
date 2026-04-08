package io.reactivex.rxjava3.kotlin;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0004H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\b\b\u0001\u0010\u0004*\u00020\u00052\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0007\u001a\n \u0003*\u0004\u0018\u0001H\u0004H\u0004¢\u0006\u0004\b\b\u0010\t"}, m18302d2 = {"<anonymous>", "Lkotlin/Pair;", "T", "kotlin.jvm.PlatformType", "R", "", "p1", "p2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m18303k = 3, m18304mv = {1, 4, 0})
final /* synthetic */ class FlowableKt$combineLatest$2 extends FunctionReferenceImpl implements Function2<Object, Object, Pair<Object, Object>> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }
}
