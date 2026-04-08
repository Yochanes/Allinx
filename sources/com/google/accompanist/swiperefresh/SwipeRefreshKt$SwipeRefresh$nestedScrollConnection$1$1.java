package com.google.accompanist.swiperefresh;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ State<Function0<Unit>> $updatedOnRefresh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1(State<? extends Function0<Unit>> state) {
        super(0);
        this.$updatedOnRefresh = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m22034invoke();
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22034invoke() {
        ((Function0) this.$updatedOnRefresh.getF20325a()).invoke();
    }
}
