package androidx.os.serialization.serializers;

import androidx.core.os.BundleCompat;
import androidx.os.serialization.SavedStateDecoder;
import androidx.os.serialization.SavedStateEncoder;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/savedstate/serialization/serializers/JavaSerializableSerializer;", "Ljava/io/Serializable;", "T", "Lkotlinx/serialization/KSerializer;", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class JavaSerializableSerializer<T extends Serializable> implements KSerializer<T> {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptorImpl f32078a = SerialDescriptorsKt.m20950c("java.io.Serializable", new SerialDescriptor[0]);

    /* JADX INFO: renamed from: a */
    public final Serializable m11923a(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.m11913a(this.f32078a.f56622a, decoder).toString());
        }
        Intrinsics.m18599g(null, "source");
        String key = ((SavedStateDecoder) decoder).f32066a;
        KClass kClassMo18612b = Reflection.f51660a.mo18612b(Serializable.class);
        Intrinsics.m18599g(key, "key");
        BundleCompat.m7637d(null, key, JvmClassMappingKt.m18572b(kClassMo18612b));
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m11924b(Encoder encoder, Serializable value) {
        Intrinsics.m18599g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.m11914b(this.f32078a.f56622a, encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        savedStateEncoder.getClass();
        String key = savedStateEncoder.f32068a;
        Intrinsics.m18599g(key, "key");
        throw null;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        m11923a(decoder);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f32078a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m11924b(encoder, (Serializable) obj);
    }
}
