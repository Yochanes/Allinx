package kotlinx.serialization.json.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-json"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AbstractJsonLexerKt {
    /* JADX INFO: renamed from: a */
    public static final byte m21092a(char c2) {
        if (c2 < '~') {
            return CharMappings.f56877b[c2];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: b */
    public static final String m21093b(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == 127 ? "invalid token" : "valid token";
    }
}
