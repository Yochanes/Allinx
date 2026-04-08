package io.ktor.utils.p043io;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "e", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class ExceptionUtilsJvmKt$safeCtor$1 extends Lambda implements Function1<Throwable, Throwable> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable e = (Throwable) obj;
        Intrinsics.m18599g(e, "e");
        try {
            throw null;
        } catch (Throwable th) {
            ResultKt.m18312a(th);
            return null;
        }
    }
}
