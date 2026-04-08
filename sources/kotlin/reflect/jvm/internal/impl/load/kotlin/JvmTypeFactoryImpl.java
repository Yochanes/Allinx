package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.compose.animation.AbstractC0455a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    /* JADX INFO: renamed from: a */
    public static final JvmTypeFactoryImpl f53268a = new JvmTypeFactoryImpl();

    /* JADX INFO: compiled from: Proguard */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static JvmType m19393a(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.m18599g(representation, "representation");
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.m19991c().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.m18598f(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new JvmType.Array(m19393a(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.m20440p(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.m18598f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new JvmType.Object(strSubstring2);
    }

    /* JADX INFO: renamed from: c */
    public static String m19394c(JvmType type) {
        String strM19991c;
        Intrinsics.m18599g(type, "type");
        if (type instanceof JvmType.Array) {
            return "[" + m19394c(((JvmType.Array) type).f53265i);
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) type).f53267i;
            return (jvmPrimitiveType == null || (strM19991c = jvmPrimitiveType.m19991c()) == null) ? "V" : strM19991c;
        }
        if (type instanceof JvmType.Object) {
            return AbstractC0455a.m2241p(new StringBuilder("L"), ((JvmType.Object) type).f53266i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public final JvmType.Object m19395b(String internalName) {
        Intrinsics.m18599g(internalName, "internalName");
        return new JvmType.Object(internalName);
    }
}
