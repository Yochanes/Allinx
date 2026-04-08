package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase<Object>, SuspendFunction {

    /* JADX INFO: renamed from: a */
    public final int f51607a;

    public RestrictedSuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.f51607a = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* JADX INFO: renamed from: getArity, reason: from getter */
    public final int getF51607a() {
        return this.f51607a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strMo18620j = Reflection.f51660a.mo18620j(this);
        Intrinsics.m18598f(strMo18620j, "renderLambdaToString(...)");
        return strMo18620j;
    }
}
