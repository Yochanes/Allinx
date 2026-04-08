package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "T", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final /* synthetic */ class FlowableStream$start$disposable$3 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((Stream.Observer) this.receiver).onComplete();
        return Unit.f51459a;
    }
}
