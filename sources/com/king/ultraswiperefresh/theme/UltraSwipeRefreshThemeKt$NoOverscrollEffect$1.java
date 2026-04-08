package com.king.ultraswiperefresh.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class UltraSwipeRefreshThemeKt$NoOverscrollEffect$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f43291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f43292b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UltraSwipeRefreshThemeKt$NoOverscrollEffect$1(Function2 function2, int i) {
        super(2);
        this.f43291a = function2;
        this.f43292b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM4417a = RecomposeScopeImplKt.m4417a(this.f43292b | 1);
        UltraSwipeRefreshThemeKt.m15395a(this.f43291a, (Composer) obj, iM4417a);
        return Unit.f51459a;
    }
}
