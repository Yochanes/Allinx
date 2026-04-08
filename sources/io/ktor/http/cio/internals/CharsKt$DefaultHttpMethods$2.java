package io.ktor.http.cio.internals;

import io.ktor.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "m", "Lio/ktor/http/HttpMethod;", "idx", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class CharsKt$DefaultHttpMethods$2 extends Lambda implements Function2<HttpMethod, Integer, Character> {

    /* JADX INFO: renamed from: a */
    public static final CharsKt$DefaultHttpMethods$2 f45903a = new CharsKt$DefaultHttpMethods$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        HttpMethod m = (HttpMethod) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.m18599g(m, "m");
        return Character.valueOf(m.f45665a.charAt(iIntValue));
    }
}
