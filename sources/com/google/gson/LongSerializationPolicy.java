package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class LongSerializationPolicy {
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;
    public static final LongSerializationPolicy DEFAULT;
    public static final LongSerializationPolicy STRING;

    /* JADX INFO: renamed from: com.google.gson.LongSerializationPolicy$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47891 extends LongSerializationPolicy {
        public C47891(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.LongSerializationPolicy$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47902 extends LongSerializationPolicy {
        public C47902(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.LongSerializationPolicy
        public JsonElement serialize(Long l) {
            return l == null ? JsonNull.INSTANCE : new JsonPrimitive(l.toString());
        }
    }

    static {
        C47891 c47891 = new C47891("DEFAULT", 0);
        DEFAULT = c47891;
        C47902 c47902 = new C47902("STRING", 1);
        STRING = c47902;
        $VALUES = new LongSerializationPolicy[]{c47891, c47902};
    }

    private LongSerializationPolicy(String str, int i) {
    }

    public static LongSerializationPolicy valueOf(String str) {
        return (LongSerializationPolicy) Enum.valueOf(LongSerializationPolicy.class, str);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[]) $VALUES.clone();
    }

    public abstract JsonElement serialize(Long l);

    public /* synthetic */ LongSerializationPolicy(String str, int i, C47891 c47891) {
        this(str, i);
    }
}
