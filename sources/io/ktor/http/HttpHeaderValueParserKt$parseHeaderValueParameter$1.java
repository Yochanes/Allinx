package io.ktor.http;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\n¢\u0006\u0002\b\b"}, m18302d2 = {"addParam", "", AttributeType.TEXT, "", OpsMetricTracker.START, "", "end", "value", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpHeaderValueParserKt$parseHeaderValueParameter$1 extends Lambda implements Function4<String, Integer, Integer, String, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f45660a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHeaderValueParserKt$parseHeaderValueParameter$1(Lazy lazy) {
        super(4);
        this.f45660a = lazy;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX INFO: renamed from: a */
    public final void m16970a(int i, int i2, String text, String value) {
        Intrinsics.m18599g(text, "text");
        Intrinsics.m18599g(value, "value");
        String strM16969b = HttpHeaderValueParserKt.m16969b(i, i2, text);
        if (strM16969b.length() == 0) {
            return;
        }
        ((ArrayList) this.f45660a.getValue()).add(new HeaderValueParam(strM16969b, value));
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        m16970a(((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj, (String) obj4);
        return Unit.f51459a;
    }
}
