package io.ktor.http;

import io.ktor.util.StringValues;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/EmptyParameters;", "Lio/ktor/http/Parameters;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class EmptyParameters implements Parameters {

    /* JADX INFO: renamed from: c */
    public static final EmptyParameters f45642c = new EmptyParameters();

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
    public final List mo16961c(String str) {
        throw null;
    }

    @Override // io.ktor.util.StringValues
    public final Set entries() {
        return EmptySet.f51498a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Parameters) && ((Parameters) obj).isEmpty();
    }

    @Override // io.ktor.util.StringValues
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + EmptySet.f51498a;
    }
}
