package io.ktor.client.features;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpRequestLifecycleKt$attachToClientEngineJob$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DisposableHandle f45262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestLifecycleKt$attachToClientEngineJob$1(DisposableHandle disposableHandle) {
        super(1);
        this.f45262a = disposableHandle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f45262a.dispose();
        return Unit.f51459a;
    }
}
