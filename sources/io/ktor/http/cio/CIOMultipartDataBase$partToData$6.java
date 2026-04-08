package io.ktor.http.cio;

import io.ktor.utils.p043io.core.Input;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lio/ktor/utils/io/core/Input;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CIOMultipartDataBase$partToData$6 extends Lambda implements Function0<Input> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lazy f45745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOMultipartDataBase$partToData$6(Lazy lazy) {
        super(0);
        this.f45745a = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (Input) this.f45745a.getValue();
    }
}
