package io.reactivex.rxjava3.kotlin;

import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a,\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0004H\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0005H\u00050\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u00062\u000e\u0010\u0007\u001a\n \u0003*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\b\u001a\n \u0003*\u0004\u0018\u0001H\u0004H\u00042\u000e\u0010\t\u001a\n \u0003*\u0004\u0018\u0001H\u0005H\u0005¢\u0006\u0004\b\n\u0010\u000b"}, m18302d2 = {"<anonymous>", "Lkotlin/Triple;", "T", "kotlin.jvm.PlatformType", "R", "U", "", "p1", "p2", "p3", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, m18303k = 3, m18304mv = {1, 4, 0})
final /* synthetic */ class FlowableKt$combineLatest$3 extends FunctionReferenceImpl implements Function3<Object, Object, Object, Triple<Object, Object, Object>> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Triple(obj, obj2, obj3);
    }
}
