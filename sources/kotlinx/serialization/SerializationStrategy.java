package kotlinx.serialization;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/SerializationStrategy;", "T", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface SerializationStrategy<T> {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, Object obj);
}
