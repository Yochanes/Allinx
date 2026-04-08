package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Extractor {

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReadResult {
    }

    /* JADX INFO: renamed from: a */
    void mo10503a(long j, long j2);

    /* JADX INFO: renamed from: f */
    boolean mo10504f(ExtractorInput extractorInput);

    /* JADX INFO: renamed from: g */
    void mo10505g(ExtractorOutput extractorOutput);

    /* JADX INFO: renamed from: h */
    default List mo10802h() {
        return ImmutableList.m14824of();
    }

    /* JADX INFO: renamed from: i */
    int mo10506i(ExtractorInput extractorInput, PositionHolder positionHolder);

    void release();

    /* JADX INFO: renamed from: b */
    default Extractor mo10801b() {
        return this;
    }
}
