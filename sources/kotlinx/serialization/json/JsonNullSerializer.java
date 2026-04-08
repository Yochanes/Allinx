package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/json/JsonNullSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonNull;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class JsonNullSerializer implements KSerializer<JsonNull> {

    /* JADX INFO: renamed from: a */
    public static final JsonNullSerializer f56841a = new JsonNullSerializer();

    /* JADX INFO: renamed from: b */
    public static final SerialDescriptorImpl f56842b = SerialDescriptorsKt.m20952e("kotlinx.serialization.json.JsonNull", SerialKind.ENUM.f56641a, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        JsonElementSerializersKt.m21062a(decoder);
        if (decoder.mo11304u()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f56842b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        Intrinsics.m18599g(value, "value");
        JsonElementSerializersKt.m21063b(encoder);
        encoder.mo11313f();
    }
}
