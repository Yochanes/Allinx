package org.koin.core.scope;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "T", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class Scope$resolveInstance$1 extends Lambda implements Function0<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParametersHolder f58256a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$resolveInstance$1(ParametersHolder parametersHolder) {
        super(0);
        this.f58256a = parametersHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "| >> parameters " + this.f58256a + ' ';
    }
}
