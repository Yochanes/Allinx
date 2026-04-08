package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DelegatingSimpleType extends SimpleType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: G0 */
    public final List mo19951G0() {
        return mo19326R0().mo19951G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public TypeAttributes mo19952H0() {
        return mo19326R0().mo19952H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: I0 */
    public final TypeConstructor mo19953I0() {
        return mo19326R0().mo19953I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: J0 */
    public boolean mo19323J0() {
        return mo19326R0().mo19323J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: K0 */
    public /* bridge */ /* synthetic */ KotlinType mo19302K0(KotlinTypeRefiner kotlinTypeRefiner) {
        return mo20098S0(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: N0 */
    public /* bridge */ /* synthetic */ UnwrappedType mo19304N0(KotlinTypeRefiner kotlinTypeRefiner) {
        return mo20098S0(kotlinTypeRefiner);
    }

    /* JADX INFO: renamed from: R0 */
    public abstract SimpleType mo19326R0();

    /* JADX INFO: renamed from: S0 */
    public SimpleType mo20098S0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.m18599g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return mo19327T0((SimpleType) kotlinTypeRefiner.mo20279f(mo19326R0()));
    }

    /* JADX INFO: renamed from: T0 */
    public abstract DelegatingSimpleType mo19327T0(SimpleType simpleType);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: o */
    public final MemberScope mo19309o() {
        return mo19326R0().mo19309o();
    }
}
