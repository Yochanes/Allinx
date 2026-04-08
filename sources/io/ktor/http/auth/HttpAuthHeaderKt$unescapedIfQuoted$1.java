package io.ktor.http.auth;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpAuthHeaderKt$unescapedIfQuoted$1 extends Lambda implements Function1<MatchResult, CharSequence> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult it = (MatchResult) obj;
        Intrinsics.m18599g(it, "it");
        return StringsKt.m20426X(1, it.getValue());
    }
}
