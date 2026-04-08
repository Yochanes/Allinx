package okhttp3.internal.http2;

import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/http2/Huffman;", "", "Node", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Huffman {

    /* JADX INFO: renamed from: a */
    public static final int[] f57667a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, MTCommonConstants.MainWhat.ON_ACTIVITY_DESTROYED, 1017, 4090, 8185, 21, 248, 2042, MTPushConstants.Message.CODE_MESSAGE_ARRIVED, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, MTObservable.WHAT_OBSERVER, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, ModuleDescriptor.MODULE_VERSION, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: b */
    public static final byte[] f57668b = {Ascii.f42534CR, Ascii.ETB, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.CAN, Ascii.f42542RS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42542RS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42542RS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, Ascii.f42537FS, 6, 10, 10, Ascii.f42536FF, Ascii.f42534CR, 6, 8, Ascii.f42547VT, 10, 10, 8, Ascii.f42547VT, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, Ascii.f42543SI, 6, Ascii.f42536FF, 10, Ascii.f42534CR, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, Ascii.f42534CR, 19, Ascii.f42534CR, Ascii.f42544SO, 6, Ascii.f42543SI, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, Ascii.f42543SI, Ascii.f42547VT, Ascii.f42544SO, Ascii.f42534CR, Ascii.f42537FS, Ascii.DC4, Ascii.SYN, Ascii.DC4, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.CAN, Ascii.CAN, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.CAN, Ascii.SYN, Ascii.NAK, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.CAN, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.NAK, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.ETB, Ascii.ETB, Ascii.DC4, Ascii.SYN, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.ETB, Ascii.SUB, Ascii.SUB, Ascii.DC4, 19, Ascii.SYN, Ascii.ETB, Ascii.SYN, Ascii.f42535EM, Ascii.SUB, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.CAN, Ascii.f42535EM, 19, Ascii.NAK, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.SUB, Ascii.ESC, Ascii.CAN, Ascii.NAK, Ascii.NAK, Ascii.SUB, Ascii.SUB, Ascii.f42537FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.DC4, Ascii.CAN, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.NAK, Ascii.NAK, Ascii.ETB, Ascii.SYN, Ascii.SYN, Ascii.f42535EM, Ascii.f42535EM, Ascii.CAN, Ascii.CAN, Ascii.SUB, Ascii.ETB, Ascii.SUB, Ascii.ESC, Ascii.SUB, Ascii.SUB, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.f42537FS, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.ESC, Ascii.SUB};

    /* JADX INFO: renamed from: c */
    public static final Node f57669c = new Node();

    static {
        Node[] nodeArr;
        for (int i = 0; i < 256; i++) {
            int i2 = f57667a[i];
            int i3 = f57668b[i];
            Node node = new Node(i, i3);
            Node node2 = f57669c;
            while (true) {
                nodeArr = node2.f57670a;
                if (i3 > 8) {
                    i3 -= 8;
                    int i4 = (i2 >>> i3) & 255;
                    Intrinsics.m18596d(nodeArr);
                    Node node3 = nodeArr[i4];
                    if (node3 == null) {
                        node3 = new Node();
                        nodeArr[i4] = node3;
                    }
                    node2 = node3;
                }
            }
            int i5 = 8 - i3;
            int i6 = (i2 << i5) & 255;
            Intrinsics.m18596d(nodeArr);
            Arrays.fill(nodeArr, i6, (1 << i5) + i6, node);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Node {

        /* JADX INFO: renamed from: a */
        public final Node[] f57670a;

        /* JADX INFO: renamed from: b */
        public final int f57671b;

        /* JADX INFO: renamed from: c */
        public final int f57672c;

        public Node() {
            this.f57670a = new Node[256];
            this.f57671b = 0;
            this.f57672c = 0;
        }

        public Node(int i, int i2) {
            this.f57670a = null;
            this.f57671b = i;
            int i3 = i2 & 7;
            this.f57672c = i3 == 0 ? 8 : i3;
        }
    }
}
