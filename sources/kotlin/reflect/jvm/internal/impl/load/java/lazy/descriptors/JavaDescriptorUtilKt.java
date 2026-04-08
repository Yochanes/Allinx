package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaDescriptorUtilKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m19243a(PropertyDescriptor propertyDescriptor) {
        Intrinsics.m18599g(propertyDescriptor, "<this>");
        return propertyDescriptor.getGetter() == null;
    }
}
