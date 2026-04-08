package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ScaffoldKt$AppScaffold$3 implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComposableLambdaImpl f41279a;

    public ScaffoldKt$AppScaffold$3(ComposableLambdaImpl composableLambdaImpl) {
        this.f41279a = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            this.f41279a.invoke(composer, 0);
        }
        return Unit.f51459a;
    }
}
