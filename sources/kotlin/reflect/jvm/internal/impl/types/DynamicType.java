package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {

    /* JADX INFO: renamed from: d */
    public final TypeAttributes f54806d;

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicType(KotlinBuiltIns kotlinBuiltIns, TypeAttributes attributes) {
        Intrinsics.m18599g(attributes, "attributes");
        SimpleType simpleTypeM18802m = kotlinBuiltIns.m18802m();
        Intrinsics.m18598f(simpleTypeM18802m, "builtIns.nothingType");
        super(simpleTypeM18802m, kotlinBuiltIns.m18803n());
        this.f54806d = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public final TypeAttributes mo19952H0() {
        return this.f54806d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
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

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: O0 */
    public final UnwrappedType mo19305O0(TypeAttributes newAttributes) {
        Intrinsics.m18599g(newAttributes, "newAttributes");
        return new DynamicType(TypeUtilsKt.m20310f(this.f54811c), newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    /* JADX INFO: renamed from: P0 */
    public final SimpleType mo19306P0() {
        return this.f54811c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    /* JADX INFO: renamed from: Q0 */
    public final String mo19307Q0(DescriptorRendererImpl descriptorRendererImpl, DescriptorRendererImpl descriptorRendererImpl2) {
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* JADX INFO: renamed from: M0 */
    public final UnwrappedType mo19303M0(boolean z2) {
        return this;
    }
}
