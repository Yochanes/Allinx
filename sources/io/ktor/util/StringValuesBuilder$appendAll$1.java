package io.ktor.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "name", "", "values", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class StringValuesBuilder$appendAll$1 extends Lambda implements Function2<String, List<? extends String>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StringValuesBuilder f46490a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValuesBuilder$appendAll$1(StringValuesBuilder stringValuesBuilder) {
        super(2);
        this.f46490a = stringValuesBuilder;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String name = (String) obj;
        List values = (List) obj2;
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(values, "values");
        this.f46490a.m17177c(values, name);
        return Unit.f51459a;
    }
}
