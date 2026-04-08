package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/internal/CollectionLikeSerializer;", "Lkotlinx/serialization/internal/MapLikeSerializer;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@InternalSerializationApi
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    /* JADX INFO: renamed from: a */
    public abstract Object mo20982a();

    /* JADX INFO: renamed from: b */
    public abstract int mo20983b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Iterator mo20984c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract int mo20985d(Object obj);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Object deserialize(Decoder decoder) {
        return m20986e(decoder);
    }

    /* JADX INFO: renamed from: e */
    public final Object m20986e(Decoder decoder) {
        Object objMo20982a = mo20982a();
        int iMo20983b = mo20983b(objMo20982a);
        CompositeDecoder compositeDecoderMo11893c = decoder.mo11893c(getDescriptor());
        while (true) {
            int iMo11305v = compositeDecoderMo11893c.mo11305v(getDescriptor());
            if (iMo11305v == -1) {
                compositeDecoderMo11893c.mo20953b(getDescriptor());
                return mo20989h(objMo20982a);
            }
            mo20987f(compositeDecoderMo11893c, iMo11305v + iMo20983b, objMo20982a);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo20987f(CompositeDecoder compositeDecoder, int i, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract Object mo20988g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo20989h(Object obj);
}
