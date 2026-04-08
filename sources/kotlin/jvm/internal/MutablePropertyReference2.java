package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements KMutableProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.f51660a.mo18616f(this);
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MutablePropertyReference2Impl) this).getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty2.Setter mo18608d() {
        return ((KMutableProperty2) getReflected()).mo18608d();
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return ((KMutableProperty2) getReflected()).getGetter();
    }
}
