package com.exchange.allin.p024ui.page.assets.bill;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.AssetFlowConfig;
import com.exchange.allin.p024ui.helper.AssetsHelper;
import com.exchange.allin.p024ui.widgets.IndexPagingSource;
import com.exchange.allin.repository.AssetRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewState;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AssetsBillViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final AssetRepository f38228f;

    /* JADX INFO: renamed from: g */
    public final Flow f38229g = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new AssetsBillViewModel$fundingPagingDataFlow$1(this, null));

    /* JADX INFO: renamed from: h */
    public final Flow f38230h = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new AssetsBillViewModel$spotPagingDataFlow$1(this, null));

    /* JADX INFO: renamed from: i */
    public final Flow f38231i = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new AssetsBillViewModel$futuresPagingDataFlow$1(this, null));

    /* JADX INFO: renamed from: j */
    public final Flow f38232j = IndexPagingSource.Companion.m14132a(ViewModelKt.m9173a(this), new AssetsBillViewModel$transferPagingDataFlow$1(this, null));

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction;", "", "ChangeType", "ChangeCoin", "ChangeDate", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction$ChangeCoin;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction$ChangeDate;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction$ChangeType;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction$ChangeCoin;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCoin extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38233a;

            public ChangeCoin(String coin) {
                Intrinsics.m18599g(coin, "coin");
                this.f38233a = coin;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCoin) && Intrinsics.m18594b(this.f38233a, ((ChangeCoin) obj).f38233a);
            }

            public final int hashCode() {
                return this.f38233a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCoin(coin="), this.f38233a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction$ChangeDate;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeDate extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38234a;

            public ChangeDate(String date) {
                Intrinsics.m18599g(date, "date");
                this.f38234a = date;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeDate) && Intrinsics.m18594b(this.f38234a, ((ChangeDate) obj).f38234a);
            }

            public final int hashCode() {
                return this.f38234a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeDate(date="), this.f38234a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction$ChangeType;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeType extends UiAction {

            /* JADX INFO: renamed from: a */
            public final int f38235a;

            /* JADX INFO: renamed from: b */
            public final Pair f38236b;

            public ChangeType(int i, Pair value) {
                Intrinsics.m18599g(value, "value");
                this.f38235a = i;
                this.f38236b = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeType)) {
                    return false;
                }
                ChangeType changeType = (ChangeType) obj;
                return this.f38235a == changeType.f38235a && Intrinsics.m18594b(this.f38236b, changeType.f38236b);
            }

            public final int hashCode() {
                return this.f38236b.hashCode() + (Integer.hashCode(this.f38235a) * 31);
            }

            public final String toString() {
                return "ChangeType(type=" + this.f38235a + ", value=" + this.f38236b + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "RefreshData", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewEvent$RefreshData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewEvent$RefreshData;", "Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class RefreshData extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final int f38237a;

            public RefreshData(int i) {
                this.f38237a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshData) && this.f38237a == ((RefreshData) obj).f38237a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f38237a);
            }

            public final String toString() {
                return AbstractC0000a.m17n(new StringBuilder("RefreshData(type="), this.f38237a, ')');
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/bill/AssetsBillViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final List f38238a;

        /* JADX INFO: renamed from: b */
        public final List f38239b;

        /* JADX INFO: renamed from: c */
        public final List f38240c;

        /* JADX INFO: renamed from: d */
        public final List f38241d;

        /* JADX INFO: renamed from: e */
        public final List f38242e;

        /* JADX INFO: renamed from: f */
        public final Pair f38243f;

        /* JADX INFO: renamed from: g */
        public final Pair f38244g;

        /* JADX INFO: renamed from: h */
        public final String f38245h;

        /* JADX INFO: renamed from: i */
        public final Pair f38246i;

        /* JADX INFO: renamed from: j */
        public final String f38247j;

        /* JADX INFO: renamed from: k */
        public final String f38248k;

        /* JADX INFO: renamed from: l */
        public final String f38249l;

        public ViewState(List list, List spotTypeList, List list2, List flashOptionTypeList, List list3, Pair pair, Pair pair2, String str, Pair pair3, String str2, String str3, String str4) {
            Intrinsics.m18599g(spotTypeList, "spotTypeList");
            Intrinsics.m18599g(flashOptionTypeList, "flashOptionTypeList");
            this.f38238a = list;
            this.f38239b = spotTypeList;
            this.f38240c = list2;
            this.f38241d = flashOptionTypeList;
            this.f38242e = list3;
            this.f38243f = pair;
            this.f38244g = pair2;
            this.f38245h = str;
            this.f38246i = pair3;
            this.f38247j = str2;
            this.f38248k = str3;
            this.f38249l = str4;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13764a(ViewState viewState, Pair pair, Pair pair2, String str, Pair pair3, String str2, String str3, String str4, int i) {
            List list = viewState.f38238a;
            List spotTypeList = viewState.f38239b;
            List list2 = viewState.f38240c;
            List flashOptionTypeList = viewState.f38241d;
            List list3 = viewState.f38242e;
            if ((i & 32) != 0) {
                pair = viewState.f38243f;
            }
            Pair fundingType = pair;
            Pair spotType = (i & 64) != 0 ? viewState.f38244g : pair2;
            String futuresType = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? viewState.f38245h : str;
            Pair flashOptionType = (i & 256) != 0 ? viewState.f38246i : pair3;
            String miniFuturesType = (i & 512) != 0 ? viewState.f38247j : str2;
            String coin = (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? viewState.f38248k : str3;
            String date = (i & 2048) != 0 ? viewState.f38249l : str4;
            viewState.getClass();
            Intrinsics.m18599g(spotTypeList, "spotTypeList");
            Intrinsics.m18599g(flashOptionTypeList, "flashOptionTypeList");
            Intrinsics.m18599g(fundingType, "fundingType");
            Intrinsics.m18599g(spotType, "spotType");
            Intrinsics.m18599g(futuresType, "futuresType");
            Intrinsics.m18599g(flashOptionType, "flashOptionType");
            Intrinsics.m18599g(miniFuturesType, "miniFuturesType");
            Intrinsics.m18599g(coin, "coin");
            Intrinsics.m18599g(date, "date");
            return new ViewState(list, spotTypeList, list2, flashOptionTypeList, list3, fundingType, spotType, futuresType, flashOptionType, miniFuturesType, coin, date);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF38249l() {
            return this.f38249l;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Pair getF38246i() {
            return this.f38246i;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Pair getF38243f() {
            return this.f38243f;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getF38245h() {
            return this.f38245h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f38238a, viewState.f38238a) && Intrinsics.m18594b(this.f38239b, viewState.f38239b) && Intrinsics.m18594b(this.f38240c, viewState.f38240c) && Intrinsics.m18594b(this.f38241d, viewState.f38241d) && Intrinsics.m18594b(this.f38242e, viewState.f38242e) && Intrinsics.m18594b(this.f38243f, viewState.f38243f) && Intrinsics.m18594b(this.f38244g, viewState.f38244g) && Intrinsics.m18594b(this.f38245h, viewState.f38245h) && Intrinsics.m18594b(this.f38246i, viewState.f38246i) && Intrinsics.m18594b(this.f38247j, viewState.f38247j) && Intrinsics.m18594b(this.f38248k, viewState.f38248k) && Intrinsics.m18594b(this.f38249l, viewState.f38249l);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getF38247j() {
            return this.f38247j;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Pair getF38244g() {
            return this.f38244g;
        }

        public final int hashCode() {
            return this.f38249l.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b((this.f38246i.hashCode() + AbstractC0000a.m5b((this.f38244g.hashCode() + ((this.f38243f.hashCode() + AbstractC0455a.m2233h(this.f38242e, AbstractC0455a.m2233h(this.f38241d, AbstractC0455a.m2233h(this.f38240c, AbstractC0455a.m2233h(this.f38239b, this.f38238a.hashCode() * 31, 31), 31), 31), 31)) * 31)) * 31, 31, this.f38245h)) * 31, 31, this.f38247j), 31, this.f38248k);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(fundingTypeList=");
            sb.append(this.f38238a);
            sb.append(", spotTypeList=");
            sb.append(this.f38239b);
            sb.append(", futuresTypeList=");
            sb.append(this.f38240c);
            sb.append(", flashOptionTypeList=");
            sb.append(this.f38241d);
            sb.append(", miniFuturesTypeList=");
            sb.append(this.f38242e);
            sb.append(", fundingType=");
            sb.append(this.f38243f);
            sb.append(", spotType=");
            sb.append(this.f38244g);
            sb.append(", futuresType=");
            sb.append(this.f38245h);
            sb.append(", flashOptionType=");
            sb.append(this.f38246i);
            sb.append(", miniFuturesType=");
            sb.append(this.f38247j);
            sb.append(", coin=");
            sb.append(this.f38248k);
            sb.append(", date=");
            return AbstractC0455a.m2241p(sb, this.f38249l, ')');
        }
    }

    public AssetsBillViewModel(AssetRepository assetRepository) {
        this.f38228f = assetRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        List<AssetFlowConfig> list = ((AssetsHelper.ViewState) AssetsHelper.f36831c.getValue()).f36857k;
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
        for (AssetFlowConfig assetFlowConfig : list) {
            arrayList.add(new Pair(Long.valueOf(assetFlowConfig.getId()), assetFlowConfig.getName()));
        }
        List list2 = AssetsBillViewModelKt.f38265b;
        List listM18414O = CollectionsKt.m18414O(StringExtKt.m14217f("asset_bill_text_all"), StringExtKt.m14217f("asset_bill_futures_type_text_close_pnl"), StringExtKt.m14217f("asset_bill_futures_type_text_transfer_frm"), StringExtKt.m14217f("asset_bill_futures_type_text_transfer_to"), StringExtKt.m14217f("asset_bill_futures_type_text_fee"), StringExtKt.m14217f("asset_bill_futures_type_text_commission"));
        List list3 = AssetsBillViewModelKt.f38266c;
        List listM18414O2 = CollectionsKt.m18414O(StringExtKt.m14217f("asset_bill_text_all"), StringExtKt.m14217f("asset_bill_futures_type_text_close_pnl"), StringExtKt.m14217f("asset_bill_futures_type_text_transfer_frm"), StringExtKt.m14217f("asset_bill_futures_type_text_transfer_to"), StringExtKt.m14217f("asset_bill_futures_type_text_fee"), StringExtKt.m14217f("asset_bill_futures_type_text_commission"));
        MutableStateFlow mutableStateFlow = AssetsHelper.f36831c;
        return new ViewState(arrayList, list2, listM18414O, list3, listM18414O2, new Pair(Long.valueOf(((AssetFlowConfig) CollectionsKt.m18398B(((AssetsHelper.ViewState) mutableStateFlow.getValue()).f36857k)).getId()), ((AssetFlowConfig) CollectionsKt.m18398B(((AssetsHelper.ViewState) mutableStateFlow.getValue()).f36857k)).getName()), new Pair(-1L, StringExtKt.m14217f("asset_bill_text_all")), StringExtKt.m14217f("asset_bill_text_all"), new Pair(0L, StringExtKt.m14217f("asset_bill_text_all")), StringExtKt.m14217f("asset_bill_text_all"), StringExtKt.m14217f("asset_bill_text_all"), StringExtKt.m14217f("asset_bill_text_all"));
    }

    /* JADX INFO: renamed from: f */
    public final void m13763f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new AssetsBillViewModel$onAction$1(uiAction, this, null), 31);
    }
}
