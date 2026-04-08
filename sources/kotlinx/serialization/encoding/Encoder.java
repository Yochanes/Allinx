package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/encoding/Encoder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface Encoder {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static void m20981a(Encoder encoder, Object obj) {
            StringSerializer stringSerializer = StringSerializer.f56762a;
            StringSerializer.f56763b.getClass();
            if (obj == null) {
                encoder.mo11313f();
            } else {
                encoder.mo20975s();
                encoder.mo11312e(stringSerializer, obj);
            }
        }
    }

    /* JADX INFO: renamed from: A */
    void mo11900A(int i);

    /* JADX INFO: renamed from: B */
    Encoder mo11307B(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: D */
    void mo11901D(long j);

    /* JADX INFO: renamed from: F */
    void mo11902F(String str);

    /* JADX INFO: renamed from: a */
    SerializersModule mo11311a();

    /* JADX INFO: renamed from: c */
    CompositeEncoder mo11903c(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: e */
    void mo11312e(SerializationStrategy serializationStrategy, Object obj);

    /* JADX INFO: renamed from: f */
    void mo11313f();

    /* JADX INFO: renamed from: g */
    void mo11904g(double d);

    /* JADX INFO: renamed from: h */
    void mo11905h(short s);

    /* JADX INFO: renamed from: k */
    void mo11906k(byte b2);

    /* JADX INFO: renamed from: l */
    void mo11907l(boolean z2);

    /* JADX INFO: renamed from: p */
    void mo11908p(float f);

    /* JADX INFO: renamed from: q */
    void mo11909q(char c2);

    /* JADX INFO: renamed from: s */
    void mo20975s();

    /* JADX INFO: renamed from: w */
    CompositeEncoder mo20979w(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: y */
    void mo11910y(SerialDescriptor serialDescriptor, int i);
}
