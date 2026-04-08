package io.ktor.utils.p043io;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0087H"}, m18302d2 = {"consumeEachRemaining", "", "Lio/ktor/utils/io/LookAheadSuspendSession;", "visitor", "Lkotlin/Function2;", "Ljava/nio/ByteBuffer;", "Lkotlin/coroutines/Continuation;", "", "continuation", ""}, m18303k = 3, m18304mv = {1, 4, 2})
@DebugMetadata(m18558c = "io.ktor.utils.io.LookAheadSessionKt", m18559f = "LookAheadSession.kt", m18560l = {55, 60}, m18561m = "consumeEachRemaining")
public final class LookAheadSessionKt$consumeEachRemaining$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47294a;

    /* JADX INFO: renamed from: b */
    public int f47295b;

    /* JADX INFO: renamed from: c */
    public LookAheadSuspendSession f47296c;

    /* JADX INFO: renamed from: d */
    public Function2 f47297d;

    /* JADX INFO: renamed from: f */
    public int f47298f;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r9 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        return kotlin.Unit.f51459a;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0057 -> B:20:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006f -> B:25:0x0072). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        LookAheadSuspendSession lookAheadSuspendSession;
        LookAheadSessionKt$consumeEachRemaining$1 lookAheadSessionKt$consumeEachRemaining$1;
        int iRemaining;
        this.f47294a = obj;
        int i = (this.f47295b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f47295b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            function2 = null;
            lookAheadSuspendSession = null;
            LookAheadSessionKt$consumeEachRemaining$1 lookAheadSessionKt$consumeEachRemaining$12 = this;
            ByteBuffer byteBufferMo17302f = lookAheadSuspendSession.mo17302f(0, 1);
            if (byteBufferMo17302f == null) {
                lookAheadSessionKt$consumeEachRemaining$12.f47296c = lookAheadSuspendSession;
                lookAheadSessionKt$consumeEachRemaining$12.f47297d = function2;
                lookAheadSessionKt$consumeEachRemaining$12.f47295b = 1;
                Object objMo17290a = lookAheadSuspendSession.mo17290a(1, lookAheadSessionKt$consumeEachRemaining$12);
                if (objMo17290a != coroutineSingletons) {
                    lookAheadSessionKt$consumeEachRemaining$1 = lookAheadSessionKt$consumeEachRemaining$12;
                    obj = objMo17290a;
                }
            } else {
                iRemaining = byteBufferMo17302f.remaining();
                lookAheadSessionKt$consumeEachRemaining$12.f47296c = lookAheadSuspendSession;
                lookAheadSessionKt$consumeEachRemaining$12.f47297d = function2;
                lookAheadSessionKt$consumeEachRemaining$12.f47298f = iRemaining;
                lookAheadSessionKt$consumeEachRemaining$12.f47295b = 2;
                Object objInvoke = function2.invoke(byteBufferMo17302f, lookAheadSessionKt$consumeEachRemaining$12);
                if (objInvoke != coroutineSingletons) {
                    lookAheadSessionKt$consumeEachRemaining$1 = lookAheadSessionKt$consumeEachRemaining$12;
                    obj = objInvoke;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    lookAheadSuspendSession.mo17337w(iRemaining);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            Function2 function22 = this.f47297d;
            LookAheadSuspendSession lookAheadSuspendSession2 = this.f47296c;
            ResultKt.m18313b(obj);
            lookAheadSuspendSession = lookAheadSuspendSession2;
            function2 = function22;
            lookAheadSessionKt$consumeEachRemaining$1 = this;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.f47298f;
            function2 = this.f47297d;
            lookAheadSuspendSession = this.f47296c;
            ResultKt.m18313b(obj);
            iRemaining = i2;
            lookAheadSessionKt$consumeEachRemaining$1 = this;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            lookAheadSuspendSession.mo17337w(iRemaining);
        }
    }
}
