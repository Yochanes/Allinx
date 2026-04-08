package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements KProperty2<D, E, V> {

    /* JADX INFO: renamed from: r */
    public final Object f51904r;

    /* JADX INFO: renamed from: s */
    public final Object f51905s;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Getter<D, E, V> extends KPropertyImpl.Getter<V> implements KProperty2.Getter<D, E, V> {

        /* JADX INFO: renamed from: n */
        public final KProperty2Impl f51906n;

        public Getter(KProperty2Impl property) {
            Intrinsics.m18599g(property, "property");
            this.f51906n = property;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((Getter) this.f51906n.f51904r.getValue()).call(obj, obj2);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* JADX INFO: renamed from: x */
        public final KPropertyImpl mo18712x() {
            return this.f51906n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51422b;
        this.f51904r = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty2Impl$_getter$1(this));
        this.f51905s = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty2Impl$delegateSource$1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.f51904r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Getter) this.f51904r.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: z */
    public final KPropertyImpl.Getter mo18714z() {
        return (Getter) this.f51904r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return (Getter) this.f51904r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51422b;
        this.f51904r = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty2Impl$_getter$1(this));
        this.f51905s = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty2Impl$delegateSource$1(this));
    }
}
