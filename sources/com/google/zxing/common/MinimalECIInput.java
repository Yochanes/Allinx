package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MinimalECIInput implements ECIInput {
    private static final int COST_PER_ECI = 3;
    private final int[] bytes;
    private final int fnc1;

    /* JADX INFO: compiled from: Proguard */
    public static final class InputEdge {

        /* JADX INFO: renamed from: c */
        private final char f42913c;
        private final int cachedTotalSize;
        private final int encoderIndex;
        private final InputEdge previous;

        public /* synthetic */ InputEdge(char c2, ECIEncoderSet eCIEncoderSet, int i, InputEdge inputEdge, int i2, C49481 c49481) {
            this(c2, eCIEncoderSet, i, inputEdge, i2);
        }

        public static /* synthetic */ int access$000(InputEdge inputEdge) {
            return inputEdge.encoderIndex;
        }

        public static /* synthetic */ int access$100(InputEdge inputEdge) {
            return inputEdge.cachedTotalSize;
        }

        public static /* synthetic */ char access$300(InputEdge inputEdge) {
            return inputEdge.f42913c;
        }

        public static /* synthetic */ InputEdge access$400(InputEdge inputEdge) {
            return inputEdge.previous;
        }

        public boolean isFNC1() {
            return this.f42913c == 1000;
        }

        private InputEdge(char c2, ECIEncoderSet eCIEncoderSet, int i, InputEdge inputEdge, int i2) {
            char c3 = c2 == i2 ? (char) 1000 : c2;
            this.f42913c = c3;
            this.encoderIndex = i;
            this.previous = inputEdge;
            int length = c3 == 1000 ? 1 : eCIEncoderSet.encode(c2, i).length;
            length = (inputEdge == null ? 0 : inputEdge.encoderIndex) != i ? length + 3 : length;
            this.cachedTotalSize = inputEdge != null ? length + inputEdge.cachedTotalSize : length;
        }
    }

    public MinimalECIInput(String str, Charset charset, int i) {
        this.fnc1 = i;
        ECIEncoderSet eCIEncoderSet = new ECIEncoderSet(str, charset, i);
        if (eCIEncoderSet.length() != 1) {
            this.bytes = encodeMinimally(str, eCIEncoderSet, i);
            return;
        }
        this.bytes = new int[str.length()];
        for (int i2 = 0; i2 < this.bytes.length; i2++) {
            char cCharAt = str.charAt(i2);
            int[] iArr = this.bytes;
            if (cCharAt == i) {
                cCharAt = 1000;
            }
            iArr[i2] = cCharAt;
        }
    }

    public static void addEdge(InputEdge[][] inputEdgeArr, int i, InputEdge inputEdge) {
        if (inputEdgeArr[i][InputEdge.access$000(inputEdge)] == null || InputEdge.access$100(inputEdgeArr[i][InputEdge.access$000(inputEdge)]) > InputEdge.access$100(inputEdge)) {
            inputEdgeArr[i][InputEdge.access$000(inputEdge)] = inputEdge;
        }
    }

    public static void addEdges(String str, ECIEncoderSet eCIEncoderSet, InputEdge[][] inputEdgeArr, int i, InputEdge inputEdge, int i2) {
        int i3;
        int priorityEncoderIndex;
        ECIEncoderSet eCIEncoderSet2;
        InputEdge inputEdge2;
        int i4;
        char cCharAt = str.charAt(i);
        int length = eCIEncoderSet.length();
        if (eCIEncoderSet.getPriorityEncoderIndex() < 0 || !(cCharAt == i2 || eCIEncoderSet.canEncode(cCharAt, eCIEncoderSet.getPriorityEncoderIndex()))) {
            i3 = length;
            priorityEncoderIndex = 0;
        } else {
            priorityEncoderIndex = eCIEncoderSet.getPriorityEncoderIndex();
            i3 = priorityEncoderIndex + 1;
        }
        int i5 = priorityEncoderIndex;
        while (i5 < i3) {
            if (cCharAt == i2 || eCIEncoderSet.canEncode(cCharAt, i5)) {
                eCIEncoderSet2 = eCIEncoderSet;
                inputEdge2 = inputEdge;
                i4 = i2;
                addEdge(inputEdgeArr, i + 1, new InputEdge(cCharAt, eCIEncoderSet2, i5, inputEdge2, i4, null));
            } else {
                eCIEncoderSet2 = eCIEncoderSet;
                inputEdge2 = inputEdge;
                i4 = i2;
            }
            i5++;
            eCIEncoderSet = eCIEncoderSet2;
            inputEdge = inputEdge2;
            i2 = i4;
        }
    }

    public static int[] encodeMinimally(String str, ECIEncoderSet eCIEncoderSet, int i) {
        int length = str.length();
        InputEdge[][] inputEdgeArr = (InputEdge[][]) Array.newInstance((Class<?>) InputEdge.class, length + 1, eCIEncoderSet.length());
        addEdges(str, eCIEncoderSet, inputEdgeArr, 0, null, i);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < eCIEncoderSet.length(); i3++) {
                InputEdge inputEdge = inputEdgeArr[i2][i3];
                if (inputEdge != null && i2 < length) {
                    addEdges(str, eCIEncoderSet, inputEdgeArr, i2, inputEdge, i);
                }
            }
            for (int i4 = 0; i4 < eCIEncoderSet.length(); i4++) {
                inputEdgeArr[i2 - 1][i4] = null;
            }
        }
        int i5 = -1;
        int iAccess$100 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < eCIEncoderSet.length(); i6++) {
            InputEdge inputEdge2 = inputEdgeArr[length][i6];
            if (inputEdge2 != null && InputEdge.access$100(inputEdge2) < iAccess$100) {
                iAccess$100 = InputEdge.access$100(inputEdge2);
                i5 = i6;
            }
        }
        if (i5 < 0) {
            throw new IllegalStateException(AbstractC0000a.m3D("Failed to encode \"", str, "\""));
        }
        ArrayList arrayList = new ArrayList();
        for (InputEdge inputEdgeAccess$400 = inputEdgeArr[length][i5]; inputEdgeAccess$400 != null; inputEdgeAccess$400 = InputEdge.access$400(inputEdgeAccess$400)) {
            if (inputEdgeAccess$400.isFNC1()) {
                arrayList.add(0, 1000);
            } else {
                byte[] bArrEncode = eCIEncoderSet.encode(InputEdge.access$300(inputEdgeAccess$400), InputEdge.access$000(inputEdgeAccess$400));
                for (int length2 = bArrEncode.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bArrEncode[length2] & UnsignedBytes.MAX_VALUE));
                }
            }
            if ((InputEdge.access$400(inputEdgeAccess$400) == null ? 0 : InputEdge.access$000(InputEdge.access$400(inputEdgeAccess$400))) != InputEdge.access$000(inputEdgeAccess$400)) {
                arrayList.add(0, Integer.valueOf(eCIEncoderSet.getECIValue(InputEdge.access$000(inputEdgeAccess$400)) + 256));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        return iArr;
    }

    @Override // com.google.zxing.common.ECIInput
    public char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m9f(i, ""));
        }
        if (isECI(i)) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "value at ", " is not a character but an ECI"));
        }
        return (char) (isFNC1(i) ? this.fnc1 : this.bytes[i]);
    }

    @Override // com.google.zxing.common.ECIInput
    public int getECIValue(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m9f(i, ""));
        }
        if (isECI(i)) {
            return this.bytes[i] - 256;
        }
        throw new IllegalArgumentException(AbstractC0000a.m10g(i, "value at ", " is not an ECI but a character"));
    }

    public int getFNC1Character() {
        return this.fnc1;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean haveNCharacters(int i, int i2) {
        if ((i + i2) - 1 >= this.bytes.length) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (isECI(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.zxing.common.ECIInput
    public boolean isECI(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m9f(i, ""));
        }
        int i2 = this.bytes[i];
        return i2 > 255 && i2 <= 999;
    }

    public boolean isFNC1(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m9f(i, ""));
        }
        return this.bytes[i] == 1000;
    }

    @Override // com.google.zxing.common.ECIInput
    public int length() {
        return this.bytes.length;
    }

    @Override // com.google.zxing.common.ECIInput
    public CharSequence subSequence(int i, int i2) {
        if (i < 0 || i > i2 || i2 > length()) {
            throw new IndexOutOfBoundsException(AbstractC0000a.m9f(i, ""));
        }
        StringBuilder sb = new StringBuilder();
        while (i < i2) {
            if (isECI(i)) {
                throw new IllegalArgumentException(AbstractC0000a.m10g(i, "value at ", " is not a character but an ECI"));
            }
            sb.append(charAt(i));
            i++;
        }
        return sb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (isECI(i)) {
                sb.append("ECI(");
                sb.append(getECIValue(i));
                sb.append(')');
            } else if (charAt(i) < 128) {
                sb.append('\'');
                sb.append(charAt(i));
                sb.append('\'');
            } else {
                sb.append((int) charAt(i));
            }
        }
        return sb.toString();
    }
}
