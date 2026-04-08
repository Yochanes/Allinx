package com.exchange.allin.p024ui.page.account.login;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.Country;
import com.exchange.allin.data.LoginData;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class LoginViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f37356f;

    /* JADX INFO: renamed from: g */
    public final UserRepository f37357g;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "", "InitData", "ToggleLoginMode", "ChangeCountry", "ChangeAccount", "ChangePassword", "ToggleHidePassword", "SubmitData", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ChangePassword;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ToggleHidePassword;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ToggleLoginMode;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAccount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37358a;

            public ChangeAccount(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37358a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAccount) && Intrinsics.m18594b(this.f37358a, ((ChangeAccount) obj).f37358a);
            }

            public final int hashCode() {
                return this.f37358a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAccount(value="), this.f37358a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f37359a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f37359a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f37359a, ((ChangeCountry) obj).f37359a);
            }

            public final int hashCode() {
                return this.f37359a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f37359a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ChangePassword;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37360a;

            public ChangePassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37360a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePassword) && Intrinsics.m18594b(this.f37360a, ((ChangePassword) obj).f37360a);
            }

            public final int hashCode() {
                return this.f37360a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePassword(value="), this.f37360a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final LoginData f37361a;

            public InitData(LoginData loginData) {
                this.f37361a = loginData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitData) && Intrinsics.m18594b(this.f37361a, ((InitData) obj).f37361a);
            }

            public final int hashCode() {
                return this.f37361a.hashCode();
            }

            public final String toString() {
                return "InitData(loginData=" + this.f37361a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SubmitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37362a;

            public SubmitData(String str) {
                this.f37362a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SubmitData) && Intrinsics.m18594b(this.f37362a, ((SubmitData) obj).f37362a);
            }

            public final int hashCode() {
                return this.f37362a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("SubmitData(backRouteName="), this.f37362a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ToggleHidePassword;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHidePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHidePassword f37363a = new ToggleHidePassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHidePassword);
            }

            public final int hashCode() {
                return -915170093;
            }

            public final String toString() {
                return "ToggleHidePassword";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction$ToggleLoginMode;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleLoginMode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final boolean f37364a;

            public ToggleLoginMode(boolean z2) {
                this.f37364a = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToggleLoginMode) && this.f37364a == ((ToggleLoginMode) obj).f37364a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f37364a);
            }

            public final String toString() {
                return AbstractC0455a.m2243r(new StringBuilder("ToggleLoginMode(isEmail="), this.f37364a, ')');
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "VerifyResult", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewEvent$VerifyResult;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewEvent$VerifyResult;", "Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyResult extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37365a;

            public VerifyResult(VerifyData verifyData) {
                this.f37365a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyResult) && Intrinsics.m18594b(this.f37365a, ((VerifyResult) obj).f37365a);
            }

            public final int hashCode() {
                VerifyData verifyData = this.f37365a;
                if (verifyData == null) {
                    return 0;
                }
                return verifyData.hashCode();
            }

            public final String toString() {
                return "VerifyResult(data=" + this.f37365a + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/login/LoginViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final boolean f37366a;

        /* JADX INFO: renamed from: b */
        public final Country f37367b;

        /* JADX INFO: renamed from: c */
        public final String f37368c;

        /* JADX INFO: renamed from: d */
        public final String f37369d;

        /* JADX INFO: renamed from: e */
        public final boolean f37370e;

        /* JADX INFO: renamed from: f */
        public final List f37371f;

        /* JADX INFO: renamed from: g */
        public final boolean f37372g;

        public ViewState(boolean z2, Country country, String str, String str2, boolean z3, List countryList, boolean z4) {
            Intrinsics.m18599g(countryList, "countryList");
            this.f37366a = z2;
            this.f37367b = country;
            this.f37368c = str;
            this.f37369d = str2;
            this.f37370e = z3;
            this.f37371f = countryList;
            this.f37372g = z4;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13664a(ViewState viewState, boolean z2, Country country, String str, String str2, boolean z3, List list, boolean z4, int i) {
            if ((i & 1) != 0) {
                z2 = viewState.f37366a;
            }
            boolean z5 = z2;
            if ((i & 2) != 0) {
                country = viewState.f37367b;
            }
            Country country2 = country;
            if ((i & 4) != 0) {
                str = viewState.f37368c;
            }
            String account = str;
            if ((i & 8) != 0) {
                str2 = viewState.f37369d;
            }
            String password = str2;
            if ((i & 16) != 0) {
                z3 = viewState.f37370e;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                list = viewState.f37371f;
            }
            List countryList = list;
            if ((i & 64) != 0) {
                z4 = viewState.f37372g;
            }
            viewState.getClass();
            Intrinsics.m18599g(account, "account");
            Intrinsics.m18599g(password, "password");
            Intrinsics.m18599g(countryList, "countryList");
            return new ViewState(z5, country2, account, password, z6, countryList, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f37366a == viewState.f37366a && Intrinsics.m18594b(this.f37367b, viewState.f37367b) && Intrinsics.m18594b(this.f37368c, viewState.f37368c) && Intrinsics.m18594b(this.f37369d, viewState.f37369d) && this.f37370e == viewState.f37370e && Intrinsics.m18594b(this.f37371f, viewState.f37371f) && this.f37372g == viewState.f37372g;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f37366a) * 31;
            Country country = this.f37367b;
            return Boolean.hashCode(this.f37372g) + AbstractC0455a.m2233h(this.f37371f, AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b((iHashCode + (country == null ? 0 : country.hashCode())) * 31, 31, this.f37368c), 31, this.f37369d), 31, this.f37370e), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isEmail=");
            sb.append(this.f37366a);
            sb.append(", country=");
            sb.append(this.f37367b);
            sb.append(", account=");
            sb.append(this.f37368c);
            sb.append(", password=");
            sb.append(this.f37369d);
            sb.append(", isHidePassword=");
            sb.append(this.f37370e);
            sb.append(", countryList=");
            sb.append(this.f37371f);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37372g, ')');
        }
    }

    public LoginViewModel(CommonRepository commonRepository, UserRepository userRepository) {
        this.f37356f = commonRepository;
        this.f37357g = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(true, null, "", "", true, EmptyList.f51496a, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13663f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new LoginViewModel$onAction$1(uiAction, this, null), 31);
    }
}
