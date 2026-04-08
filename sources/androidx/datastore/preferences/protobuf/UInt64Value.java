package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class UInt64Value extends GeneratedMessageLite<UInt64Value, Builder> implements UInt64ValueOrBuilder {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile Parser<UInt64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.UInt64Value$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15971 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24142a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24142a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24142a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24142a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24142a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24142a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24142a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24142a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<UInt64Value, Builder> implements UInt64ValueOrBuilder {
    }

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        GeneratedMessageLite.m8506o(UInt64Value.class, uInt64Value);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 3:
                return new UInt64Value();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<UInt64Value> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (UInt64Value.class) {
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
