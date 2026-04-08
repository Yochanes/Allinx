package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ClassDescriptorFactory {
    /* JADX INFO: renamed from: a */
    Collection mo18816a(FqName fqName);

    /* JADX INFO: renamed from: b */
    boolean mo18817b(FqName fqName, Name name);

    /* JADX INFO: renamed from: c */
    ClassDescriptor mo18818c(ClassId classId);
}
