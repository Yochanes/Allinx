package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Duration extends GeneratedMessageLite<Duration, Builder> implements DurationOrBuilder {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile Parser<Duration> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Duration$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15551 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23917a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23917a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23917a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23917a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23917a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23917a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23917a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23917a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<Duration, Builder> implements DurationOrBuilder {
    }

    static {
        Duration duration = new Duration();
        DEFAULT_INSTANCE = duration;
        GeneratedMessageLite.m8506o(Duration.class, duration);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 3:
                return new Duration();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Duration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Duration.class) {
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
