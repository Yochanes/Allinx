package com.exchange.allin.p024ui.page.account.security.email.setting;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class EmailSettingViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final UserRepository f37720f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "", "ChangeEmail", "ChangeEmailCode", "ChangePhoneCode", "SendEmailCode", "SendPhoneCode", "Submit", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$ChangeEmail;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$ChangeEmailCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$ChangePhoneCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$SendEmailCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$SendPhoneCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$Submit;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$ChangeEmail;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeEmail extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37721a;

            public ChangeEmail(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37721a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeEmail) && Intrinsics.m18594b(this.f37721a, ((ChangeEmail) obj).f37721a);
            }

            public final int hashCode() {
                return this.f37721a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeEmail(value="), this.f37721a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$ChangeEmailCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeEmailCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37722a;

            public ChangeEmailCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37722a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeEmailCode) && Intrinsics.m18594b(this.f37722a, ((ChangeEmailCode) obj).f37722a);
            }

            public final int hashCode() {
                return this.f37722a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeEmailCode(value="), this.f37722a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$ChangePhoneCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePhoneCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37723a;

            public ChangePhoneCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37723a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePhoneCode) && Intrinsics.m18594b(this.f37723a, ((ChangePhoneCode) obj).f37723a);
            }

            public final int hashCode() {
                return this.f37723a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangePhoneCode(value="), this.f37723a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$SendEmailCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SendEmailCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SendEmailCode f37724a = new SendEmailCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendEmailCode);
            }

            public final int hashCode() {
                return -2104378771;
            }

            public final String toString() {
                return "SendEmailCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$SendPhoneCode;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SendPhoneCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SendPhoneCode f37725a = new SendPhoneCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendPhoneCode);
            }

            public final int hashCode() {
                return -958827713;
            }

            public final String toString() {
                return "SendPhoneCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37726a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -1768124372;
            }

            public final String toString() {
                return "Submit";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f37727a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return -1512783898;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/email/setting/EmailSettingViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f37728a;

        /* JADX INFO: renamed from: b */
        public final String f37729b;

        /* JADX INFO: renamed from: c */
        public final String f37730c;

        /* JADX INFO: renamed from: d */
        public final String f37731d;

        /* JADX INFO: renamed from: e */
        public final String f37732e;

        /* JADX INFO: renamed from: f */
        public final boolean f37733f;

        public ViewState(String str, String str2, String str3, String str4, String str5, boolean z2) {
            this.f37728a = str;
            this.f37729b = str2;
            this.f37730c = str3;
            this.f37731d = str4;
            this.f37732e = str5;
            this.f37733f = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13720a(ViewState viewState, String str, String str2, String str3, String str4, String str5, boolean z2, int i) {
            if ((i & 1) != 0) {
                str = viewState.f37728a;
            }
            String email = str;
            if ((i & 2) != 0) {
                str2 = viewState.f37729b;
            }
            String emailCode = str2;
            if ((i & 4) != 0) {
                str3 = viewState.f37730c;
            }
            String emailCodeTime = str3;
            if ((i & 8) != 0) {
                str4 = viewState.f37731d;
            }
            String phoneCode = str4;
            if ((i & 16) != 0) {
                str5 = viewState.f37732e;
            }
            String phoneCodeTime = str5;
            if ((i & 32) != 0) {
                z2 = viewState.f37733f;
            }
            viewState.getClass();
            Intrinsics.m18599g(email, "email");
            Intrinsics.m18599g(emailCode, "emailCode");
            Intrinsics.m18599g(emailCodeTime, "emailCodeTime");
            Intrinsics.m18599g(phoneCode, "phoneCode");
            Intrinsics.m18599g(phoneCodeTime, "phoneCodeTime");
            return new ViewState(email, emailCode, emailCodeTime, phoneCode, phoneCodeTime, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37728a, viewState.f37728a) && Intrinsics.m18594b(this.f37729b, viewState.f37729b) && Intrinsics.m18594b(this.f37730c, viewState.f37730c) && Intrinsics.m18594b(this.f37731d, viewState.f37731d) && Intrinsics.m18594b(this.f37732e, viewState.f37732e) && this.f37733f == viewState.f37733f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37733f) + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.f37728a.hashCode() * 31, 31, this.f37729b), 31, this.f37730c), 31, this.f37731d), 31, this.f37732e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(email=");
            sb.append(this.f37728a);
            sb.append(", emailCode=");
            sb.append(this.f37729b);
            sb.append(", emailCodeTime=");
            sb.append(this.f37730c);
            sb.append(", phoneCode=");
            sb.append(this.f37731d);
            sb.append(", phoneCodeTime=");
            sb.append(this.f37732e);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37733f, ')');
        }
    }

    public EmailSettingViewModel(UserRepository userRepository) {
        this.f37720f = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState("", "", "", "", "", false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13719f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new EmailSettingViewModel$onAction$1(uiAction, this, null), 31);
    }
}
