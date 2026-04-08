package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "T", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SingleInstanceFactory$get$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingleInstanceFactory f58219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InstanceContext f58220b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory$get$1(SingleInstanceFactory singleInstanceFactory, InstanceContext instanceContext) {
        super(0);
        this.f58219a = singleInstanceFactory;
        this.f58220b = instanceContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SingleInstanceFactory singleInstanceFactory = this.f58219a;
        if (singleInstanceFactory.f58218b == null) {
            singleInstanceFactory.f58218b = singleInstanceFactory.mo21805a(this.f58220b);
        }
        return Unit.f51459a;
    }
}
