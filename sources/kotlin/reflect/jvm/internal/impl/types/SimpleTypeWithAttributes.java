package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {

    /* JADX INFO: renamed from: c */
    public final TypeAttributes f54840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(SimpleType simpleType, TypeAttributes attributes) {
        super(simpleType);
        Intrinsics.m18599g(attributes, "attributes");
        this.f54840c = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: H0 */
    public final TypeAttributes mo19952H0() {
        return this.f54840c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: T0 */
    public final DelegatingSimpleType mo19327T0(SimpleType simpleType) {
        return new SimpleTypeWithAttributes(simpleType, this.f54840c);
    }
}
