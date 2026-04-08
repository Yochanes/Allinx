package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$typeParametersCount$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6191x131ab843 extends Lambda implements Function1<ProtoBuf.Type, Integer> {

    /* JADX INFO: renamed from: a */
    public static final C6191x131ab843 f54629a = new C6191x131ab843(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProtoBuf.Type it = (ProtoBuf.Type) obj;
        Intrinsics.m18599g(it, "it");
        return Integer.valueOf(it.f53683d.size());
    }
}
