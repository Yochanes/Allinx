package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DisjointKeysUnionTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    public final TypeSubstitution f54804b;

    /* JADX INFO: renamed from: c */
    public final TypeSubstitution f54805c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    public DisjointKeysUnionTypeSubstitution(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        this.f54804b = typeSubstitution;
        this.f54805c = typeSubstitution2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public final boolean mo20127a() {
        return this.f54804b.mo20127a() || this.f54805c.mo20127a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public final boolean mo19957b() {
        return this.f54804b.mo19957b() || this.f54805c.mo19957b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: c */
    public final Annotations mo20128c(Annotations annotations) {
        Intrinsics.m18599g(annotations, "annotations");
        return this.f54805c.mo20128c(this.f54804b.mo20128c(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: d */
    public final TypeProjection mo19297d(KotlinType kotlinType) {
        TypeProjection typeProjectionMo19297d = this.f54804b.mo19297d(kotlinType);
        return typeProjectionMo19297d == null ? this.f54805c.mo19297d(kotlinType) : typeProjectionMo19297d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public final KotlinType mo20130f(KotlinType topLevelType, Variance position) {
        Intrinsics.m18599g(topLevelType, "topLevelType");
        Intrinsics.m18599g(position, "position");
        return this.f54805c.mo20130f(this.f54804b.mo20130f(topLevelType, position), position);
    }
}
