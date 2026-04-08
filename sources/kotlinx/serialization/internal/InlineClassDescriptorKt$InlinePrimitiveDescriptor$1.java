package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlinx/serialization/internal/InlineClassDescriptorKt$InlinePrimitiveDescriptor$1", "Lkotlinx/serialization/internal/GeneratedSerializer;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class InlineClassDescriptorKt$InlinePrimitiveDescriptor$1 implements GeneratedSerializer<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KSerializer f56699a;

    public InlineClassDescriptorKt$InlinePrimitiveDescriptor$1(KSerializer kSerializer) {
        this.f56699a = kSerializer;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.f56699a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f56746a;
    }
}
