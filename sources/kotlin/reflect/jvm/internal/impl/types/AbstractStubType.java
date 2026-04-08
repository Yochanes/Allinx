package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractStubType extends SimpleType {

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: G0 */
    public final List mo19951G0() {
        return EmptyList.f51496a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public final TypeAttributes mo19952H0() {
        TypeAttributes.f54853b.getClass();
        return TypeAttributes.f54854c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: J0 */
    public final boolean mo19323J0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: K0 */
    public final KotlinType mo19302K0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.m18599g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: N0 */
    public final UnwrappedType mo19304N0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.m18599g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: O0 */
    public final UnwrappedType mo19305O0(TypeAttributes newAttributes) {
        Intrinsics.m18599g(newAttributes, "newAttributes");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType mo19324P0(boolean z2) {
        return !z2 ? this : mo20107R0(z2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    /* JADX INFO: renamed from: Q0 */
    public final SimpleType mo19325Q0(TypeAttributes newAttributes) {
        Intrinsics.m18599g(newAttributes, "newAttributes");
        return this;
    }

    /* JADX INFO: renamed from: R0 */
    public abstract StubTypeForBuilderInference mo20107R0(boolean z2);

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: o */
    public MemberScope mo19309o() {
        return null;
    }
}
