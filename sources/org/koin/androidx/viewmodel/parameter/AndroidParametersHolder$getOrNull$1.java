package org.koin.androidx.viewmodel.parameter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
final class AndroidParametersHolder$getOrNull$1 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AndroidParametersHolder f58189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KClass f58190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParametersHolder$getOrNull$1(AndroidParametersHolder androidParametersHolder, KClass kClass) {
        super(0);
        this.f58189a = androidParametersHolder;
        this.f58190b = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return AndroidParametersHolder.m21793b(this.f58189a, this.f58190b);
    }
}
