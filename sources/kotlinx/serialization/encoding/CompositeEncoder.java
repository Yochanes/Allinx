package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PrimitiveArrayDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/encoding/CompositeEncoder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface CompositeEncoder {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: C */
    void mo20966C(SerialDescriptor serialDescriptor, int i, SerializationStrategy serializationStrategy, Object obj);

    /* JADX INFO: renamed from: E */
    void mo20967E(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, double d);

    /* JADX INFO: renamed from: b */
    void mo20968b(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: i */
    void mo20969i(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, short s);

    /* JADX INFO: renamed from: j */
    void mo20970j(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, char c2);

    /* JADX INFO: renamed from: m */
    void mo20971m(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, boolean z2);

    /* JADX INFO: renamed from: n */
    void mo20972n(Object obj, SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: o */
    void mo20973o(int i, int i2, SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: r */
    void mo20974r(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, byte b2);

    /* JADX INFO: renamed from: t */
    void mo20976t(SerialDescriptor serialDescriptor, int i, String str);

    /* JADX INFO: renamed from: u */
    void mo20977u(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, float f);

    /* JADX INFO: renamed from: v */
    void mo20978v(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i, long j);

    /* JADX INFO: renamed from: x */
    Encoder mo20980x(PrimitiveArrayDescriptor primitiveArrayDescriptor, int i);

    /* JADX INFO: renamed from: z */
    boolean mo11911z(SerialDescriptor serialDescriptor, int i);
}
