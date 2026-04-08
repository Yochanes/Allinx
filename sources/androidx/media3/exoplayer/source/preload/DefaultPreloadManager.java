package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultPreloadManager extends BasePreloadManager<Integer> {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends BasePreloadManager.BuilderBase<Integer> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class RankingDataComparator implements Comparator<Integer> {
        @Override // java.util.Comparator
        public final int compare(Integer num, Integer num2) {
            return Integer.compare(Math.abs(num.intValue()), Math.abs(num2.intValue()));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class SourcePreloadControl implements PreloadMediaSource.PreloadControl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Status implements TargetPreloadStatusControl.PreloadStatus {

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Stage {
        }
    }
}
