package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "SubList", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, KMappedMarker {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Lkotlin/collections/AbstractList;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class SubList<E> extends AbstractList<E> implements ImmutableList<E> {

        /* JADX INFO: renamed from: a */
        public final ImmutableList f16754a;

        /* JADX INFO: renamed from: b */
        public final int f16755b;

        /* JADX INFO: renamed from: c */
        public final int f16756c;

        public SubList(ImmutableList immutableList, int i, int i2) {
            this.f16754a = immutableList;
            this.f16755b = i;
            ListImplementation.m4723c(i, i2, immutableList.size());
            this.f16756c = i2 - i;
        }

        @Override // kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getF16756c() {
            return this.f16756c;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final Object get(int i) {
            ListImplementation.m4721a(i, this.f16756c);
            return this.f16754a.get(this.f16755b + i);
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            ListImplementation.m4723c(i, i2, this.f16756c);
            int i3 = this.f16755b;
            return new SubList(this.f16754a, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    default ImmutableList subList(int i, int i2) {
        return new SubList(this, i, i2);
    }
}
