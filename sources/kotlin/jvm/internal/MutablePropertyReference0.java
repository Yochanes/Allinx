package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements KMutableProperty0 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.f51660a.mo18614d(this);
    }

    @Override // kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ KMutableProperty.Setter mo18608d() {
        return mo18608d();
    }

    @Override // kotlin.reflect.KProperty
    public final /* bridge */ /* synthetic */ KProperty.Getter getGetter() {
        return getGetter();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty0.Setter mo18608d() {
        return ((KMutableProperty0) getReflected()).mo18608d();
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return ((KMutableProperty0) getReflected()).getGetter();
    }
}
