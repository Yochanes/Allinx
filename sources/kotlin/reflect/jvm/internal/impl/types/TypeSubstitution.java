package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TypeSubstitution {

    /* JADX INFO: renamed from: a */
    public static final TypeSubstitution$Companion$EMPTY$1 f54879a = new TypeSubstitution$Companion$EMPTY$1();

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo20127a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo19957b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public Annotations mo20128c(Annotations annotations) {
        Intrinsics.m18599g(annotations, "annotations");
        return annotations;
    }

    /* JADX INFO: renamed from: d */
    public abstract TypeProjection mo19297d(KotlinType kotlinType);

    /* JADX INFO: renamed from: e */
    public boolean mo20129e() {
        return this instanceof TypeSubstitution$Companion$EMPTY$1;
    }

    /* JADX INFO: renamed from: f */
    public KotlinType mo20130f(KotlinType topLevelType, Variance position) {
        Intrinsics.m18599g(topLevelType, "topLevelType");
        Intrinsics.m18599g(position, "position");
        return topLevelType;
    }
}
