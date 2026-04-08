package io.ktor.client.engine;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.JobKt;

/* JADX INFO: renamed from: io.ktor.client.engine.HttpClientJvmEngine$createCallContext$onParentCancelCleanupHandle$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "cause", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class C5883x6fe6073 extends Lambda implements Function1<Throwable, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Throwable) obj) == null) {
            return Unit.f51459a;
        }
        JobKt.m20599b(null, null);
        throw null;
    }
}
