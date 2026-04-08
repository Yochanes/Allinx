package com.squareup.moshi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class JsonAdapter<T> {

    /* JADX INFO: renamed from: com.squareup.moshi.JsonAdapter$1 */
    /* JADX INFO: compiled from: Proguard */
    class C50171 extends JsonAdapter<Object> {
        public final String toString() {
            return "null.serializeNulls()";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.JsonAdapter$2 */
    /* JADX INFO: compiled from: Proguard */
    class C50182 extends JsonAdapter<Object> {
        public final String toString() {
            return "null.lenient()";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.JsonAdapter$3 */
    /* JADX INFO: compiled from: Proguard */
    class C50193 extends JsonAdapter<Object> {
        public final String toString() {
            return "null.failOnUnknown()";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.JsonAdapter$4 */
    /* JADX INFO: compiled from: Proguard */
    class C50204 extends JsonAdapter<Object> {
        public final String toString() {
            return "null.indent(\"null\")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
    }
}
