package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b */
    public static volatile ExtensionRegistryLite f23922b;

    /* JADX INFO: renamed from: c */
    public static final ExtensionRegistryLite f23923c;

    /* JADX INFO: renamed from: a */
    public final Map f23924a = Collections.EMPTY_MAP;

    /* JADX INFO: compiled from: Proguard */
    public static final class ObjectIntPair {

        /* JADX INFO: renamed from: a */
        public final MessageLite f23925a;

        /* JADX INFO: renamed from: b */
        public final int f23926b;

        public ObjectIntPair(int i, MessageLite messageLite) {
            this.f23925a = messageLite;
            this.f23926b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f23925a == objectIntPair.f23925a && this.f23926b == objectIntPair.f23926b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f23925a) * 65535) + this.f23926b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f23923c = new ExtensionRegistryLite();
    }

    /* JADX INFO: renamed from: a */
    public static ExtensionRegistryLite m8478a() {
        ExtensionRegistryLite extensionRegistryLite;
        ExtensionRegistryLite extensionRegistryLite2 = f23922b;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = f23922b;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.f23921a;
                    if (cls != null) {
                        try {
                            extensionRegistryLite = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                            extensionRegistryLite = f23923c;
                        }
                        f23922b = extensionRegistryLite;
                    } else {
                        extensionRegistryLite = f23923c;
                        f23922b = extensionRegistryLite;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLite;
    }
}
