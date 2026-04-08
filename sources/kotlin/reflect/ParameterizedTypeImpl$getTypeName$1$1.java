package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements Function1<Type, String> {

    /* JADX INFO: renamed from: a */
    public static final ParameterizedTypeImpl$getTypeName$1$1 f51733a = new ParameterizedTypeImpl$getTypeName$1$1(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type p0 = (Type) obj;
        Intrinsics.m18599g(p0, "p0");
        return TypesJVMKt.m18667a(p0);
    }
}
