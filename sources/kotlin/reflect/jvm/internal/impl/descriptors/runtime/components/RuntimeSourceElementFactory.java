package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeSourceElementFactory implements JavaSourceElementFactory {

    /* JADX INFO: renamed from: a */
    public static final RuntimeSourceElementFactory f52629a = new RuntimeSourceElementFactory();

    /* JADX INFO: compiled from: Proguard */
    public static final class RuntimeSourceElement implements JavaSourceElement {

        /* JADX INFO: renamed from: b */
        public final ReflectJavaElement f52630b;

        public RuntimeSourceElement(ReflectJavaElement javaElement) {
            Intrinsics.m18599g(javaElement, "javaElement");
            this.f52630b = javaElement;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement
        /* JADX INFO: renamed from: a */
        public final ReflectJavaElement mo19114a() {
            return this.f52630b;
        }

        public final String toString() {
            return RuntimeSourceElement.class.getName() + ": " + this.f52630b;
        }
    }

    /* JADX INFO: renamed from: a */
    public final RuntimeSourceElement m19113a(JavaElement javaElement) {
        Intrinsics.m18599g(javaElement, "javaElement");
        return new RuntimeSourceElement((ReflectJavaElement) javaElement);
    }
}
