package com.exchange.allin.p024ui.page.assets.internal;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.Country;
import com.exchange.allin.repository.CommonRepository;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AssetsInternalWithdrawViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f38439f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction;", "", "LoadData", "ChangeAccountType", "ChangeAccount", "ChangeAmount", "ChangeCountry", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeAccountType;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeAmount;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$LoadData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAccount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38440a;

            public ChangeAccount(String account) {
                Intrinsics.m18599g(account, "account");
                this.f38440a = account;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAccount) && Intrinsics.m18594b(this.f38440a, ((ChangeAccount) obj).f38440a);
            }

            public final int hashCode() {
                return this.f38440a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAccount(account="), this.f38440a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeAccountType;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAccountType extends UiAction {

            /* JADX INFO: renamed from: a */
            public final int f38441a;

            public ChangeAccountType(int i) {
                this.f38441a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAccountType) && this.f38441a == ((ChangeAccountType) obj).f38441a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f38441a);
            }

            public final String toString() {
                return AbstractC0000a.m17n(new StringBuilder("ChangeAccountType(type="), this.f38441a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeAmount;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAmount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38442a;

            public ChangeAmount(String amount) {
                Intrinsics.m18599g(amount, "amount");
                this.f38442a = amount;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAmount) && Intrinsics.m18594b(this.f38442a, ((ChangeAmount) obj).f38442a);
            }

            public final int hashCode() {
                return this.f38442a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAmount(amount="), this.f38442a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f38443a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f38443a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f38443a, ((ChangeCountry) obj).f38443a);
            }

            public final int hashCode() {
                return this.f38443a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f38443a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction$LoadData;", "Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class LoadData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final LoadData f38444a = new LoadData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadData);
            }

            public final int hashCode() {
                return -1479184849;
            }

            public final String toString() {
                return "LoadData";
            }
        }
    }

    public AssetsInternalWithdrawViewModel(CommonRepository commonRepository) {
        this.f38439f = commonRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState();
    }

    /* JADX INFO: renamed from: f */
    public final void m13792f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new AssetsInternalWithdrawViewModel$onAction$1(uiAction, this, null), 31);
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/internal/AssetsInternalWithdrawViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final int f38445a;

        /* JADX INFO: renamed from: b */
        public final List f38446b;

        /* JADX INFO: renamed from: c */
        public final Country f38447c;

        /* JADX INFO: renamed from: d */
        public final String f38448d;

        /* JADX INFO: renamed from: e */
        public final String f38449e;

        public ViewState(int i, List list, Country country, String str, String str2) {
            this.f38445a = i;
            this.f38446b = list;
            this.f38447c = country;
            this.f38448d = str;
            this.f38449e = str2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13793a(ViewState viewState, int i, List list, Country country, String str, String str2, int i2) {
            if ((i2 & 1) != 0) {
                i = viewState.f38445a;
            }
            int i3 = i;
            if ((i2 & 2) != 0) {
                list = viewState.f38446b;
            }
            List countryList = list;
            if ((i2 & 4) != 0) {
                country = viewState.f38447c;
            }
            Country country2 = country;
            if ((i2 & 8) != 0) {
                str = viewState.f38448d;
            }
            String account = str;
            if ((i2 & 16) != 0) {
                str2 = viewState.f38449e;
            }
            String amount = str2;
            viewState.getClass();
            Intrinsics.m18599g(countryList, "countryList");
            Intrinsics.m18599g(account, "account");
            Intrinsics.m18599g(amount, "amount");
            return new ViewState(i3, countryList, country2, account, amount);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f38445a == viewState.f38445a && Intrinsics.m18594b(this.f38446b, viewState.f38446b) && Intrinsics.m18594b(this.f38447c, viewState.f38447c) && Intrinsics.m18594b(this.f38448d, viewState.f38448d) && Intrinsics.m18594b(this.f38449e, viewState.f38449e);
        }

        public final int hashCode() {
            int iM2233h = AbstractC0455a.m2233h(this.f38446b, Integer.hashCode(this.f38445a) * 31, 31);
            Country country = this.f38447c;
            return this.f38449e.hashCode() + AbstractC0000a.m5b((iM2233h + (country == null ? 0 : country.hashCode())) * 31, 31, this.f38448d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(accountType=");
            sb.append(this.f38445a);
            sb.append(", countryList=");
            sb.append(this.f38446b);
            sb.append(", country=");
            sb.append(this.f38447c);
            sb.append(", account=");
            sb.append(this.f38448d);
            sb.append(", amount=");
            return AbstractC0455a.m2241p(sb, this.f38449e, ')');
        }

        public /* synthetic */ ViewState() {
            this(0, EmptyList.f51496a, null, "", "");
        }
    }
}
