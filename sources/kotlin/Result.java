package kotlin;

import java.io.Serializable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0007¨\u0006\b"}, m18302d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "Failure", "value", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmInline
public final class Result<T> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f51431a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/Result$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Failure implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f51432a;

        public Failure(Throwable exception) {
            Intrinsics.m18599g(exception, "exception");
            this.f51432a = exception;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                return Intrinsics.m18594b(this.f51432a, ((Failure) obj).f51432a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f51432a.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f51432a + ')';
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.f51431a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m18311a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f51432a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Result) {
            return Intrinsics.m18594b(this.f51431a, ((Result) obj).f51431a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f51431a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f51431a;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
