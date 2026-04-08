package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.f51660a.mo18617g(this);
    }

    @Override // kotlin.reflect.KProperty
    public final /* bridge */ /* synthetic */ KProperty.Getter getGetter() {
        return getGetter();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }
}
