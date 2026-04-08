package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.CharMatcher;
import java.util.BitSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class SmallCharMatcher extends CharMatcher.NamedFastMatcher {

    /* JADX INFO: renamed from: C1 */
    private static final int f42552C1 = -862048943;

    /* JADX INFO: renamed from: C2 */
    private static final int f42553C2 = 461845907;
    private static final double DESIRED_LOAD_FACTOR = 0.5d;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char[] table;

    private SmallCharMatcher(char[] cArr, long j, boolean z2, String str) {
        super(str);
        this.table = cArr;
        this.filter = j;
        this.containsZero = z2;
    }

    private boolean checkFilter(int i) {
        return 1 == ((this.filter >> i) & 1);
    }

    @VisibleForTesting
    public static int chooseTableSize(int i) {
        if (i == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < i) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static CharMatcher from(BitSet bitSet, String str) {
        int i;
        int iCardinality = bitSet.cardinality();
        boolean z2 = bitSet.get(0);
        int iChooseTableSize = chooseTableSize(iCardinality);
        char[] cArr = new char[iChooseTableSize];
        int i2 = iChooseTableSize - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (iNextSetBit != -1) {
            long j2 = (1 << iNextSetBit) | j;
            int iSmear = smear(iNextSetBit);
            while (true) {
                i = iSmear & i2;
                if (cArr[i] == 0) {
                    break;
                }
                iSmear = i + 1;
            }
            cArr[i] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j = j2;
        }
        return new SmallCharMatcher(cArr, j, z2, str);
    }

    public static int smear(int i) {
        return Integer.rotateLeft(i * f42552C1, 15) * f42553C2;
    }

    @Override // com.google.common.base.CharMatcher
    public boolean matches(char c2) {
        if (c2 == 0) {
            return this.containsZero;
        }
        if (!checkFilter(c2)) {
            return false;
        }
        int length = this.table.length - 1;
        int iSmear = smear(c2) & length;
        int i = iSmear;
        do {
            char c3 = this.table[i];
            if (c3 == 0) {
                return false;
            }
            if (c3 == c2) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != iSmear);
        return false;
    }

    @Override // com.google.common.base.CharMatcher
    public void setBits(BitSet bitSet) {
        if (this.containsZero) {
            bitSet.set(0);
        }
        for (char c2 : this.table) {
            if (c2 != 0) {
                bitSet.set(c2);
            }
        }
    }
}
