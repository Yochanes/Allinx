package org.jetbrains.anko;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m18303k = 3, m18304mv = {1, 1, 13})
public final class AsyncKt$crashLogger$1 extends Lambda implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.m18600h(throwable, "throwable");
        throwable.printStackTrace();
        return Unit.f51459a;
    }
}
