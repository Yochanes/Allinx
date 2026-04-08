package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class Mixin extends GeneratedMessageLite<Mixin, Builder> implements MixinOrBuilder {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Mixin> PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Mixin$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15791 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24066a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f24066a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24066a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24066a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24066a[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24066a[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24066a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24066a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends GeneratedMessageLite.Builder<Mixin, Builder> implements MixinOrBuilder {
    }

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        GeneratedMessageLite.m8506o(Mixin.class, mixin);
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
                return new RawMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 3:
                return new Mixin();
            case 4:
                return new Builder(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Parser<Mixin> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Mixin.class) {
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
