package com.exchange.allin.p024ui.page.account.security.verify;

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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SecurityVerifyViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f37970f;

    /* JADX INFO: renamed from: g */
    public final UserRepository f37971g;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "", "InitData", "ChangeCountry", "ChangeAccount", "ChangeCurCode", "ChangeNewCode", "GetCurCode", "GetNewCode", "Submit", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeCurCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeNewCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$GetCurCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$GetNewCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$Submit;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeAccount;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAccount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37972a;

            public ChangeAccount(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37972a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAccount) && Intrinsics.m18594b(this.f37972a, ((ChangeAccount) obj).f37972a);
            }

            public final int hashCode() {
                return this.f37972a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAccount(value="), this.f37972a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f37973a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f37973a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f37973a, ((ChangeCountry) obj).f37973a);
            }

            public final int hashCode() {
                return this.f37973a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f37973a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeCurCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCurCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37974a;

            public ChangeCurCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37974a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCurCode) && Intrinsics.m18594b(this.f37974a, ((ChangeCurCode) obj).f37974a);
            }

            public final int hashCode() {
                return this.f37974a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCurCode(value="), this.f37974a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$ChangeNewCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeNewCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37975a;

            public ChangeNewCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37975a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeNewCode) && Intrinsics.m18594b(this.f37975a, ((ChangeNewCode) obj).f37975a);
            }

            public final int hashCode() {
                return this.f37975a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeNewCode(value="), this.f37975a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$GetCurCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class GetCurCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final GetCurCode f37976a = new GetCurCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GetCurCode);
            }

            public final int hashCode() {
                return 2082214725;
            }

            public final String toString() {
                return "GetCurCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$GetNewCode;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class GetNewCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final GetNewCode f37977a = new GetNewCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GetNewCode);
            }

            public final int hashCode() {
                return -1493595483;
            }

            public final String toString() {
                return "GetNewCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37978a;

            public InitData(VerifyData verifyData) {
                this.f37978a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitData) && Intrinsics.m18594b(this.f37978a, ((InitData) obj).f37978a);
            }

            public final int hashCode() {
                return this.f37978a.hashCode();
            }

            public final String toString() {
                return "InitData(data=" + this.f37978a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37979a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -2086053306;
            }

            public final String toString() {
                return "Submit";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37980a;

            public Result(VerifyData verifyData) {
                this.f37980a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Result) && Intrinsics.m18594b(this.f37980a, ((Result) obj).f37980a);
            }

            public final int hashCode() {
                VerifyData verifyData = this.f37980a;
                if (verifyData == null) {
                    return 0;
                }
                return verifyData.hashCode();
            }

            public final String toString() {
                return "Result(data=" + this.f37980a + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/verify/SecurityVerifyViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final VerifyData f37981a;

        /* JADX INFO: renamed from: b */
        public final String f37982b;

        /* JADX INFO: renamed from: c */
        public final Country f37983c;

        /* JADX INFO: renamed from: d */
        public final String f37984d;

        /* JADX INFO: renamed from: e */
        public final String f37985e;

        /* JADX INFO: renamed from: f */
        public final String f37986f;

        /* JADX INFO: renamed from: g */
        public final String f37987g;

        /* JADX INFO: renamed from: h */
        public final List f37988h;

        /* JADX INFO: renamed from: i */
        public final boolean f37989i;

        public ViewState(VerifyData verifyData, String str, Country country, String str2, String str3, String str4, String str5, List countryList, boolean z2) {
            Intrinsics.m18599g(countryList, "countryList");
            this.f37981a = verifyData;
            this.f37982b = str;
            this.f37983c = country;
            this.f37984d = str2;
            this.f37985e = str3;
            this.f37986f = str4;
            this.f37987g = str5;
            this.f37988h = countryList;
            this.f37989i = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13745a(ViewState viewState, VerifyData verifyData, String str, Country country, String str2, String str3, String str4, String str5, List list, boolean z2, int i) {
            if ((i & 1) != 0) {
                verifyData = viewState.f37981a;
            }
            VerifyData verifyData2 = verifyData;
            if ((i & 2) != 0) {
                str = viewState.f37982b;
            }
            String account = str;
            if ((i & 4) != 0) {
                country = viewState.f37983c;
            }
            Country country2 = country;
            if ((i & 8) != 0) {
                str2 = viewState.f37984d;
            }
            String curCode = str2;
            if ((i & 16) != 0) {
                str3 = viewState.f37985e;
            }
            String curCodeTime = str3;
            String newCode = (i & 32) != 0 ? viewState.f37986f : str4;
            String newCodeTime = (i & 64) != 0 ? viewState.f37987g : str5;
            List countryList = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? viewState.f37988h : list;
            boolean z3 = (i & 256) != 0 ? viewState.f37989i : z2;
            viewState.getClass();
            Intrinsics.m18599g(account, "account");
            Intrinsics.m18599g(curCode, "curCode");
            Intrinsics.m18599g(curCodeTime, "curCodeTime");
            Intrinsics.m18599g(newCode, "newCode");
            Intrinsics.m18599g(newCodeTime, "newCodeTime");
            Intrinsics.m18599g(countryList, "countryList");
            return new ViewState(verifyData2, account, country2, curCode, curCodeTime, newCode, newCodeTime, countryList, z3);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF37986f() {
            return this.f37986f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37981a, viewState.f37981a) && Intrinsics.m18594b(this.f37982b, viewState.f37982b) && Intrinsics.m18594b(this.f37983c, viewState.f37983c) && Intrinsics.m18594b(this.f37984d, viewState.f37984d) && Intrinsics.m18594b(this.f37985e, viewState.f37985e) && Intrinsics.m18594b(this.f37986f, viewState.f37986f) && Intrinsics.m18594b(this.f37987g, viewState.f37987g) && Intrinsics.m18594b(this.f37988h, viewState.f37988h) && this.f37989i == viewState.f37989i;
        }

        public final int hashCode() {
            VerifyData verifyData = this.f37981a;
            int iM5b = AbstractC0000a.m5b((verifyData == null ? 0 : verifyData.hashCode()) * 31, 31, this.f37982b);
            Country country = this.f37983c;
            return Boolean.hashCode(this.f37989i) + AbstractC0455a.m2233h(this.f37988h, AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b((iM5b + (country != null ? country.hashCode() : 0)) * 31, 31, this.f37984d), 31, this.f37985e), 31, this.f37986f), 31, this.f37987g), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(verifyData=");
            sb.append(this.f37981a);
            sb.append(", account=");
            sb.append(this.f37982b);
            sb.append(", country=");
            sb.append(this.f37983c);
            sb.append(", curCode=");
            sb.append(this.f37984d);
            sb.append(", curCodeTime=");
            sb.append(this.f37985e);
            sb.append(", newCode=");
            sb.append(this.f37986f);
            sb.append(", newCodeTime=");
            sb.append(this.f37987g);
            sb.append(", countryList=");
            sb.append(this.f37988h);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37989i, ')');
        }
    }

    public SecurityVerifyViewModel(CommonRepository commonRepository, UserRepository userRepository) {
        this.f37970f = commonRepository;
        this.f37971g = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(null, "", null, "", "", "", "", EmptyList.f51496a, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13744f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new SecurityVerifyViewModel$onAction$1(uiAction, this, null), 31);
    }
}
