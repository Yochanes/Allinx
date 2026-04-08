package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "t", "Lkotlin/Pair;", "", "Lio/ktor/http/cio/ConnectionOptions;", "idx", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class ConnectionOptions$Companion$knownTypes$2 extends Lambda implements Function2<Pair<? extends String, ? extends ConnectionOptions>, Integer, Character> {

    /* JADX INFO: renamed from: a */
    public static final ConnectionOptions$Companion$knownTypes$2 f45794a = new ConnectionOptions$Companion$knownTypes$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Pair t = (Pair) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.m18599g(t, "t");
        return Character.valueOf(((String) t.f51426a).charAt(iIntValue));
    }
}
