package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p001A.AbstractC0000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ToNumberPolicy implements ToNumberStrategy {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    public static final ToNumberPolicy BIG_DECIMAL;
    public static final ToNumberPolicy DOUBLE;
    public static final ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final ToNumberPolicy LONG_OR_DOUBLE;

    /* JADX INFO: renamed from: com.google.gson.ToNumberPolicy$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47951 extends ToNumberPolicy {
        public C47951(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.ToNumberStrategy
        public /* bridge */ /* synthetic */ Number readNumber(JsonReader jsonReader) {
            return readNumber(jsonReader);
        }

        @Override // com.google.gson.ToNumberStrategy
        public Double readNumber(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ToNumberPolicy$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47962 extends ToNumberPolicy {
        public C47962(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ToNumberPolicy$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47973 extends ToNumberPolicy {
        public C47973(String str, int i) {
            super(str, i, null);
        }

        private Number parseAsDouble(String str, JsonReader jsonReader) throws MalformedJsonException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!jsonReader.isLenient()) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + jsonReader.getPreviousPath());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbM23t = AbstractC0000a.m23t("Cannot parse ", str, "; at path ");
                sbM23t.append(jsonReader.getPreviousPath());
                throw new JsonParseException(sbM23t.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            if (strNextString.indexOf(46) >= 0) {
                return parseAsDouble(strNextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(strNextString));
            } catch (NumberFormatException unused) {
                return parseAsDouble(strNextString, jsonReader);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.gson.ToNumberPolicy$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47984 extends ToNumberPolicy {
        public C47984(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.ToNumberStrategy
        public /* bridge */ /* synthetic */ Number readNumber(JsonReader jsonReader) {
            return readNumber(jsonReader);
        }

        @Override // com.google.gson.ToNumberStrategy
        public BigDecimal readNumber(JsonReader jsonReader) throws IOException {
            String strNextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(strNextString);
            } catch (NumberFormatException e) {
                StringBuilder sbM23t = AbstractC0000a.m23t("Cannot parse ", strNextString, "; at path ");
                sbM23t.append(jsonReader.getPreviousPath());
                throw new JsonParseException(sbM23t.toString(), e);
            }
        }
    }

    static {
        C47951 c47951 = new C47951("DOUBLE", 0);
        DOUBLE = c47951;
        C47962 c47962 = new C47962("LAZILY_PARSED_NUMBER", 1);
        LAZILY_PARSED_NUMBER = c47962;
        C47973 c47973 = new C47973("LONG_OR_DOUBLE", 2);
        LONG_OR_DOUBLE = c47973;
        C47984 c47984 = new C47984("BIG_DECIMAL", 3);
        BIG_DECIMAL = c47984;
        $VALUES = new ToNumberPolicy[]{c47951, c47962, c47973, c47984};
    }

    private ToNumberPolicy(String str, int i) {
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) $VALUES.clone();
    }

    public /* synthetic */ ToNumberPolicy(String str, int i, C47951 c47951) {
        this(str, i);
    }
}
