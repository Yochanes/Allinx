package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.zxing.aztec.encoder.Encoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import me.jessyan.retrofiturlmanager.BuildConfig;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(tags = {3})
public class ESDescriptor extends BaseDescriptor {

    /* JADX INFO: renamed from: g */
    public static final Logger f58544g = LoggerFactory.getLogger((Class<?>) ESDescriptor.class);

    /* JADX INFO: renamed from: b */
    public int f58545b;

    /* JADX INFO: renamed from: c */
    public int f58546c;

    /* JADX INFO: renamed from: d */
    public DecoderConfigDescriptor f58547d;

    /* JADX INFO: renamed from: e */
    public SLConfigDescriptor f58548e;

    /* JADX INFO: renamed from: f */
    public ArrayList f58549f;

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    public final int mo21825a() {
        int iM21826b = this.f58548e.m21826b() + this.f58547d.m21826b() + 3;
        if (this.f58549f.size() <= 0) {
            return iM21826b;
        }
        throw new RuntimeException(" Doesn't handle other descriptors yet");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ByteBuffer m21830e() {
        int i;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[m21826b()]);
        IsoTypeWriter.m21857h(3, byteBufferWrap);
        m21828d(mo21825a(), byteBufferWrap);
        IsoTypeWriter.m21854e(this.f58545b, byteBufferWrap);
        byteBufferWrap.put((byte) (((0 << 7) | (0 << 6) | (0 << 5) | (0 & 31)) & 255));
        DecoderConfigDescriptor decoderConfigDescriptor = this.f58547d;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(decoderConfigDescriptor.m21826b());
        IsoTypeWriter.m21857h(decoderConfigDescriptor.f58532a, byteBufferAllocate);
        decoderConfigDescriptor.m21828d(decoderConfigDescriptor.mo21825a(), byteBufferAllocate);
        byteBufferAllocate.put((byte) (decoderConfigDescriptor.f58537b & 255));
        byteBufferAllocate.put((byte) (((decoderConfigDescriptor.f58538c << 2) | (0 << 1) | 1) & 255));
        IsoTypeWriter.m21856g(decoderConfigDescriptor.f58539d, byteBufferAllocate);
        byteBufferAllocate.putInt((int) decoderConfigDescriptor.f58540e);
        byteBufferAllocate.putInt((int) decoderConfigDescriptor.f58541f);
        AudioSpecificConfig audioSpecificConfig = decoderConfigDescriptor.f58542g;
        if (audioSpecificConfig != null) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(audioSpecificConfig.m21826b());
            IsoTypeWriter.m21857h(audioSpecificConfig.f58532a, byteBufferAllocate2);
            audioSpecificConfig.m21828d(audioSpecificConfig.mo21825a(), byteBufferAllocate2);
            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[audioSpecificConfig.mo21825a()]);
            BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(byteBufferWrap2);
            AudioSpecificConfig.m21824e(0, bitWriterBuffer);
            bitWriterBuffer.m21829a(audioSpecificConfig.f58523c, 4);
            if (audioSpecificConfig.f58523c == 15) {
                bitWriterBuffer.m21829a(0, 24);
            }
            bitWriterBuffer.m21829a(audioSpecificConfig.f58524d, 4);
            int i2 = audioSpecificConfig.f58522b;
            if (i2 == 5 || i2 == 29) {
                audioSpecificConfig.f58525e = 5;
                audioSpecificConfig.f58526f = true;
                if (i2 == 29) {
                    audioSpecificConfig.f58527g = true;
                }
                bitWriterBuffer.m21829a(audioSpecificConfig.f58528h, 4);
                if (audioSpecificConfig.f58528h == 15) {
                    bitWriterBuffer.m21829a(0, 24);
                }
                AudioSpecificConfig.m21824e(audioSpecificConfig.f58522b, bitWriterBuffer);
                if (audioSpecificConfig.f58522b == 22) {
                    bitWriterBuffer.m21829a(0, 4);
                }
            }
            switch (audioSpecificConfig.f58522b) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                    bitWriterBuffer.m21829a(0, 1);
                    bitWriterBuffer.m21829a(0, 1);
                    bitWriterBuffer.m21829a(0, 1);
                    if (audioSpecificConfig.f58524d == 0) {
                        throw new UnsupportedOperationException("can't parse program_config_element yet");
                    }
                    int i3 = audioSpecificConfig.f58522b;
                    if (i3 == 6 || i3 == 20) {
                        bitWriterBuffer.m21829a(0, 3);
                    }
                    break;
                case 5:
                case 10:
                case 11:
                case 18:
                case 29:
                case 31:
                default:
                    int i4 = audioSpecificConfig.f58522b;
                    if (i4 == 17 || i4 == 39) {
                        bitWriterBuffer.m21829a(0, 2);
                        i = audioSpecificConfig.f58531k;
                        if (i >= 0) {
                            bitWriterBuffer.m21829a(i, 11);
                            if (audioSpecificConfig.f58531k == 695) {
                                AudioSpecificConfig.m21824e(audioSpecificConfig.f58525e, bitWriterBuffer);
                                if (audioSpecificConfig.f58525e == 5) {
                                    bitWriterBuffer.m21829a(audioSpecificConfig.f58526f ? 1 : 0, 1);
                                    if (audioSpecificConfig.f58526f) {
                                        bitWriterBuffer.m21829a(audioSpecificConfig.f58528h, 4);
                                        if (audioSpecificConfig.f58528h == 15) {
                                            bitWriterBuffer.m21829a(0, 24);
                                        }
                                        int i5 = audioSpecificConfig.f58530j;
                                        if (i5 >= 0) {
                                            bitWriterBuffer.m21829a(i5, 11);
                                            if (audioSpecificConfig.f58529i == 1352) {
                                                bitWriterBuffer.m21829a(audioSpecificConfig.f58527g ? 1 : 0, 1);
                                            }
                                        }
                                    }
                                }
                                if (audioSpecificConfig.f58525e == 22) {
                                    bitWriterBuffer.m21829a(audioSpecificConfig.f58526f ? 1 : 0, 1);
                                    if (audioSpecificConfig.f58526f) {
                                        bitWriterBuffer.m21829a(audioSpecificConfig.f58528h, 4);
                                        if (audioSpecificConfig.f58528h == 15) {
                                            bitWriterBuffer.m21829a(0, 24);
                                        }
                                    }
                                    bitWriterBuffer.m21829a(0, 4);
                                }
                            }
                        }
                        byteBufferAllocate2.put((ByteBuffer) byteBufferWrap2.rewind());
                        byteBufferAllocate.put((ByteBuffer) byteBufferAllocate2.rewind());
                    } else {
                        switch (i4) {
                        }
                        i = audioSpecificConfig.f58531k;
                        if (i >= 0) {
                        }
                        byteBufferAllocate2.put((ByteBuffer) byteBufferWrap2.rewind());
                        byteBufferAllocate.put((ByteBuffer) byteBufferAllocate2.rewind());
                    }
                    break;
                case 8:
                    throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
                case 9:
                    throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
                case TYPE_BYTES_VALUE:
                    throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
                case 13:
                case 14:
                case 15:
                case 16:
                    throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
                case BuildConfig.VERSION_CODE /* 25 */:
                    throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
                case 26:
                case 27:
                    throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
                case 28:
                    throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
                case 30:
                    bitWriterBuffer.m21829a(0, 1);
                    throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                    throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
                case 35:
                    throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
                case 36:
                    bitWriterBuffer.m21829a(0, 5);
                    throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
                case 37:
                case 38:
                    throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
                case 39:
                    throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
                case 40:
                case me.jessyan.autosize.BuildConfig.VERSION_CODE /* 41 */:
                    throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
            }
        }
        for (ProfileLevelIndicationDescriptor profileLevelIndicationDescriptor : decoderConfigDescriptor.f58543h) {
            ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(profileLevelIndicationDescriptor.m21826b());
            IsoTypeWriter.m21857h(20, byteBufferAllocate3);
            profileLevelIndicationDescriptor.m21828d(1, byteBufferAllocate3);
            byteBufferAllocate3.put((byte) (0 & 255));
            byteBufferAllocate.put(byteBufferAllocate3);
        }
        ByteBuffer byteBuffer = (ByteBuffer) byteBufferAllocate.rewind();
        SLConfigDescriptor sLConfigDescriptor = this.f58548e;
        ByteBuffer byteBufferAllocate4 = ByteBuffer.allocate(sLConfigDescriptor.m21826b());
        IsoTypeWriter.m21857h(6, byteBufferAllocate4);
        sLConfigDescriptor.m21828d(1, byteBufferAllocate4);
        byteBufferAllocate4.put((byte) (sLConfigDescriptor.f58553b & 255));
        byteBufferWrap.put(byteBuffer.array());
        byteBufferWrap.put(byteBufferAllocate4.array());
        return byteBufferWrap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ESDescriptor eSDescriptor = (ESDescriptor) obj;
        if (this.f58546c != eSDescriptor.f58546c || this.f58545b != eSDescriptor.f58545b) {
            return false;
        }
        DecoderConfigDescriptor decoderConfigDescriptor = this.f58547d;
        if (decoderConfigDescriptor != null) {
            if (!decoderConfigDescriptor.equals(eSDescriptor.f58547d)) {
                return false;
            }
        } else if (eSDescriptor.f58547d != null) {
            return false;
        }
        ArrayList arrayList = this.f58549f;
        ArrayList arrayList2 = eSDescriptor.f58549f;
        if (arrayList != null) {
            if (!arrayList.equals(arrayList2)) {
                return false;
            }
        } else if (arrayList2 != null) {
            return false;
        }
        SLConfigDescriptor sLConfigDescriptor = this.f58548e;
        SLConfigDescriptor sLConfigDescriptor2 = eSDescriptor.f58548e;
        return sLConfigDescriptor != null ? sLConfigDescriptor.equals(sLConfigDescriptor2) : sLConfigDescriptor2 == null;
    }

    public final int hashCode() {
        int i = ((((((((((((((((this.f58545b * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f58546c) * 31) + 0) * 961) + 0) * 31) + 0) * 31;
        DecoderConfigDescriptor decoderConfigDescriptor = this.f58547d;
        int iHashCode = (i + (decoderConfigDescriptor != null ? decoderConfigDescriptor.hashCode() : 0)) * 31;
        SLConfigDescriptor sLConfigDescriptor = this.f58548e;
        int i2 = (iHashCode + (sLConfigDescriptor != null ? sLConfigDescriptor.f58553b : 0)) * 31;
        ArrayList arrayList = this.f58549f;
        return i2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        return "ESDescriptor{esId=" + this.f58545b + ", streamDependenceFlag=0, URLFlag=0, oCRstreamFlag=0, streamPriority=0, URLLength=" + this.f58546c + ", URLString='" + ((String) null) + "', remoteODFlag=0, dependsOnEsId=0, oCREsId=0, decoderConfigDescriptor=" + this.f58547d + ", slConfigDescriptor=" + this.f58548e + '}';
    }
}
