package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public final class JsonElementSerializer implements KSerializer<JsonElement> {

    /* JADX INFO: renamed from: a */
    public static final JsonElementSerializer f56833a = new JsonElementSerializer();

    /* JADX INFO: renamed from: b */
    public static final SerialDescriptorImpl f56834b = SerialDescriptorsKt.m20951d("kotlinx.serialization.json.JsonElement", PolymorphicKind.SEALED.f56612a, new SerialDescriptor[0], new C6345a(0));

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        return JsonElementSerializersKt.m21062a(decoder).mo21057m();
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return f56834b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement value = (JsonElement) obj;
        Intrinsics.m18599g(value, "value");
        JsonElementSerializersKt.m21063b(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.mo11312e(JsonPrimitiveSerializer.f56849a, value);
        } else if (value instanceof JsonObject) {
            encoder.mo11312e(JsonObjectSerializer.f56844a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.mo11312e(JsonArraySerializer.f56812a, value);
        }
    }
}
