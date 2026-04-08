package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ogg.FlacReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class StreamReader {

    /* JADX INFO: renamed from: b */
    public TrackOutput f28950b;

    /* JADX INFO: renamed from: c */
    public ExtractorOutput f28951c;

    /* JADX INFO: renamed from: d */
    public OggSeeker f28952d;

    /* JADX INFO: renamed from: e */
    public long f28953e;

    /* JADX INFO: renamed from: f */
    public long f28954f;

    /* JADX INFO: renamed from: g */
    public long f28955g;

    /* JADX INFO: renamed from: h */
    public int f28956h;

    /* JADX INFO: renamed from: i */
    public int f28957i;

    /* JADX INFO: renamed from: k */
    public long f28959k;

    /* JADX INFO: renamed from: l */
    public boolean f28960l;

    /* JADX INFO: renamed from: m */
    public boolean f28961m;

    /* JADX INFO: renamed from: a */
    public final OggPacket f28949a = new OggPacket();

    /* JADX INFO: renamed from: j */
    public SetupData f28958j = new SetupData();

    /* JADX INFO: compiled from: Proguard */
    public static class SetupData {

        /* JADX INFO: renamed from: a */
        public Format f28962a;

        /* JADX INFO: renamed from: b */
        public FlacReader.FlacOggSeeker f28963b;
    }

    /* JADX INFO: renamed from: a */
    public void mo10947a(long j) {
        this.f28955g = j;
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo10938b(ParsableByteArray parsableByteArray);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo10939c(ParsableByteArray parsableByteArray, long j, SetupData setupData);

    /* JADX INFO: renamed from: d */
    public void mo10940d(boolean z2) {
        if (z2) {
            this.f28958j = new SetupData();
            this.f28954f = 0L;
            this.f28956h = 0;
        } else {
            this.f28956h = 1;
        }
        this.f28953e = -1L;
        this.f28955g = 0L;
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnseekableOggSeeker implements OggSeeker {
        @Override // androidx.media3.extractor.ogg.OggSeeker
        /* JADX INFO: renamed from: a */
        public final long mo10935a(DefaultExtractorInput defaultExtractorInput) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        /* JADX INFO: renamed from: b */
        public final SeekMap mo10936b() {
            return new SeekMap.Unseekable(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        /* JADX INFO: renamed from: c */
        public final void mo10937c(long j) {
        }
    }
}
