package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AbstractC1740a;
import androidx.media3.common.DataReader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@UnstableApi
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {

    /* JADX INFO: renamed from: g */
    public static final Pair f27501g = Pair.create(AbstractC1740a.m9417n(), AbstractC1740a.m9417n());

    /* JADX INFO: renamed from: h */
    public static final Pattern f27502h = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* JADX INFO: renamed from: a */
    public ExtractorOutput f27503a;

    /* JADX INFO: renamed from: b */
    public MediaParser.SeekMap f27504b;

    /* JADX INFO: renamed from: c */
    public String f27505c;

    /* JADX INFO: renamed from: d */
    public boolean f27506d;

    /* JADX INFO: renamed from: e */
    public boolean f27507e;

    /* JADX INFO: renamed from: f */
    public boolean f27508f;

    /* JADX INFO: compiled from: Proguard */
    public static final class DataReaderAdapter implements DataReader {

        /* JADX INFO: renamed from: a */
        public MediaParser$InputReader f27509a;

        @Override // androidx.media3.common.DataReader
        public final int read(byte[] bArr, int i, int i2) {
            MediaParser$InputReader mediaParser$InputReader = this.f27509a;
            int i3 = Util.f25665a;
            return AbstractC1740a.m9407d(AbstractC1740a.m9416m(mediaParser$InputReader), bArr, i, i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SeekMapAdapter implements SeekMap {

        /* JADX INFO: renamed from: a */
        public final MediaParser.SeekMap f27510a;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.f27510a = seekMap;
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: d */
        public final boolean mo10589d() {
            return AbstractC1740a.m9400A(this.f27510a);
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: j */
        public final SeekMap.SeekPoints mo10590j(long j) {
            Pair pairM9421r = AbstractC1740a.m9421r(this.f27510a, j);
            Object obj = pairM9421r.first;
            if (obj == pairM9421r.second) {
                MediaParser.SeekPoint seekPointM9418o = AbstractC1740a.m9418o(obj);
                SeekPoint seekPoint = new SeekPoint(AbstractC1740a.m9403D(seekPointM9418o), AbstractC1740a.m9411h(seekPointM9418o));
                return new SeekMap.SeekPoints(seekPoint, seekPoint);
            }
            MediaParser.SeekPoint seekPointM9418o2 = AbstractC1740a.m9418o(obj);
            SeekPoint seekPoint2 = new SeekPoint(AbstractC1740a.m9403D(seekPointM9418o2), AbstractC1740a.m9411h(seekPointM9418o2));
            MediaParser.SeekPoint seekPointM9418o3 = AbstractC1740a.m9418o(pairM9421r.second);
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(AbstractC1740a.m9403D(seekPointM9418o3), AbstractC1740a.m9411h(seekPointM9418o3)));
        }

        @Override // androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: l */
        public final long mo10548l() {
            long jM9410g = AbstractC1740a.m9410g(this.f27510a);
            if (jM9410g != -2147483648L) {
                return jM9410g;
            }
            return -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10587a(int i) {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m10588b(String str) {
        String str2;
        str.getClass();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2063506020:
                if (str.equals("android.media.mediaparser.Mp4Parser")) {
                    b2 = 0;
                }
                break;
            case -1870824006:
                if (str.equals("android.media.mediaparser.OggParser")) {
                    b2 = 1;
                }
                break;
            case -1566427438:
                if (str.equals("android.media.mediaparser.TsParser")) {
                    b2 = 2;
                }
                break;
            case -900207883:
                if (str.equals("android.media.mediaparser.AdtsParser")) {
                    b2 = 3;
                }
                break;
            case -589864617:
                if (str.equals("android.media.mediaparser.WavParser")) {
                    b2 = 4;
                }
                break;
            case 52265814:
                if (str.equals("android.media.mediaparser.PsParser")) {
                    b2 = 5;
                }
                break;
            case 116768877:
                if (str.equals("android.media.mediaparser.FragmentedMp4Parser")) {
                    b2 = 6;
                }
                break;
            case 376876796:
                if (str.equals("android.media.mediaparser.Ac3Parser")) {
                    b2 = 7;
                }
                break;
            case 703268017:
                if (str.equals("android.media.mediaparser.AmrParser")) {
                    b2 = 8;
                }
                break;
            case 768643067:
                if (str.equals("android.media.mediaparser.FlacParser")) {
                    b2 = 9;
                }
                break;
            case 965962719:
                if (str.equals("android.media.mediaparser.MatroskaParser")) {
                    b2 = 10;
                }
                break;
            case 1264380477:
                if (str.equals("android.media.mediaparser.Ac4Parser")) {
                    b2 = Ascii.f42547VT;
                }
                break;
            case 1343957595:
                if (str.equals("android.media.mediaparser.Mp3Parser")) {
                    b2 = Ascii.f42536FF;
                }
                break;
            case 2063134683:
                if (str.equals("android.media.mediaparser.FlvParser")) {
                    b2 = Ascii.f42534CR;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 6:
                str2 = "video/mp4";
                break;
            case 1:
                str2 = "audio/ogg";
                break;
            case 2:
                str2 = "video/mp2t";
                break;
            case 3:
                str2 = "audio/mp4a-latm";
                break;
            case 4:
                str2 = "audio/raw";
                break;
            case 5:
                str2 = "video/mp2p";
                break;
            case 7:
                str2 = "audio/ac3";
                break;
            case 8:
                str2 = "audio/amr";
                break;
            case 9:
                str2 = "audio/flac";
                break;
            case 10:
                str2 = "video/webm";
                break;
            case 11:
                str2 = "audio/ac4";
                break;
            case TYPE_BYTES_VALUE:
                str2 = "audio/mpeg";
                break;
            case 13:
                str2 = "video/x-flv";
                break;
            default:
                throw new IllegalArgumentException("Illegal parser name: ".concat(str));
        }
        this.f27505c = str2;
    }

    public final void onSampleCompleted(int i, long j, int i2, int i3, int i4, MediaCodec.CryptoInfo cryptoInfo) {
        if (0 == -9223372036854775807L || j < 0) {
            throw null;
        }
    }

    public final void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) {
        m10587a(i);
        throw null;
    }

    public final void onSeekMapFound(MediaParser.SeekMap seekMap) {
        SeekMap seekMapAdapter;
        this.f27504b = seekMap;
        long jM9410g = AbstractC1740a.m9410g(seekMap);
        ExtractorOutput extractorOutput = this.f27503a;
        if (this.f27508f) {
            if (jM9410g == -2147483648L) {
                jM9410g = -9223372036854775807L;
            }
            seekMapAdapter = new SeekMap.Unseekable(jM9410g);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        extractorOutput.mo9958a(seekMapAdapter);
    }

    public final void onTrackCountFound(int i) {
        this.f27506d = true;
        if (this.f27506d && !this.f27507e) {
            throw null;
        }
    }

    public final void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        MediaFormat mediaFormatM9415l = AbstractC1740a.m9415l(trackData);
        ByteBuffer byteBuffer = mediaFormatM9415l.getByteBuffer("chunk-index-int-sizes");
        if (byteBuffer == null) {
            m10587a(i);
            throw null;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        ByteBuffer byteBuffer2 = mediaFormatM9415l.getByteBuffer("chunk-index-long-offsets");
        byteBuffer2.getClass();
        LongBuffer longBufferAsLongBuffer = byteBuffer2.asLongBuffer();
        ByteBuffer byteBuffer3 = mediaFormatM9415l.getByteBuffer("chunk-index-long-us-durations");
        byteBuffer3.getClass();
        LongBuffer longBufferAsLongBuffer2 = byteBuffer3.asLongBuffer();
        ByteBuffer byteBuffer4 = mediaFormatM9415l.getByteBuffer("chunk-index-long-us-times");
        byteBuffer4.getClass();
        LongBuffer longBufferAsLongBuffer3 = byteBuffer4.asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        this.f27503a.mo9958a(new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }
}
