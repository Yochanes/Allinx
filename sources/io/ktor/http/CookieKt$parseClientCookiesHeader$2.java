package io.ktor.http;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CookieKt$parseClientCookiesHeader$2 extends Lambda implements Function1<Pair<? extends String, ? extends String>, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair it = (Pair) obj;
        Intrinsics.m18599g(it, "it");
        return true;
    }
}
