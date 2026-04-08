package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty2Impl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class KMutableProperty2Impl$_setter$1 extends Lambda implements Function0<KMutableProperty2Impl.Setter<Object, Object, Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KMutableProperty2Impl f51869a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl$_setter$1(KMutableProperty2Impl kMutableProperty2Impl) {
        super(0);
        this.f51869a = kMutableProperty2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new KMutableProperty2Impl.Setter(this.f51869a);
    }
}
