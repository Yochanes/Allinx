package io.ktor.client.features;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: renamed from: io.ktor.client.features.DefaultTransformKt$defaultTransformers$2$invokeSuspend$$inlined$also$lambda$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke", "io/ktor/client/features/DefaultTransformKt$defaultTransformers$2$channel$2$1"}, m18303k = 3, m18304mv = {1, 4, 2})
final class C5890xe41ac95f extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JobImpl f45185a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5890xe41ac95f(JobImpl jobImpl) {
        super(1);
        this.f45185a = jobImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f45185a.mo20549a();
        return Unit.f51459a;
    }
}
