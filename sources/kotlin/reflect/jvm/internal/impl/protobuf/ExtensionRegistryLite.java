package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ExtensionRegistryLite {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f54095b = 0;

    /* JADX INFO: renamed from: a */
    public final Map f54096a;

    /* JADX INFO: compiled from: Proguard */
    public static final class ObjectIntPair {

        /* JADX INFO: renamed from: a */
        public final MessageLite f54097a;

        /* JADX INFO: renamed from: b */
        public final int f54098b;

        public ObjectIntPair(int i, MessageLite messageLite) {
            this.f54097a = messageLite;
            this.f54098b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f54097a == objectIntPair.f54097a && this.f54098b == objectIntPair.f54098b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f54097a) * 65535) + this.f54098b;
        }
    }

    static {
        new ExtensionRegistryLite(0);
    }

    public ExtensionRegistryLite() {
        this.f54096a = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m19682a(GeneratedMessageLite.GeneratedExtension generatedExtension) {
        this.f54096a.put(new ObjectIntPair(generatedExtension.f54118d.f54112a, generatedExtension.f54115a), generatedExtension);
    }

    public ExtensionRegistryLite(int i) {
        this.f54096a = Collections.EMPTY_MAP;
    }
}
