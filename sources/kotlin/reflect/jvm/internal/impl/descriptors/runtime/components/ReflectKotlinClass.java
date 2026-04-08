package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6095x2cf49cf1;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C6095x2cf49cf1.MemberAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    /* JADX INFO: renamed from: a */
    public final Class f52622a;

    /* JADX INFO: renamed from: b */
    public final KotlinClassHeader f52623b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory {
        /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ReflectKotlinClass m19109a(Class klass) throws InvocationTargetException {
            KotlinClassHeader kotlinClassHeader;
            Intrinsics.m18599g(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new ReadKotlinClassHeaderAnnotationVisitor();
            readKotlinClassHeaderAnnotationVisitor.f53305a = null;
            readKotlinClassHeaderAnnotationVisitor.f53306b = null;
            readKotlinClassHeaderAnnotationVisitor.f53307c = 0;
            readKotlinClassHeaderAnnotationVisitor.f53308d = null;
            readKotlinClassHeaderAnnotationVisitor.f53309e = null;
            readKotlinClassHeaderAnnotationVisitor.f53310f = null;
            readKotlinClassHeaderAnnotationVisitor.f53311g = null;
            readKotlinClassHeaderAnnotationVisitor.f53312h = null;
            ReflectClassStructure.m19099b(klass, readKotlinClassHeaderAnnotationVisitor);
            JvmMetadataVersion jvmMetadataVersion = JvmMetadataVersion.f54014g;
            if (readKotlinClassHeaderAnnotationVisitor.f53311g == null || readKotlinClassHeaderAnnotationVisitor.f53305a == null) {
                kotlinClassHeader = null;
            } else {
                JvmMetadataVersion jvmMetadataVersion2 = new JvmMetadataVersion(readKotlinClassHeaderAnnotationVisitor.f53305a, (readKotlinClassHeaderAnnotationVisitor.f53307c & 8) != 0);
                if (jvmMetadataVersion2.m19565b(jvmMetadataVersion)) {
                    KotlinClassHeader.Kind kind = readKotlinClassHeaderAnnotationVisitor.f53311g;
                    if ((kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && readKotlinClassHeaderAnnotationVisitor.f53308d == null) {
                    }
                } else {
                    readKotlinClassHeaderAnnotationVisitor.f53310f = readKotlinClassHeaderAnnotationVisitor.f53308d;
                    readKotlinClassHeaderAnnotationVisitor.f53308d = null;
                }
                String[] strArr = readKotlinClassHeaderAnnotationVisitor.f53312h;
                if (strArr != null) {
                    BitEncoding.m19561a(strArr);
                }
                kotlinClassHeader = new KotlinClassHeader(readKotlinClassHeaderAnnotationVisitor.f53311g, jvmMetadataVersion2, readKotlinClassHeaderAnnotationVisitor.f53308d, readKotlinClassHeaderAnnotationVisitor.f53310f, readKotlinClassHeaderAnnotationVisitor.f53309e, readKotlinClassHeaderAnnotationVisitor.f53306b, readKotlinClassHeaderAnnotationVisitor.f53307c);
            }
            if (kotlinClassHeader == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeader);
        }
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader) {
        this.f52622a = cls;
        this.f52623b = kotlinClassHeader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: a */
    public final KotlinClassHeader mo19104a() {
        return this.f52623b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: b */
    public final void mo19105b(C6095x2cf49cf1 c6095x2cf49cf1) throws InvocationTargetException {
        Class klass = this.f52622a;
        Intrinsics.m18599g(klass, "klass");
        Method[] declaredMethods = klass.getDeclaredMethods();
        Intrinsics.m18598f(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            Name nameM19605e = Name.m19605e(method.getName());
            StringBuilder sb = new StringBuilder("(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.m18598f(parameterTypes, "method.parameterTypes");
            for (Class<?> parameterType : parameterTypes) {
                Intrinsics.m18598f(parameterType, "parameterType");
                sb.append(ReflectClassUtilKt.m19118b(parameterType));
            }
            sb.append(")");
            Class<?> returnType = method.getReturnType();
            Intrinsics.m18598f(returnType, "method.returnType");
            sb.append(ReflectClassUtilKt.m19118b(returnType));
            String string = sb.toString();
            Intrinsics.m18598f(string, "sb.toString()");
            C6095x2cf49cf1.AnnotationVisitorForMethod annotationVisitorForMethodM19347a = c6095x2cf49cf1.m19347a(nameM19605e, string);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            Intrinsics.m18598f(declaredAnnotations, "method.declaredAnnotations");
            for (Annotation annotation : declaredAnnotations) {
                Intrinsics.m18598f(annotation, "annotation");
                ReflectClassStructure.m19100c(annotationVisitorForMethodM19347a, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.m18598f(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length2 = annotationArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                Annotation[] annotations = annotationArr[i2];
                Intrinsics.m18598f(annotations, "annotations");
                int length3 = annotations.length;
                int i3 = 0;
                while (i3 < length3) {
                    Annotation annotation2 = annotations[i3];
                    Class clsM18572b = JvmClassMappingKt.m18572b(JvmClassMappingKt.m18571a(annotation2));
                    Class cls = klass;
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorM19348c = annotationVisitorForMethodM19347a.m19348c(i2, ReflectClassUtilKt.m19117a(clsM18572b), new ReflectAnnotationSource(annotation2));
                    if (annotationArgumentVisitorM19348c != null) {
                        ReflectClassStructure.m19101d(annotationArgumentVisitorM19348c, annotation2, clsM18572b);
                    }
                    i3++;
                    klass = cls;
                }
            }
            annotationVisitorForMethodM19347a.mo18761a();
            i++;
            klass = klass;
        }
        Class cls2 = klass;
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        Intrinsics.m18598f(declaredConstructors, "klass.declaredConstructors");
        int length4 = declaredConstructors.length;
        int i4 = 0;
        while (i4 < length4) {
            Constructor<?> constructor = declaredConstructors[i4];
            Name name = SpecialNames.f54044e;
            Intrinsics.m18598f(constructor, "constructor");
            StringBuilder sb2 = new StringBuilder("(");
            Class<?>[] parameterTypes2 = constructor.getParameterTypes();
            Intrinsics.m18598f(parameterTypes2, "constructor.parameterTypes");
            for (Class<?> parameterType2 : parameterTypes2) {
                Intrinsics.m18598f(parameterType2, "parameterType");
                sb2.append(ReflectClassUtilKt.m19118b(parameterType2));
            }
            sb2.append(")V");
            String string2 = sb2.toString();
            Intrinsics.m18598f(string2, "sb.toString()");
            C6095x2cf49cf1.AnnotationVisitorForMethod annotationVisitorForMethodM19347a2 = c6095x2cf49cf1.m19347a(name, string2);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            Intrinsics.m18598f(declaredAnnotations2, "constructor.declaredAnnotations");
            for (Annotation annotation3 : declaredAnnotations2) {
                Intrinsics.m18598f(annotation3, "annotation");
                ReflectClassStructure.m19100c(annotationVisitorForMethodM19347a2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            Intrinsics.m18598f(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length != 0) {
                int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length6 = parameterAnnotations2.length;
                int i5 = 0;
                while (i5 < length6) {
                    Annotation[] annotations2 = parameterAnnotations2[i5];
                    Intrinsics.m18598f(annotations2, "annotations");
                    int length7 = annotations2.length;
                    Constructor<?>[] constructorArr = declaredConstructors;
                    int i6 = 0;
                    while (i6 < length7) {
                        int i7 = i6;
                        Annotation annotation4 = annotations2[i7];
                        int i8 = length4;
                        Class clsM18572b2 = JvmClassMappingKt.m18572b(JvmClassMappingKt.m18571a(annotation4));
                        int i9 = i4;
                        int i10 = length5;
                        Annotation[][] annotationArr2 = parameterAnnotations2;
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorM19348c2 = annotationVisitorForMethodM19347a2.m19348c(i5 + length5, ReflectClassUtilKt.m19117a(clsM18572b2), new ReflectAnnotationSource(annotation4));
                        if (annotationArgumentVisitorM19348c2 != null) {
                            ReflectClassStructure.m19101d(annotationArgumentVisitorM19348c2, annotation4, clsM18572b2);
                        }
                        i6 = i7 + 1;
                        i4 = i9;
                        length4 = i8;
                        length5 = i10;
                        parameterAnnotations2 = annotationArr2;
                    }
                    i5++;
                    declaredConstructors = constructorArr;
                }
            }
            Constructor<?>[] constructorArr2 = declaredConstructors;
            int i11 = length4;
            int i12 = i4;
            annotationVisitorForMethodM19347a2.mo18761a();
            i4 = i12 + 1;
            declaredConstructors = constructorArr2;
            length4 = i11;
        }
        Field[] declaredFields = cls2.getDeclaredFields();
        Intrinsics.m18598f(declaredFields, "klass.declaredFields");
        for (Field field : declaredFields) {
            Name nameM19605e2 = Name.m19605e(field.getName());
            Class<?> type = field.getType();
            Intrinsics.m18598f(type, "field.type");
            String desc = ReflectClassUtilKt.m19118b(type);
            Intrinsics.m18599g(desc, "desc");
            String strM19608b = nameM19605e2.m19608b();
            Intrinsics.m18598f(strM19608b, "name.asString()");
            C6095x2cf49cf1.MemberAnnotationVisitor memberAnnotationVisitor = c6095x2cf49cf1.new MemberAnnotationVisitor(MemberSignature.Companion.m19397a(strM19608b, desc));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            Intrinsics.m18598f(declaredAnnotations3, "field.declaredAnnotations");
            for (Annotation annotation5 : declaredAnnotations3) {
                Intrinsics.m18598f(annotation5, "annotation");
                ReflectClassStructure.m19100c(memberAnnotationVisitor, annotation5);
            }
            memberAnnotationVisitor.mo18761a();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: c */
    public final void mo19106c(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) throws InvocationTargetException {
        ReflectClassStructure.m19099b(this.f52622a, annotationVisitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: d */
    public final ClassId mo19107d() {
        return ReflectClassUtilKt.m19117a(this.f52622a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    /* JADX INFO: renamed from: e */
    public final String mo19108e() {
        return StringsKt.m20410H(this.f52622a.getName(), '.', '/').concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectKotlinClass) {
            return Intrinsics.m18594b(this.f52622a, ((ReflectKotlinClass) obj).f52622a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f52622a.hashCode();
    }

    public final String toString() {
        return ReflectKotlinClass.class.getName() + ": " + this.f52622a;
    }
}
