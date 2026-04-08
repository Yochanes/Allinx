package kotlin.reflect;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements Function1<Class<?>, Class<?>> {

    /* JADX INFO: renamed from: a */
    public static final TypesJVMKt$typeToString$unwrap$1 f51736a = new TypesJVMKt$typeToString$unwrap$1(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Class p0 = (Class) obj;
        Intrinsics.m18599g(p0, "p0");
        return p0.getComponentType();
    }
}
