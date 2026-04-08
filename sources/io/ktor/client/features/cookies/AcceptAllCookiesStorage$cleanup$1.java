package io.ktor.client.features.cookies;

import io.ktor.http.Cookie;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "cookie", "Lio/ktor/http/Cookie;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class AcceptAllCookiesStorage$cleanup$1 extends Lambda implements Function1<Cookie, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f45366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptAllCookiesStorage$cleanup$1(long j) {
        super(1);
        this.f45366a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Cookie cookie = (Cookie) obj;
        Intrinsics.m18599g(cookie, "cookie");
        boolean z2 = false;
        GMTDate gMTDate = cookie.f45594e;
        if (gMTDate != null) {
            if (gMTDate.f46594n < this.f45366a) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
