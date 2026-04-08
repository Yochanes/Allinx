package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface TrackSelection {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* JADX INFO: renamed from: a */
    TrackGroup mo10520a();

    /* JADX INFO: renamed from: e */
    Format mo10523e(int i);

    /* JADX INFO: renamed from: g */
    int mo10525g(int i);

    int length();

    /* JADX INFO: renamed from: m */
    int mo10531m(int i);
}
