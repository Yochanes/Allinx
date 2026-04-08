package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Empty extends GeneratedMessageLite<Empty, Builder> implements EmptyOrBuilder {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile Parser<Empty> PARSER;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Empty$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15561 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23918a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f23918a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23918a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23918a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23918a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23918a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23918a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23918a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<Empty, Builder> implements EmptyOrBuilder {
    }

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        GeneratedMessageLite.m8506o(Empty.class, empty);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new Empty();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Empty> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Empty.class) {
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
