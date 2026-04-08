package io.ktor.http.cio;

import io.ktor.http.cio.MultipartEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CIOMultipartDataBase$partToData$2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultipartEvent.MultipartPart f45742a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOMultipartDataBase$partToData$2(MultipartEvent.MultipartPart multipartPart) {
        super(0);
        this.f45742a = multipartPart;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f45742a.mo17019a();
        return Unit.f51459a;
    }
}
