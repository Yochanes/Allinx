package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;

    @SinceKotlin
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public KCallable computeReflected() {
        return Reflection.f51660a.mo18611a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && Intrinsics.m18594b(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.m18594b(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public /* bridge */ /* synthetic */ KCallable getReflected() {
        return getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @SinceKotlin
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }
}
