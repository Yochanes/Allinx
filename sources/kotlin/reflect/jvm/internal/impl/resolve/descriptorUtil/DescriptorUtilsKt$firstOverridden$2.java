package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorUtilsKt$firstOverridden$2 extends DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f54391a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lambda f54392b;

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorUtilsKt$firstOverridden$2(Ref.ObjectRef objectRef, Function1 function1) {
        this.f54391a = objectRef;
        this.f54392b = (Lambda) function1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    /* JADX INFO: renamed from: a */
    public final Object mo18868a() {
        return (CallableMemberDescriptor) this.f54391a.f51659a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    /* JADX INFO: renamed from: b */
    public final void mo19974b(Object obj) {
        CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
        Intrinsics.m18599g(current, "current");
        Ref.ObjectRef objectRef = this.f54391a;
        if (objectRef.f51659a == null && ((Boolean) this.f54392b.invoke(current)).booleanValue()) {
            objectRef.f51659a = current;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
    /* JADX INFO: renamed from: c */
    public final boolean mo18672c(Object obj) {
        CallableMemberDescriptor current = (CallableMemberDescriptor) obj;
        Intrinsics.m18599g(current, "current");
        return this.f54391a.f51659a == null;
    }
}
