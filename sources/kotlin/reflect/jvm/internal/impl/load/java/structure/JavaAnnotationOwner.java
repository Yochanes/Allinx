package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface JavaAnnotationOwner extends JavaElement {
    Collection getAnnotations();

    /* JADX INFO: renamed from: h */
    JavaAnnotation mo19137h(FqName fqName);
}
