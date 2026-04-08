package io.ktor.client.engine.cio;

import io.ktor.http.cio.RequestResponseBuilder;
import io.ktor.utils.p043io.core.InsufficientSpaceException;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "key", "", "value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class UtilsKt$write$2 extends Lambda implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RequestResponseBuilder f45157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$write$2(RequestResponseBuilder requestResponseBuilder) {
        super(2);
        this.f45157a = requestResponseBuilder;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws InsufficientSpaceException, EOFException {
        String key = (String) obj;
        String value = (String) obj2;
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        this.f45157a.m17025a(key, value);
        return Unit.f51459a;
    }
}
