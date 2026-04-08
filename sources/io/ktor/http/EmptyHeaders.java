package io.ktor.http;

import io.ktor.util.StringValues;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/EmptyHeaders;", "Lio/ktor/http/Headers;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class EmptyHeaders implements Headers {

    /* JADX INFO: renamed from: c */
    public static final EmptyHeaders f45641c = new EmptyHeaders();

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: a */
    public final void mo16959a(Function2 function2) {
        StringValues.DefaultImpls.m17174a(this, function2);
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: b */
    public final boolean getF46492d() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    /* JADX INFO: renamed from: c */
    public final List mo16961c(String name) {
        Intrinsics.m18599g(name, "name");
        return null;
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        return EmptySet.f51498a;
    }

    @Override // io.ktor.util.StringValues
    public final String get(String name) {
        Intrinsics.m18599g(name, "name");
        mo16961c(name);
        return null;
    }

    public final String toString() {
        return "Headers " + EmptySet.f51498a;
    }
}
