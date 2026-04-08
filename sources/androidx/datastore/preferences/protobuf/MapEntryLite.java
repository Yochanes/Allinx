package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MapEntryLite<K, V> {

    /* JADX INFO: renamed from: a */
    public final Metadata f24033a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15761 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24034a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f24034a = iArr;
            try {
                iArr[WireFormat.FieldType.f24176r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24034a[WireFormat.FieldType.f24179u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24034a[WireFormat.FieldType.f24175q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Metadata<K, V> {

        /* JADX INFO: renamed from: a */
        public final WireFormat.FieldType f24035a;

        /* JADX INFO: renamed from: b */
        public final WireFormat.FieldType f24036b;

        /* JADX INFO: renamed from: c */
        public final GeneratedMessageLite f24037c;

        public Metadata(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
            this.f24035a = fieldType;
            this.f24036b = fieldType2;
            this.f24037c = generatedMessageLite;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2, GeneratedMessageLite generatedMessageLite) {
        this.f24033a = new Metadata(fieldType, fieldType2, generatedMessageLite);
    }

    /* JADX INFO: renamed from: a */
    public static int m8533a(Metadata metadata, Object obj, Object obj2) {
        return FieldSet.m8489b(metadata.f24035a, 1, obj) + FieldSet.m8489b(metadata.f24036b, 2, obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m8534b(CodedOutputStream codedOutputStream, Metadata metadata, Object obj, Object obj2) {
        FieldSet.m8493k(codedOutputStream, metadata.f24035a, 1, obj);
        FieldSet.m8493k(codedOutputStream, metadata.f24036b, 2, obj2);
    }
}
