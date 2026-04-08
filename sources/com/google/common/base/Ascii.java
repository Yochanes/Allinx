package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;

    /* JADX INFO: renamed from: BS */
    public static final byte f42533BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';

    /* JADX INFO: renamed from: CR */
    public static final byte f42534CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;

    /* JADX INFO: renamed from: EM */
    public static final byte f42535EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;

    /* JADX INFO: renamed from: FF */
    public static final byte f42536FF = 12;

    /* JADX INFO: renamed from: FS */
    public static final byte f42537FS = 28;

    /* JADX INFO: renamed from: GS */
    public static final byte f42538GS = 29;

    /* JADX INFO: renamed from: HT */
    public static final byte f42539HT = 9;

    /* JADX INFO: renamed from: LF */
    public static final byte f42540LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;

    /* JADX INFO: renamed from: NL */
    public static final byte f42541NL = 10;
    public static final byte NUL = 0;

    /* JADX INFO: renamed from: RS */
    public static final byte f42542RS = 30;

    /* JADX INFO: renamed from: SI */
    public static final byte f42543SI = 15;

    /* JADX INFO: renamed from: SO */
    public static final byte f42544SO = 14;
    public static final byte SOH = 1;

    /* JADX INFO: renamed from: SP */
    public static final byte f42545SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;

    /* JADX INFO: renamed from: US */
    public static final byte f42546US = 31;

    /* JADX INFO: renamed from: VT */
    public static final byte f42547VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int alphaIndex;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((alphaIndex = getAlphaIndex(cCharAt)) >= 26 || alphaIndex != getAlphaIndex(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int getAlphaIndex(char c2) {
        return (char) ((c2 | CASE_MASK) - 97);
    }

    public static boolean isLowerCase(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean isUpperCase(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (isUpperCase(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (isUpperCase(c2)) {
                        charArray[i] = (char) (c2 ^ CASE_MASK);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (isLowerCase(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c2 = charArray[i];
                    if (isLowerCase(c2)) {
                        charArray[i] = (char) (c2 ^ CASE_MASK);
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String truncate(CharSequence charSequence, int i, String str) {
        Preconditions.checkNotNull(charSequence);
        int length = i - str.length();
        Preconditions.checkArgument(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i, str.length());
        int length2 = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length2 <= i) {
            String string = charSequence.toString();
            int length3 = string.length();
            charSequence2 = string;
            if (length3 <= i) {
                return string;
            }
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence2, 0, length);
        sb.append(str);
        return sb.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toLowerCase(charSequence.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = toUpperCase(charSequence.charAt(i));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c2) {
        return isUpperCase(c2) ? (char) (c2 ^ CASE_MASK) : c2;
    }

    public static char toUpperCase(char c2) {
        return isLowerCase(c2) ? (char) (c2 ^ CASE_MASK) : c2;
    }
}
