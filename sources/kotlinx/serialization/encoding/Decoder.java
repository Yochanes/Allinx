package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/encoding/Decoder;", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface Decoder {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: A */
    Object mo11301A(DeserializationStrategy deserializationStrategy);

    /* JADX INFO: renamed from: B */
    byte mo11889B();

    /* JADX INFO: renamed from: C */
    short mo11890C();

    /* JADX INFO: renamed from: D */
    float mo11891D();

    /* JADX INFO: renamed from: E */
    double mo11892E();

    /* JADX INFO: renamed from: a */
    SerializersModule mo11303a();

    /* JADX INFO: renamed from: c */
    CompositeDecoder mo11893c(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: g */
    boolean mo11894g();

    /* JADX INFO: renamed from: i */
    char mo11895i();

    /* JADX INFO: renamed from: j */
    int mo11896j(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: n */
    int mo11897n();

    /* JADX INFO: renamed from: q */
    String mo11898q();

    /* JADX INFO: renamed from: s */
    long mo11899s();

    /* JADX INFO: renamed from: u */
    boolean mo11304u();

    /* JADX INFO: renamed from: x */
    Decoder mo11306x(SerialDescriptor serialDescriptor);
}
