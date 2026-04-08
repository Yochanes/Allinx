package io.ktor.util;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "", "Value", "Lio/ktor/util/CaseInsensitiveString;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CaseInsensitiveMap$entries$1 extends Lambda implements Function1<Map.Entry<CaseInsensitiveString, Object>, Map.Entry<String, Object>> {

    /* JADX INFO: renamed from: a */
    public static final CaseInsensitiveMap$entries$1 f46439a = new CaseInsensitiveMap$entries$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry receiver = (Map.Entry) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        return new Entry(((CaseInsensitiveString) receiver.getKey()).f46444b, receiver.getValue());
    }
}
