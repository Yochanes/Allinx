package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/reflect/KType;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class KTypeWrapper implements KType {

    /* JADX INFO: renamed from: a */
    public final KType f56705a;

    public KTypeWrapper(KType origin) {
        Intrinsics.m18599g(origin, "origin");
        this.f56705a = origin;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: e */
    public final List mo18635e() {
        return this.f56705a.mo18635e();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KTypeWrapper kTypeWrapper = obj instanceof KTypeWrapper ? (KTypeWrapper) obj : null;
        KType kType = kTypeWrapper != null ? kTypeWrapper.f56705a : null;
        KType kType2 = this.f56705a;
        if (!Intrinsics.m18594b(kType2, kType)) {
            return false;
        }
        KClassifier kClassifierMo18637g = kType2.mo18637g();
        if (!(kClassifierMo18637g instanceof KClass)) {
            return false;
        }
        KType kType3 = obj instanceof KType ? (KType) obj : null;
        KClassifier kClassifierMo18637g2 = kType3 != null ? kType3.mo18637g() : null;
        if (kClassifierMo18637g2 == null || !(kClassifierMo18637g2 instanceof KClass)) {
            return false;
        }
        return JvmClassMappingKt.m18572b((KClass) kClassifierMo18637g).equals(JvmClassMappingKt.m18572b((KClass) kClassifierMo18637g2));
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: g */
    public final KClassifier mo18637g() {
        return this.f56705a.mo18637g();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.f56705a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: h */
    public final boolean mo18638h() {
        return this.f56705a.mo18638h();
    }

    public final int hashCode() {
        return this.f56705a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f56705a;
    }
}
