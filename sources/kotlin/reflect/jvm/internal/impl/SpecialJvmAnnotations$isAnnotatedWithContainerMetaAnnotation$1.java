package kotlin.reflect.jvm.internal.impl;

import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1 implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.BooleanRef f52007a;

    public SpecialJvmAnnotations$isAnnotatedWithContainerMetaAnnotation$1(Ref.BooleanRef booleanRef) {
        this.f52007a = booleanRef;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    /* JADX INFO: renamed from: b */
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor mo18762b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource) {
        if (!classId.equals(JvmAbi.f52759b)) {
            return null;
        }
        this.f52007a.f51655a = true;
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    /* JADX INFO: renamed from: a */
    public final void mo18761a() {
    }
}
