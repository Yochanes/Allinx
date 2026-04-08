package androidx.os.serialization.serializers;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", "T", "Lkotlinx/serialization/KSerializer;", "Landroid/util/SparseArray;", "SparseArraySurrogate", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SparseArraySerializer<T> implements KSerializer<SparseArray<T>> {

    /* JADX INFO: renamed from: a */
    public final KSerializer f32089a;

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor f32090b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u0003*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0004\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "T", "", "Companion", "$serializer", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @Serializable
    @SuppressLint({"UnsafeOptInUsageError"})
    public static final class SparseArraySurrogate<T> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c */
        public static final Lazy[] f32091c = {LazyKt.m18298a(LazyThreadSafetyMode.f51422b, new C2197a()), null};

        /* JADX INFO: renamed from: d */
        public static final PluginGeneratedSerialDescriptor f32092d;

        /* JADX INFO: renamed from: a */
        public final List f32093a;

        /* JADX INFO: renamed from: b */
        public final List f32094b;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00050\u0003\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
            @NotNull
            public final <T> KSerializer<SparseArraySurrogate<T>> serializer(@NotNull KSerializer<T> typeSerial0) {
                Intrinsics.m18599g(typeSerial0, "typeSerial0");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(typeSerial0);
            }
        }

        static {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            pluginGeneratedSerialDescriptor.m21022j(UserMetadata.KEYDATA_FILENAME, false);
            pluginGeneratedSerialDescriptor.m21022j("values", false);
            f32092d = pluginGeneratedSerialDescriptor;
        }

        public /* synthetic */ SparseArraySurrogate(int i, List list, List list2) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.m21021a(i, 3, f32092d);
                throw null;
            }
            this.f32093a = list;
            this.f32094b = list2;
        }

        public SparseArraySurrogate(ArrayList arrayList, ArrayList arrayList2) {
            this.f32093a = arrayList;
            this.f32094b = arrayList2;
        }
    }

    public SparseArraySerializer(KSerializer elementSerializer) {
        Intrinsics.m18599g(elementSerializer, "elementSerializer");
        KSerializer<SparseArraySurrogate<T>> kSerializerSerializer = SparseArraySurrogate.INSTANCE.serializer(elementSerializer);
        this.f32089a = kSerializerSerializer;
        this.f32090b = kSerializerSerializer.getF32090b();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) decoder.mo11301A(this.f32089a);
        int size = sparseArraySurrogate.f32093a.size();
        List list = sparseArraySurrogate.f32094b;
        if (size != list.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list2 = sparseArraySurrogate.f32093a;
        SparseArray sparseArray = new SparseArray(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            sparseArray.append(((Number) list2.get(i)).intValue(), list.get(i));
        }
        return sparseArray;
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final SerialDescriptor getF32090b() {
        return this.f32090b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SparseArray value = (SparseArray) obj;
        Intrinsics.m18599g(value, "value");
        int size = value.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(value.keyAt(i)));
        }
        int size2 = value.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList2.add(value.valueAt(i2));
        }
        encoder.mo11312e(this.f32089a, new SparseArraySurrogate(arrayList, arrayList2));
    }
}
