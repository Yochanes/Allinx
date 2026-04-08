package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements Function1<ParameterizedType, Sequence<? extends Type>> {

    /* JADX INFO: renamed from: a */
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 f52648a = new ReflectClassUtilKt$parameterizedTypeArguments$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParameterizedType it = (ParameterizedType) obj;
        Intrinsics.m18599g(it, "it");
        Type[] actualTypeArguments = it.getActualTypeArguments();
        Intrinsics.m18598f(actualTypeArguments, "it.actualTypeArguments");
        return ArraysKt.m18367f(actualTypeArguments);
    }
}
