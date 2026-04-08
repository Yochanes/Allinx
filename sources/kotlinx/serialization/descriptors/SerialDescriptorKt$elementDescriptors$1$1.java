package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"kotlinx/serialization/descriptors/SerialDescriptorKt$elementDescriptors$1$1", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SerialDescriptorKt$elementDescriptors$1$1 implements Iterator<SerialDescriptor>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public int f56634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SerialDescriptor f56635b;

    public SerialDescriptorKt$elementDescriptors$1$1(SerialDescriptor serialDescriptor) {
        this.f56635b = serialDescriptor;
        this.f56634a = serialDescriptor.mo20942e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56634a > 0;
    }

    @Override // java.util.Iterator
    public final SerialDescriptor next() {
        SerialDescriptor serialDescriptor = this.f56635b;
        int iMo20942e = serialDescriptor.mo20942e();
        int i = this.f56634a;
        this.f56634a = i - 1;
        return serialDescriptor.mo20945h(iMo20942e - i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
