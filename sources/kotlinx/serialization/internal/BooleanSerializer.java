package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/BooleanSerializer;", "Lkotlinx/serialization/KSerializer;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class BooleanSerializer implements KSerializer<Boolean> {

    /* JADX INFO: renamed from: a */
    public static final BooleanSerializer f56650a = new BooleanSerializer();

    /* JADX INFO: renamed from: b */
    public static final PrimitiveSerialDescriptor f56651b = new PrimitiveSerialDescriptor("kotlin.Boolean", PrimitiveKind.BOOLEAN.f56613a);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.mo11894g());
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f56651b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        encoder.mo11907l(((Boolean) obj).booleanValue());
    }
}
