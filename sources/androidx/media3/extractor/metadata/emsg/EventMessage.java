package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class EventMessage implements Metadata.Entry {

    /* JADX INFO: renamed from: g */
    public static final Format f28450g;

    /* JADX INFO: renamed from: h */
    public static final Format f28451h;

    /* JADX INFO: renamed from: a */
    public final String f28452a;

    /* JADX INFO: renamed from: b */
    public final String f28453b;

    /* JADX INFO: renamed from: c */
    public final long f28454c;

    /* JADX INFO: renamed from: d */
    public final long f28455d;

    /* JADX INFO: renamed from: e */
    public final byte[] f28456e;

    /* JADX INFO: renamed from: f */
    public int f28457f;

    static {
        Format.Builder builder = new Format.Builder();
        builder.f25198m = MimeTypes.m9342m("application/id3");
        f28450g = new Format(builder);
        Format.Builder builder2 = new Format.Builder();
        builder2.f25198m = MimeTypes.m9342m("application/x-scte35");
        f28451h = new Format(builder2);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f28452a = str;
        this.f28453b = str2;
        this.f28454c = j;
        this.f28455d = j2;
        this.f28456e = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: a */
    public final Format mo9327a() {
        String str = this.f28452a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f28451h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f28450g;
            default:
                return null;
        }
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: c */
    public final byte[] mo9329c() {
        if (mo9327a() != null) {
            return this.f28456e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.f28454c == eventMessage.f28454c && this.f28455d == eventMessage.f28455d && Objects.equals(this.f28452a, eventMessage.f28452a) && Objects.equals(this.f28453b, eventMessage.f28453b) && Arrays.equals(this.f28456e, eventMessage.f28456e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f28457f == 0) {
            String str = this.f28452a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f28453b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.f28454c;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f28455d;
            this.f28457f = Arrays.hashCode(this.f28456e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f28457f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f28452a + ", id=" + this.f28455d + ", durationMs=" + this.f28454c + ", value=" + this.f28453b;
    }
}
