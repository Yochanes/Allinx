package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DeserializedAnnotations implements Annotations {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ KProperty[] f54633b;

    /* JADX INFO: renamed from: a */
    public final NotNullLazyValue f54634a;

    static {
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f54633b = new KProperty[]{reflectionFactory.mo18618h(new PropertyReference1Impl(reflectionFactory.mo18612b(DeserializedAnnotations.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public DeserializedAnnotations(LockBasedStorageManager storageManager, Function0 function0) {
        Intrinsics.m18599g(storageManager, "storageManager");
        this.f54634a = storageManager.mo20076a(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: H */
    public final boolean mo18994H(FqName fqName) {
        return Annotations.DefaultImpls.m18998b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: h */
    public final AnnotationDescriptor mo18995h(FqName fqName) {
        return Annotations.DefaultImpls.m18997a(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return ((List) StorageKt.m20097a(this.f54634a, f54633b[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return ((List) StorageKt.m20097a(this.f54634a, f54633b[0])).iterator();
    }
}
