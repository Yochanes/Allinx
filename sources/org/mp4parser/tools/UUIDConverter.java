package org.mp4parser.tools;

import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UUIDConverter {
    /* JADX INFO: renamed from: a */
    public static void m21859a(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (mostSignificantBits >>> ((7 - i) * 8));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            bArr[i2] = (byte) (leastSignificantBits >>> ((7 - i2) * 8));
        }
    }
}
