package com.exchange.allin.p024ui.page.account.forget;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.Country;
import com.exchange.allin.data.VerifyData;
import com.exchange.allin.repository.CommonRepository;
import com.exchange.allin.repository.UserRepository;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ForgetPasswordViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f37098f;

    /* JADX INFO: renamed from: g */
    public final UserRepository f37099g;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction;", "", "InitData", "ToggleLoginMode", "ChangeCountry", "ChangeAccount", "SubmitData", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$ToggleLoginMode;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAccount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37100a;

            public ChangeAccount(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37100a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAccount) && Intrinsics.m18594b(this.f37100a, ((ChangeAccount) obj).f37100a);
            }

            public final int hashCode() {
                return this.f37100a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAccount(value="), this.f37100a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f37101a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f37101a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f37101a, ((ChangeCountry) obj).f37101a);
            }

            public final int hashCode() {
                return this.f37101a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f37101a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final InitData f37102a = new InitData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InitData);
            }

            public final int hashCode() {
                return -480161481;
            }

            public final String toString() {
                return "InitData";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SubmitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SubmitData f37103a = new SubmitData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmitData);
            }

            public final int hashCode() {
                return 531940607;
            }

            public final String toString() {
                return "SubmitData";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction$ToggleLoginMode;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleLoginMode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final boolean f37104a;

            public ToggleLoginMode(boolean z2) {
                this.f37104a = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToggleLoginMode) && this.f37104a == ((ToggleLoginMode) obj).f37104a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f37104a);
            }

            public final String toString() {
                return AbstractC0455a.m2243r(new StringBuilder("ToggleLoginMode(isEmail="), this.f37104a, ')');
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "VerifyResult", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewEvent$VerifyResult;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewEvent$VerifyResult;", "Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyResult extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37105a;

            public VerifyResult(VerifyData verifyData) {
                this.f37105a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyResult) && Intrinsics.m18594b(this.f37105a, ((VerifyResult) obj).f37105a);
            }

            public final int hashCode() {
                return this.f37105a.hashCode();
            }

            public final String toString() {
                return "VerifyResult(data=" + this.f37105a + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/ForgetPasswordViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final boolean f37106a;

        /* JADX INFO: renamed from: b */
        public final Country f37107b;

        /* JADX INFO: renamed from: c */
        public final String f37108c;

        /* JADX INFO: renamed from: d */
        public final List f37109d;

        /* JADX INFO: renamed from: e */
        public final boolean f37110e;

        public ViewState(boolean z2, Country country, String str, List countryList, boolean z3) {
            Intrinsics.m18599g(countryList, "countryList");
            this.f37106a = z2;
            this.f37107b = country;
            this.f37108c = str;
            this.f37109d = countryList;
            this.f37110e = z3;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13647a(ViewState viewState, boolean z2, Country country, String str, List list, boolean z3, int i) {
            if ((i & 1) != 0) {
                z2 = viewState.f37106a;
            }
            boolean z4 = z2;
            if ((i & 2) != 0) {
                country = viewState.f37107b;
            }
            Country country2 = country;
            if ((i & 4) != 0) {
                str = viewState.f37108c;
            }
            String account = str;
            if ((i & 8) != 0) {
                list = viewState.f37109d;
            }
            List countryList = list;
            if ((i & 16) != 0) {
                z3 = viewState.f37110e;
            }
            viewState.getClass();
            Intrinsics.m18599g(account, "account");
            Intrinsics.m18599g(countryList, "countryList");
            return new ViewState(z4, country2, account, countryList, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f37106a == viewState.f37106a && Intrinsics.m18594b(this.f37107b, viewState.f37107b) && Intrinsics.m18594b(this.f37108c, viewState.f37108c) && Intrinsics.m18594b(this.f37109d, viewState.f37109d) && this.f37110e == viewState.f37110e;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f37106a) * 31;
            Country country = this.f37107b;
            return Boolean.hashCode(this.f37110e) + AbstractC0455a.m2233h(this.f37109d, AbstractC0000a.m5b((iHashCode + (country == null ? 0 : country.hashCode())) * 31, 31, this.f37108c), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isEmail=");
            sb.append(this.f37106a);
            sb.append(", country=");
            sb.append(this.f37107b);
            sb.append(", account=");
            sb.append(this.f37108c);
            sb.append(", countryList=");
            sb.append(this.f37109d);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37110e, ')');
        }
    }

    public ForgetPasswordViewModel(CommonRepository commonRepository, UserRepository userRepository) {
        this.f37098f = commonRepository;
        this.f37099g = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(true, null, "", EmptyList.f51496a, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13646f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new ForgetPasswordViewModel$onAction$1(uiAction, this, null), 31);
    }
}
