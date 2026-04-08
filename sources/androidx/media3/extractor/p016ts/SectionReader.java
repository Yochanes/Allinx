package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.p016ts.TsPayloadReader;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SectionReader implements TsPayloadReader {

    /* JADX INFO: renamed from: a */
    public final SectionPayloadReader f29702a;

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f29703b = new ParsableByteArray(32);

    /* JADX INFO: renamed from: c */
    public int f29704c;

    /* JADX INFO: renamed from: d */
    public int f29705d;

    /* JADX INFO: renamed from: e */
    public boolean f29706e;

    /* JADX INFO: renamed from: f */
    public boolean f29707f;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.f29702a = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.p016ts.TsPayloadReader
    /* JADX INFO: renamed from: a */
    public final void mo11070a() {
        this.f29707f = true;
    }

    @Override // androidx.media3.extractor.p016ts.TsPayloadReader
    /* JADX INFO: renamed from: b */
    public final void mo11071b(int i, ParsableByteArray parsableByteArray) {
        boolean z2 = (i & 1) != 0;
        int iM9568u = z2 ? parsableByteArray.f25645b + parsableByteArray.m9568u() : -1;
        if (this.f29707f) {
            if (!z2) {
                return;
            }
            this.f29707f = false;
            parsableByteArray.m9546G(iM9568u);
            this.f29705d = 0;
        }
        while (parsableByteArray.m9548a() > 0) {
            int i2 = this.f29705d;
            ParsableByteArray parsableByteArray2 = this.f29703b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iM9568u2 = parsableByteArray.m9568u();
                    parsableByteArray.m9546G(parsableByteArray.f25645b - 1);
                    if (iM9568u2 == 255) {
                        this.f29707f = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.m9548a(), 3 - this.f29705d);
                parsableByteArray.m9552e(parsableByteArray2.f25644a, this.f29705d, iMin);
                int i3 = this.f29705d + iMin;
                this.f29705d = i3;
                if (i3 == 3) {
                    parsableByteArray2.m9546G(0);
                    parsableByteArray2.m9545F(3);
                    parsableByteArray2.m9547H(1);
                    int iM9568u3 = parsableByteArray2.m9568u();
                    int iM9568u4 = parsableByteArray2.m9568u();
                    this.f29706e = (iM9568u3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                    int i4 = (((iM9568u3 & 15) << 8) | iM9568u4) + 3;
                    this.f29704c = i4;
                    byte[] bArr = parsableByteArray2.f25644a;
                    if (bArr.length < i4) {
                        parsableByteArray2.m9549b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.m9548a(), this.f29704c - this.f29705d);
                parsableByteArray.m9552e(parsableByteArray2.f25644a, this.f29705d, iMin2);
                int i5 = this.f29705d + iMin2;
                this.f29705d = i5;
                int i6 = this.f29704c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f29706e) {
                        parsableByteArray2.m9545F(i6);
                    } else {
                        if (Util.m9621l(0, parsableByteArray2.f25644a, i6, -1) != 0) {
                            this.f29707f = true;
                            return;
                        }
                        parsableByteArray2.m9545F(this.f29704c - 4);
                    }
                    parsableByteArray2.m9546G(0);
                    this.f29702a.mo11068b(parsableByteArray2);
                    this.f29705d = 0;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.p016ts.TsPayloadReader
    /* JADX INFO: renamed from: c */
    public final void mo11072c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f29702a.mo11069c(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.f29707f = true;
    }
}
