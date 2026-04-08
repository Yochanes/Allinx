package org.mp4parser.boxes.microsoft.contentprotection;

import java.nio.ByteBuffer;
import java.util.UUID;
import org.mp4parser.boxes.microsoft.ProtectionSpecificHeader;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PlayReadyHeader extends ProtectionSpecificHeader {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class PlayReadyRecord {

        /* JADX INFO: compiled from: Proguard */
        public static class DefaulPlayReadyRecord extends PlayReadyRecord {
            @Override // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader.PlayReadyRecord
            /* JADX INFO: renamed from: a */
            public final ByteBuffer mo21839a() {
                return null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static class EmeddedLicenseStore extends PlayReadyRecord {
            @Override // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader.PlayReadyRecord
            /* JADX INFO: renamed from: a */
            public final ByteBuffer mo21839a() {
                return null;
            }

            @Override // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader.PlayReadyRecord
            public final String toString() {
                throw null;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static class RMHeader extends PlayReadyRecord {
            @Override // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader.PlayReadyRecord
            /* JADX INFO: renamed from: a */
            public final ByteBuffer mo21839a() {
                throw null;
            }

            @Override // org.mp4parser.boxes.microsoft.contentprotection.PlayReadyHeader.PlayReadyRecord
            public final String toString() {
                StringBuilder sb = new StringBuilder("RMHeader{length=");
                sb.append(mo21839a().limit());
                sb.append(", header='");
                return AbstractC0000a.m19p(sb, null, "'}");
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract ByteBuffer mo21839a();

        public String toString() {
            return "PlayReadyRecord{type=0, length=" + mo21839a().limit() + '}';
        }
    }

    static {
        ProtectionSpecificHeader.f59067a.put(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"), PlayReadyHeader.class);
    }

    @Override // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo21838a() {
        throw null;
    }

    @Override // org.mp4parser.boxes.microsoft.ProtectionSpecificHeader
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayReadyHeader{length=");
        sb.append(0L);
        sb.append(", recordCount=");
        throw null;
    }
}
