package com.exchange.allin.p024ui.page.spot.order;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.p024ui.widgets.IndexPagingSource;
import com.exchange.allin.repository.SpotRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewState;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SpotOrderViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final SpotRepository f40806f;

    /* JADX INFO: renamed from: g */
    public final Flow f40807g = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new SpotOrderViewModel$orderList$1(this, null));

    /* JADX INFO: renamed from: h */
    public final Flow f40808h = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new SpotOrderViewModel$tradeList$1(this, null));

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction;", "", "ChangePair", "ChangeSide", "ChangeDate", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction$ChangeDate;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction$ChangePair;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction$ChangeSide;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction$ChangeDate;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeDate extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f40809a;

            public ChangeDate(String date) {
                Intrinsics.m18599g(date, "date");
                this.f40809a = date;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeDate) && Intrinsics.m18594b(this.f40809a, ((ChangeDate) obj).f40809a);
            }

            public final int hashCode() {
                return this.f40809a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeDate(date="), this.f40809a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction$ChangePair;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePair extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f40810a;

            public ChangePair(String pair) {
                Intrinsics.m18599g(pair, "pair");
                this.f40810a = pair;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePair) && Intrinsics.m18594b(this.f40810a, ((ChangePair) obj).f40810a);
            }

            public final int hashCode() {
                return this.f40810a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePair(pair="), this.f40810a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction$ChangeSide;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeSide extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f40811a;

            public ChangeSide(String side) {
                Intrinsics.m18599g(side, "side");
                this.f40811a = side;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeSide) && Intrinsics.m18594b(this.f40811a, ((ChangeSide) obj).f40811a);
            }

            public final int hashCode() {
                return this.f40811a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeSide(side="), this.f40811a, ')');
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "RefreshOrder", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewEvent$RefreshOrder;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewEvent$RefreshOrder;", "Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class RefreshOrder extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final RefreshOrder f40812a = new RefreshOrder();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RefreshOrder);
            }

            public final int hashCode() {
                return 1445722529;
            }

            public final String toString() {
                return "RefreshOrder";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/spot/order/SpotOrderViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f40813a;

        /* JADX INFO: renamed from: b */
        public final String f40814b;

        /* JADX INFO: renamed from: c */
        public final String f40815c;

        public ViewState(String str, String str2, String str3) {
            this.f40813a = str;
            this.f40814b = str2;
            this.f40815c = str3;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m14068a(ViewState viewState, String pair, String side, String date, int i) {
            if ((i & 1) != 0) {
                pair = viewState.f40813a;
            }
            if ((i & 2) != 0) {
                side = viewState.f40814b;
            }
            if ((i & 4) != 0) {
                date = viewState.f40815c;
            }
            viewState.getClass();
            Intrinsics.m18599g(pair, "pair");
            Intrinsics.m18599g(side, "side");
            Intrinsics.m18599g(date, "date");
            return new ViewState(pair, side, date);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f40813a, viewState.f40813a) && Intrinsics.m18594b(this.f40814b, viewState.f40814b) && Intrinsics.m18594b(this.f40815c, viewState.f40815c);
        }

        public final int hashCode() {
            return this.f40815c.hashCode() + AbstractC0000a.m5b(this.f40813a.hashCode() * 31, 31, this.f40814b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(pair=");
            sb.append(this.f40813a);
            sb.append(", side=");
            sb.append(this.f40814b);
            sb.append(", date=");
            return AbstractC0455a.m2241p(sb, this.f40815c, ')');
        }
    }

    public SpotOrderViewModel(SpotRepository spotRepository) {
        this.f40806f = spotRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState("All", "All", "All");
    }

    /* JADX INFO: renamed from: f */
    public final void m14067f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new SpotOrderViewModel$onAction$1(uiAction, this, null), 31);
    }
}
