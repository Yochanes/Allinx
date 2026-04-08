package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder;", "", "Companion", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface CompositeDecoder {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/encoding/CompositeDecoder$Companion;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    SerializersModule mo11303a();

    /* JADX INFO: renamed from: b */
    void mo20953b(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: e */
    short mo20954e(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: f */
    float mo20955f(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: h */
    char mo20956h(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: k */
    byte mo20957k(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: l */
    boolean mo20958l(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: o */
    int mo20959o(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: p */
    Object mo20960p(SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj);

    /* JADX INFO: renamed from: r */
    long mo20961r(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: t */
    String mo20962t(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: v */
    int mo11305v(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: w */
    Object mo20963w(SerialDescriptor serialDescriptor, String str);

    /* JADX INFO: renamed from: y */
    Decoder mo20964y(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: z */
    double mo20965z(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);
}
