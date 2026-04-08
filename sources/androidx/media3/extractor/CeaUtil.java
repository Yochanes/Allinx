package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CeaUtil {
    /* JADX INFO: renamed from: a */
    public static void m10778a(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i;
        while (true) {
            if (parsableByteArray.m9548a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (parsableByteArray.m9548a() == 0) {
                    i = -1;
                    break;
                }
                int iM9568u = parsableByteArray.m9568u();
                i2 += iM9568u;
                if (iM9568u != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (parsableByteArray.m9548a() == 0) {
                    i3 = -1;
                    break;
                }
                int iM9568u2 = parsableByteArray.m9568u();
                i3 += iM9568u2;
                if (iM9568u2 != 255) {
                    break;
                }
            }
            int i4 = parsableByteArray.f25645b + i3;
            if (i3 == -1 || i3 > parsableByteArray.m9548a()) {
                Log.m9511g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = parsableByteArray.f25646c;
            } else if (i == 4 && i3 >= 8) {
                int iM9568u3 = parsableByteArray.m9568u();
                int iM9540A = parsableByteArray.m9540A();
                int iM9554g = iM9540A == 49 ? parsableByteArray.m9554g() : 0;
                int iM9568u4 = parsableByteArray.m9568u();
                if (iM9540A == 47) {
                    parsableByteArray.m9547H(1);
                }
                boolean z2 = iM9568u3 == 181 && (iM9540A == 49 || iM9540A == 47) && iM9568u4 == 3;
                if (iM9540A == 49) {
                    z2 &= iM9554g == 1195456820;
                }
                if (z2) {
                    m10779b(j, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.m9546G(i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10779b(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int iM9568u = parsableByteArray.m9568u();
        if ((iM9568u & 64) != 0) {
            parsableByteArray.m9547H(1);
            int i = (iM9568u & 31) * 3;
            int i2 = parsableByteArray.f25645b;
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.m9546G(i2);
                trackOutput.mo10800e(i, parsableByteArray);
                Assertions.m9464e(j != -9223372036854775807L);
                trackOutput.mo9961f(j, 1, i, 0, null);
            }
        }
    }
}
