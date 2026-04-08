package com.google.common.primitives;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.InlineMe;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
public final class Chars {
    public static final int BYTES = 2;

    /* JADX INFO: compiled from: Proguard */
    @GwtCompatible
    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        public CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Character) && Chars.access$000(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != charArrayAsList.array[charArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return get(i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.start; i < this.end; i++) {
                iHashCode = (iHashCode * 31) + Chars.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iAccess$000;
            if (!(obj instanceof Character) || (iAccess$000 = Chars.access$000(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iAccess$000 - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iAccess$100;
            if (!(obj instanceof Character) || (iAccess$100 = Chars.access$100(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iAccess$100 - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            return set(i, (Character) obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.array;
            int i3 = this.start;
            return new CharArrayAsList(cArr, i + i3, i3 + i2);
        }

        public char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.array[i]);
            }
        }

        public CharArrayAsList(char[] cArr, int i, int i2) {
            this.array = cArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Character.valueOf(this.array[this.start + i]);
        }

        public Character set(int i, Character ch) {
            Preconditions.checkElementIndex(i, size());
            char[] cArr = this.array;
            int i2 = this.start;
            char c2 = cArr[i2 + i];
            cArr[i2 + i] = ((Character) Preconditions.checkNotNull(ch)).charValue();
            return Character.valueOf(c2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(char[] cArr, char[] cArr2) {
            return compare2(cArr, cArr2);
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Character.compare(cArr[i], cArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private Chars() {
    }

    public static /* synthetic */ int access$000(char[] cArr, char c2, int i, int i2) {
        return indexOf(cArr, c2, i, i2);
    }

    public static /* synthetic */ int access$100(char[] cArr, char c2, int i, int i2) {
        return lastIndexOf(cArr, c2, i, i2);
    }

    public static List<Character> asList(char... cArr) {
        return cArr.length == 0 ? Collections.EMPTY_LIST : new CharArrayAsList(cArr);
    }

    private static int checkNoOverflow(long j) {
        int i = (int) j;
        Preconditions.checkArgument(j == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j);
        return i;
    }

    public static char checkedCast(long j) {
        char c2 = (char) j;
        Preconditions.checkArgument(((long) c2) == j, "Out of range: %s", j);
        return c2;
    }

    @InlineMe(replacement = "Character.compare(a, b)")
    public static int compare(char c2, char c3) {
        return Character.compare(c2, c3);
    }

    public static char[] concat(char[]... cArr) {
        long length = 0;
        for (char[] cArr2 : cArr) {
            length += (long) cArr2.length;
        }
        char[] cArr3 = new char[checkNoOverflow(length)];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    public static char constrainToRange(char c2, char c3, char c4) {
        Preconditions.checkArgument(c3 <= c4, "min (%s) must be less than or equal to max (%s)", c3, c4);
        return c2 < c3 ? c3 : c2 < c4 ? c2 : c4;
    }

    public static boolean contains(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] cArr, int i, int i2) {
        Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return cArr.length < i ? Arrays.copyOf(cArr, i + i2) : cArr;
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static char fromBytes(byte b2, byte b3) {
        return (char) ((b2 << 8) | (b3 & UnsignedBytes.MAX_VALUE));
    }

    public static int indexOf(char[] cArr, char c2) {
        return indexOf(cArr, c2, 0, cArr.length);
    }

    public static String join(String str, char... cArr) {
        Preconditions.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(((length - 1) * str.length()) + length);
        sb.append(cArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(str);
            sb.append(cArr[i]);
        }
        return sb.toString();
    }

    public static int lastIndexOf(char[] cArr, char c2) {
        return lastIndexOf(cArr, c2, 0, cArr.length);
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c2 = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            char c3 = cArr[i];
            if (c3 > c2) {
                c2 = c3;
            }
        }
        return c2;
    }

    public static char min(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c2 = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            char c3 = cArr[i];
            if (c3 < c2) {
                c2 = c3;
            }
        }
        return c2;
    }

    public static void reverse(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static void rotate(char[] cArr, int i) {
        rotate(cArr, i, 0, cArr.length);
    }

    public static char saturatedCast(long j) {
        if (j > 65535) {
            return (char) 65535;
        }
        if (j < 0) {
            return (char) 0;
        }
        return (char) j;
    }

    public static void sortDescending(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).toCharArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = ((Character) Preconditions.checkNotNull(array[i])).charValue();
        }
        return cArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c2) {
        return new byte[]{(byte) (c2 >> '\b'), (byte) c2};
    }

    private static int indexOf(char[] cArr, char c2, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int lastIndexOf(char[] cArr, char c2, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c2) {
                return i3;
            }
        }
        return -1;
    }

    public static void rotate(char[] cArr, int i, int i2, int i3) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i2, i3, cArr.length);
        if (cArr.length <= 1) {
            return;
        }
        int i4 = i3 - i2;
        int i5 = (-i) % i4;
        if (i5 < 0) {
            i5 += i4;
        }
        int i6 = i5 + i2;
        if (i6 == i2) {
            return;
        }
        reverse(cArr, i2, i6);
        reverse(cArr, i6, i3);
        reverse(cArr, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int indexOf(char[] cArr, char[] cArr2) {
        Preconditions.checkNotNull(cArr, "array");
        Preconditions.checkNotNull(cArr2, "target");
        if (cArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (cArr.length - cArr2.length) + 1) {
            for (int i2 = 0; i2 < cArr2.length; i2++) {
                if (cArr[i + i2] != cArr2[i2]) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }

    public static void reverse(char[] cArr, int i, int i2) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i, i2, cArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            char c2 = cArr[i];
            cArr[i] = cArr[i3];
            cArr[i3] = c2;
            i++;
        }
    }

    public static void sortDescending(char[] cArr, int i, int i2) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i, i2, cArr.length);
        Arrays.sort(cArr, i, i2);
        reverse(cArr, i, i2);
    }

    public static int hashCode(char c2) {
        return c2;
    }
}
