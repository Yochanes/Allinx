package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface KotlinJvmBinaryClass {

    /* JADX INFO: compiled from: Proguard */
    public interface AnnotationArgumentVisitor {
        /* JADX INFO: renamed from: a */
        void mo19376a();

        /* JADX INFO: renamed from: b */
        void mo19369b(Name name, ClassLiteralValue classLiteralValue);

        /* JADX INFO: renamed from: c */
        AnnotationArgumentVisitor mo19370c(ClassId classId, Name name);

        /* JADX INFO: renamed from: d */
        void mo19371d(Name name, ClassId classId, Name name2);

        /* JADX INFO: renamed from: e */
        void mo19372e(Object obj, Name name);

        /* JADX INFO: renamed from: f */
        AnnotationArrayArgumentVisitor mo19373f(Name name);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface AnnotationArrayArgumentVisitor {
        /* JADX INFO: renamed from: a */
        void mo19377a();

        /* JADX INFO: renamed from: b */
        void mo19378b(Object obj);

        /* JADX INFO: renamed from: c */
        void mo19379c(ClassId classId, Name name);

        /* JADX INFO: renamed from: d */
        AnnotationArgumentVisitor mo19380d(ClassId classId);

        /* JADX INFO: renamed from: e */
        void mo19381e(ClassLiteralValue classLiteralValue);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface AnnotationVisitor {
        /* JADX INFO: renamed from: a */
        void mo18761a();

        /* JADX INFO: renamed from: b */
        AnnotationArgumentVisitor mo18762b(ClassId classId, ReflectAnnotationSource reflectAnnotationSource);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MemberVisitor {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MethodAnnotationVisitor extends AnnotationVisitor {
    }

    /* JADX INFO: renamed from: a */
    KotlinClassHeader mo19104a();

    /* JADX INFO: renamed from: b */
    void mo19105b(C6095x2cf49cf1 c6095x2cf49cf1);

    /* JADX INFO: renamed from: c */
    void mo19106c(AnnotationVisitor annotationVisitor);

    /* JADX INFO: renamed from: d */
    ClassId mo19107d();

    /* JADX INFO: renamed from: e */
    String mo19108e();
}
