package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ReflectJavaArrayAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaArrayAnnotationArgument {

    /* JADX INFO: renamed from: b */
    public final Object[] f52652b;

    public ReflectJavaArrayAnnotationArgument(Name name, Object[] objArr) {
        super(name);
        this.f52652b = objArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument
    /* JADX INFO: renamed from: e */
    public final ArrayList mo19128e() {
        Object[] objArr = this.f52652b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Intrinsics.m18596d(obj);
            arrayList.add(ReflectJavaAnnotationArgument.Factory.m19124a(obj, null));
        }
        return arrayList;
    }
}
