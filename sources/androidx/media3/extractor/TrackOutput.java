package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface TrackOutput {

    /* JADX INFO: compiled from: Proguard */
    public static final class CryptoData {

        /* JADX INFO: renamed from: a */
        public final int f28279a;

        /* JADX INFO: renamed from: b */
        public final byte[] f28280b;

        /* JADX INFO: renamed from: c */
        public final int f28281c;

        /* JADX INFO: renamed from: d */
        public final int f28282d;

        public CryptoData(int i, byte[] bArr, int i2, int i3) {
            this.f28279a = i;
            this.f28280b = bArr;
            this.f28281c = i2;
            this.f28282d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CryptoData.class == obj.getClass()) {
                CryptoData cryptoData = (CryptoData) obj;
                if (this.f28279a == cryptoData.f28279a && this.f28281c == cryptoData.f28281c && this.f28282d == cryptoData.f28282d && Arrays.equals(this.f28280b, cryptoData.f28280b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f28280b) + (this.f28279a * 31)) * 31) + this.f28281c) * 31) + this.f28282d;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    /* JADX INFO: renamed from: a */
    default int mo10799a(DataReader dataReader, int i, boolean z2) {
        return mo10561c(dataReader, i, z2);
    }

    /* JADX INFO: renamed from: b */
    void mo10560b(ParsableByteArray parsableByteArray, int i, int i2);

    /* JADX INFO: renamed from: c */
    int mo10561c(DataReader dataReader, int i, boolean z2);

    /* JADX INFO: renamed from: d */
    void mo10562d(Format format);

    /* JADX INFO: renamed from: e */
    default void mo10800e(int i, ParsableByteArray parsableByteArray) {
        mo10560b(parsableByteArray, i, 0);
    }

    /* JADX INFO: renamed from: f */
    void mo9961f(long j, int i, int i2, int i3, CryptoData cryptoData);

    /* JADX INFO: renamed from: g */
    default void mo9962g() {
    }
}
