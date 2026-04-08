package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DelegatedTypeSubstitution extends TypeSubstitution {

    /* JADX INFO: renamed from: b */
    public final TypeSubstitution f54802b;

    public DelegatedTypeSubstitution(TypeSubstitution typeSubstitution) {
        this.f54802b = typeSubstitution;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: a */
    public final boolean mo20127a() {
        return this.f54802b.mo20127a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: b */
    public boolean mo19957b() {
        return this.f54802b.mo19957b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: c */
    public final Annotations mo20128c(Annotations annotations) {
        Intrinsics.m18599g(annotations, "annotations");
        return this.f54802b.mo20128c(annotations);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: d */
    public TypeProjection mo19297d(KotlinType kotlinType) {
        return this.f54802b.mo19297d(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: e */
    public final boolean mo20129e() {
        return this.f54802b.mo20129e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* JADX INFO: renamed from: f */
    public final KotlinType mo20130f(KotlinType topLevelType, Variance position) {
        Intrinsics.m18599g(topLevelType, "topLevelType");
        Intrinsics.m18599g(position, "position");
        return this.f54802b.mo20130f(topLevelType, position);
    }
}
