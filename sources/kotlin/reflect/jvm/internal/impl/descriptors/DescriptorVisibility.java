package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DescriptorVisibility {
    /* JADX INFO: renamed from: a */
    public abstract Visibility mo18906a();

    /* JADX INFO: renamed from: b */
    public abstract String mo18907b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor);

    /* JADX INFO: renamed from: d */
    public abstract DescriptorVisibility mo18908d();

    public final String toString() {
        return mo18906a().mo18985b();
    }
}
