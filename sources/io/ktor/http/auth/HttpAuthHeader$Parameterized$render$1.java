package io.ktor.http.auth;

import io.ktor.http.HeaderValueParam;
import io.ktor.http.auth.HttpAuthHeader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Lio/ktor/http/HeaderValueParam;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpAuthHeader$Parameterized$render$1 extends Lambda implements Function1<HeaderValueParam, CharSequence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpAuthHeader.Parameterized f45719a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpAuthHeader$Parameterized$render$1(HttpAuthHeader.Parameterized parameterized) {
        super(1);
        this.f45719a = parameterized;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HeaderValueParam it = (HeaderValueParam) obj;
        Intrinsics.m18599g(it, "it");
        StringBuilder sb = new StringBuilder();
        sb.append(it.f45651a);
        sb.append('=');
        this.f45719a.getClass();
        throw null;
    }
}
