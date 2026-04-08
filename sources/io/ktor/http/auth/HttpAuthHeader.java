package io.ktor.http.auth;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/ktor/http/auth/HttpAuthHeader;", "", "Companion", "Parameterized", "Parameters", "Single", "Lio/ktor/http/auth/HttpAuthHeader$Single;", "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class HttpAuthHeader {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Parameterized extends HttpAuthHeader {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[HeaderValueEncoding.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
            }
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        /* JADX INFO: renamed from: a */
        public final String mo16996a() {
            Intrinsics.m18599g(null, "encoding");
            CollectionsKt.m18409J(null, ", ", "null ", null, new HttpAuthHeader$Parameterized$render$1(this), 28);
            throw null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) obj;
            parameterized.getClass();
            parameterized.getClass();
            return true;
        }

        public final int hashCode() {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameters;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Parameters {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Single;", "Lio/ktor/http/auth/HttpAuthHeader;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Single extends HttpAuthHeader {
        @Override // io.ktor.http.auth.HttpAuthHeader
        /* JADX INFO: renamed from: a */
        public final String mo16996a() {
            return "null null";
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Single)) {
                return false;
            }
            Single single = (Single) obj;
            single.getClass();
            single.getClass();
            return true;
        }

        public final int hashCode() {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo16996a();

    public final String toString() {
        return mo16996a();
    }
}
