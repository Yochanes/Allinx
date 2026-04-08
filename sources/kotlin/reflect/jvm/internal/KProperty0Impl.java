package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public class KProperty0Impl<V> extends KPropertyImpl<V> implements KProperty0<V> {

    /* JADX INFO: renamed from: r */
    public final Object f51894r;

    /* JADX INFO: renamed from: s */
    public final Object f51895s;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Getter<R> extends KPropertyImpl.Getter<R> implements KProperty0.Getter<R> {

        /* JADX INFO: renamed from: n */
        public final KProperty0Impl f51896n;

        public Getter(KProperty0Impl property) {
            Intrinsics.m18599g(property, "property");
            this.f51896n = property;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f51896n.get();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* JADX INFO: renamed from: x */
        public final KPropertyImpl mo18712x() {
            return this.f51896n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51422b;
        this.f51894r = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty0Impl$_getter$1(this));
        this.f51895s = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty0Impl$delegateValue$1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty0
    public final Object get() {
        return ((Getter) this.f51894r.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.f51894r.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    /* JADX INFO: renamed from: z */
    public final KPropertyImpl.Getter mo18714z() {
        return (Getter) this.f51894r.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return (Getter) this.f51894r.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f51422b;
        this.f51894r = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty0Impl$_getter$1(this));
        this.f51895s = LazyKt.m18298a(lazyThreadSafetyMode, new KProperty0Impl$delegateValue$1(this));
    }
}
