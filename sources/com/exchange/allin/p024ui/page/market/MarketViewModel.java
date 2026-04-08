package com.exchange.allin.p024ui.page.market;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "<init>", "()V", "ViewState", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MarketViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction;", "", "ChangePairSort", "ChangeTurnoverSort", "ChangePriceSort", "ChangeChangeSort", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangeChangeSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangePairSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangePriceSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangeTurnoverSort;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangeChangeSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeChangeSort extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ChangeChangeSort f39986a = new ChangeChangeSort();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangeChangeSort);
            }

            public final int hashCode() {
                return 1987404661;
            }

            public final String toString() {
                return "ChangeChangeSort";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangePairSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePairSort extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ChangePairSort f39987a = new ChangePairSort();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangePairSort);
            }

            public final int hashCode() {
                return 1679352671;
            }

            public final String toString() {
                return "ChangePairSort";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangePriceSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePriceSort extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ChangePriceSort f39988a = new ChangePriceSort();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangePriceSort);
            }

            public final int hashCode() {
                return -330320992;
            }

            public final String toString() {
                return "ChangePriceSort";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction$ChangeTurnoverSort;", "Lcom/exchange/allin/ui/page/market/MarketViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeTurnoverSort extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ChangeTurnoverSort f39989a = new ChangeTurnoverSort();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ChangeTurnoverSort);
            }

            public final int hashCode() {
                return -619009962;
            }

            public final String toString() {
                return "ChangeTurnoverSort";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/market/MarketViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final int f39990a;

        /* JADX INFO: renamed from: b */
        public final int f39991b;

        /* JADX INFO: renamed from: c */
        public final int f39992c;

        /* JADX INFO: renamed from: d */
        public final int f39993d;

        public ViewState(int i, int i2, int i3, int i4) {
            this.f39990a = i;
            this.f39991b = i2;
            this.f39992c = i3;
            this.f39993d = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f39990a == viewState.f39990a && this.f39991b == viewState.f39991b && this.f39992c == viewState.f39992c && this.f39993d == viewState.f39993d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f39993d) + AbstractC0455a.m2228c(this.f39992c, AbstractC0455a.m2228c(this.f39991b, Integer.hashCode(this.f39990a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(pairSort=");
            sb.append(this.f39990a);
            sb.append(", turnoverSort=");
            sb.append(this.f39991b);
            sb.append(", priceSort=");
            sb.append(this.f39992c);
            sb.append(", changeSort=");
            return AbstractC0000a.m17n(sb, this.f39993d, ')');
        }
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m13947f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new MarketViewModel$onAction$1(uiAction, this, null), 31);
    }
}
