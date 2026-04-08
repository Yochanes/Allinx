package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* JADX INFO: renamed from: a */
    public final Field f52670a;

    public ReflectJavaField(Field member) {
        Intrinsics.m18599g(member, "member");
        this.f52670a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    /* JADX INFO: renamed from: H */
    public final Member mo19152H() {
        return this.f52670a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final JavaType getType() {
        Type genericType = this.f52670a.getGenericType();
        Intrinsics.m18598f(genericType, "member.genericType");
        return ReflectJavaType.Factory.m19164a(genericType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    /* JADX INFO: renamed from: z */
    public final boolean mo19156z() {
        return this.f52670a.isEnumConstant();
    }
}
