package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class ReflectClassUtilKt$parameterizedTypeArguments$1 extends Lambda implements Function1<ParameterizedType, ParameterizedType> {

    /* JADX INFO: renamed from: a */
    public static final ReflectClassUtilKt$parameterizedTypeArguments$1 f52647a = new ReflectClassUtilKt$parameterizedTypeArguments$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ParameterizedType it = (ParameterizedType) obj;
        Intrinsics.m18599g(it, "it");
        Type ownerType = it.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
