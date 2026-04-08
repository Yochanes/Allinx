package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class BoolValue extends GeneratedMessageLite<BoolValue, Builder> implements BoolValueOrBuilder {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile Parser<BoolValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.BoolValue$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15451 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23854a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23854a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23854a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23854a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23854a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23854a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23854a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23854a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<BoolValue, Builder> implements BoolValueOrBuilder {
    }

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        GeneratedMessageLite.m8506o(BoolValue.class, boolValue);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 3:
                return new BoolValue();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<BoolValue> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (BoolValue.class) {
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
