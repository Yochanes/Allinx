package androidx.os.serialization.serializers;

import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import androidx.os.SavedStateWriter;
import androidx.os.serialization.SavedStateDecoder;
import androidx.os.serialization.SavedStateEncoder;
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
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/savedstate/serialization/serializers/ParcelableSerializer;", "Landroid/os/Parcelable;", "T", "Lkotlinx/serialization/KSerializer;", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ParcelableSerializer<T extends Parcelable> implements KSerializer<T> {

    /* JADX INFO: renamed from: a */
    public final SerialDescriptorImpl f32082a = SerialDescriptorsKt.m20950c("android.os.Parcelable", new SerialDescriptor[0]);

    /* JADX INFO: renamed from: a */
    public final Parcelable m11929a(Decoder decoder) {
        if (!(decoder instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.m11913a(this.f32082a.f56622a, decoder).toString());
        }
        Intrinsics.m18599g(null, "source");
        String key = ((SavedStateDecoder) decoder).f32066a;
        KClass kClassMo18612b = Reflection.f51660a.mo18612b(Parcelable.class);
        Intrinsics.m18599g(key, "key");
        BundleCompat.m7634a(null, key, JvmClassMappingKt.m18572b(kClassMo18612b));
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m11930b(Encoder encoder, Parcelable value) {
        Intrinsics.m18599g(value, "value");
        if (!(encoder instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(BuiltInSerializerKt.m11914b(this.f32082a.f56622a, encoder).toString());
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) encoder;
        savedStateEncoder.getClass();
        SavedStateWriter.m11880c(null, savedStateEncoder.f32068a, value);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        m11929a(decoder);
        throw null;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f32082a;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m11930b(encoder, (Parcelable) obj);
    }
}
