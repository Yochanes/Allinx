package kotlinx.serialization.json.internal;

import com.google.common.base.Ascii;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CharMappings {

    /* JADX INFO: renamed from: a */
    public static final char[] f56876a = new char[117];

    /* JADX INFO: renamed from: b */
    public static final byte[] f56877b = new byte[126];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
        }
        m21102a(8, 'b');
        m21102a(9, 't');
        m21102a(10, 'n');
        m21102a(12, 'f');
        m21102a(13, 'r');
        m21102a(47, '/');
        m21102a(34, '\"');
        m21102a(92, '\\');
        while (true) {
            byte[] bArr = f56877b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = Ascii.DEL;
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m21102a(int i, char c2) {
        if (c2 != 'u') {
            f56876a[c2] = (char) i;
        }
    }
}
