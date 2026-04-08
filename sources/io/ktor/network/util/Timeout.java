package io.ktor.network.util;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/util/Timeout;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class Timeout {

    /* JADX INFO: renamed from: a */
    public final Job f46393a;

    /* JADX INFO: renamed from: b */
    public final long f46394b;

    /* JADX INFO: renamed from: c */
    public final Function0 f46395c;

    /* JADX INFO: renamed from: d */
    public final CoroutineScope f46396d;

    /* JADX INFO: renamed from: e */
    public final SuspendLambda f46397e;
    volatile /* synthetic */ int isStarted;
    volatile /* synthetic */ long lastActivityTime;

    /* JADX WARN: Multi-variable type inference failed */
    public Timeout(String str, long j, Function0 function0, CoroutineScope scope, Function1 function1) {
        Intrinsics.m18599g(scope, "scope");
        this.f46394b = j;
        this.f46395c = function0;
        this.f46396d = scope;
        this.f46397e = (SuspendLambda) function1;
        this.lastActivityTime = 0L;
        this.isStarted = 0;
        this.f46393a = j != Long.MAX_VALUE ? BuildersKt.m20507c(scope, scope.getF44860c().mo2465z(new CoroutineName("Timeout ".concat(str))), null, new Timeout$initTimeoutJob$1(this, null), 2) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m17151a() {
        this.lastActivityTime = ((Number) this.f46395c.invoke()).longValue();
        this.isStarted = 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m17152b() {
        this.isStarted = 0;
    }
}
