package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DelegatedDescriptorVisibility extends DescriptorVisibility {

    /* JADX INFO: renamed from: a */
    public final Visibility f52242a;

    public DelegatedDescriptorVisibility(Visibility delegate) {
        Intrinsics.m18599g(delegate, "delegate");
        this.f52242a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    /* JADX INFO: renamed from: a */
    public final Visibility mo18906a() {
        return this.f52242a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    /* JADX INFO: renamed from: b */
    public final String mo18907b() {
        return this.f52242a.mo18985b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
    /* JADX INFO: renamed from: d */
    public final DescriptorVisibility mo18908d() {
        return DescriptorVisibilities.m18917g(this.f52242a.mo18987c());
    }
}
