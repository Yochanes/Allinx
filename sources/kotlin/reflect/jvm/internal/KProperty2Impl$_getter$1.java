package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KProperty2Impl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0006\b\u0002\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", "E", "V", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class KProperty2Impl$_getter$1 extends Lambda implements Function0<KProperty2Impl.Getter<Object, Object, Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KProperty2Impl f51907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl$_getter$1(KProperty2Impl kProperty2Impl) {
        super(0);
        this.f51907a = kProperty2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new KProperty2Impl.Getter(this.f51907a);
    }
}
