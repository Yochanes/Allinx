package io.ktor.http;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Lkotlin/Pair;", "", "cookie", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CookieKt$parseClientCookiesHeader$3 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Pair<? extends String, ? extends String>> {

    /* JADX INFO: renamed from: a */
    public static final CookieKt$parseClientCookiesHeader$3 f45621a = new CookieKt$parseClientCookiesHeader$3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair cookie = (Pair) obj;
        Intrinsics.m18599g(cookie, "cookie");
        String str = (String) cookie.f51427b;
        return (StringsKt.m20416N(str, "\"", false) && StringsKt.m20439o(str, "\"", false)) ? Pair.m18308a(cookie, null, StringsKt.m20408F(str), 1) : cookie;
    }
}
