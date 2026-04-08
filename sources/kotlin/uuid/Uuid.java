package kotlin.uuid;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.HexExtensionsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/uuid/Uuid;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalUuidApi
public final class Uuid implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final Uuid f55231c = new Uuid(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f55232a;

    /* JADX INFO: renamed from: b */
    public final long f55233b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static Uuid m20487a(String uuidString) {
            Intrinsics.m18599g(uuidString, "uuidString");
            if (uuidString.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
            }
            long jM20385b = HexExtensionsKt.m20385b(0, 8, uuidString);
            UuidKt__UuidKt.m20488a(8, uuidString);
            long jM20385b2 = HexExtensionsKt.m20385b(9, 13, uuidString);
            UuidKt__UuidKt.m20488a(13, uuidString);
            long jM20385b3 = HexExtensionsKt.m20385b(14, 18, uuidString);
            UuidKt__UuidKt.m20488a(18, uuidString);
            long jM20385b4 = HexExtensionsKt.m20385b(19, 23, uuidString);
            UuidKt__UuidKt.m20488a(23, uuidString);
            long j = (jM20385b << 32) | (jM20385b2 << 16) | jM20385b3;
            long jM20385b5 = HexExtensionsKt.m20385b(24, 36, uuidString) | (jM20385b4 << 48);
            return (j == 0 && jM20385b5 == 0) ? Uuid.f55231c : new Uuid(j, jM20385b5);
        }
    }

    public Uuid(long j, long j2) {
        this.f55232a = j;
        this.f55233b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.f55232a == uuid.f55232a && this.f55233b == uuid.f55233b;
    }

    public final int hashCode() {
        long j = this.f55232a ^ this.f55233b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j = this.f55233b;
        UuidKt__UuidKt.m20489b(j, bArr, 24, 6);
        bArr[23] = 45;
        UuidKt__UuidKt.m20489b(j >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        long j2 = this.f55232a;
        UuidKt__UuidKt.m20489b(j2, bArr, 14, 2);
        bArr[13] = 45;
        UuidKt__UuidKt.m20489b(j2 >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        UuidKt__UuidKt.m20489b(j2 >>> 32, bArr, 0, 4);
        return new String(bArr, Charsets.f55167a);
    }
}
