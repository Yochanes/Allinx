package com.exchange.allin.p024ui.page.assets.withdraw.address;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.AssetWithdrawAddress;
import com.exchange.allin.repository.AssetRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewState;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AssetsWithdrawAddressViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final AssetRepository f38618f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "", "InitData", "ChangeCoin", "ChangeAddress", "ChangeNetwork", "ChangeRemark", "VerifyWithdrawAddress", "Submit", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeCoin;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeNetwork;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeRemark;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$VerifyWithdrawAddress;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAddress extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38619a;

            public ChangeAddress(String address) {
                Intrinsics.m18599g(address, "address");
                this.f38619a = address;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAddress) && Intrinsics.m18594b(this.f38619a, ((ChangeAddress) obj).f38619a);
            }

            public final int hashCode() {
                return this.f38619a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAddress(address="), this.f38619a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeCoin;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCoin extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38620a;

            public ChangeCoin(String coinName) {
                Intrinsics.m18599g(coinName, "coinName");
                this.f38620a = coinName;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCoin) && Intrinsics.m18594b(this.f38620a, ((ChangeCoin) obj).f38620a);
            }

            public final int hashCode() {
                return this.f38620a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCoin(coinName="), this.f38620a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeNetwork;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeNetwork extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38621a;

            public ChangeNetwork(String network) {
                Intrinsics.m18599g(network, "network");
                this.f38621a = network;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeNetwork) && Intrinsics.m18594b(this.f38621a, ((ChangeNetwork) obj).f38621a);
            }

            public final int hashCode() {
                return this.f38621a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeNetwork(network="), this.f38621a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$ChangeRemark;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeRemark extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38622a;

            public ChangeRemark(String remark) {
                Intrinsics.m18599g(remark, "remark");
                this.f38622a = remark;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeRemark) && Intrinsics.m18594b(this.f38622a, ((ChangeRemark) obj).f38622a);
            }

            public final int hashCode() {
                return this.f38622a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeRemark(remark="), this.f38622a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final AssetWithdrawAddress f38623a;

            public InitData(AssetWithdrawAddress assetWithdrawAddress) {
                this.f38623a = assetWithdrawAddress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitData) && Intrinsics.m18594b(this.f38623a, ((InitData) obj).f38623a);
            }

            public final int hashCode() {
                return this.f38623a.hashCode();
            }

            public final String toString() {
                return "InitData(addressData=" + this.f38623a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f38624a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -1112935863;
            }

            public final String toString() {
                return "Submit";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction$VerifyWithdrawAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyWithdrawAddress extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final VerifyWithdrawAddress f38625a = new VerifyWithdrawAddress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof VerifyWithdrawAddress);
            }

            public final int hashCode() {
                return 620436864;
            }

            public final String toString() {
                return "VerifyWithdrawAddress";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f38626a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return 1618190697;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/address/AssetsWithdrawAddressViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final AssetWithdrawAddress f38627a;

        /* JADX INFO: renamed from: b */
        public final String f38628b;

        /* JADX INFO: renamed from: c */
        public final boolean f38629c;

        public ViewState(AssetWithdrawAddress assetWithdrawAddress, String str, boolean z2) {
            this.f38627a = assetWithdrawAddress;
            this.f38628b = str;
            this.f38629c = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13808a(ViewState viewState, AssetWithdrawAddress assetWithdrawAddress, String str, boolean z2, int i) {
            if ((i & 1) != 0) {
                assetWithdrawAddress = viewState.f38627a;
            }
            if ((i & 2) != 0) {
                str = viewState.f38628b;
            }
            if ((i & 4) != 0) {
                z2 = viewState.f38629c;
            }
            viewState.getClass();
            return new ViewState(assetWithdrawAddress, str, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f38627a, viewState.f38627a) && Intrinsics.m18594b(this.f38628b, viewState.f38628b) && this.f38629c == viewState.f38629c;
        }

        public final int hashCode() {
            AssetWithdrawAddress assetWithdrawAddress = this.f38627a;
            return Boolean.hashCode(this.f38629c) + AbstractC0000a.m5b((assetWithdrawAddress == null ? 0 : assetWithdrawAddress.hashCode()) * 31, 31, this.f38628b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(addressData=");
            sb.append(this.f38627a);
            sb.append(", addressErrorMsg=");
            sb.append(this.f38628b);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f38629c, ')');
        }
    }

    public AssetsWithdrawAddressViewModel(AssetRepository assetRepository) {
        this.f38618f = assetRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(null, "", false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13807f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new AssetsWithdrawAddressViewModel$onAction$1(uiAction, this, null), 31);
    }
}
