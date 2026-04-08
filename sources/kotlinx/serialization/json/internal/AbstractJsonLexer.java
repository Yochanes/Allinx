package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AbstractJsonLexer {

    /* JADX INFO: renamed from: a */
    public int f56853a;

    /* JADX INFO: renamed from: b */
    public final JsonPath f56854b;

    /* JADX INFO: renamed from: c */
    public String f56855c;

    /* JADX INFO: renamed from: d */
    public final StringBuilder f56856d;

    public AbstractJsonLexer() {
        JsonPath jsonPath = new JsonPath();
        jsonPath.f56889a = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        jsonPath.f56890b = iArr;
        jsonPath.f56891c = -1;
        this.f56854b = jsonPath;
        this.f56856d = new StringBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m21068n(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractJsonLexer.f56853a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        abstractJsonLexer.m21081m(i, str, str2);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m21069a(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f56856d.append((char) (m21083p(charSequence, i + 3) + (m21083p(charSequence, i) << 12) + (m21083p(charSequence, i + 1) << 8) + (m21083p(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f56853a = i;
        mo21080l();
        if (this.f56853a + 4 < charSequence.length()) {
            return m21069a(charSequence, this.f56853a);
        }
        m21068n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public void mo21070b(int i, int i2) {
        this.f56856d.append(mo21084q(), i, i2);
    }

    /* JADX INFO: renamed from: c */
    public final void m21071c(int i, String str) {
        if (((String) mo21084q()).length() - i < str.length()) {
            m21068n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (((String) mo21084q()).charAt(i + i2) | ' ')) {
                m21068n(this, "Expected valid boolean literal prefix, but had '" + m21077i() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f56853a = str.length() + i;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo21072d();

    /* JADX INFO: renamed from: e */
    public abstract byte mo21073e();

    /* JADX INFO: renamed from: f */
    public final byte m21074f(byte b2) {
        byte bMo21073e = mo21073e();
        if (bMo21073e == b2) {
            return bMo21073e;
        }
        m21082o(b2, true);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c0, code lost:
    
        m21068n(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01cc, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cd, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cf, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d4, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d7, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d8, code lost:
    
        m21068n(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01de, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01df, code lost:
    
        m21068n(r22, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        r12 = r6;
        m21068n(r22, "Unexpected symbol '" + r8 + "' in numeric literal", 0, r12, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0144, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0148, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0160, code lost:
    
        if (((java.lang.String) mo21084q()).charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        m21068n(r22, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016e, code lost:
    
        m21068n(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0174, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0175, code lost:
    
        r22.f56853a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        if (r20 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0188, code lost:
    
        if (r20 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018a, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018f, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019a, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a6, code lost:
    
        m21068n(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m21075g() {
        boolean z2;
        boolean z3;
        boolean z4;
        int iMo21087t = mo21087t(mo21088u());
        ?? r6 = 0;
        if (iMo21087t < ((String) mo21084q()).length() && iMo21087t != -1) {
            if (((String) mo21084q()).charAt(iMo21087t) == '\"') {
                iMo21087t++;
                if (iMo21087t == ((String) mo21084q()).length()) {
                    m21068n(this, "EOF", 0, null, 6);
                    throw null;
                }
                z2 = true;
            } else {
                z2 = false;
            }
            int i = iMo21087t;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            long j = 0;
            long j2 = 0;
            while (true) {
                if (i == ((String) mo21084q()).length()) {
                    z3 = z2;
                    z4 = z6;
                    break;
                }
                char cCharAt = ((String) mo21084q()).charAt(i);
                if ((cCharAt != 'e' && cCharAt != 'E') || z6) {
                    z3 = z2;
                    if (cCharAt == '-' && z6) {
                        if (i == iMo21087t) {
                            m21068n(this, "Unexpected symbol '-' in numeric literal", 0, r6, 6);
                            throw r6;
                        }
                        i++;
                        z2 = z3;
                        z5 = false;
                        r6 = r6;
                    } else if (cCharAt != '+' || !z6) {
                        z4 = z6;
                        if (cCharAt != '-') {
                            if (AbstractJsonLexerKt.m21092a(cCharAt) != 0) {
                                break;
                            }
                            i++;
                            int i2 = cCharAt - '0';
                            if (i2 < 0 || i2 >= 10) {
                                break;
                            }
                            if (z4) {
                                j = (j * ((long) 10)) + ((long) i2);
                                z2 = z3;
                                z6 = z4;
                                r6 = r6;
                            } else {
                                boolean z8 = z5;
                                j2 = (j2 * ((long) 10)) - ((long) i2);
                                if (j2 > 0) {
                                    m21068n(this, "Numeric value overflow", 0, null, 6);
                                    throw null;
                                }
                                z2 = z3;
                                z5 = z8;
                                z6 = z4;
                                r6 = 0;
                            }
                        } else {
                            if (i != iMo21087t) {
                                m21068n(this, "Unexpected symbol '-' in numeric literal", 0, r6, 6);
                                throw r6;
                            }
                            i++;
                            z2 = z3;
                            z6 = z4;
                            z7 = true;
                        }
                    } else {
                        if (i == iMo21087t) {
                            m21068n(this, "Unexpected symbol '+' in numeric literal", 0, r6, 6);
                            throw r6;
                        }
                        i++;
                        z2 = z3;
                        z5 = true;
                        r6 = r6;
                    }
                } else {
                    if (i == iMo21087t) {
                        m21068n(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r6, 6);
                        throw r6;
                    }
                    i++;
                    z5 = true;
                    z6 = true;
                }
            }
        } else {
            m21068n(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m21076h() {
        String str = this.f56855c;
        if (str == null) {
            return mo21072d();
        }
        Intrinsics.m18596d(str);
        this.f56855c = null;
        return str;
    }

    /* JADX INFO: renamed from: i */
    public final String m21077i() {
        String str = this.f56855c;
        if (str != null) {
            Intrinsics.m18596d(str);
            this.f56855c = null;
            return str;
        }
        int iMo21088u = mo21088u();
        if (iMo21088u >= ((String) mo21084q()).length() || iMo21088u == -1) {
            m21068n(this, "EOF", iMo21088u, null, 4);
            throw null;
        }
        byte bM21092a = AbstractJsonLexerKt.m21092a(((String) mo21084q()).charAt(iMo21088u));
        if (bM21092a == 1) {
            return m21076h();
        }
        if (bM21092a != 0) {
            m21068n(this, "Expected beginning of the string, but got " + ((String) mo21084q()).charAt(iMo21088u), 0, null, 6);
            throw null;
        }
        boolean z2 = false;
        while (AbstractJsonLexerKt.m21092a(((String) mo21084q()).charAt(iMo21088u)) == 0) {
            iMo21088u++;
            if (iMo21088u >= ((String) mo21084q()).length()) {
                mo21070b(this.f56853a, iMo21088u);
                int iMo21087t = mo21087t(iMo21088u);
                if (iMo21087t == -1) {
                    this.f56853a = iMo21088u;
                    return m21079k(0, 0);
                }
                iMo21088u = iMo21087t;
                z2 = true;
            }
        }
        String strMo21089v = !z2 ? mo21089v(this.f56853a, iMo21088u) : m21079k(this.f56853a, iMo21088u);
        this.f56853a = iMo21088u;
        return strMo21089v;
    }

    /* JADX INFO: renamed from: j */
    public final String m21078j() {
        String strM21077i = m21077i();
        if (Intrinsics.m18594b(strM21077i, "null")) {
            if (((String) mo21084q()).charAt(this.f56853a - 1) != '\"') {
                m21068n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return strM21077i;
    }

    /* JADX INFO: renamed from: k */
    public final String m21079k(int i, int i2) {
        mo21070b(i, i2);
        StringBuilder sb = this.f56856d;
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    /* JADX INFO: renamed from: m */
    public final void m21081m(int i, String message, String hint) {
        Intrinsics.m18599g(message, "message");
        Intrinsics.m18599g(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbM21r = AbstractC0000a.m21r(message, " at path: ");
        sbM21r.append(this.f56854b.m21130a());
        sbM21r.append(strConcat);
        throw JsonExceptionsKt.m21119d(mo21084q(), i, sbM21r.toString());
    }

    /* JADX INFO: renamed from: o */
    public final void m21082o(byte b2, boolean z2) {
        String strM21093b = AbstractJsonLexerKt.m21093b(b2);
        int i = z2 ? this.f56853a - 1 : this.f56853a;
        m21068n(this, AbstractC0000a.m15l("Expected ", strM21093b, ", but had '", (this.f56853a == ((String) mo21084q()).length() || i < 0) ? "EOF" : String.valueOf(((String) mo21084q()).charAt(i)), "' instead"), i, null, 4);
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final int m21083p(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m21068n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public abstract CharSequence mo21084q();

    /* JADX INFO: renamed from: r */
    public byte mo21085r() {
        CharSequence charSequenceMo21084q = mo21084q();
        int i = this.f56853a;
        while (true) {
            int iMo21087t = mo21087t(i);
            if (iMo21087t == -1) {
                this.f56853a = iMo21087t;
                return (byte) 10;
            }
            char cCharAt = ((String) charSequenceMo21084q).charAt(iMo21087t);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f56853a = iMo21087t;
                return AbstractJsonLexerKt.m21092a(cCharAt);
            }
            i = iMo21087t + 1;
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m21086s(boolean z2) {
        String strM21076h;
        byte bMo21085r = mo21085r();
        if (z2) {
            if (bMo21085r != 1 && bMo21085r != 0) {
                return null;
            }
            strM21076h = m21077i();
        } else {
            if (bMo21085r != 1) {
                return null;
            }
            strM21076h = m21076h();
        }
        this.f56855c = strM21076h;
        return strM21076h;
    }

    /* JADX INFO: renamed from: t */
    public abstract int mo21087t(int i);

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) mo21084q());
        sb.append("', currentPosition=");
        return AbstractC0000a.m17n(sb, this.f56853a, ')');
    }

    /* JADX INFO: renamed from: u */
    public abstract int mo21088u();

    /* JADX INFO: renamed from: v */
    public String mo21089v(int i, int i2) {
        return ((String) mo21084q()).subSequence(i, i2).toString();
    }

    /* JADX INFO: renamed from: w */
    public final boolean m21090w() {
        int iMo21088u = mo21088u();
        String str = (String) mo21084q();
        if (iMo21088u >= str.length() || iMo21088u == -1 || str.charAt(iMo21088u) != ',') {
            return false;
        }
        this.f56853a++;
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m21091x(char c2) {
        int i = this.f56853a;
        if (i > 0 && c2 == '\"') {
            try {
                this.f56853a = i - 1;
                String strM21077i = m21077i();
                this.f56853a = i;
                if (Intrinsics.m18594b(strM21077i, "null")) {
                    m21081m(this.f56853a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f56853a = i;
                throw th;
            }
        }
        m21082o(AbstractJsonLexerKt.m21092a(c2), true);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public void mo21080l() {
    }
}
