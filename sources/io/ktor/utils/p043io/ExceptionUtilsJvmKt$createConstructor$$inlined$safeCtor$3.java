package io.ktor.utils.p043io;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m18302d2 = {"<anonymous>", "", "e", "invoke", "io/ktor/utils/io/ExceptionUtilsJvmKt$safeCtor$1"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$3 extends Lambda implements Function1<Throwable, Throwable> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Constructor f47290a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$3(Constructor constructor) {
        super(1);
        this.f47290a = constructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objM18312a;
        Object objNewInstance;
        Throwable e = (Throwable) obj;
        Intrinsics.m18599g(e, "e");
        try {
            objNewInstance = this.f47290a.newInstance(e.getMessage());
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (objNewInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(e);
        objM18312a = th2;
        boolean z2 = objM18312a instanceof Result.Failure;
        Object obj2 = objM18312a;
        if (z2) {
            obj2 = null;
        }
        return (Throwable) obj2;
    }
}
