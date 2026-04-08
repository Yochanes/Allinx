package com.exchange.allin.p024ui.page.assets.withdraw.detail;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.AssetPayToken;
import com.exchange.allin.repository.AssetRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AssetsWithdrawDetailViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: renamed from: f */
    public final AssetRepository f38686f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "", "InitData", "ChangeNetworkIndex", "ChangeAddress", "ChangeAmount", "VerifyWithdrawAddress", "DeleteAddress", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$ChangeAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$ChangeAmount;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$ChangeNetworkIndex;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$DeleteAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$VerifyWithdrawAddress;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$ChangeAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAddress extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38687a;

            public ChangeAddress(String address) {
                Intrinsics.m18599g(address, "address");
                this.f38687a = address;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAddress) && Intrinsics.m18594b(this.f38687a, ((ChangeAddress) obj).f38687a);
            }

            public final int hashCode() {
                return this.f38687a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAddress(address="), this.f38687a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$ChangeAmount;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAmount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38688a;

            public ChangeAmount(String value) {
                Intrinsics.m18599g(value, "value");
                this.f38688a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAmount) && Intrinsics.m18594b(this.f38688a, ((ChangeAmount) obj).f38688a);
            }

            public final int hashCode() {
                return this.f38688a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAmount(value="), this.f38688a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$ChangeNetworkIndex;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeNetworkIndex extends UiAction {

            /* JADX INFO: renamed from: a */
            public final int f38689a;

            public ChangeNetworkIndex(int i) {
                this.f38689a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeNetworkIndex) && this.f38689a == ((ChangeNetworkIndex) obj).f38689a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f38689a);
            }

            public final String toString() {
                return AbstractC0000a.m17n(new StringBuilder("ChangeNetworkIndex(index="), this.f38689a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$DeleteAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class DeleteAddress extends UiAction {

            /* JADX INFO: renamed from: a */
            public final long f38690a;

            public DeleteAddress(long j) {
                this.f38690a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DeleteAddress) && this.f38690a == ((DeleteAddress) obj).f38690a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f38690a);
            }

            public final String toString() {
                return AbstractC0455a.m2240o(new StringBuilder("DeleteAddress(id="), this.f38690a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final AssetPayToken f38691a;

            /* JADX INFO: renamed from: b */
            public final int f38692b;

            public InitData(AssetPayToken assetPayToken, int i) {
                Intrinsics.m18599g(assetPayToken, "assetPayToken");
                this.f38691a = assetPayToken;
                this.f38692b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitData)) {
                    return false;
                }
                InitData initData = (InitData) obj;
                return Intrinsics.m18594b(this.f38691a, initData.f38691a) && this.f38692b == initData.f38692b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f38692b) + (this.f38691a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InitData(assetPayToken=");
                sb.append(this.f38691a);
                sb.append(", curNetworkIndex=");
                return AbstractC0000a.m17n(sb, this.f38692b, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction$VerifyWithdrawAddress;", "Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyWithdrawAddress extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final VerifyWithdrawAddress f38693a = new VerifyWithdrawAddress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof VerifyWithdrawAddress);
            }

            public final int hashCode() {
                return -2025943666;
            }

            public final String toString() {
                return "VerifyWithdrawAddress";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/withdraw/detail/AssetsWithdrawDetailViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final AssetPayToken f38694a;

        /* JADX INFO: renamed from: b */
        public final int f38695b;

        /* JADX INFO: renamed from: c */
        public final List f38696c;

        /* JADX INFO: renamed from: d */
        public final String f38697d;

        /* JADX INFO: renamed from: e */
        public final String f38698e;

        /* JADX INFO: renamed from: f */
        public final String f38699f;

        public ViewState(AssetPayToken assetPayToken, int i, List addressList, String str, String str2, String str3) {
            Intrinsics.m18599g(addressList, "addressList");
            this.f38694a = assetPayToken;
            this.f38695b = i;
            this.f38696c = addressList;
            this.f38697d = str;
            this.f38698e = str2;
            this.f38699f = str3;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13814a(ViewState viewState, AssetPayToken assetPayToken, int i, List list, String str, String str2, String str3, int i2) {
            if ((i2 & 1) != 0) {
                assetPayToken = viewState.f38694a;
            }
            AssetPayToken assetPayToken2 = assetPayToken;
            if ((i2 & 2) != 0) {
                i = viewState.f38695b;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                list = viewState.f38696c;
            }
            List addressList = list;
            if ((i2 & 8) != 0) {
                str = viewState.f38697d;
            }
            String address = str;
            if ((i2 & 16) != 0) {
                str2 = viewState.f38698e;
            }
            String amount = str2;
            if ((i2 & 32) != 0) {
                str3 = viewState.f38699f;
            }
            viewState.getClass();
            Intrinsics.m18599g(addressList, "addressList");
            Intrinsics.m18599g(address, "address");
            Intrinsics.m18599g(amount, "amount");
            return new ViewState(assetPayToken2, i3, addressList, address, amount, str3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f38694a, viewState.f38694a) && this.f38695b == viewState.f38695b && Intrinsics.m18594b(this.f38696c, viewState.f38696c) && Intrinsics.m18594b(this.f38697d, viewState.f38697d) && Intrinsics.m18594b(this.f38698e, viewState.f38698e) && Intrinsics.m18594b(this.f38699f, viewState.f38699f);
        }

        public final int hashCode() {
            AssetPayToken assetPayToken = this.f38694a;
            return this.f38699f.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0455a.m2233h(this.f38696c, AbstractC0455a.m2228c(this.f38695b, (assetPayToken == null ? 0 : assetPayToken.hashCode()) * 31, 31), 31), 31, this.f38697d), 31, this.f38698e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(assetPayToken=");
            sb.append(this.f38694a);
            sb.append(", curNetworkIndex=");
            sb.append(this.f38695b);
            sb.append(", addressList=");
            sb.append(this.f38696c);
            sb.append(", address=");
            sb.append(this.f38697d);
            sb.append(", amount=");
            sb.append(this.f38698e);
            sb.append(", addressErrorMsg=");
            return AbstractC0455a.m2241p(sb, this.f38699f, ')');
        }
    }

    public AssetsWithdrawDetailViewModel(AssetRepository assetRepository) {
        this.f38686f = assetRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(null, 0, EmptyList.f51496a, "", "", "");
    }

    /* JADX INFO: renamed from: f */
    public final void m13813f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new AssetsWithdrawDetailViewModel$onAction$1(uiAction, this, null), 31);
    }
}
