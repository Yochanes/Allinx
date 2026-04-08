package io.ktor.http;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/ktor/http/ContentRange;", "", "Bounded", "Suffix", "TailFrom", "Lio/ktor/http/ContentRange$Bounded;", "Lio/ktor/http/ContentRange$TailFrom;", "Lio/ktor/http/ContentRange$Suffix;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class ContentRange {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentRange$Bounded;", "Lio/ktor/http/ContentRange;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Bounded extends ContentRange {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bounded)) {
                return false;
            }
            ((Bounded) obj).getClass();
            return true;
        }

        public final int hashCode() {
            int i = (int) 0;
            return (i * 31) + i;
        }

        public final String toString() {
            return "0-0";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentRange$Suffix;", "Lio/ktor/http/ContentRange;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Suffix extends ContentRange {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suffix)) {
                return false;
            }
            ((Suffix) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return (int) 0;
        }

        public final String toString() {
            return "-0";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentRange$TailFrom;", "Lio/ktor/http/ContentRange;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class TailFrom extends ContentRange {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TailFrom)) {
                return false;
            }
            ((TailFrom) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return (int) 0;
        }

        public final String toString() {
            return "0-";
        }
    }
}
