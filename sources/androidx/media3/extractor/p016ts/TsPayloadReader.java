package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface TsPayloadReader {

    /* JADX INFO: compiled from: Proguard */
    public static final class DvbSubtitleInfo {

        /* JADX INFO: renamed from: a */
        public final String f29748a;

        /* JADX INFO: renamed from: b */
        public final byte[] f29749b;

        public DvbSubtitleInfo(String str, byte[] bArr) {
            this.f29748a = str;
            this.f29749b = bArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EsInfo {

        /* JADX INFO: renamed from: a */
        public final String f29750a;

        /* JADX INFO: renamed from: b */
        public final int f29751b;

        /* JADX INFO: renamed from: c */
        public final List f29752c;

        /* JADX INFO: renamed from: d */
        public final byte[] f29753d;

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioType {
        }

        public EsInfo(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
            this.f29750a = str;
            this.f29751b = i2;
            this.f29752c = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
            this.f29753d = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final int m11080a() {
            int i = this.f29751b;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TrackIdGenerator {

        /* JADX INFO: renamed from: a */
        public final String f29754a;

        /* JADX INFO: renamed from: b */
        public final int f29755b;

        /* JADX INFO: renamed from: c */
        public final int f29756c;

        /* JADX INFO: renamed from: d */
        public int f29757d;

        /* JADX INFO: renamed from: e */
        public String f29758e;

        public TrackIdGenerator(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* JADX INFO: renamed from: a */
        public final void m11081a() {
            int i = this.f29757d;
            this.f29757d = i == Integer.MIN_VALUE ? this.f29755b : i + this.f29756c;
            this.f29758e = this.f29754a + this.f29757d;
        }

        /* JADX INFO: renamed from: b */
        public final void m11082b() {
            if (this.f29757d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public TrackIdGenerator(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + RemoteSettings.FORWARD_SLASH_STRING;
            } else {
                str = "";
            }
            this.f29754a = str;
            this.f29755b = i2;
            this.f29756c = i3;
            this.f29757d = Integer.MIN_VALUE;
            this.f29758e = "";
        }
    }

    /* JADX INFO: renamed from: a */
    void mo11070a();

    /* JADX INFO: renamed from: b */
    void mo11071b(int i, ParsableByteArray parsableByteArray);

    /* JADX INFO: renamed from: c */
    void mo11072c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);
}
