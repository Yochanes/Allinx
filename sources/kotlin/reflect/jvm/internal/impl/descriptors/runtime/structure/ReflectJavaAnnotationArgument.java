package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ReflectJavaAnnotationArgument implements JavaAnnotationArgument {

    /* JADX INFO: renamed from: a */
    public final Name f52650a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory {
        /* JADX INFO: renamed from: a */
        public static ReflectJavaAnnotationArgument m19124a(Object obj, Name name) {
            Class<?> cls = obj.getClass();
            List list = ReflectClassUtilKt.f52643a;
            return Enum.class.isAssignableFrom(cls) ? new ReflectJavaEnumValueAnnotationArgument(name, (Enum) obj) : obj instanceof Annotation ? new ReflectJavaAnnotationAsAnnotationArgument(name, (Annotation) obj) : obj instanceof Object[] ? new ReflectJavaArrayAnnotationArgument(name, (Object[]) obj) : obj instanceof Class ? new ReflectJavaClassObjectAnnotationArgument(name, (Class) obj) : new ReflectJavaLiteralAnnotationArgument(obj, name);
        }
    }

    public ReflectJavaAnnotationArgument(Name name) {
        this.f52650a = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument
    public final Name getName() {
        return this.f52650a;
    }
}
