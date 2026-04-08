package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Any extends GeneratedMessageLite<Any, Builder> implements AnyOrBuilder {
    private static final Any DEFAULT_INSTANCE;
    private static volatile Parser<Any> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private ByteString value_ = ByteString.f23857b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Any$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15401 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23842a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23842a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23842a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23842a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23842a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23842a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23842a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23842a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<Any, Builder> implements AnyOrBuilder {
    }

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        GeneratedMessageLite.m8506o(Any.class, any);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 3:
                return new Any();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Any> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Any.class) {
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
