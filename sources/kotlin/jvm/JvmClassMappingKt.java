package kotlin.jvm;

import io.intercom.android.sdk.models.AttributeType;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmName
public final class JvmClassMappingKt {
    /* JADX INFO: renamed from: a */
    public static final KClass m18571a(Annotation annotation) {
        Intrinsics.m18599g(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Intrinsics.m18598f(clsAnnotationType, "annotationType(...)");
        return m18575e(clsAnnotationType);
    }

    /* JADX INFO: renamed from: b */
    public static final Class m18572b(KClass kClass) {
        Intrinsics.m18599g(kClass, "<this>");
        Class clsMo18585f = ((ClassBasedDeclarationContainer) kClass).getF51654a();
        Intrinsics.m18597e(clsMo18585f, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo18585f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static final Class m18573c(KClass kClass) {
        Intrinsics.m18599g(kClass, "<this>");
        Class clsMo18585f = ((ClassBasedDeclarationContainer) kClass).getF51654a();
        if (!clsMo18585f.isPrimitive()) {
            return clsMo18585f;
        }
        String name = clsMo18585f.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals(AttributeType.BOOLEAN)) {
                }
                break;
            case 97526364:
                if (!name.equals(AttributeType.FLOAT)) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsMo18585f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public static final Class m18574d(KClass kClass) {
        Intrinsics.m18599g(kClass, "<this>");
        Class clsMo18585f = ((ClassBasedDeclarationContainer) kClass).getF51654a();
        if (clsMo18585f.isPrimitive()) {
            return clsMo18585f;
        }
        String name = clsMo18585f.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final KClass m18575e(Class cls) {
        Intrinsics.m18599g(cls, "<this>");
        return Reflection.f51660a.mo18612b(cls);
    }
}
