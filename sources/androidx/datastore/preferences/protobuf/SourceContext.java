package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class SourceContext extends GeneratedMessageLite<SourceContext, Builder> implements SourceContextOrBuilder {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SourceContext> PARSER;
    private String fileName_ = "";

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.SourceContext$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15881 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24129a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24129a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24129a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24129a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24129a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24129a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24129a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24129a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<SourceContext, Builder> implements SourceContextOrBuilder {
    }

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        GeneratedMessageLite.m8506o(SourceContext.class, sourceContext);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 3:
                return new SourceContext();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<SourceContext> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SourceContext.class) {
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
