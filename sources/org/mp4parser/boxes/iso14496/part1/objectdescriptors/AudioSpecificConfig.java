package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import java.util.HashMap;
import org.mp4parser.tools.Hex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Descriptor(objectTypeIndication = UserMetadata.MAX_ATTRIBUTES, tags = {5})
public class AudioSpecificConfig extends BaseDescriptor {

    /* JADX INFO: renamed from: l */
    public static final HashMap f58520l;

    /* JADX INFO: renamed from: m */
    public static final HashMap f58521m;

    /* JADX INFO: renamed from: b */
    public int f58522b;

    /* JADX INFO: renamed from: c */
    public int f58523c;

    /* JADX INFO: renamed from: d */
    public int f58524d;

    /* JADX INFO: renamed from: e */
    public int f58525e;

    /* JADX INFO: renamed from: f */
    public boolean f58526f;

    /* JADX INFO: renamed from: g */
    public boolean f58527g;

    /* JADX INFO: renamed from: h */
    public int f58528h;

    /* JADX INFO: renamed from: i */
    public int f58529i;

    /* JADX INFO: renamed from: j */
    public int f58530j;

    /* JADX INFO: renamed from: k */
    public int f58531k;

    /* JADX INFO: compiled from: Proguard */
    public class ELDSpecificConfig {
    }

    /* JADX INFO: compiled from: Proguard */
    public class sbr_header {
    }

    static {
        HashMap map = new HashMap();
        f58520l = map;
        HashMap map2 = new HashMap();
        f58521m = map2;
        map.put(0, 96000);
        map.put(1, 88200);
        map.put(2, 64000);
        map.put(3, 48000);
        map.put(4, 44100);
        map.put(5, 32000);
        map.put(6, 24000);
        map.put(7, 22050);
        map.put(8, 16000);
        map.put(9, 12000);
        map.put(10, 11025);
        map.put(11, 8000);
        map2.put(1, "AAC main");
        map2.put(2, "AAC LC");
        map2.put(3, "AAC SSR");
        map2.put(4, "AAC LTP");
        map2.put(5, "SBR");
        map2.put(6, "AAC Scalable");
        map2.put(7, "TwinVQ");
        map2.put(8, "CELP");
        map2.put(9, "HVXC");
        map2.put(10, "(reserved)");
        map2.put(11, "(reserved)");
        map2.put(12, "TTSI");
        map2.put(13, "Main synthetic");
        map2.put(14, "Wavetable synthesis");
        map2.put(15, "General MIDI");
        map2.put(16, "Algorithmic Synthesis and Audio FX");
        map2.put(17, "ER AAC LC");
        map2.put(18, "(reserved)");
        map2.put(19, "ER AAC LTP");
        map2.put(20, "ER AAC Scalable");
        map2.put(21, "ER TwinVQ");
        map2.put(22, "ER BSAC");
        map2.put(23, "ER AAC LD");
        map2.put(24, "ER CELP");
        map2.put(25, "ER HVXC");
        map2.put(26, "ER HILN");
        map2.put(27, "ER Parametric");
        map2.put(28, "SSC");
        map2.put(29, "PS");
        map2.put(30, "MPEG Surround");
        map2.put(31, "(escape)");
        map2.put(32, "Layer-1");
        map2.put(33, "Layer-2");
        map2.put(34, "Layer-3");
        map2.put(35, "DST");
        map2.put(36, "ALS");
        map2.put(37, "SLS");
        map2.put(38, "SLS non-core");
        map2.put(39, "ER AAC ELD");
        map2.put(40, "SMR Simple");
        map2.put(41, "SMR Main");
    }

    /* JADX INFO: renamed from: e */
    public static void m21824e(int i, BitWriterBuffer bitWriterBuffer) {
        if (i < 32) {
            bitWriterBuffer.m21829a(i, 5);
        } else {
            bitWriterBuffer.m21829a(31, 5);
            bitWriterBuffer.m21829a(i - 32, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0053 A[PHI: r0
      0x0053: PHI (r0v10 int) = (r0v9 int), (r0v12 int), (r0v13 int) binds: [B:24:0x003d, B:29:0x0049, B:32:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo21825a() {
        int i = 5 + 4;
        if (this.f58523c == 15) {
            i = 5 + 28;
        }
        int i2 = i + 4;
        int i3 = this.f58522b;
        if (i3 == 5 || i3 == 29) {
            i2 = i + 8;
            if (this.f58528h == 15) {
                i2 = i + 32;
            }
        }
        if (i3 == 22) {
            i2 += 4;
        }
        int i4 = this.f58531k;
        if (i4 >= 0) {
            int i5 = i2 + 11;
            if (i4 == 695) {
                int i6 = i2 + 16;
                int i7 = this.f58525e;
                if (i7 > 30) {
                    i6 = i2 + 22;
                }
                if (i7 == 5) {
                    int i8 = i6 + 1;
                    if (this.f58526f) {
                        i8 = i6 + 5;
                        if (this.f58528h == 15) {
                            i8 = i6 + 29;
                        }
                        int i9 = this.f58530j;
                        if (i9 >= 0) {
                            i2 = i8 + 11;
                            if (i9 == 1352) {
                                i8 += 12;
                                i2 = i8;
                            }
                        } else {
                            i2 = i8;
                        }
                    }
                } else {
                    i2 = i6;
                }
                if (i7 == 22) {
                    int i10 = i2 + 1;
                    if (this.f58526f) {
                        i10 = i2 + 5;
                        if (this.f58528h == 15) {
                            i10 = i2 + 29;
                        }
                    }
                    i2 = i10 + 4;
                }
            } else {
                i2 = i5;
            }
        }
        return (int) Math.ceil(((double) i2) / 8.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioSpecificConfig audioSpecificConfig = (AudioSpecificConfig) obj;
        return this.f58522b == audioSpecificConfig.f58522b && this.f58524d == audioSpecificConfig.f58524d && this.f58525e == audioSpecificConfig.f58525e && this.f58528h == audioSpecificConfig.f58528h && this.f58527g == audioSpecificConfig.f58527g && this.f58523c == audioSpecificConfig.f58523c && this.f58526f == audioSpecificConfig.f58526f && this.f58529i == audioSpecificConfig.f58529i && Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((0 * 31) + this.f58522b) * 31) + this.f58523c) * 31) + 0) * 31) + this.f58524d) * 31) + this.f58525e) * 31) + (this.f58526f ? 1 : 0)) * 31) + (this.f58527g ? 1 : 0)) * 31) + this.f58528h) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.f58529i) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    @Override // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(Hex.m21848a(0, null));
        sb.append(", audioObjectType=");
        sb.append(this.f58522b);
        sb.append(" (");
        HashMap map = f58521m;
        sb.append((String) map.get(Integer.valueOf(this.f58522b)));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f58523c);
        sb.append(" (");
        HashMap map2 = f58520l;
        sb.append(map2.get(Integer.valueOf(this.f58523c)));
        sb.append("), samplingFrequency=");
        sb.append(0);
        sb.append(", channelConfiguration=");
        sb.append(this.f58524d);
        if (this.f58525e > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.f58525e);
            sb.append(" (");
            sb.append((String) map.get(Integer.valueOf(this.f58525e)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.f58526f);
            sb.append(", psPresentFlag=");
            sb.append(this.f58527g);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.f58528h);
            sb.append(" (");
            sb.append(map2.get(Integer.valueOf(this.f58528h)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(0);
            sb.append(", extensionChannelConfiguration=");
            sb.append(0);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.f58529i);
        sb.append('}');
        return sb.toString();
    }
}
