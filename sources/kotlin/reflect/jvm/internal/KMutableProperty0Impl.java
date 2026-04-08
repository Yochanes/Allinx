package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "V", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements KMutableProperty0<V> {

    /* JADX INFO: renamed from: t */
    public final Object f51861t;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty0$Setter;", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Setter<R> extends KPropertyImpl.Setter<R> implements KMutableProperty0.Setter<R> {

        /* JADX INFO: renamed from: n */
        public final KMutableProperty0Impl f51862n;

        public Setter(KMutableProperty0Impl property) {
            Intrinsics.m18599g(property, "property");
            this.f51862n = property;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws IllegalCallableAccessException {
            ((Setter) this.f51862n.f51861t.getValue()).call(obj);
            return Unit.f51459a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        /* JADX INFO: renamed from: x */
        public final KPropertyImpl mo18712x() {
            return this.f51862n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(descriptor, "descriptor");
        this.f51861t = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new KMutableProperty0Impl$_setter$1(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty.Setter mo18608d() {
        return (Setter) this.f51861t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    /* JADX INFO: renamed from: d */
    public final KMutableProperty0.Setter mo18608d() {
        return (Setter) this.f51861t.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.m18599g(container, "container");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(signature, "signature");
        this.f51861t = LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new KMutableProperty0Impl$_setter$1(this));
    }
}
