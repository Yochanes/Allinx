package io.ktor.http.cio;

import io.ktor.http.cio.MultipartEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "t", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class MultipartEvent$MultipartPart$release$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultipartEvent.MultipartPart f45833a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartEvent$MultipartPart$release$1(MultipartEvent.MultipartPart multipartPart) {
        super(1);
        this.f45833a = multipartPart;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Throwable) obj) == null) {
            return Unit.f51459a;
        }
        this.f45833a.getClass();
        throw null;
    }
}
