package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SerialModuleImpl extends SerializersModule {

    /* JADX INFO: renamed from: a */
    public final Object f56960a;

    /* JADX INFO: renamed from: b */
    public final Object f56961b;

    /* JADX INFO: renamed from: c */
    public final Object f56962c;

    /* JADX INFO: renamed from: d */
    public final Object f56963d;

    /* JADX INFO: renamed from: e */
    public final Object f56964e;

    /* JADX INFO: renamed from: f */
    public final boolean f56965f;

    public SerialModuleImpl(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z2) {
        Intrinsics.m18599g(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.m18599g(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.m18599g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.m18599g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.m18599g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f56960a = class2ContextualFactory;
        this.f56961b = polyBase2Serializers;
        this.f56962c = polyBase2DefaultSerializerProvider;
        this.f56963d = polyBase2NamedSerializers;
        this.f56964e = polyBase2DefaultDeserializerProvider;
        this.f56965f = z2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.SerializersModule
    /* JADX INFO: renamed from: a */
    public final KSerializer mo21161a(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.m18599g(kClass, "kClass");
        Intrinsics.m18599g(typeArgumentsSerializers, "typeArgumentsSerializers");
        ContextualProvider contextualProvider = (ContextualProvider) this.f56960a.get(kClass);
        KSerializer kSerializerMo21160a = contextualProvider != null ? contextualProvider.mo21160a(typeArgumentsSerializers) : null;
        if (kSerializerMo21160a instanceof KSerializer) {
            return kSerializerMo21160a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.SerializersModule
    /* JADX INFO: renamed from: b */
    public final DeserializationStrategy mo21162b(String str, KClass baseClass) {
        Intrinsics.m18599g(baseClass, "baseClass");
        Map map = (Map) this.f56963d.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f56964e.get(baseClass);
        Function1 function1 = TypeIntrinsics.m18630f(1, obj) ? (Function1) obj : null;
        if (function1 != null) {
            return (DeserializationStrategy) function1.invoke(str);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.modules.SerializersModule
    /* JADX INFO: renamed from: c */
    public final SerializationStrategy mo21163c(KClass baseClass, Object value) {
        Intrinsics.m18599g(baseClass, "baseClass");
        Intrinsics.m18599g(value, "value");
        if (baseClass.mo18589m(value)) {
            Map map = (Map) this.f56961b.get(baseClass);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(Reflection.f51660a.mo18612b(value.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof SerializationStrategy ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj = this.f56962c.get(baseClass);
            Function1 function1 = TypeIntrinsics.m18630f(1, obj) ? (Function1) obj : null;
            if (function1 != null) {
                return (SerializationStrategy) function1.invoke(value);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public final void m21164d(SerializersModuleCollector serializersModuleCollector) {
        for (Map.Entry entry : this.f56960a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            ContextualProvider contextualProvider = (ContextualProvider) entry.getValue();
            if (contextualProvider instanceof ContextualProvider.Argless) {
                Intrinsics.m18597e(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                serializersModuleCollector.mo21146d(kClass, ((ContextualProvider.Argless) contextualProvider).f56958a);
            } else {
                if (!(contextualProvider instanceof ContextualProvider.WithTypeArguments)) {
                    throw new NoWhenBranchMatchedException();
                }
                serializersModuleCollector.mo21147e(kClass, ((ContextualProvider.WithTypeArguments) contextualProvider).f56959a);
            }
        }
        for (Map.Entry entry2 : this.f56961b.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                Intrinsics.m18597e(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.m18597e(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.m18597e(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                serializersModuleCollector.mo21144b(kClass2, kClass3, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.f56962c.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.m18597e(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.m18597e(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            TypeIntrinsics.m18629e(1, function1);
            serializersModuleCollector.mo21143a(kClass4, function1);
        }
        for (Map.Entry entry5 : this.f56964e.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.m18597e(kClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.m18597e(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            TypeIntrinsics.m18629e(1, function12);
            serializersModuleCollector.mo21145c(kClass5, function12);
        }
    }
}
