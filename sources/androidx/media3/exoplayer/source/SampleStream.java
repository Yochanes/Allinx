package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface SampleStream {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadDataResult {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadFlags {
    }

    /* JADX INFO: renamed from: a */
    boolean mo10476a();

    /* JADX INFO: renamed from: h */
    void mo10477h();

    /* JADX INFO: renamed from: j */
    int mo10478j(long j);

    /* JADX INFO: renamed from: n */
    int mo10479n(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i);
}
