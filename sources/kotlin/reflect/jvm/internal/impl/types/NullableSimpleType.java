package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: J0 */
    public final boolean mo19323J0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    /* JADX INFO: renamed from: T0 */
    public final DelegatingSimpleType mo19327T0(SimpleType simpleType) {
        return new NullableSimpleType(simpleType);
    }
}
