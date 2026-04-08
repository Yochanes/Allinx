package com.exchange.allin.p024ui.page.account.forget.setting;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.VerifyData;
import com.exchange.allin.repository.UserRepository;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ForgetPasswordSettingViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final UserRepository f37179f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "", "InitData", "ChangePassword", "ChangeRePassword", "ToggleHidePassword", "ToggleHideRePassword", "Submit", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ChangePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ChangeRePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ToggleHidePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ToggleHideRePassword;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ChangePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37180a;

            public ChangePassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37180a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePassword) && Intrinsics.m18594b(this.f37180a, ((ChangePassword) obj).f37180a);
            }

            public final int hashCode() {
                return this.f37180a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePassword(value="), this.f37180a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ChangeRePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeRePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37181a;

            public ChangeRePassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37181a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeRePassword) && Intrinsics.m18594b(this.f37181a, ((ChangeRePassword) obj).f37181a);
            }

            public final int hashCode() {
                return this.f37181a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeRePassword(value="), this.f37181a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37182a;

            public InitData(VerifyData verifyData) {
                this.f37182a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitData) && Intrinsics.m18594b(this.f37182a, ((InitData) obj).f37182a);
            }

            public final int hashCode() {
                return this.f37182a.hashCode();
            }

            public final String toString() {
                return "InitData(data=" + this.f37182a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37183a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return 1101837629;
            }

            public final String toString() {
                return "Submit";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ToggleHidePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHidePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHidePassword f37184a = new ToggleHidePassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHidePassword);
            }

            public final int hashCode() {
                return -443731690;
            }

            public final String toString() {
                return "ToggleHidePassword";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction$ToggleHideRePassword;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHideRePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHideRePassword f37185a = new ToggleHideRePassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHideRePassword);
            }

            public final int hashCode() {
                return -31978071;
            }

            public final String toString() {
                return "ToggleHideRePassword";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f37186a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return 1556692213;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/forget/setting/ForgetPasswordSettingViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final VerifyData f37187a;

        /* JADX INFO: renamed from: b */
        public final String f37188b;

        /* JADX INFO: renamed from: c */
        public final String f37189c;

        /* JADX INFO: renamed from: d */
        public final boolean f37190d;

        /* JADX INFO: renamed from: e */
        public final boolean f37191e;

        /* JADX INFO: renamed from: f */
        public final boolean f37192f;

        public ViewState(VerifyData verifyData, String str, String str2, boolean z2, boolean z3, boolean z4) {
            this.f37187a = verifyData;
            this.f37188b = str;
            this.f37189c = str2;
            this.f37190d = z2;
            this.f37191e = z3;
            this.f37192f = z4;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13651a(ViewState viewState, VerifyData verifyData, String str, String str2, boolean z2, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                verifyData = viewState.f37187a;
            }
            VerifyData verifyData2 = verifyData;
            if ((i & 2) != 0) {
                str = viewState.f37188b;
            }
            String password = str;
            if ((i & 4) != 0) {
                str2 = viewState.f37189c;
            }
            String rePassword = str2;
            if ((i & 8) != 0) {
                z2 = viewState.f37190d;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = viewState.f37191e;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                z4 = viewState.f37192f;
            }
            viewState.getClass();
            Intrinsics.m18599g(password, "password");
            Intrinsics.m18599g(rePassword, "rePassword");
            return new ViewState(verifyData2, password, rePassword, z5, z6, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37187a, viewState.f37187a) && Intrinsics.m18594b(this.f37188b, viewState.f37188b) && Intrinsics.m18594b(this.f37189c, viewState.f37189c) && this.f37190d == viewState.f37190d && this.f37191e == viewState.f37191e && this.f37192f == viewState.f37192f;
        }

        public final int hashCode() {
            VerifyData verifyData = this.f37187a;
            return Boolean.hashCode(this.f37192f) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b((verifyData == null ? 0 : verifyData.hashCode()) * 31, 31, this.f37188b), 31, this.f37189c), 31, this.f37190d), 31, this.f37191e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(verifyData=");
            sb.append(this.f37187a);
            sb.append(", password=");
            sb.append(this.f37188b);
            sb.append(", rePassword=");
            sb.append(this.f37189c);
            sb.append(", isHidePassword=");
            sb.append(this.f37190d);
            sb.append(", isHideRePassword=");
            sb.append(this.f37191e);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37192f, ')');
        }
    }

    public ForgetPasswordSettingViewModel(UserRepository userRepository) {
        this.f37179f = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(null, "", "", true, true, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13650f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new ForgetPasswordSettingViewModel$onAction$1(uiAction, this, null), 31);
    }
}
