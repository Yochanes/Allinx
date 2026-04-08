package kotlinx.serialization.descriptors;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.internal.EnumDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"kotlinx/serialization/descriptors/SerialDescriptorKt$elementNames$1$1", "", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SerialDescriptorKt$elementNames$1$1 implements Iterator<String>, KMappedMarker {

    /* JADX INFO: renamed from: a */
    public int f56636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumDescriptor f56637b;

    public SerialDescriptorKt$elementNames$1$1(EnumDescriptor enumDescriptor) {
        this.f56637b = enumDescriptor;
        this.f56636a = enumDescriptor.f56737c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56636a > 0;
    }

    @Override // java.util.Iterator
    public final String next() {
        EnumDescriptor enumDescriptor = this.f56637b;
        int i = this.f56636a;
        this.f56636a = i - 1;
        return enumDescriptor.f56739e[enumDescriptor.f56737c - i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
