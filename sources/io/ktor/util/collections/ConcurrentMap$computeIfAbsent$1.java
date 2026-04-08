package io.ktor.util.collections;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Value", "Key", "", "invoke", "()Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 4, 2})
final class ConcurrentMap$computeIfAbsent$1 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConcurrentMap f46527a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f46528b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lambda f46529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentMap$computeIfAbsent$1(ConcurrentMap concurrentMap, Object obj, Function0 function0) {
        super(0);
        this.f46527a = concurrentMap;
        this.f46528b = obj;
        this.f46529c = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ConcurrentMap concurrentMap = this.f46527a;
        Object obj = this.f46528b;
        Object obj2 = concurrentMap.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        Object objInvoke = this.f46529c.invoke();
        concurrentMap.put(obj, objInvoke);
        return objInvoke;
    }
}
