package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DeprecationCausedByFunctionNInfo extends DescriptorBasedDeprecationInfo {

    /* JADX INFO: renamed from: a */
    public final JavaCallableMemberDescriptor f52722a;

    public DeprecationCausedByFunctionNInfo(JavaCallableMemberDescriptor target) {
        Intrinsics.m18599g(target, "target");
        this.f52722a = target;
    }
}
