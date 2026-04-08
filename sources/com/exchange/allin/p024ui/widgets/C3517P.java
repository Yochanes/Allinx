package com.exchange.allin.p024ui.widgets;

import androidx.activity.OnBackPressedDispatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.P */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3517P implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41227a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OnBackPressedDispatcher f41228b;

    public /* synthetic */ C3517P(OnBackPressedDispatcher onBackPressedDispatcher, int i) {
        this.f41227a = i;
        this.f41228b = onBackPressedDispatcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41227a) {
            case 0:
                OnBackPressedDispatcher onBackPressedDispatcher = this.f41228b;
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.m167c();
                }
                break;
            default:
                OnBackPressedDispatcher onBackPressedDispatcher2 = this.f41228b;
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.m167c();
                }
                break;
        }
        return Unit.f51459a;
    }
}
