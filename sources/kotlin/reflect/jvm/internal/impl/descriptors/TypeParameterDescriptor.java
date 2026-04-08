package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    TypeParameterDescriptor mo18872a();

    /* JADX INFO: renamed from: b0 */
    StorageManager mo18882b0();

    int getIndex();

    List getUpperBounds();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    /* JADX INFO: renamed from: h */
    TypeConstructor mo18830h();

    /* JADX INFO: renamed from: i0 */
    boolean mo18883i0();

    /* JADX INFO: renamed from: k */
    Variance mo18884k();

    /* JADX INFO: renamed from: y */
    boolean mo18886y();
}
