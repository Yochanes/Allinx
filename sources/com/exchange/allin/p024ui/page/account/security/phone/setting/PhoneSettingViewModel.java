package com.exchange.allin.p024ui.page.account.security.phone.setting;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.Country;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class PhoneSettingViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f37922f;

    /* JADX INFO: renamed from: g */
    public final UserRepository f37923g;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "", "InitData", "ChangeCountry", "ChangePhone", "ChangePhoneCode", "ChangeEmailCode", "SendPhoneCode", "SendEmailCode", "Submit", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangeEmailCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangePhone;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangePhoneCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$SendEmailCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$SendPhoneCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$Submit;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f37924a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f37924a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f37924a, ((ChangeCountry) obj).f37924a);
            }

            public final int hashCode() {
                return this.f37924a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f37924a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangeEmailCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeEmailCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37925a;

            public ChangeEmailCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37925a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeEmailCode) && Intrinsics.m18594b(this.f37925a, ((ChangeEmailCode) obj).f37925a);
            }

            public final int hashCode() {
                return this.f37925a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeEmailCode(value="), this.f37925a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangePhone;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePhone extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37926a;

            public ChangePhone(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37926a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePhone) && Intrinsics.m18594b(this.f37926a, ((ChangePhone) obj).f37926a);
            }

            public final int hashCode() {
                return this.f37926a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePhone(value="), this.f37926a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$ChangePhoneCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePhoneCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37927a;

            public ChangePhoneCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37927a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePhoneCode) && Intrinsics.m18594b(this.f37927a, ((ChangePhoneCode) obj).f37927a);
            }

            public final int hashCode() {
                return this.f37927a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePhoneCode(value="), this.f37927a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final InitData f37928a = new InitData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InitData);
            }

            public final int hashCode() {
                return -884826350;
            }

            public final String toString() {
                return "InitData";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$SendEmailCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SendEmailCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SendEmailCode f37929a = new SendEmailCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendEmailCode);
            }

            public final int hashCode() {
                return -1468740151;
            }

            public final String toString() {
                return "SendEmailCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$SendPhoneCode;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SendPhoneCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SendPhoneCode f37930a = new SendPhoneCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendPhoneCode);
            }

            public final int hashCode() {
                return -323189093;
            }

            public final String toString() {
                return "SendPhoneCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37931a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -1661449136;
            }

            public final String toString() {
                return "Submit";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f37932a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return 1794148418;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/phone/setting/PhoneSettingViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final Country f37933a;

        /* JADX INFO: renamed from: b */
        public final String f37934b;

        /* JADX INFO: renamed from: c */
        public final String f37935c;

        /* JADX INFO: renamed from: d */
        public final String f37936d;

        /* JADX INFO: renamed from: e */
        public final String f37937e;

        /* JADX INFO: renamed from: f */
        public final String f37938f;

        /* JADX INFO: renamed from: g */
        public final List f37939g;

        /* JADX INFO: renamed from: h */
        public final boolean f37940h;

        public ViewState(Country country, String str, String str2, String str3, String str4, String str5, List countryList, boolean z2) {
            Intrinsics.m18599g(countryList, "countryList");
            this.f37933a = country;
            this.f37934b = str;
            this.f37935c = str2;
            this.f37936d = str3;
            this.f37937e = str4;
            this.f37938f = str5;
            this.f37939g = countryList;
            this.f37940h = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13739a(ViewState viewState, Country country, String str, String str2, String str3, String str4, String str5, List list, boolean z2, int i) {
            if ((i & 1) != 0) {
                country = viewState.f37933a;
            }
            Country country2 = country;
            if ((i & 2) != 0) {
                str = viewState.f37934b;
            }
            String phone = str;
            if ((i & 4) != 0) {
                str2 = viewState.f37935c;
            }
            String phoneCode = str2;
            if ((i & 8) != 0) {
                str3 = viewState.f37936d;
            }
            String phoneCodeTime = str3;
            if ((i & 16) != 0) {
                str4 = viewState.f37937e;
            }
            String emailCode = str4;
            if ((i & 32) != 0) {
                str5 = viewState.f37938f;
            }
            String emailCodeTime = str5;
            List countryList = (i & 64) != 0 ? viewState.f37939g : list;
            boolean z3 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? viewState.f37940h : z2;
            viewState.getClass();
            Intrinsics.m18599g(phone, "phone");
            Intrinsics.m18599g(phoneCode, "phoneCode");
            Intrinsics.m18599g(phoneCodeTime, "phoneCodeTime");
            Intrinsics.m18599g(emailCode, "emailCode");
            Intrinsics.m18599g(emailCodeTime, "emailCodeTime");
            Intrinsics.m18599g(countryList, "countryList");
            return new ViewState(country2, phone, phoneCode, phoneCodeTime, emailCode, emailCodeTime, countryList, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37933a, viewState.f37933a) && Intrinsics.m18594b(this.f37934b, viewState.f37934b) && Intrinsics.m18594b(this.f37935c, viewState.f37935c) && Intrinsics.m18594b(this.f37936d, viewState.f37936d) && Intrinsics.m18594b(this.f37937e, viewState.f37937e) && Intrinsics.m18594b(this.f37938f, viewState.f37938f) && Intrinsics.m18594b(this.f37939g, viewState.f37939g) && this.f37940h == viewState.f37940h;
        }

        public final int hashCode() {
            Country country = this.f37933a;
            return Boolean.hashCode(this.f37940h) + AbstractC0455a.m2233h(this.f37939g, AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b((country == null ? 0 : country.hashCode()) * 31, 31, this.f37934b), 31, this.f37935c), 31, this.f37936d), 31, this.f37937e), 31, this.f37938f), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(country=");
            sb.append(this.f37933a);
            sb.append(", phone=");
            sb.append(this.f37934b);
            sb.append(", phoneCode=");
            sb.append(this.f37935c);
            sb.append(", phoneCodeTime=");
            sb.append(this.f37936d);
            sb.append(", emailCode=");
            sb.append(this.f37937e);
            sb.append(", emailCodeTime=");
            sb.append(this.f37938f);
            sb.append(", countryList=");
            sb.append(this.f37939g);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37940h, ')');
        }
    }

    public PhoneSettingViewModel(CommonRepository commonRepository, UserRepository userRepository) {
        this.f37922f = commonRepository;
        this.f37923g = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(null, "", "", "", "", "", EmptyList.f51496a, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13738f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new PhoneSettingViewModel$onAction$1(uiAction, this, null), 31);
    }
}
