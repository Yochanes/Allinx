package com.exchange.allin.p024ui.page.futures.history;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.p024ui.widgets.IndexPagingSource;
import com.exchange.allin.repository.FuturesRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewState;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FuturesHistoryViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final FuturesRepository f39412f;

    /* JADX INFO: renamed from: g */
    public final Flow f39413g = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new FuturesHistoryViewModel$orderPagingDataFlow$1(this, null));

    /* JADX INFO: renamed from: h */
    public final Flow f39414h = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new FuturesHistoryViewModel$conditionalPagingDataFlow$1(this, null));

    /* JADX INFO: renamed from: i */
    public final Flow f39415i = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new FuturesHistoryViewModel$tradePagingDataFlow$1(this, null));

    /* JADX INFO: renamed from: j */
    public final Flow f39416j = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new FuturesHistoryViewModel$positionPagingDataFlow$1(this, null));

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction;", "", "LoadMarketList", "ChangeContract", "ChangeType", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction$ChangeContract;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction$ChangeType;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction$LoadMarketList;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction$ChangeContract;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeContract extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f39417a;

            public ChangeContract(String value) {
                Intrinsics.m18599g(value, "value");
                this.f39417a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeContract) && Intrinsics.m18594b(this.f39417a, ((ChangeContract) obj).f39417a);
            }

            public final int hashCode() {
                return this.f39417a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeContract(value="), this.f39417a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction$ChangeType;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeType extends UiAction {

            /* JADX INFO: renamed from: a */
            public final int f39418a;

            /* JADX INFO: renamed from: b */
            public final String f39419b;

            public ChangeType(int i, String value) {
                Intrinsics.m18599g(value, "value");
                this.f39418a = i;
                this.f39419b = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeType)) {
                    return false;
                }
                ChangeType changeType = (ChangeType) obj;
                return this.f39418a == changeType.f39418a && Intrinsics.m18594b(this.f39419b, changeType.f39419b);
            }

            public final int hashCode() {
                return this.f39419b.hashCode() + (Integer.hashCode(this.f39418a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ChangeType(type=");
                sb.append(this.f39418a);
                sb.append(", value=");
                return AbstractC0455a.m2241p(sb, this.f39419b, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction$LoadMarketList;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class LoadMarketList extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final LoadMarketList f39420a = new LoadMarketList();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadMarketList);
            }

            public final int hashCode() {
                return 476115475;
            }

            public final String toString() {
                return "LoadMarketList";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "RefreshData", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewEvent$RefreshData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewEvent$RefreshData;", "Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class RefreshData extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final int f39421a;

            public RefreshData(int i) {
                this.f39421a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshData) && this.f39421a == ((RefreshData) obj).f39421a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f39421a);
            }

            public final String toString() {
                return AbstractC0000a.m17n(new StringBuilder("RefreshData(type="), this.f39421a, ')');
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/futures/history/FuturesHistoryViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final List f39422a;

        /* JADX INFO: renamed from: b */
        public final List f39423b;

        /* JADX INFO: renamed from: c */
        public final List f39424c;

        /* JADX INFO: renamed from: d */
        public final List f39425d;

        /* JADX INFO: renamed from: e */
        public final String f39426e;

        /* JADX INFO: renamed from: f */
        public final String f39427f;

        /* JADX INFO: renamed from: g */
        public final String f39428g;

        /* JADX INFO: renamed from: h */
        public final String f39429h;

        public ViewState(List contractList, List list, List list2, List list3, String str, String str2, String str3, String str4) {
            Intrinsics.m18599g(contractList, "contractList");
            this.f39422a = contractList;
            this.f39423b = list;
            this.f39424c = list2;
            this.f39425d = list3;
            this.f39426e = str;
            this.f39427f = str2;
            this.f39428g = str3;
            this.f39429h = str4;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13897a(ViewState viewState, ArrayList arrayList, String str, String str2, String str3, String str4, int i) {
            List list = arrayList;
            if ((i & 1) != 0) {
                list = viewState.f39422a;
            }
            List contractList = list;
            List list2 = viewState.f39423b;
            List list3 = viewState.f39424c;
            List list4 = viewState.f39425d;
            if ((i & 16) != 0) {
                str = viewState.f39426e;
            }
            String contract = str;
            if ((i & 32) != 0) {
                str2 = viewState.f39427f;
            }
            String orderType = str2;
            if ((i & 64) != 0) {
                str3 = viewState.f39428g;
            }
            String tradeType = str3;
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                str4 = viewState.f39429h;
            }
            String positionType = str4;
            viewState.getClass();
            Intrinsics.m18599g(contractList, "contractList");
            Intrinsics.m18599g(contract, "contract");
            Intrinsics.m18599g(orderType, "orderType");
            Intrinsics.m18599g(tradeType, "tradeType");
            Intrinsics.m18599g(positionType, "positionType");
            return new ViewState(contractList, list2, list3, list4, contract, orderType, tradeType, positionType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f39422a, viewState.f39422a) && Intrinsics.m18594b(this.f39423b, viewState.f39423b) && Intrinsics.m18594b(this.f39424c, viewState.f39424c) && Intrinsics.m18594b(this.f39425d, viewState.f39425d) && Intrinsics.m18594b(this.f39426e, viewState.f39426e) && Intrinsics.m18594b(this.f39427f, viewState.f39427f) && Intrinsics.m18594b(this.f39428g, viewState.f39428g) && Intrinsics.m18594b(this.f39429h, viewState.f39429h);
        }

        public final int hashCode() {
            return this.f39429h.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2233h(this.f39425d, AbstractC0455a.m2233h(this.f39424c, AbstractC0455a.m2233h(this.f39423b, this.f39422a.hashCode() * 31, 31), 31), 31), 31, this.f39426e), 31, this.f39427f), 31, this.f39428g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(contractList=");
            sb.append(this.f39422a);
            sb.append(", orderTypeList=");
            sb.append(this.f39423b);
            sb.append(", tradeTypeList=");
            sb.append(this.f39424c);
            sb.append(", positionTypeList=");
            sb.append(this.f39425d);
            sb.append(", contract=");
            sb.append(this.f39426e);
            sb.append(", orderType=");
            sb.append(this.f39427f);
            sb.append(", tradeType=");
            sb.append(this.f39428g);
            sb.append(", positionType=");
            return AbstractC0455a.m2241p(sb, this.f39429h, ')');
        }
    }

    public FuturesHistoryViewModel(FuturesRepository futuresRepository) {
        this.f39412f = futuresRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(EmptyList.f51496a, CollectionsKt.m18422W(StringExtKt.m14217f("futures_history_text_all"), StringExtKt.m14217f("futures_history_order_type_text_limit_or_market")), CollectionsKt.m18422W(StringExtKt.m14217f("futures_history_text_all"), StringExtKt.m14217f("futures_history_trade_type_text_open"), StringExtKt.m14217f("futures_history_trade_type_text_close")), CollectionsKt.m18422W(StringExtKt.m14217f("futures_history_text_all"), StringExtKt.m14217f("futures_history_position_type_text_trade"), StringExtKt.m14217f("futures_history_position_type_text_liquidation"), StringExtKt.m14217f("futures_history_position_type_text_adl")), StringExtKt.m14217f("futures_history_text_all"), StringExtKt.m14217f("futures_history_text_all"), StringExtKt.m14217f("futures_history_text_all"), StringExtKt.m14217f("futures_history_text_all"));
    }

    /* JADX INFO: renamed from: f */
    public final void m13896f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new FuturesHistoryViewModel$onAction$1(uiAction, this, null), 31);
    }
}
