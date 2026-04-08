package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", "p1", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final /* synthetic */ class FlowableStream$start$disposable$2 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable p1 = (Throwable) obj;
        Intrinsics.m18599g(p1, "p1");
        ((Stream.Observer) this.receiver).onError(p1);
        return Unit.f51459a;
    }
}
