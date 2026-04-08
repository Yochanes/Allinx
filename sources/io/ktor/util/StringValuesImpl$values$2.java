package io.ktor.util;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class StringValuesImpl$values$2 extends Lambda implements Function0<Map<String, ? extends List<? extends String>>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StringValuesImpl f46493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f46494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValuesImpl$values$2(StringValuesImpl stringValuesImpl, Map map) {
        super(0);
        this.f46493a = stringValuesImpl;
        this.f46494b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z2 = this.f46493a.f46492d;
        Map map = this.f46494b;
        if (!z2) {
            return MapsKt.m18490m(map);
        }
        CaseInsensitiveMap caseInsensitiveMap = new CaseInsensitiveMap();
        caseInsensitiveMap.putAll(map);
        return caseInsensitiveMap;
    }
}
