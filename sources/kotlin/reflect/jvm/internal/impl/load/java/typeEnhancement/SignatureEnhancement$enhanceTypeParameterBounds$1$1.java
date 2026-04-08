package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SignatureEnhancement$enhanceTypeParameterBounds$1$1 extends Lambda implements Function1<UnwrappedType, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final SignatureEnhancement$enhanceTypeParameterBounds$1$1 f53179a = new SignatureEnhancement$enhanceTypeParameterBounds$1$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UnwrappedType it = (UnwrappedType) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.valueOf(it instanceof RawType);
    }
}
