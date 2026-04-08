package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "V", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements KMutableProperty1<T, V> {

    /* JADX INFO: renamed from: t */
    public final Object f51864t;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "T", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Setter<T, V> extends KPropertyImpl.Setter<V> implements KMutableProperty1.Setter<T, V> {

        /* JADX INFO: renamed from: n */
        public final KMutableProperty1Impl f51865n;

        public Setter(KMutableProperty1Impl property) {
            Intrinsics.m18599g(property, "property");
            this.f51865n = property;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            ((Setter) this.f51865n.f51864t.getValue()).call(obj, obj2);
            return Unit.f51459a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* JADX INFO: renamed from: x */
        public final KPropertyImpl mo18712x() {
            return this.f51865n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(signature, "signature");
        this.f51864t = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new KMutableProperty1Impl$_setter$1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty.Setter mo18608d() {
        return (Setter) this.f51864t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty1.Setter mo18608d() {
        return (Setter) this.f51864t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(descriptor, "descriptor");
        this.f51864t = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new KMutableProperty1Impl$_setter$1(this));
    }
}
