package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "Builder", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, KMutableList {
    }

    @Override // java.util.List
    PersistentList add(int i, Object obj);

    @Override // java.util.List, java.util.Collection
    PersistentList add(Object obj);

    @Override // java.util.List, java.util.Collection
    PersistentList addAll(Collection collection);

    /* JADX INFO: renamed from: b */
    PersistentVectorBuilder mo4593b();

    @Override // java.util.List, java.util.Collection
    PersistentList remove(Object obj);

    @Override // java.util.List, java.util.Collection
    PersistentList removeAll(Collection collection);

    @Override // java.util.List
    PersistentList set(int i, Object obj);

    /* JADX INFO: renamed from: x */
    PersistentList mo4594x(int i);

    /* JADX INFO: renamed from: z */
    PersistentList mo4595z(Function1 function1);
}
