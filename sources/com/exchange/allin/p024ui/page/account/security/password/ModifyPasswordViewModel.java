package com.exchange.allin.p024ui.page.account.security.password;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.VerifyData;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ModifyPasswordViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "", "ChangeCurPassword", "ChangeNewPassword", "ChangeRePassword", "ToggleHideCurPassword", "ToggleHideNewPassword", "ToggleHideRePassword", "Submit", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ChangeCurPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ChangeNewPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ChangeRePassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ToggleHideCurPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ToggleHideNewPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ToggleHideRePassword;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ChangeCurPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCurPassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37871a;

            public ChangeCurPassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37871a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCurPassword) && Intrinsics.m18594b(this.f37871a, ((ChangeCurPassword) obj).f37871a);
            }

            public final int hashCode() {
                return this.f37871a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCurPassword(value="), this.f37871a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ChangeNewPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeNewPassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37872a;

            public ChangeNewPassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37872a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeNewPassword) && Intrinsics.m18594b(this.f37872a, ((ChangeNewPassword) obj).f37872a);
            }

            public final int hashCode() {
                return this.f37872a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeNewPassword(value="), this.f37872a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ChangeRePassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeRePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37873a;

            public ChangeRePassword(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37873a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeRePassword) && Intrinsics.m18594b(this.f37873a, ((ChangeRePassword) obj).f37873a);
            }

            public final int hashCode() {
                return this.f37873a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeRePassword(value="), this.f37873a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37874a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -252137524;
            }

            public final String toString() {
                return "Submit";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ToggleHideCurPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHideCurPassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHideCurPassword f37875a = new ToggleHideCurPassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHideCurPassword);
            }

            public final int hashCode() {
                return 1196673585;
            }

            public final String toString() {
                return "ToggleHideCurPassword";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ToggleHideNewPassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHideNewPassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHideNewPassword f37876a = new ToggleHideNewPassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHideNewPassword);
            }

            public final int hashCode() {
                return 1306956177;
            }

            public final String toString() {
                return "ToggleHideNewPassword";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction$ToggleHideRePassword;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleHideRePassword extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleHideRePassword f37877a = new ToggleHideRePassword();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleHideRePassword);
            }

            public final int hashCode() {
                return 91677176;
            }

            public final String toString() {
                return "ToggleHideRePassword";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "VerifyResult", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$ViewEvent$VerifyResult;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$ViewEvent$VerifyResult;", "Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyResult extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37878a;

            public VerifyResult(VerifyData verifyData) {
                this.f37878a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyResult) && Intrinsics.m18594b(this.f37878a, ((VerifyResult) obj).f37878a);
            }

            public final int hashCode() {
                return this.f37878a.hashCode();
            }

            public final String toString() {
                return "VerifyResult(data=" + this.f37878a + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/password/ModifyPasswordViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f37879a;

        /* JADX INFO: renamed from: b */
        public final String f37880b;

        /* JADX INFO: renamed from: c */
        public final String f37881c;

        /* JADX INFO: renamed from: d */
        public final boolean f37882d;

        /* JADX INFO: renamed from: e */
        public final boolean f37883e;

        /* JADX INFO: renamed from: f */
        public final boolean f37884f;

        public ViewState(boolean z2, boolean z3, String str, String str2, boolean z4, String str3) {
            this.f37879a = str;
            this.f37880b = str2;
            this.f37881c = str3;
            this.f37882d = z2;
            this.f37883e = z3;
            this.f37884f = z4;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13732a(ViewState viewState, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                str = viewState.f37879a;
            }
            String curPassword = str;
            if ((i & 2) != 0) {
                str2 = viewState.f37880b;
            }
            String newPassword = str2;
            if ((i & 4) != 0) {
                str3 = viewState.f37881c;
            }
            String rePassword = str3;
            if ((i & 8) != 0) {
                z2 = viewState.f37882d;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = viewState.f37883e;
            }
            boolean z6 = z3;
            if ((i & 32) != 0) {
                z4 = viewState.f37884f;
            }
            viewState.getClass();
            Intrinsics.m18599g(curPassword, "curPassword");
            Intrinsics.m18599g(newPassword, "newPassword");
            Intrinsics.m18599g(rePassword, "rePassword");
            return new ViewState(z5, z6, curPassword, newPassword, z4, rePassword);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37879a, viewState.f37879a) && Intrinsics.m18594b(this.f37880b, viewState.f37880b) && Intrinsics.m18594b(this.f37881c, viewState.f37881c) && this.f37882d == viewState.f37882d && this.f37883e == viewState.f37883e && this.f37884f == viewState.f37884f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37884f) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b(this.f37879a.hashCode() * 31, 31, this.f37880b), 31, this.f37881c), 31, this.f37882d), 31, this.f37883e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(curPassword=");
            sb.append(this.f37879a);
            sb.append(", newPassword=");
            sb.append(this.f37880b);
            sb.append(", rePassword=");
            sb.append(this.f37881c);
            sb.append(", isHideCurPassword=");
            sb.append(this.f37882d);
            sb.append(", isHideNewPassword=");
            sb.append(this.f37883e);
            sb.append(", isHideRePassword=");
            return AbstractC0455a.m2243r(sb, this.f37884f, ')');
        }
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(true, true, "", "", true, "");
    }

    /* JADX INFO: renamed from: f */
    public final void m13731f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new ModifyPasswordViewModel$onAction$1(uiAction, this, null), 31);
    }
}
