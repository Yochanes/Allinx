package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class CookieUtilsKt$tryParseTime$second$1$3 extends Lambda implements Function1<Character, Boolean> {

    /* JADX INFO: renamed from: a */
    public static final CookieUtilsKt$tryParseTime$second$1$3 f45635a = new CookieUtilsKt$tryParseTime$second$1$3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(CookieUtilsKt.m16955b(((Character) obj).charValue()));
    }
}
