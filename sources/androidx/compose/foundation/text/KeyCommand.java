package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KeyCommand {

    /* JADX INFO: renamed from: A */
    public static final KeyCommand f8424A;

    /* JADX INFO: renamed from: B */
    public static final KeyCommand f8425B;

    /* JADX INFO: renamed from: C */
    public static final KeyCommand f8426C;

    /* JADX INFO: renamed from: D */
    public static final KeyCommand f8427D;

    /* JADX INFO: renamed from: E */
    public static final KeyCommand f8428E;

    /* JADX INFO: renamed from: F */
    public static final KeyCommand f8429F;

    /* JADX INFO: renamed from: G */
    public static final KeyCommand f8430G;

    /* JADX INFO: renamed from: H */
    public static final KeyCommand f8431H;

    /* JADX INFO: renamed from: I */
    public static final KeyCommand f8432I;

    /* JADX INFO: renamed from: J */
    public static final KeyCommand f8433J;

    /* JADX INFO: renamed from: K */
    public static final KeyCommand f8434K;

    /* JADX INFO: renamed from: L */
    public static final KeyCommand f8435L;

    /* JADX INFO: renamed from: M */
    public static final KeyCommand f8436M;

    /* JADX INFO: renamed from: N */
    public static final KeyCommand f8437N;

    /* JADX INFO: renamed from: O */
    public static final KeyCommand f8438O;

    /* JADX INFO: renamed from: P */
    public static final KeyCommand f8439P;

    /* JADX INFO: renamed from: Q */
    public static final KeyCommand f8440Q;

    /* JADX INFO: renamed from: R */
    public static final KeyCommand f8441R;

    /* JADX INFO: renamed from: S */
    public static final KeyCommand f8442S;

    /* JADX INFO: renamed from: T */
    public static final KeyCommand f8443T;

    /* JADX INFO: renamed from: U */
    public static final KeyCommand f8444U;

    /* JADX INFO: renamed from: V */
    public static final KeyCommand f8445V;

    /* JADX INFO: renamed from: W */
    public static final KeyCommand f8446W;

    /* JADX INFO: renamed from: X */
    public static final KeyCommand f8447X;

    /* JADX INFO: renamed from: Y */
    public static final KeyCommand f8448Y;

    /* JADX INFO: renamed from: Z */
    public static final KeyCommand f8449Z;

    /* JADX INFO: renamed from: a0 */
    public static final KeyCommand f8450a0;

    /* JADX INFO: renamed from: b */
    public static final KeyCommand f8451b;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KeyCommand[] f8452b0;

    /* JADX INFO: renamed from: c */
    public static final KeyCommand f8453c;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ EnumEntries f8454c0;

    /* JADX INFO: renamed from: d */
    public static final KeyCommand f8455d;

    /* JADX INFO: renamed from: f */
    public static final KeyCommand f8456f;

    /* JADX INFO: renamed from: g */
    public static final KeyCommand f8457g;

    /* JADX INFO: renamed from: i */
    public static final KeyCommand f8458i;

    /* JADX INFO: renamed from: j */
    public static final KeyCommand f8459j;

    /* JADX INFO: renamed from: n */
    public static final KeyCommand f8460n;

    /* JADX INFO: renamed from: o */
    public static final KeyCommand f8461o;

    /* JADX INFO: renamed from: p */
    public static final KeyCommand f8462p;

    /* JADX INFO: renamed from: q */
    public static final KeyCommand f8463q;

    /* JADX INFO: renamed from: r */
    public static final KeyCommand f8464r;

    /* JADX INFO: renamed from: s */
    public static final KeyCommand f8465s;

    /* JADX INFO: renamed from: t */
    public static final KeyCommand f8466t;

    /* JADX INFO: renamed from: u */
    public static final KeyCommand f8467u;

    /* JADX INFO: renamed from: v */
    public static final KeyCommand f8468v;

    /* JADX INFO: renamed from: w */
    public static final KeyCommand f8469w;

    /* JADX INFO: renamed from: x */
    public static final KeyCommand f8470x;

    /* JADX INFO: renamed from: y */
    public static final KeyCommand f8471y;

    /* JADX INFO: renamed from: z */
    public static final KeyCommand f8472z;

    /* JADX INFO: renamed from: a */
    public final boolean f8473a;

    static {
        KeyCommand keyCommand = new KeyCommand("LEFT_CHAR", 0, false);
        f8451b = keyCommand;
        KeyCommand keyCommand2 = new KeyCommand("RIGHT_CHAR", 1, false);
        f8453c = keyCommand2;
        KeyCommand keyCommand3 = new KeyCommand("RIGHT_WORD", 2, false);
        f8455d = keyCommand3;
        KeyCommand keyCommand4 = new KeyCommand("LEFT_WORD", 3, false);
        f8456f = keyCommand4;
        KeyCommand keyCommand5 = new KeyCommand("NEXT_PARAGRAPH", 4, false);
        f8457g = keyCommand5;
        KeyCommand keyCommand6 = new KeyCommand("PREV_PARAGRAPH", 5, false);
        f8458i = keyCommand6;
        KeyCommand keyCommand7 = new KeyCommand("LINE_START", 6, false);
        f8459j = keyCommand7;
        KeyCommand keyCommand8 = new KeyCommand("LINE_END", 7, false);
        f8460n = keyCommand8;
        KeyCommand keyCommand9 = new KeyCommand("LINE_LEFT", 8, false);
        f8461o = keyCommand9;
        KeyCommand keyCommand10 = new KeyCommand("LINE_RIGHT", 9, false);
        f8462p = keyCommand10;
        KeyCommand keyCommand11 = new KeyCommand("UP", 10, false);
        f8463q = keyCommand11;
        KeyCommand keyCommand12 = new KeyCommand("DOWN", 11, false);
        f8464r = keyCommand12;
        KeyCommand keyCommand13 = new KeyCommand("PAGE_UP", 12, false);
        f8465s = keyCommand13;
        KeyCommand keyCommand14 = new KeyCommand("PAGE_DOWN", 13, false);
        f8466t = keyCommand14;
        KeyCommand keyCommand15 = new KeyCommand("HOME", 14, false);
        f8467u = keyCommand15;
        KeyCommand keyCommand16 = new KeyCommand("END", 15, false);
        f8468v = keyCommand16;
        KeyCommand keyCommand17 = new KeyCommand("COPY", 16, false);
        f8469w = keyCommand17;
        KeyCommand keyCommand18 = new KeyCommand("PASTE", 17, true);
        f8470x = keyCommand18;
        KeyCommand keyCommand19 = new KeyCommand("CUT", 18, true);
        f8471y = keyCommand19;
        KeyCommand keyCommand20 = new KeyCommand("DELETE_PREV_CHAR", 19, true);
        f8472z = keyCommand20;
        KeyCommand keyCommand21 = new KeyCommand("DELETE_NEXT_CHAR", 20, true);
        f8424A = keyCommand21;
        KeyCommand keyCommand22 = new KeyCommand("DELETE_PREV_WORD", 21, true);
        f8425B = keyCommand22;
        KeyCommand keyCommand23 = new KeyCommand("DELETE_NEXT_WORD", 22, true);
        f8426C = keyCommand23;
        KeyCommand keyCommand24 = new KeyCommand("DELETE_FROM_LINE_START", 23, true);
        f8427D = keyCommand24;
        KeyCommand keyCommand25 = new KeyCommand("DELETE_TO_LINE_END", 24, true);
        f8428E = keyCommand25;
        KeyCommand keyCommand26 = new KeyCommand("SELECT_ALL", 25, false);
        f8429F = keyCommand26;
        KeyCommand keyCommand27 = new KeyCommand("SELECT_LEFT_CHAR", 26, false);
        f8430G = keyCommand27;
        KeyCommand keyCommand28 = new KeyCommand("SELECT_RIGHT_CHAR", 27, false);
        f8431H = keyCommand28;
        KeyCommand keyCommand29 = new KeyCommand("SELECT_UP", 28, false);
        f8432I = keyCommand29;
        KeyCommand keyCommand30 = new KeyCommand("SELECT_DOWN", 29, false);
        f8433J = keyCommand30;
        KeyCommand keyCommand31 = new KeyCommand("SELECT_PAGE_UP", 30, false);
        f8434K = keyCommand31;
        KeyCommand keyCommand32 = new KeyCommand("SELECT_PAGE_DOWN", 31, false);
        f8435L = keyCommand32;
        KeyCommand keyCommand33 = new KeyCommand("SELECT_HOME", 32, false);
        f8436M = keyCommand33;
        KeyCommand keyCommand34 = new KeyCommand("SELECT_END", 33, false);
        f8437N = keyCommand34;
        KeyCommand keyCommand35 = new KeyCommand("SELECT_LEFT_WORD", 34, false);
        f8438O = keyCommand35;
        KeyCommand keyCommand36 = new KeyCommand("SELECT_RIGHT_WORD", 35, false);
        f8439P = keyCommand36;
        KeyCommand keyCommand37 = new KeyCommand("SELECT_NEXT_PARAGRAPH", 36, false);
        f8440Q = keyCommand37;
        KeyCommand keyCommand38 = new KeyCommand("SELECT_PREV_PARAGRAPH", 37, false);
        f8441R = keyCommand38;
        KeyCommand keyCommand39 = new KeyCommand("SELECT_LINE_START", 38, false);
        f8442S = keyCommand39;
        KeyCommand keyCommand40 = new KeyCommand("SELECT_LINE_END", 39, false);
        f8443T = keyCommand40;
        KeyCommand keyCommand41 = new KeyCommand("SELECT_LINE_LEFT", 40, false);
        f8444U = keyCommand41;
        KeyCommand keyCommand42 = new KeyCommand("SELECT_LINE_RIGHT", 41, false);
        f8445V = keyCommand42;
        KeyCommand keyCommand43 = new KeyCommand("DESELECT", 42, false);
        f8446W = keyCommand43;
        KeyCommand keyCommand44 = new KeyCommand("NEW_LINE", 43, true);
        f8447X = keyCommand44;
        KeyCommand keyCommand45 = new KeyCommand("TAB", 44, true);
        f8448Y = keyCommand45;
        KeyCommand keyCommand46 = new KeyCommand("UNDO", 45, true);
        f8449Z = keyCommand46;
        KeyCommand keyCommand47 = new KeyCommand("REDO", 46, true);
        f8450a0 = keyCommand47;
        KeyCommand[] keyCommandArr = {keyCommand, keyCommand2, keyCommand3, keyCommand4, keyCommand5, keyCommand6, keyCommand7, keyCommand8, keyCommand9, keyCommand10, keyCommand11, keyCommand12, keyCommand13, keyCommand14, keyCommand15, keyCommand16, keyCommand17, keyCommand18, keyCommand19, keyCommand20, keyCommand21, keyCommand22, keyCommand23, keyCommand24, keyCommand25, keyCommand26, keyCommand27, keyCommand28, keyCommand29, keyCommand30, keyCommand31, keyCommand32, keyCommand33, keyCommand34, keyCommand35, keyCommand36, keyCommand37, keyCommand38, keyCommand39, keyCommand40, keyCommand41, keyCommand42, keyCommand43, keyCommand44, keyCommand45, keyCommand46, keyCommand47, new KeyCommand("CHARACTER_PALETTE", 47, true)};
        f8452b0 = keyCommandArr;
        f8454c0 = EnumEntriesKt.m18563a(keyCommandArr);
    }

    public KeyCommand(String str, int i, boolean z2) {
        this.f8473a = z2;
    }

    public static KeyCommand valueOf(String str) {
        return (KeyCommand) Enum.valueOf(KeyCommand.class, str);
    }

    public static KeyCommand[] values() {
        return (KeyCommand[]) f8452b0.clone();
    }
}
