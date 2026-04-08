package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends ObservableProperty<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DescriptorRendererOptionsImpl f54303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.f54303a = descriptorRendererOptionsImpl;
    }

    @Override // kotlin.properties.ObservableProperty
    public final boolean beforeChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.m18599g(property, "property");
        if (this.f54303a.f54276a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
