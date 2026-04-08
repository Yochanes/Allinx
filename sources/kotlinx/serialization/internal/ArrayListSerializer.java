package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/serialization/internal/ArrayListSerializer;", "E", "Lkotlinx/serialization/internal/CollectionSerializer;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
@InternalSerializationApi
public final class ArrayListSerializer<E> extends CollectionSerializer<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b */
    public final ArrayListClassDesc f56646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayListSerializer(KSerializer element) {
        super(element);
        Intrinsics.m18599g(element, "element");
        SerialDescriptor elementDesc = element.getDescriptor();
        Intrinsics.m18599g(elementDesc, "elementDesc");
        this.f56646b = new ArrayListClassDesc(elementDesc);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: a */
    public final Object mo20982a() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: b */
    public final int mo20983b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.m18599g(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: g */
    public final Object mo20988g(Object obj) {
        Intrinsics.m18599g(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return this.f56646b;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    /* JADX INFO: renamed from: h */
    public final Object mo20989h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.m18599g(arrayList, "<this>");
        return arrayList;
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    /* JADX INFO: renamed from: i */
    public final void mo20991i(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.m18599g(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
