package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class RawTypeImpl$render$newArgs$1 extends Lambda implements Function1<String, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final RawTypeImpl$render$newArgs$1 f53102a = new RawTypeImpl$render$newArgs$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.m18599g(it, "it");
        return "(raw) ".concat(it);
    }
}
