package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class FieldInfo implements Comparable<FieldInfo> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldInfo$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15631 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23960a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f23960a = iArr;
            try {
                iArr[FieldType.f23967b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23960a[FieldType.f23968c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23960a[FieldType.f23969d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23960a[FieldType.f23972i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    @Override // java.lang.Comparable
    public final int compareTo(FieldInfo fieldInfo) {
        fieldInfo.getClass();
        return 0;
    }
}
