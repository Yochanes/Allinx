package com.airbnb.lottie.parser.moshi;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer;
import okio.ByteString;
import okio.Options;
import okio.RealBufferedSource;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final String[] f34819f = new String[UserMetadata.MAX_ROLLOUT_ASSIGNMENTS];

    /* JADX INFO: renamed from: a */
    public int f34820a;

    /* JADX INFO: renamed from: b */
    public int[] f34821b;

    /* JADX INFO: renamed from: c */
    public String[] f34822c;

    /* JADX INFO: renamed from: d */
    public int[] f34823d;

    /* JADX INFO: compiled from: Proguard */
    public static final class Options {

        /* JADX INFO: renamed from: a */
        public final String[] f34824a;

        /* JADX INFO: renamed from: b */
        public final okio.Options f34825b;

        public Options(String[] strArr, okio.Options options) {
            this.f34824a = strArr;
            this.f34825b = options;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Options m12715a(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f34819f;
                    buffer.m21563C0(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    buffer.m21574O0(i2, i3, str2);
                                }
                                buffer.m21578S0(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                            }
                            buffer.m21578S0(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        buffer.m21574O0(i2, length, str2);
                    }
                    buffer.m21563C0(34);
                    buffer.m21562C();
                    byteStringArr[i] = buffer.m21570L(buffer.f57830b);
                }
                return new Options((String[]) strArr.clone(), Options.Companion.m21679b(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Token {

        /* JADX INFO: renamed from: a */
        public static final Token f34826a;

        /* JADX INFO: renamed from: b */
        public static final Token f34827b;

        /* JADX INFO: renamed from: c */
        public static final Token f34828c;

        /* JADX INFO: renamed from: d */
        public static final Token f34829d;

        /* JADX INFO: renamed from: f */
        public static final Token f34830f;

        /* JADX INFO: renamed from: g */
        public static final Token f34831g;

        /* JADX INFO: renamed from: i */
        public static final Token f34832i;

        /* JADX INFO: renamed from: j */
        public static final Token f34833j;

        /* JADX INFO: renamed from: n */
        public static final Token f34834n;

        /* JADX INFO: renamed from: o */
        public static final Token f34835o;

        /* JADX INFO: renamed from: p */
        public static final /* synthetic */ Token[] f34836p;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            f34826a = token;
            Token token2 = new Token("END_ARRAY", 1);
            f34827b = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            f34828c = token3;
            Token token4 = new Token("END_OBJECT", 3);
            f34829d = token4;
            Token token5 = new Token("NAME", 4);
            f34830f = token5;
            Token token6 = new Token("STRING", 5);
            f34831g = token6;
            Token token7 = new Token("NUMBER", 6);
            f34832i = token7;
            Token token8 = new Token("BOOLEAN", 7);
            f34833j = token8;
            Token token9 = new Token("NULL", 8);
            f34834n = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            f34835o = token10;
            f34836p = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) f34836p.clone();
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f34819f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f34819f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: x */
    public static JsonReader m12698x(RealBufferedSource realBufferedSource) {
        return new JsonUtf8Reader(realBufferedSource);
    }

    /* JADX INFO: renamed from: C */
    public final void m12699C(int i) {
        int i2 = this.f34820a;
        int[] iArr = this.f34821b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f34821b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f34822c;
            this.f34822c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f34823d;
            this.f34823d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f34821b;
        int i3 = this.f34820a;
        this.f34820a = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: H */
    public abstract int mo12700H(Options options);

    /* JADX INFO: renamed from: L */
    public abstract void mo12701L();

    /* JADX INFO: renamed from: M */
    public abstract void mo12702M();

    /* JADX INFO: renamed from: N */
    public final void m12703N(String str) throws JsonEncodingException {
        StringBuilder sbM21r = AbstractC0000a.m21r(str, " at path ");
        sbM21r.append(getPath());
        throw new JsonEncodingException(sbM21r.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12704a();

    /* JADX INFO: renamed from: b */
    public abstract void mo12705b();

    /* JADX INFO: renamed from: d */
    public abstract void mo12706d();

    /* JADX INFO: renamed from: g */
    public abstract void mo12707g();

    public final String getPath() {
        int i = this.f34820a;
        int[] iArr = this.f34821b;
        String[] strArr = this.f34822c;
        int[] iArr2 = this.f34823d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo12708h();

    /* JADX INFO: renamed from: i */
    public abstract boolean mo12709i();

    /* JADX INFO: renamed from: j */
    public abstract double mo12710j();

    /* JADX INFO: renamed from: k */
    public abstract int mo12711k();

    /* JADX INFO: renamed from: n */
    public abstract String mo12712n();

    /* JADX INFO: renamed from: u */
    public abstract String mo12713u();

    /* JADX INFO: renamed from: z */
    public abstract Token mo12714z();
}
