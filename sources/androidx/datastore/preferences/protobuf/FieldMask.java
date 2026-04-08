package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class FieldMask extends GeneratedMessageLite<FieldMask, Builder> implements FieldMaskOrBuilder {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile Parser<FieldMask> PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> paths_ = ProtobufArrayList.f24081d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldMask$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15641 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23961a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23961a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23961a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23961a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23961a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23961a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23961a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23961a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<FieldMask, Builder> implements FieldMaskOrBuilder {
    }

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        GeneratedMessageLite.m8506o(FieldMask.class, fieldMask);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: h */
    public final Object mo8264h(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        Parser defaultInstanceBasedParser;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 3:
                return new FieldMask();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<FieldMask> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (FieldMask.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser();
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
