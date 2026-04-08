package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a */
    public final Kind f53287a;

    /* JADX INFO: renamed from: b */
    public final JvmMetadataVersion f53288b;

    /* JADX INFO: renamed from: c */
    public final String[] f53289c;

    /* JADX INFO: renamed from: d */
    public final String[] f53290d;

    /* JADX INFO: renamed from: e */
    public final String[] f53291e;

    /* JADX INFO: renamed from: f */
    public final String f53292f;

    /* JADX INFO: renamed from: g */
    public final int f53293g;

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        /* JADX INFO: renamed from: b */
        public static final LinkedHashMap f53294b;

        /* JADX INFO: renamed from: a */
        public final int f53302a;

        /* JADX INFO: compiled from: Proguard */
        public static final class Companion {
        }

        static {
            Kind[] kindArrValues = values();
            int iM18484g = MapsKt.m18484g(kindArrValues.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g < 16 ? 16 : iM18484g);
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f53302a), kind);
            }
            f53294b = linkedHashMap;
        }

        Kind(int i) {
            this.f53302a = i;
        }
    }

    public KotlinClassHeader(Kind kind, JvmMetadataVersion jvmMetadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        Intrinsics.m18599g(kind, "kind");
        this.f53287a = kind;
        this.f53288b = jvmMetadataVersion;
        this.f53289c = strArr;
        this.f53290d = strArr2;
        this.f53291e = strArr3;
        this.f53292f = str;
        this.f53293g = i;
    }

    public final String toString() {
        return this.f53287a + " version=" + this.f53288b;
    }
}
