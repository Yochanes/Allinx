package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JvmType {

    /* JADX INFO: renamed from: a */
    public static final Primitive f53257a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b */
    public static final Primitive f53258b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c */
    public static final Primitive f53259c = new Primitive(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d */
    public static final Primitive f53260d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e */
    public static final Primitive f53261e = new Primitive(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f */
    public static final Primitive f53262f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g */
    public static final Primitive f53263g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h */
    public static final Primitive f53264h = new Primitive(JvmPrimitiveType.DOUBLE);

    /* JADX INFO: compiled from: Proguard */
    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i */
        public final JvmType f53265i;

        public Array(JvmType elementType) {
            Intrinsics.m18599g(elementType, "elementType");
            this.f53265i = elementType;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i */
        public final String f53266i;

        public Object(String internalName) {
            Intrinsics.m18599g(internalName, "internalName");
            this.f53266i = internalName;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i */
        public final JvmPrimitiveType f53267i;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            this.f53267i = jvmPrimitiveType;
        }
    }

    public final String toString() {
        return JvmTypeFactoryImpl.m19394c(this);
    }
}
