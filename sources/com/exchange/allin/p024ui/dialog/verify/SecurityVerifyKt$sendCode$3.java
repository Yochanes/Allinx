package com.exchange.allin.p024ui.dialog.verify;

import com.exchange.allin.utils.ext.StringExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class SecurityVerifyKt$sendCode$3<T> implements FlowCollector {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f36807a;

    public SecurityVerifyKt$sendCode$3(Function1 function1) {
        this.f36807a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f36807a.invoke("(" + ((Number) obj).intValue() + StringExtKt.m14217f("common_unit_time_second") + ')');
        return Unit.f51459a;
    }
}
