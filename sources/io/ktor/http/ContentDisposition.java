package io.ktor.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/http/ContentDisposition;", "Lio/ktor/http/HeaderValueWithParameters;", "Companion", "Parameters", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ContentDisposition extends HeaderValueWithParameters {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f45584c = 0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentDisposition$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/ContentDisposition$Parameters;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Parameters {
    }

    static {
        EmptyList emptyList = EmptyList.f51496a;
        new ContentDisposition("file", emptyList);
        new ContentDisposition("mixed", emptyList);
        new ContentDisposition("attachment", emptyList);
        new ContentDisposition("inline", emptyList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDisposition(String disposition, List parameters) {
        super(disposition, parameters);
        Intrinsics.m18599g(disposition, "disposition");
        Intrinsics.m18599g(parameters, "parameters");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ContentDisposition)) {
            return false;
        }
        ContentDisposition contentDisposition = (ContentDisposition) obj;
        if (Intrinsics.m18594b(this.f45653a, contentDisposition.f45653a)) {
            return Intrinsics.m18594b(this.f45654b, contentDisposition.f45654b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45654b.hashCode() + (this.f45653a.hashCode() * 31);
    }
}
