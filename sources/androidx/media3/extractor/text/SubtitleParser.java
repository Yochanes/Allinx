package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface SubtitleParser {

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {

        /* JADX INFO: renamed from: a */
        public static final Factory f28999a = new C19671();

        /* JADX INFO: renamed from: androidx.media3.extractor.text.SubtitleParser$Factory$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C19671 implements Factory {
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            /* JADX INFO: renamed from: a */
            public final int mo10953a(Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            /* JADX INFO: renamed from: b */
            public final SubtitleParser mo10954b(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            /* JADX INFO: renamed from: g */
            public final boolean mo10955g(Format format) {
                return false;
            }
        }

        /* JADX INFO: renamed from: a */
        int mo10953a(Format format);

        /* JADX INFO: renamed from: b */
        SubtitleParser mo10954b(Format format);

        /* JADX INFO: renamed from: g */
        boolean mo10955g(Format format);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class OutputOptions {

        /* JADX INFO: renamed from: c */
        public static final OutputOptions f29000c = new OutputOptions(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a */
        public final long f29001a;

        /* JADX INFO: renamed from: b */
        public final boolean f29002b;

        public OutputOptions(long j, boolean z2) {
            this.f29001a = j;
            this.f29002b = z2;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo10960a(byte[] bArr, int i, int i2, OutputOptions outputOptions, Consumer consumer);

    /* JADX INFO: renamed from: b */
    default Subtitle mo10961b(byte[] bArr, int i, int i2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        OutputOptions outputOptions = OutputOptions.f29000c;
        Objects.requireNonNull(builder);
        mo10960a(bArr, 0, i2, outputOptions, new C1968a(builder, 1));
        return new CuesWithTimingSubtitle(builder.build());
    }

    default void reset() {
    }
}
