package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FunctionsKt$ALWAYS_TRUE$1 extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final FunctionsKt$ALWAYS_TRUE$1 f55094a = new FunctionsKt$ALWAYS_TRUE$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.TRUE;
    }
}
