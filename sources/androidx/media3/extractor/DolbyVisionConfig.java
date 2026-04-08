package androidx.media3.extractor;

import androidx.compose.animation.AbstractC0455a;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DolbyVisionConfig {

    /* JADX INFO: renamed from: a */
    public final String f28196a;

    public DolbyVisionConfig(String str) {
        this.f28196a = str;
    }

    /* JADX INFO: renamed from: a */
    public static DolbyVisionConfig m10796a(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.m9547H(2);
        int iM9568u = parsableByteArray.m9568u();
        int i = iM9568u >> 1;
        int iM9568u2 = ((parsableByteArray.m9568u() >> 3) & 31) | ((iM9568u & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM2244s = AbstractC0455a.m2244s(str);
        sbM2244s.append(i < 10 ? ".0" : ".");
        sbM2244s.append(i);
        sbM2244s.append(iM9568u2 < 10 ? ".0" : ".");
        sbM2244s.append(iM9568u2);
        return new DolbyVisionConfig(sbM2244s.toString());
    }
}
