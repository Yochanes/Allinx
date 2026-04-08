package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/JsonPrimitive;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@Serializable(with = JsonNullSerializer.class)
public final class JsonNull extends JsonPrimitive {

    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: c */
    public final String getF56838c() {
        return "null";
    }

    @NotNull
    public final KSerializer<JsonNull> serializer() {
        return JsonNullSerializer.f56841a;
    }
}
