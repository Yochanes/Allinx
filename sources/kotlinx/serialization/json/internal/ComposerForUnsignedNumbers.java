package kotlinx.serialization.json.internal;

import com.google.common.primitives.UnsignedBytes;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/ComposerForUnsignedNumbers;", "Lkotlinx/serialization/json/internal/Composer;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SuppressAnimalSniffer
public final class ComposerForUnsignedNumbers extends Composer {

    /* JADX INFO: renamed from: c */
    public final boolean f56881c;

    public ComposerForUnsignedNumbers(JsonToStringWriter jsonToStringWriter, boolean z2) {
        super(jsonToStringWriter);
        this.f56881c = z2;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: d */
    public final void mo21106d(byte b2) {
        if (this.f56881c) {
            mo21112j(String.valueOf(b2 & UnsignedBytes.MAX_VALUE));
        } else {
            m21110h(String.valueOf(b2 & UnsignedBytes.MAX_VALUE));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: f */
    public final void mo21108f(int i) {
        if (this.f56881c) {
            mo21112j(Long.toString(4294967295L & ((long) i), 10));
        } else {
            m21110h(Long.toString(4294967295L & ((long) i), 10));
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: g */
    public final void mo21109g(long j) {
        int i = 63;
        String str = "0";
        if (this.f56881c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / ((long) 5);
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            mo21112j(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / ((long) 5);
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        m21110h(str);
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: i */
    public final void mo21111i(short s) {
        if (this.f56881c) {
            mo21112j(String.valueOf(s & 65535));
        } else {
            m21110h(String.valueOf(s & 65535));
        }
    }
}
