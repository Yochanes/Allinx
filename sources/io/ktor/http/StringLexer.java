package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/StringLexer;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class StringLexer {

    /* JADX INFO: renamed from: a */
    public int f45691a;

    /* JADX INFO: renamed from: b */
    public final String f45692b;

    public StringLexer(String source) {
        Intrinsics.m18599g(source, "source");
        this.f45692b = source;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16979a(Function1 predicate) {
        Intrinsics.m18599g(predicate, "predicate");
        boolean zM16981c = m16981c(predicate);
        if (zM16981c) {
            this.f45691a++;
        }
        return zM16981c;
    }

    /* JADX INFO: renamed from: b */
    public final void m16980b(Function1 function1) {
        if (m16981c(function1)) {
            while (m16981c(function1)) {
                this.f45691a++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16981c(Function1 predicate) {
        Intrinsics.m18599g(predicate, "predicate");
        int i = this.f45691a;
        String str = this.f45692b;
        return i < str.length() && ((Boolean) predicate.invoke(Character.valueOf(str.charAt(this.f45691a)))).booleanValue();
    }
}
