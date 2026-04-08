package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class OverridingStrategy {
    /* JADX INFO: renamed from: a */
    public abstract void mo19044a(CallableMemberDescriptor callableMemberDescriptor);

    /* JADX INFO: renamed from: b */
    public void mo19211b(CallableMemberDescriptor member, Collection collection) {
        Intrinsics.m18599g(member, "member");
        member.mo18880r0(collection);
    }
}
