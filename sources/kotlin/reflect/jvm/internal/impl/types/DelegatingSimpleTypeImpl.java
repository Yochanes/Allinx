package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DelegatingSimpleTypeImpl extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b */
    public final SimpleType f54803b;

    public DelegatingSimpleTypeImpl(SimpleType simpleType) {
        this.f54803b = simpleType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType mo19324P0(boolean z2) {
        return z2 == mo19323J0() ? this : this.f54803b.mo19324P0(z2).mo19325Q0(mo19952H0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: Q0 */
    public final SimpleType mo19325Q0(TypeAttributes newAttributes) {
        Intrinsics.m18599g(newAttributes, "newAttributes");
        return newAttributes != mo19952H0() ? new SimpleTypeWithAttributes(this, newAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: R0 */
    public final SimpleType mo19326R0() {
        return this.f54803b;
    }
}
