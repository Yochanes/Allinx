package io.ktor.client;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u0006*\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "TBuilder", "", "TFeature", "T", "Lio/ktor/client/engine/HttpClientEngineConfig;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpClientConfig$install$2 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f44895a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f44896b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientConfig$install$2(Function1 function1, Function1 function12) {
        super(1);
        this.f44895a = function1;
        this.f44896b = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object receiver) {
        Intrinsics.m18599g(receiver, "$receiver");
        Function1 function1 = this.f44895a;
        if (function1 != null) {
        }
        this.f44896b.invoke(receiver);
        return Unit.f51459a;
    }
}
