package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeEnhancementKt {

    /* JADX INFO: renamed from: a */
    public static final Annotations f53196a;

    /* JADX INFO: renamed from: b */
    public static final EnhancedTypeAnnotations f53197b;

    /* JADX INFO: compiled from: Proguard */
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53198a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53198a = iArr;
        }
    }

    static {
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.f52775p;
        Intrinsics.m18598f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f53196a = new EnhancedTypeAnnotations(ENHANCED_NULLABILITY_ANNOTATION);
        FqName ENHANCED_MUTABILITY_ANNOTATION = JvmAnnotationNames.f52776q;
        Intrinsics.m18598f(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f53197b = new EnhancedTypeAnnotations(ENHANCED_MUTABILITY_ANNOTATION);
    }
}
