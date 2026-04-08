package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "V", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class KMutableProperty0Impl$_setter$1 extends Lambda implements Function0<KMutableProperty0Impl.Setter<Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KMutableProperty0Impl f51863a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl$_setter$1(KMutableProperty0Impl kMutableProperty0Impl) {
        super(0);
        this.f51863a = kMutableProperty0Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new KMutableProperty0Impl.Setter(this.f51863a);
    }
}
