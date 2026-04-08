package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class IntegerLiteralTypeConstructor$valueToString$1 extends Lambda implements Function1<KotlinType, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final IntegerLiteralTypeConstructor$valueToString$1 f54380a = new IntegerLiteralTypeConstructor$valueToString$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KotlinType it = (KotlinType) obj;
        Intrinsics.m18599g(it, "it");
        return it.toString();
    }
}
