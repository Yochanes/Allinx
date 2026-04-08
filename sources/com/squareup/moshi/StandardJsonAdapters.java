package com.squareup.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class StandardJsonAdapters {

    /* JADX INFO: renamed from: a */
    public static final JsonAdapter.Factory f43423a = new C50301();

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C50301 implements JsonAdapter.Factory {
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$10 */
    /* JADX INFO: compiled from: Proguard */
    public class C503110 extends JsonAdapter<String> {
        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$11 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C503211 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43424a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f43424a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43424a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43424a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43424a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43424a[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43424a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C50332 extends JsonAdapter<Boolean> {
        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C50343 extends JsonAdapter<Byte> {
        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C50354 extends JsonAdapter<Character> {
        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C50365 extends JsonAdapter<Double> {
        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$6 */
    /* JADX INFO: compiled from: Proguard */
    public class C50376 extends JsonAdapter<Float> {
        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$7 */
    /* JADX INFO: compiled from: Proguard */
    public class C50387 extends JsonAdapter<Integer> {
        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$8 */
    /* JADX INFO: compiled from: Proguard */
    public class C50398 extends JsonAdapter<Long> {
        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.StandardJsonAdapters$9 */
    /* JADX INFO: compiled from: Proguard */
    public class C50409 extends JsonAdapter<Short> {
        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ObjectJsonAdapter extends JsonAdapter<Object> {
        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }
}
