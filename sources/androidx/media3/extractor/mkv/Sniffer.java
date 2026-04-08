package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Sniffer {

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f28675a = new ParsableByteArray(8);

    /* JADX INFO: renamed from: b */
    public int f28676b;

    /* JADX INFO: renamed from: a */
    public final long m10887a(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = this.f28675a;
        int i = 0;
        defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 0, 1, false);
        int i2 = parsableByteArray.f25644a[0] & UnsignedBytes.MAX_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        defaultExtractorInput.mo10781c(parsableByteArray.f25644a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (parsableByteArray.f25644a[i] & UnsignedBytes.MAX_VALUE) + (i5 << 8);
        }
        this.f28676b = i4 + 1 + this.f28676b;
        return i5;
    }
}
