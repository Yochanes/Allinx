package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DeserializedMemberScope$classNames$2 extends Lambda implements Function0<Set<? extends Name>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f54716a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeserializedMemberScope$classNames$2(Function0 function0) {
        super(0);
        this.f54716a = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CollectionsKt.m18399B0((Iterable) this.f54716a.invoke());
    }
}
