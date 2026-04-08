package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.FlacStreamMetadata;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FlacMetadataReader {

    /* JADX INFO: compiled from: Proguard */
    public static final class FlacStreamMetadataHolder {

        /* JADX INFO: renamed from: a */
        public FlacStreamMetadata f28211a;
    }

    /* JADX INFO: renamed from: a */
    public static FlacStreamMetadata.SeekTable m10806a(ParsableByteArray parsableByteArray) {
        parsableByteArray.m9547H(1);
        int iM9571x = parsableByteArray.m9571x();
        long j = ((long) parsableByteArray.f25645b) + ((long) iM9571x);
        int i = iM9571x / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jM9562o = parsableByteArray.m9562o();
            if (jM9562o == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM9562o;
            jArrCopyOf2[i2] = parsableByteArray.m9562o();
            parsableByteArray.m9547H(2);
            i2++;
        }
        parsableByteArray.m9547H((int) (j - ((long) parsableByteArray.f25645b)));
        return new FlacStreamMetadata.SeekTable(jArrCopyOf, jArrCopyOf2);
    }
}
