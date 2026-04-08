package io.ktor.http;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Lkotlin/Pair;", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CookieKt$parseClientCookiesHeader$1 extends Lambda implements Function1<MatchResult, Pair<? extends String, ? extends String>> {

    /* JADX INFO: renamed from: a */
    public static final CookieKt$parseClientCookiesHeader$1 f45620a = new CookieKt$parseClientCookiesHeader$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult it = (MatchResult) obj;
        Intrinsics.m18599g(it, "it");
        MatchGroup matchGroupM20394e = it.getF55199c().m20394e(2);
        String str = matchGroupM20394e != null ? matchGroupM20394e.f55194a : "";
        MatchGroup matchGroupM20394e2 = it.getF55199c().m20394e(4);
        return new Pair(str, matchGroupM20394e2 != null ? matchGroupM20394e2.f55194a : "");
    }
}
