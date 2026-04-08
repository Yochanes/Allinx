package androidx.media3.extractor.text;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;
import java.io.EOFException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SubtitleTranscodingTrackOutput implements TrackOutput {

    /* JADX INFO: renamed from: a */
    public final TrackOutput f29008a;

    /* JADX INFO: renamed from: b */
    public final SubtitleParser.Factory f29009b;

    /* JADX INFO: renamed from: g */
    public SubtitleParser f29014g;

    /* JADX INFO: renamed from: h */
    public Format f29015h;

    /* JADX INFO: renamed from: i */
    public boolean f29016i;

    /* JADX INFO: renamed from: d */
    public int f29011d = 0;

    /* JADX INFO: renamed from: e */
    public int f29012e = 0;

    /* JADX INFO: renamed from: f */
    public byte[] f29013f = Util.f25667c;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f29010c = new ParsableByteArray();

    public SubtitleTranscodingTrackOutput(TrackOutput trackOutput, SubtitleParser.Factory factory) {
        this.f29008a = trackOutput;
        this.f29009b = factory;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: b */
    public final void mo10560b(ParsableByteArray parsableByteArray, int i, int i2) {
        if (this.f29014g == null) {
            this.f29008a.mo10560b(parsableByteArray, i, i2);
            return;
        }
        m10962h(i);
        parsableByteArray.m9552e(this.f29013f, this.f29012e, i);
        this.f29012e += i;
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: c */
    public final int mo10561c(DataReader dataReader, int i, boolean z2) throws EOFException {
        if (this.f29014g == null) {
            return this.f29008a.mo10561c(dataReader, i, z2);
        }
        m10962h(i);
        int i2 = dataReader.read(this.f29013f, this.f29012e, i);
        if (i2 != -1) {
            this.f29012e += i2;
            return i2;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: d */
    public final void mo10562d(Format format) {
        format.f25161n.getClass();
        String str = format.f25161n;
        Assertions.m9460a(MimeTypes.m9337h(str) == 3);
        boolean zEquals = format.equals(this.f29015h);
        SubtitleParser.Factory factory = this.f29009b;
        if (!zEquals) {
            this.f29015h = format;
            this.f29014g = factory.mo10955g(format) ? factory.mo10954b(format) : null;
        }
        SubtitleParser subtitleParser = this.f29014g;
        TrackOutput trackOutput = this.f29008a;
        if (subtitleParser == null) {
            trackOutput.mo10562d(format);
            return;
        }
        Format.Builder builderM9248a = format.m9248a();
        builderM9248a.f25198m = MimeTypes.m9342m("application/x-media3-cues");
        builderM9248a.f25195j = str;
        builderM9248a.f25203r = Long.MAX_VALUE;
        builderM9248a.f25182I = factory.mo10953a(format);
        trackOutput.mo10562d(new Format(builderM9248a));
    }

    @Override // androidx.media3.extractor.TrackOutput
    /* JADX INFO: renamed from: f */
    public final void mo9961f(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        if (this.f29014g == null) {
            this.f29008a.mo9961f(j, i, i2, i3, cryptoData);
            return;
        }
        Assertions.m9461b(cryptoData == null, "DRM on subtitles is not supported");
        int i4 = (this.f29012e - i3) - i2;
        try {
            this.f29014g.mo10960a(this.f29013f, i4, i2, SubtitleParser.OutputOptions.f29000c, new C1969b(this, j, i));
        } catch (RuntimeException e) {
            if (!this.f29016i) {
                throw e;
            }
            Log.m9512h("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.f29011d = i5;
        if (i5 == this.f29012e) {
            this.f29011d = 0;
            this.f29012e = 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10962h(int i) {
        int length = this.f29013f.length;
        int i2 = this.f29012e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.f29011d;
        int iMax = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f29013f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f29011d, bArr2, 0, i3);
        this.f29011d = 0;
        this.f29012e = i3;
        this.f29013f = bArr2;
    }
}
