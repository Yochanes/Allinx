package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeErrorReporter implements ErrorReporter {

    /* JADX INFO: renamed from: b */
    public static final RuntimeErrorReporter f52626b = new RuntimeErrorReporter();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    /* JADX INFO: renamed from: a */
    public final void mo19111a(ClassDescriptor descriptor, ArrayList arrayList) {
        Intrinsics.m18599g(descriptor, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter
    /* JADX INFO: renamed from: b */
    public final void mo19112b(CallableMemberDescriptor descriptor) {
        Intrinsics.m18599g(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }
}
