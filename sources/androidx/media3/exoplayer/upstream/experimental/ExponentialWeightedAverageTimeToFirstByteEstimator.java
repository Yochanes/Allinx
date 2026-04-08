package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements TimeToFirstByteEstimator {

    /* JADX INFO: compiled from: Proguard */
    public static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry entry) {
            return size() > 0;
        }
    }
}
