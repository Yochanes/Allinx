package com.exchange.allin.p024ui.widgets;

import androidx.compose.foundation.ScrollState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/widgets/ScrollableTabDataEx;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ScrollableTabDataEx {

    /* JADX INFO: renamed from: a */
    public final ScrollState f41282a;

    /* JADX INFO: renamed from: b */
    public final CoroutineScope f41283b;

    /* JADX INFO: renamed from: c */
    public Integer f41284c;

    public ScrollableTabDataEx(CoroutineScope coroutineScope, ScrollState scrollState) {
        Intrinsics.m18599g(scrollState, "scrollState");
        Intrinsics.m18599g(coroutineScope, "coroutineScope");
        this.f41282a = scrollState;
        this.f41283b = coroutineScope;
    }
}
