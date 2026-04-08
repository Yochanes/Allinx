package io.ktor.client.features.cookies;

import io.ktor.http.Cookie;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Lio/ktor/http/Cookie;", "invoke", "io/ktor/client/features/cookies/AcceptAllCookiesStorage$addCookie$2$2"}, m18303k = 3, m18304mv = {1, 4, 2})
final class AcceptAllCookiesStorage$addCookie$$inlined$withLock$lambda$1 extends Lambda implements Function1<Cookie, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Cookie f45357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Url f45358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptAllCookiesStorage$addCookie$$inlined$withLock$lambda$1(Cookie cookie, Url url) {
        super(1);
        this.f45357a = cookie;
        this.f45358b = url;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Cookie it = (Cookie) obj;
        Intrinsics.m18599g(it, "it");
        return Boolean.valueOf(Intrinsics.m18594b(it.f45590a, this.f45357a.f45590a) && CookiesStorageKt.m16913a(it, this.f45358b));
    }
}
