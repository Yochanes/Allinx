package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6052xccd5eab2 extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final C6052xccd5eab2 f52721a = new C6052xccd5eab2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallableMemberDescriptor it = (CallableMemberDescriptor) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.m19185b(it));
    }
}
