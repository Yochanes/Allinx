package com.exchange.allin.p024ui.page.account.register;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.Country;
import com.exchange.allin.data.VerifyData;
import com.exchange.allin.repository.CommonRepository;
import com.exchange.allin.repository.UserRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class RegisterViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f37650f;

    /* JADX INFO: renamed from: g */
    public final UserRepository f37651g;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "", "InitData", "ToggleRegisterMode", "ChangeCountry", "ChangeAccount", "ChangePassword", "ChangeInviteCode", "ToggleHidePassword", "ToggleCheckAgreement", "SubmitData", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangeInviteCode;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangePassword;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ToggleCheckAgreement;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ToggleHidePassword;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ToggleRegisterMode;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAccount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37652a;

            public ChangeAccount(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37652a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAccount) && Intrinsics.m18594b(this.f37652a, ((ChangeAccount) obj).f37652a);
            }

            public final int hashCode() {
                return this.f37652a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAccount(value="), this.f37652a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f37653a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f37653a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f37653a, ((ChangeCountry) obj).f37653a);
            }

            public final int hashCode() {
                return this.f37653a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f37653a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangeInviteCode;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeInviteCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37654a;

            public ChangeInviteCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37654a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeInviteCode) && Intrinsics.m18594b(this.f37654a, ((ChangeInviteCode) obj).f37654a);
            }

            public final int hashCode() {
                return this.f37654a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeInviteCode(value="), this.f37654a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ChangePassword;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37655a;

            public ChangePassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37655a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePassword) && Intrinsics.m18594b(this.f37655a, ((ChangePassword) obj).f37655a);
            }

            public final int hashCode() {
                return this.f37655a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePassword(value="), this.f37655a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final InitData f37656a = new InitData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InitData);
            }

            public final int hashCode() {
                return -1694063534;
            }

            public final String toString() {
                return "InitData";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SubmitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SubmitData f37657a = new SubmitData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmitData);
            }

            public final int hashCode() {
                return -2091795110;
            }

            public final String toString() {
                return "SubmitData";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ToggleCheckAgreement;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleCheckAgreement extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleCheckAgreement f37658a = new ToggleCheckAgreement();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleCheckAgreement);
            }

            public final int hashCode() {
                return 305285582;
            }

            public final String toString() {
                return "ToggleCheckAgreement";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ToggleHidePassword;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHidePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHidePassword f37659a = new ToggleHidePassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHidePassword);
            }

            public final int hashCode() {
                return 1079392489;
            }

            public final String toString() {
                return "ToggleHidePassword";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction$ToggleRegisterMode;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleRegisterMode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final boolean f37660a;

            public ToggleRegisterMode(boolean z2) {
                this.f37660a = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ToggleRegisterMode) && this.f37660a == ((ToggleRegisterMode) obj).f37660a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f37660a);
            }

            public final String toString() {
                return AbstractC0455a.m2243r(new StringBuilder("ToggleRegisterMode(isEmail="), this.f37660a, ')');
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "VerifyResult", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewEvent$VerifyResult;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewEvent$VerifyResult;", "Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyResult extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37661a;

            public VerifyResult(VerifyData verifyData) {
                this.f37661a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyResult) && Intrinsics.m18594b(this.f37661a, ((VerifyResult) obj).f37661a);
            }

            public final int hashCode() {
                return this.f37661a.hashCode();
            }

            public final String toString() {
                return "VerifyResult(data=" + this.f37661a + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/register/RegisterViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final boolean f37662a;

        /* JADX INFO: renamed from: b */
        public final Country f37663b;

        /* JADX INFO: renamed from: c */
        public final String f37664c;

        /* JADX INFO: renamed from: d */
        public final String f37665d;

        /* JADX INFO: renamed from: e */
        public final String f37666e;

        /* JADX INFO: renamed from: f */
        public final boolean f37667f;

        /* JADX INFO: renamed from: g */
        public final boolean f37668g;

        /* JADX INFO: renamed from: h */
        public final List f37669h;

        /* JADX INFO: renamed from: i */
        public final boolean f37670i;

        public ViewState(boolean z2, Country country, String str, String str2, String str3, boolean z3, boolean z4, List countryList, boolean z5) {
            Intrinsics.m18599g(countryList, "countryList");
            this.f37662a = z2;
            this.f37663b = country;
            this.f37664c = str;
            this.f37665d = str2;
            this.f37666e = str3;
            this.f37667f = z3;
            this.f37668g = z4;
            this.f37669h = countryList;
            this.f37670i = z5;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13695a(ViewState viewState, boolean z2, Country country, String str, String str2, String str3, boolean z3, boolean z4, List list, boolean z5, int i) {
            if ((i & 1) != 0) {
                z2 = viewState.f37662a;
            }
            boolean z6 = z2;
            if ((i & 2) != 0) {
                country = viewState.f37663b;
            }
            Country country2 = country;
            if ((i & 4) != 0) {
                str = viewState.f37664c;
            }
            String account = str;
            if ((i & 8) != 0) {
                str2 = viewState.f37665d;
            }
            String password = str2;
            if ((i & 16) != 0) {
                str3 = viewState.f37666e;
            }
            String inviteCode = str3;
            boolean z7 = (i & 32) != 0 ? viewState.f37667f : z3;
            boolean z8 = (i & 64) != 0 ? viewState.f37668g : z4;
            List countryList = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? viewState.f37669h : list;
            boolean z9 = (i & 256) != 0 ? viewState.f37670i : z5;
            viewState.getClass();
            Intrinsics.m18599g(account, "account");
            Intrinsics.m18599g(password, "password");
            Intrinsics.m18599g(inviteCode, "inviteCode");
            Intrinsics.m18599g(countryList, "countryList");
            return new ViewState(z6, country2, account, password, inviteCode, z7, z8, countryList, z9);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f37662a == viewState.f37662a && Intrinsics.m18594b(this.f37663b, viewState.f37663b) && Intrinsics.m18594b(this.f37664c, viewState.f37664c) && Intrinsics.m18594b(this.f37665d, viewState.f37665d) && Intrinsics.m18594b(this.f37666e, viewState.f37666e) && this.f37667f == viewState.f37667f && this.f37668g == viewState.f37668g && Intrinsics.m18594b(this.f37669h, viewState.f37669h) && this.f37670i == viewState.f37670i;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f37662a) * 31;
            Country country = this.f37663b;
            return Boolean.hashCode(this.f37670i) + AbstractC0455a.m2233h(this.f37669h, AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b((iHashCode + (country == null ? 0 : country.hashCode())) * 31, 31, this.f37664c), 31, this.f37665d), 31, this.f37666e), 31, this.f37667f), 31, this.f37668g), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isEmail=");
            sb.append(this.f37662a);
            sb.append(", country=");
            sb.append(this.f37663b);
            sb.append(", account=");
            sb.append(this.f37664c);
            sb.append(", password=");
            sb.append(this.f37665d);
            sb.append(", inviteCode=");
            sb.append(this.f37666e);
            sb.append(", isHidePassword=");
            sb.append(this.f37667f);
            sb.append(", isCheckedAgreement=");
            sb.append(this.f37668g);
            sb.append(", countryList=");
            sb.append(this.f37669h);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37670i, ')');
        }
    }

    public RegisterViewModel(CommonRepository commonRepository, UserRepository userRepository) {
        this.f37650f = commonRepository;
        this.f37651g = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(true, null, "", "", "", true, false, EmptyList.f51496a, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13694f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new RegisterViewModel$onAction$1(uiAction, this, null), 31);
    }
}
