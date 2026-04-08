package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/serialization/ContextualSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ExperimentalSerializationApi
public final class ContextualSerializer<T> implements KSerializer<T> {
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.mo11303a().mo21161a(null, null);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.m18599g(value, "value");
        encoder.mo11311a().mo21161a(null, null);
        throw null;
    }
}
