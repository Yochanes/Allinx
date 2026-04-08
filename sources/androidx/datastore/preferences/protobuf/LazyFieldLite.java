package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a */
    public volatile MessageLite f24020a;

    /* JADX INFO: renamed from: b */
    public volatile ByteString f24021b;

    static {
        ExtensionRegistryLite.m8478a();
    }

    /* JADX INFO: renamed from: a */
    public final MessageLite m8525a(MessageLite messageLite) {
        if (this.f24020a == null) {
            synchronized (this) {
                if (this.f24020a == null) {
                    try {
                        this.f24020a = messageLite;
                        this.f24021b = ByteString.f23857b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f24020a = messageLite;
                        this.f24021b = ByteString.f23857b;
                    }
                }
            }
        }
        return this.f24020a;
    }

    /* JADX INFO: renamed from: b */
    public final ByteString m8526b() {
        if (this.f24021b != null) {
            return this.f24021b;
        }
        synchronized (this) {
            try {
                if (this.f24021b != null) {
                    return this.f24021b;
                }
                if (this.f24020a == null) {
                    this.f24021b = ByteString.f23857b;
                } else {
                    this.f24021b = this.f24020a.toByteString();
                }
                return this.f24021b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f24020a;
        MessageLite messageLite2 = lazyFieldLite.f24020a;
        return (messageLite == null && messageLite2 == null) ? m8526b().equals(lazyFieldLite.m8526b()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.m8525a(messageLite.mo8507a())) : m8525a(messageLite2.mo8507a()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
