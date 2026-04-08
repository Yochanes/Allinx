package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/json/JsonElement;", "Companion", "Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonNull;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@Serializable(with = JsonPrimitiveSerializer.class)
public abstract class JsonPrimitive extends JsonElement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/serialization/json/JsonPrimitive$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<JsonPrimitive> serializer() {
            return JsonPrimitiveSerializer.f56849a;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo21067c();

    public String toString() {
        return mo21067c();
    }
}
