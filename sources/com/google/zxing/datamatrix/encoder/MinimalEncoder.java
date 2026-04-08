package com.google.zxing.datamatrix.encoder;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.common.MinimalECIInput;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MinimalEncoder {
    static final char[] C40_SHIFT2_CHARS = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.encoder.MinimalEncoder$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C49511 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode */
        static final /* synthetic */ int[] f42915x93f64673;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint;

        static {
            int[] iArr = new int[SymbolShapeHint.values().length];
            $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint = iArr;
            try {
                iArr[SymbolShapeHint.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[SymbolShapeHint.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Mode.values().length];
            f42915x93f64673 = iArr2;
            try {
                iArr2[Mode.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42915x93f64673[Mode.B256.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42915x93f64673[Mode.C40.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42915x93f64673[Mode.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42915x93f64673[Mode.X12.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42915x93f64673[Mode.EDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Edge {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int cachedTotalSize;
        private final int characterLength;
        private final int fromPosition;
        private final Input input;
        private final Mode mode;
        private final Edge previous;
        private static final int[] allCodewordCapacities = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};
        private static final int[] squareCodewordCapacities = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};
        private static final int[] rectangularCodewordCapacities = {5, 10, 16, 33, 32, 49};

        public /* synthetic */ Edge(Input input, Mode mode, int i, int i2, Edge edge, C49511 c49511) {
            this(input, mode, i, i2, edge);
        }

        public static /* synthetic */ int access$100(Edge edge) {
            return edge.fromPosition;
        }

        public static /* synthetic */ Input access$1000(Edge edge) {
            return edge.input;
        }

        public static /* synthetic */ Mode access$1100(Edge edge) {
            return edge.mode;
        }

        public static /* synthetic */ Edge access$1200(Edge edge) {
            return edge.previous;
        }

        public static /* synthetic */ int access$200(Edge edge) {
            return edge.characterLength;
        }

        public static /* synthetic */ int access$300(Edge edge) {
            return edge.cachedTotalSize;
        }

        public static byte[] getBytes(int i) {
            return new byte[]{(byte) i};
        }

        private static int getC40Value(boolean z2, int i, char c2, int i2) {
            if (c2 == i2) {
                return 27;
            }
            if (z2) {
                if (c2 <= 31) {
                    return c2;
                }
                if (c2 == ' ') {
                    return 3;
                }
                return c2 <= '/' ? c2 - '!' : c2 <= '9' ? c2 - ',' : c2 <= '@' ? c2 - '+' : c2 <= 'Z' ? c2 - '3' : c2 <= '_' ? c2 - 'E' : c2 <= 127 ? c2 - '`' : c2;
            }
            if (c2 == 0) {
                return 0;
            }
            if (i == 0 && c2 <= 3) {
                return c2 - 1;
            }
            if (i == 1 && c2 <= 31) {
                return c2;
            }
            if (c2 == ' ') {
                return 3;
            }
            if (c2 >= '!' && c2 <= '/') {
                return c2 - '!';
            }
            if (c2 >= '0' && c2 <= '9') {
                return c2 - ',';
            }
            if (c2 >= ':' && c2 <= '@') {
                return c2 - '+';
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                return c2 - '@';
            }
            if (c2 >= '[' && c2 <= '_') {
                return c2 - 'E';
            }
            if (c2 == '`') {
                return 0;
            }
            return (c2 < 'a' || c2 > 'z') ? (c2 < '{' || c2 > 127) ? c2 : c2 - '`' : c2 - 'S';
        }

        public static int getShiftValue(char c2, boolean z2, int i) {
            if (z2 && MinimalEncoder.access$600(c2)) {
                return 0;
            }
            if (!z2 && MinimalEncoder.access$700(c2)) {
                return 0;
            }
            if (z2 && MinimalEncoder.access$800(c2, i)) {
                return 1;
            }
            return (z2 || !MinimalEncoder.access$900(c2, i)) ? 2 : 1;
        }

        private static int getX12Value(char c2) {
            if (c2 == '\r') {
                return 0;
            }
            if (c2 == '*') {
                return 1;
            }
            if (c2 == '>') {
                return 2;
            }
            if (c2 == ' ') {
                return 3;
            }
            return (c2 < '0' || c2 > '9') ? (c2 < 'A' || c2 > 'Z') ? c2 : c2 - '3' : c2 - ',';
        }

        public static void setC40Word(byte[] bArr, int i, int i2, int i3, int i4) {
            int i5 = ((i3 & 255) * 40) + ((i2 & 255) * 1600) + (i4 & 255) + 1;
            bArr[i] = (byte) (i5 / 256);
            bArr[i + 1] = (byte) (i5 % 256);
        }

        public int getB256Size() {
            int i = 0;
            for (Edge edge = this; edge != null && edge.mode == Mode.B256 && i <= 250; edge = edge.previous) {
                i++;
            }
            return i;
        }

        public byte[] getC40Words(boolean z2, int i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.characterLength; i2++) {
                char cCharAt = this.input.charAt(this.fromPosition + i2);
                if ((z2 && HighLevelEncoder.isNativeC40(cCharAt)) || (!z2 && HighLevelEncoder.isNativeText(cCharAt))) {
                    arrayList.add(Byte.valueOf((byte) getC40Value(z2, 0, cCharAt, i)));
                } else if (MinimalEncoder.isExtendedASCII(cCharAt, i)) {
                    char c2 = (char) ((cCharAt & 255) - 128);
                    if (!(z2 && HighLevelEncoder.isNativeC40(c2)) && (z2 || !HighLevelEncoder.isNativeText(c2))) {
                        arrayList.add((byte) 1);
                        arrayList.add(Byte.valueOf(Ascii.f42542RS));
                        int shiftValue = getShiftValue(c2, z2, i);
                        arrayList.add(Byte.valueOf((byte) shiftValue));
                        arrayList.add(Byte.valueOf((byte) getC40Value(z2, shiftValue, c2, i)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add(Byte.valueOf(Ascii.f42542RS));
                        arrayList.add(Byte.valueOf((byte) getC40Value(z2, 0, c2, i)));
                    }
                } else {
                    int shiftValue2 = getShiftValue(cCharAt, z2, i);
                    arrayList.add(Byte.valueOf((byte) shiftValue2));
                    arrayList.add(Byte.valueOf((byte) getC40Value(z2, shiftValue2, cCharAt, i)));
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) * 2];
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4 += 3) {
                setC40Word(bArr, i3, ((Byte) arrayList.get(i4)).byteValue() & UnsignedBytes.MAX_VALUE, ((Byte) arrayList.get(i4 + 1)).byteValue() & UnsignedBytes.MAX_VALUE, ((Byte) arrayList.get(i4 + 2)).byteValue() & UnsignedBytes.MAX_VALUE);
                i3 += 2;
            }
            return bArr;
        }

        public int getCodewordsRemaining(int i) {
            return getMinSymbolSize(i) - i;
        }

        public byte[] getDataBytes() {
            switch (C49511.f42915x93f64673[this.mode.ordinal()]) {
                case 1:
                    if (this.input.isECI(this.fromPosition)) {
                        return getBytes(241, this.input.getECIValue(this.fromPosition) + 1);
                    }
                    if (MinimalEncoder.isExtendedASCII(this.input.charAt(this.fromPosition), this.input.getFNC1Character())) {
                        return getBytes(235, this.input.charAt(this.fromPosition) - 127);
                    }
                    if (this.characterLength == 2) {
                        return getBytes(this.input.charAt(this.fromPosition + 1) + ((this.input.charAt(this.fromPosition) - '0') * 10) + 82);
                    }
                    return this.input.isFNC1(this.fromPosition) ? getBytes(232) : getBytes(this.input.charAt(this.fromPosition) + 1);
                case 2:
                    return getBytes(this.input.charAt(this.fromPosition));
                case 3:
                    return getC40Words(true, this.input.getFNC1Character());
                case 4:
                    return getC40Words(false, this.input.getFNC1Character());
                case 5:
                    return getX12Words();
                case 6:
                    return getEDFBytes();
                default:
                    return new byte[0];
            }
        }

        public byte[] getEDFBytes() {
            int iCeil = (int) Math.ceil(((double) this.characterLength) / 4.0d);
            byte[] bArr = new byte[iCeil * 3];
            int i = this.fromPosition;
            int iMin = Math.min((this.characterLength + i) - 1, this.input.length() - 1);
            for (int i2 = 0; i2 < iCeil; i2 += 3) {
                int[] iArr = new int[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    if (i <= iMin) {
                        iArr[i3] = this.input.charAt(i) & '?';
                        i++;
                    } else {
                        iArr[i3] = i == iMin + 1 ? 31 : 0;
                    }
                }
                int i4 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i2] = (byte) ((i4 >> 16) & 255);
                bArr[i2 + 1] = (byte) ((i4 >> 8) & 255);
                bArr[i2 + 2] = (byte) (i4 & 255);
            }
            return bArr;
        }

        public Mode getEndMode() {
            if (this.mode == Mode.EDF) {
                if (this.characterLength < 4) {
                    return Mode.ASCII;
                }
                int lastASCII = getLastASCII();
                if (lastASCII > 0 && getCodewordsRemaining(this.cachedTotalSize + lastASCII) <= 2 - lastASCII) {
                    return Mode.ASCII;
                }
            }
            Mode mode = this.mode;
            if (mode == Mode.C40 || mode == Mode.TEXT || mode == Mode.X12) {
                if (this.fromPosition + this.characterLength >= this.input.length() && getCodewordsRemaining(this.cachedTotalSize) == 0) {
                    return Mode.ASCII;
                }
                if (getLastASCII() == 1 && getCodewordsRemaining(this.cachedTotalSize + 1) == 0) {
                    return Mode.ASCII;
                }
            }
            return this.mode;
        }

        public int getLastASCII() {
            int length = this.input.length();
            int i = this.fromPosition + this.characterLength;
            int i2 = length - i;
            if (i2 <= 4 && i < length) {
                if (i2 == 1) {
                    return MinimalEncoder.isExtendedASCII(this.input.charAt(i), this.input.getFNC1Character()) ? 0 : 1;
                }
                if (i2 == 2) {
                    if (!MinimalEncoder.isExtendedASCII(this.input.charAt(i), this.input.getFNC1Character())) {
                        int i3 = i + 1;
                        if (!MinimalEncoder.isExtendedASCII(this.input.charAt(i3), this.input.getFNC1Character())) {
                            return (HighLevelEncoder.isDigit(this.input.charAt(i)) && HighLevelEncoder.isDigit(this.input.charAt(i3))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i2 == 3) {
                    if (HighLevelEncoder.isDigit(this.input.charAt(i)) && HighLevelEncoder.isDigit(this.input.charAt(i + 1)) && !MinimalEncoder.isExtendedASCII(this.input.charAt(i + 2), this.input.getFNC1Character())) {
                        return 2;
                    }
                    return (HighLevelEncoder.isDigit(this.input.charAt(i + 1)) && HighLevelEncoder.isDigit(this.input.charAt(i + 2)) && !MinimalEncoder.isExtendedASCII(this.input.charAt(i), this.input.getFNC1Character())) ? 2 : 0;
                }
                if (HighLevelEncoder.isDigit(this.input.charAt(i)) && HighLevelEncoder.isDigit(this.input.charAt(i + 1)) && HighLevelEncoder.isDigit(this.input.charAt(i + 2)) && HighLevelEncoder.isDigit(this.input.charAt(i + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        public byte[] getLatchBytes() {
            int[] iArr = C49511.f42915x93f64673;
            switch (iArr[getPreviousMode().ordinal()]) {
                case 1:
                case 2:
                    int i = iArr[this.mode.ordinal()];
                    if (i == 2) {
                        return getBytes(231);
                    }
                    if (i == 3) {
                        return getBytes(230);
                    }
                    if (i == 4) {
                        return getBytes(239);
                    }
                    if (i == 5) {
                        return getBytes(238);
                    }
                    if (i == 6) {
                        return getBytes(240);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    if (this.mode != getPreviousMode()) {
                        switch (iArr[this.mode.ordinal()]) {
                            case 1:
                                return getBytes(254);
                            case 2:
                                return getBytes(254, 231);
                            case 3:
                                return getBytes(254, 230);
                            case 4:
                                return getBytes(254, 239);
                            case 5:
                                return getBytes(254, 238);
                            case 6:
                                return getBytes(254, 240);
                        }
                    }
                    break;
            }
            return new byte[0];
        }

        public int getMinSymbolSize(int i) {
            int i2 = C49511.$SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[Input.access$500(this.input).ordinal()];
            if (i2 == 1) {
                for (int i3 : squareCodewordCapacities) {
                    if (i3 >= i) {
                        return i3;
                    }
                }
            } else if (i2 == 2) {
                for (int i4 : rectangularCodewordCapacities) {
                    if (i4 >= i) {
                        return i4;
                    }
                }
            }
            for (int i5 : allCodewordCapacities) {
                if (i5 >= i) {
                    return i5;
                }
            }
            int[] iArr = allCodewordCapacities;
            return iArr[iArr.length - 1];
        }

        public Mode getMode() {
            return this.mode;
        }

        public Mode getPreviousMode() {
            Edge edge = this.previous;
            return edge == null ? Mode.ASCII : edge.getEndMode();
        }

        public Mode getPreviousStartMode() {
            Edge edge = this.previous;
            return edge == null ? Mode.ASCII : edge.mode;
        }

        public byte[] getX12Words() {
            int i = (this.characterLength / 3) * 2;
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2 += 2) {
                int i3 = (i2 / 2) * 3;
                setC40Word(bArr, i2, getX12Value(this.input.charAt(this.fromPosition + i3)), getX12Value(this.input.charAt(this.fromPosition + i3 + 1)), getX12Value(this.input.charAt(this.fromPosition + i3 + 2)));
            }
            return bArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0074 A[PHI: r10
          0x0074: PHI (r10v12 int) = (r10v8 int), (r10v8 int), (r10v8 int), (r10v15 int), (r10v15 int), (r10v15 int) binds: [B:55:0x0094, B:57:0x0098, B:59:0x009c, B:38:0x006c, B:40:0x0070, B:41:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0077 A[PHI: r10
          0x0077: PHI (r10v10 int) = (r10v5 int), (r10v5 int), (r10v5 int), (r10v8 int), (r10v15 int), (r10v15 int) binds: [B:69:0x00bc, B:71:0x00c0, B:73:0x00c4, B:52:0x008f, B:32:0x0061, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Edge(Input input, Mode mode, int i, int i2, Edge edge) {
            this.input = input;
            this.mode = mode;
            this.fromPosition = i;
            this.characterLength = i2;
            this.previous = edge;
            int numberOfC40Words = edge != null ? edge.cachedTotalSize : 0;
            Mode previousMode = getPreviousMode();
            switch (C49511.f42915x93f64673[mode.ordinal()]) {
                case 1:
                    numberOfC40Words = (input.isECI(i) || MinimalEncoder.isExtendedASCII(input.charAt(i), input.getFNC1Character())) ? numberOfC40Words + 2 : numberOfC40Words + 1;
                    if (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == Mode.X12) {
                        numberOfC40Words++;
                    }
                    break;
                case 2:
                    numberOfC40Words = (previousMode == Mode.B256 && getB256Size() != 250) ? numberOfC40Words + 1 : numberOfC40Words + 2;
                    if (previousMode != Mode.ASCII) {
                        if (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == Mode.X12) {
                            numberOfC40Words += 2;
                        }
                        break;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    Mode mode2 = Mode.X12;
                    if (mode == mode2) {
                        numberOfC40Words += 2;
                    } else {
                        numberOfC40Words = (MinimalEncoder.getNumberOfC40Words(input, i, mode == Mode.C40, new int[1]) * 2) + numberOfC40Words;
                    }
                    if (previousMode != Mode.ASCII && previousMode != Mode.B256) {
                        if (previousMode != mode && (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == mode2)) {
                        }
                    }
                    break;
                case 6:
                    numberOfC40Words = (previousMode != Mode.ASCII && previousMode != Mode.B256) ? (previousMode != Mode.C40 && previousMode != Mode.TEXT && previousMode != Mode.X12) ? numberOfC40Words + 3 : numberOfC40Words + 5 : numberOfC40Words + 4;
                    break;
            }
            this.cachedTotalSize = numberOfC40Words;
        }

        public static byte[] getBytes(int i, int i2) {
            return new byte[]{(byte) i, (byte) i2};
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Input extends MinimalECIInput {
        private final int macroId;
        private final SymbolShapeHint shape;

        public /* synthetic */ Input(String str, Charset charset, int i, SymbolShapeHint symbolShapeHint, int i2, C49511 c49511) {
            this(str, charset, i, symbolShapeHint, i2);
        }

        public static /* synthetic */ int access$1300(Input input) {
            return input.getMacroId();
        }

        public static /* synthetic */ SymbolShapeHint access$500(Input input) {
            return input.getShapeHint();
        }

        private int getMacroId() {
            return this.macroId;
        }

        private SymbolShapeHint getShapeHint() {
            return this.shape;
        }

        private Input(String str, Charset charset, int i, SymbolShapeHint symbolShapeHint, int i2) {
            super(str, charset, i);
            this.shape = symbolShapeHint;
            this.macroId = i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum Mode {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Result {
        private final byte[] bytes;

        public Result(Edge edge) {
            int i;
            Input inputAccess$1000 = Edge.access$1000(edge);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            int iPrepend = ((Edge.access$1100(edge) == Mode.C40 || Edge.access$1100(edge) == Mode.TEXT || Edge.access$1100(edge) == Mode.X12) && edge.getEndMode() != Mode.ASCII) ? prepend(Edge.getBytes(254), arrayList) : 0;
            for (Edge edgeAccess$1200 = edge; edgeAccess$1200 != null; edgeAccess$1200 = Edge.access$1200(edgeAccess$1200)) {
                iPrepend += prepend(edgeAccess$1200.getDataBytes(), arrayList);
                if (Edge.access$1200(edgeAccess$1200) == null || edgeAccess$1200.getPreviousStartMode() != edgeAccess$1200.getMode()) {
                    if (edgeAccess$1200.getMode() == Mode.B256) {
                        if (iPrepend <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) iPrepend));
                            i = iPrepend + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (iPrepend % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((iPrepend / 250) + 249)));
                            i = iPrepend + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i));
                    }
                    prepend(edgeAccess$1200.getLatchBytes(), arrayList);
                    iPrepend = 0;
                }
            }
            if (Input.access$1300(inputAccess$1000) == 5) {
                prepend(Edge.getBytes(236), arrayList);
            } else if (Input.access$1300(inputAccess$1000) == 6) {
                prepend(Edge.getBytes(237), arrayList);
            }
            if (inputAccess$1000.getFNC1Character() > 0) {
                prepend(Edge.getBytes(232), arrayList);
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                applyRandomPattern(arrayList, arrayList.size() - ((Integer) arrayList2.get(i3)).intValue(), ((Integer) arrayList3.get(i3)).intValue());
            }
            int minSymbolSize = edge.getMinSymbolSize(arrayList.size());
            if (arrayList.size() < minSymbolSize) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < minSymbolSize) {
                arrayList.add(Byte.valueOf((byte) randomize253State(arrayList.size() + 1)));
            }
            this.bytes = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.bytes;
                if (i2 >= bArr.length) {
                    return;
                }
                bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
                i2++;
            }
        }

        public static void applyRandomPattern(List<Byte> list, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                int iByteValue = (((i4 + 1) * 149) % 255) + 1 + (list.get(i4).byteValue() & UnsignedBytes.MAX_VALUE);
                if (iByteValue > 255) {
                    iByteValue -= 256;
                }
                list.set(i4, Byte.valueOf((byte) iByteValue));
            }
        }

        public static int prepend(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int randomize253State(int i) {
            int i2 = (i * 149) % 253;
            int i3 = i2 + 130;
            return i3 <= 254 ? i3 : i2 - 124;
        }

        public byte[] getBytes() {
            return this.bytes;
        }
    }

    private MinimalEncoder() {
    }

    public static /* synthetic */ boolean access$600(char c2) {
        return isInC40Shift1Set(c2);
    }

    public static /* synthetic */ boolean access$700(char c2) {
        return isInTextShift1Set(c2);
    }

    public static /* synthetic */ boolean access$800(char c2, int i) {
        return isInC40Shift2Set(c2, i);
    }

    public static /* synthetic */ boolean access$900(char c2, int i) {
        return isInTextShift2Set(c2, i);
    }

    public static void addEdge(Edge[][] edgeArr, Edge edge) {
        int iAccess$100 = Edge.access$100(edge) + Edge.access$200(edge);
        if (edgeArr[iAccess$100][edge.getEndMode().ordinal()] == null || Edge.access$300(edgeArr[iAccess$100][edge.getEndMode().ordinal()]) > Edge.access$300(edge)) {
            edgeArr[iAccess$100][edge.getEndMode().ordinal()] = edge;
        }
    }

    public static void addEdges(Input input, Edge[][] edgeArr, int i, Edge edge) {
        if (input.isECI(i)) {
            addEdge(edgeArr, new Edge(input, Mode.ASCII, i, 1, edge, null));
            return;
        }
        char cCharAt = input.charAt(i);
        int i2 = 0;
        if (edge == null || edge.getEndMode() != Mode.EDF) {
            if (HighLevelEncoder.isDigit(cCharAt) && input.haveNCharacters(i, 2) && HighLevelEncoder.isDigit(input.charAt(i + 1))) {
                addEdge(edgeArr, new Edge(input, Mode.ASCII, i, 2, edge, null));
            } else {
                addEdge(edgeArr, new Edge(input, Mode.ASCII, i, 1, edge, null));
            }
            Mode[] modeArr = {Mode.C40, Mode.TEXT};
            for (int i3 = 0; i3 < 2; i3++) {
                Mode mode = modeArr[i3];
                int[] iArr = new int[1];
                if (getNumberOfC40Words(input, i, mode == Mode.C40, iArr) > 0) {
                    addEdge(edgeArr, new Edge(input, mode, i, iArr[0], edge, null));
                }
            }
            if (input.haveNCharacters(i, 3) && HighLevelEncoder.isNativeX12(input.charAt(i)) && HighLevelEncoder.isNativeX12(input.charAt(i + 1)) && HighLevelEncoder.isNativeX12(input.charAt(i + 2))) {
                addEdge(edgeArr, new Edge(input, Mode.X12, i, 3, edge, null));
            }
            addEdge(edgeArr, new Edge(input, Mode.B256, i, 1, edge, null));
        }
        while (i2 < 3) {
            int i4 = i + i2;
            if (!input.haveNCharacters(i4, 1) || !HighLevelEncoder.isNativeEDIFACT(input.charAt(i4))) {
                break;
            }
            int i5 = i2 + 1;
            addEdge(edgeArr, new Edge(input, Mode.EDF, i, i5, edge, null));
            i2 = i5;
        }
        if (i2 == 3 && input.haveNCharacters(i, 4) && HighLevelEncoder.isNativeEDIFACT(input.charAt(i + 3))) {
            addEdge(edgeArr, new Edge(input, Mode.EDF, i, 4, edge, null));
        }
    }

    public static byte[] encode(String str, Charset charset, int i, SymbolShapeHint symbolShapeHint, int i2) {
        return encodeMinimally(new Input(str, charset, i, symbolShapeHint, i2, null)).getBytes();
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, null, -1, SymbolShapeHint.FORCE_NONE);
    }

    public static Result encodeMinimally(Input input) {
        int length = input.length();
        int i = 0;
        Edge[][] edgeArr = (Edge[][]) Array.newInstance((Class<?>) Edge.class, length + 1, 6);
        addEdges(input, edgeArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < 6; i3++) {
                Edge edge = edgeArr[i2][i3];
                if (edge != null && i2 < length) {
                    addEdges(input, edgeArr, i2, edge);
                }
            }
            for (int i4 = 0; i4 < 6; i4++) {
                edgeArr[i2 - 1][i4] = null;
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        while (i < 6) {
            Edge edge2 = edgeArr[length][i];
            if (edge2 != null) {
                int iAccess$300 = (i < 1 || i > 3) ? Edge.access$300(edge2) : Edge.access$300(edge2) + 1;
                if (iAccess$300 < i6) {
                    i5 = i;
                    i6 = iAccess$300;
                }
            }
            i++;
        }
        if (i5 >= 0) {
            return new Result(edgeArr[length][i5]);
        }
        throw new IllegalStateException("Failed to encode \"" + input + "\"");
    }

    public static int getNumberOfC40Words(Input input, int i, boolean z2, int[] iArr) {
        int i2 = 0;
        for (int i3 = i; i3 < input.length(); i3++) {
            if (input.isECI(i3)) {
                iArr[0] = 0;
                return 0;
            }
            char cCharAt = input.charAt(i3);
            if ((z2 && HighLevelEncoder.isNativeC40(cCharAt)) || (!z2 && HighLevelEncoder.isNativeText(cCharAt))) {
                i2++;
            } else if (isExtendedASCII(cCharAt, input.getFNC1Character())) {
                int i4 = cCharAt & 255;
                i2 = (i4 < 128 || (!(z2 && HighLevelEncoder.isNativeC40((char) (i4 + (-128)))) && (z2 || !HighLevelEncoder.isNativeText((char) (i4 + (-128)))))) ? i2 + 4 : i2 + 3;
            } else {
                i2 += 2;
            }
            if (i2 % 3 == 0 || ((i2 - 2) % 3 == 0 && i3 + 1 == input.length())) {
                iArr[0] = (i3 - i) + 1;
                return (int) Math.ceil(((double) i2) / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    public static boolean isExtendedASCII(char c2, int i) {
        return c2 != i && c2 >= 128 && c2 <= 255;
    }

    private static boolean isInC40Shift1Set(char c2) {
        return c2 <= 31;
    }

    private static boolean isInC40Shift2Set(char c2, int i) {
        for (char c3 : C40_SHIFT2_CHARS) {
            if (c3 == c2) {
                return true;
            }
        }
        return c2 == i;
    }

    private static boolean isInTextShift1Set(char c2) {
        return isInC40Shift1Set(c2);
    }

    private static boolean isInTextShift2Set(char c2, int i) {
        return isInC40Shift2Set(c2, i);
    }

    public static String encodeHighLevel(String str, Charset charset, int i, SymbolShapeHint symbolShapeHint) {
        int i2;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i2 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i2 = 6;
        } else {
            i2 = 0;
        }
        return new String(encode(str, charset, i, symbolShapeHint, i2), StandardCharsets.ISO_8859_1);
    }
}
