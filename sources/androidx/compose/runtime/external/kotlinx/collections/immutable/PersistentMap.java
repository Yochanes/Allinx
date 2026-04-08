package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "Builder", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "K", "V", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface Builder<K, V> extends Map<K, V>, KMutableMap {
        PersistentMap build();
    }

    /* JADX INFO: renamed from: b */
    Builder mo4400b();
}
