package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class WrappedType extends KotlinType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: G0 */
    public final List mo19951G0() {
        return mo20152M0().mo19951G0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public final TypeAttributes mo19952H0() {
        return mo20152M0().mo19952H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: I0 */
    public final TypeConstructor mo19953I0() {
        return mo20152M0().mo19953I0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: J0 */
    public final boolean mo19323J0() {
        return mo20152M0().mo19323J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: L0 */
    public final UnwrappedType mo20144L0() {
        KotlinType kotlinTypeMo20152M0 = mo20152M0();
        while (kotlinTypeMo20152M0 instanceof WrappedType) {
            kotlinTypeMo20152M0 = ((WrappedType) kotlinTypeMo20152M0).mo20152M0();
        }
        Intrinsics.m18597e(kotlinTypeMo20152M0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) kotlinTypeMo20152M0;
    }

    /* JADX INFO: renamed from: M0 */
    public abstract KotlinType mo20152M0();

    /* JADX INFO: renamed from: N0 */
    public boolean mo20153N0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: o */
    public final MemberScope mo19309o() {
        return mo20152M0().mo19309o();
    }

    public final String toString() {
        return mo20153N0() ? mo20152M0().toString() : "<Not computed yet>";
    }
}
