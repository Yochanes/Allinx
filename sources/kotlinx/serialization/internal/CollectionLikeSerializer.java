package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Lkotlinx/serialization/internal/CollectionSerializer;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlinx/serialization/internal/ReferenceArraySerializer;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@SourceDebugExtension
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a */
    public final KSerializer f56670a;

    public CollectionLikeSerializer(KSerializer kSerializer) {
        this.f56670a = kSerializer;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: f */
    public void mo20987f(CompositeDecoder compositeDecoder, int i, Object obj) {
        mo20991i(i, obj, compositeDecoder.mo20960p(getDescriptor(), i, this.f56670a, null));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo20991i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Object obj) {
        int iMo20985d = mo20985d(obj);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderMo20979w = encoder.mo20979w(descriptor, iMo20985d);
        Iterator itMo20984c = mo20984c(obj);
        for (int i = 0; i < iMo20985d; i++) {
            compositeEncoderMo20979w.mo20966C(getDescriptor(), i, this.f56670a, itMo20984c.next());
        }
        compositeEncoderMo20979w.mo20968b(descriptor);
    }
}
