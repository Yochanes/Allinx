package androidx.os.compose.serialization.serializers;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m18302d2 = {"Landroidx/savedstate/compose/serialization/serializers/MutableStateSerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroidx/compose/runtime/MutableState;", "savedstate-compose_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class MutableStateSerializer<T> implements KSerializer<MutableState<T>> {
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        decoder.mo11301A(null);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return null;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MutableState value = (MutableState) obj;
        Intrinsics.m18599g(value, "value");
        encoder.mo11312e(null, value.getF20325a());
        throw null;
    }
}
