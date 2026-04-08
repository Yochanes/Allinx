package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "Lkotlin/reflect/KMutableProperty2;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class KMutableProperty2Impl<D, E, V> extends KProperty2Impl<D, E, V> implements KMutableProperty2<D, E, V> {

    /* JADX INFO: renamed from: t */
    public final Object f51867t;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty2$Setter;", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Setter<D, E, V> extends KPropertyImpl.Setter<V> implements KMutableProperty2.Setter<D, E, V> {

        /* JADX INFO: renamed from: n */
        public final KMutableProperty2Impl f51868n;

        public Setter(KMutableProperty2Impl property) {
            Intrinsics.m18599g(property, "property");
            this.f51868n = property;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            ((Setter) this.f51868n.f51867t.getValue()).call(obj, obj2, obj3);
            return Unit.f51459a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* JADX INFO: renamed from: x */
        public final KPropertyImpl mo18712x() {
            return this.f51868n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(signature, "signature");
        this.f51867t = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new KMutableProperty2Impl$_setter$1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty.Setter mo18608d() {
        return (Setter) this.f51867t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty2, kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty2.Setter mo18608d() {
        return (Setter) this.f51867t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(descriptor, "descriptor");
        this.f51867t = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new KMutableProperty2Impl$_setter$1(this));
    }
}
