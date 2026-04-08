package io.ktor.http;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m18302d2 = {"Lio/ktor/http/CacheControl;", "", "MaxAge", "NoCache", "NoStore", "Visibility", "Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl$MaxAge;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class CacheControl {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/CacheControl$MaxAge;", "Lio/ktor/http/CacheControl;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class MaxAge extends CacheControl {
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MaxAge)) {
                return false;
            }
            MaxAge maxAge = (MaxAge) obj;
            maxAge.getClass();
            maxAge.getClass();
            maxAge.getClass();
            maxAge.getClass();
            maxAge.getClass();
            return true;
        }

        public final int hashCode() {
            Boolean bool = Boolean.FALSE;
            return (bool.hashCode() + (bool.hashCode() * 31)) * 31;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=0");
            return CollectionsKt.m18409J(arrayList, ", ", null, null, null, 62);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class NoCache extends CacheControl {
        public final boolean equals(Object obj) {
            if (!(obj instanceof NoCache)) {
                return false;
            }
            ((NoCache) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "no-cache";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class NoStore extends CacheControl {
        public final boolean equals(Object obj) {
            if (!(obj instanceof NoStore)) {
                return false;
            }
            ((NoStore) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "no-store";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/CacheControl$Visibility;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Visibility {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Visibility[] f45570a = {new Visibility("Public", 0), new Visibility("Private", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Visibility EF5;

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) f45570a.clone();
        }
    }
}
