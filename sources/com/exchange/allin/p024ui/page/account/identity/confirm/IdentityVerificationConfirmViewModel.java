package com.exchange.allin.p024ui.page.account.identity.confirm;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.VerifyCode;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IdentityVerificationConfirmViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final UserRepository f37259f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction;", "", "ChangeFrontPhotoPath", "ChangeHandPhotoPath", "ToggleIsCheckedAgreement", "Submit", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$ChangeFrontPhotoPath;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$ChangeHandPhotoPath;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$ToggleIsCheckedAgreement;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$ChangeFrontPhotoPath;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeFrontPhotoPath extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37260a;

            public ChangeFrontPhotoPath(String path) {
                Intrinsics.m18599g(path, "path");
                this.f37260a = path;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeFrontPhotoPath) && Intrinsics.m18594b(this.f37260a, ((ChangeFrontPhotoPath) obj).f37260a);
            }

            public final int hashCode() {
                return this.f37260a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeFrontPhotoPath(path="), this.f37260a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$ChangeHandPhotoPath;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeHandPhotoPath extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37261a;

            public ChangeHandPhotoPath(String path) {
                Intrinsics.m18599g(path, "path");
                this.f37261a = path;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeHandPhotoPath) && Intrinsics.m18594b(this.f37261a, ((ChangeHandPhotoPath) obj).f37261a);
            }

            public final int hashCode() {
                return this.f37261a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeHandPhotoPath(path="), this.f37261a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37262a;

            /* JADX INFO: renamed from: b */
            public final String f37263b;

            /* JADX INFO: renamed from: c */
            public final String f37264c;

            /* JADX INFO: renamed from: d */
            public final String f37265d;

            /* JADX INFO: renamed from: e */
            public final VerifyCode f37266e;

            public Submit(String str, String str2, String str3, String str4, VerifyCode verifyCode) {
                Intrinsics.m18599g(verifyCode, "verifyCode");
                this.f37262a = str;
                this.f37263b = str2;
                this.f37264c = str3;
                this.f37265d = str4;
                this.f37266e = verifyCode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Submit)) {
                    return false;
                }
                Submit submit = (Submit) obj;
                return Intrinsics.m18594b(this.f37262a, submit.f37262a) && Intrinsics.m18594b(this.f37263b, submit.f37263b) && Intrinsics.m18594b(this.f37264c, submit.f37264c) && Intrinsics.m18594b(this.f37265d, submit.f37265d) && Intrinsics.m18594b(this.f37266e, submit.f37266e);
            }

            public final int hashCode() {
                return this.f37266e.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.f37262a.hashCode() * 31, 31, this.f37263b), 31, this.f37264c), 31, this.f37265d);
            }

            public final String toString() {
                return "Submit(type=" + this.f37262a + ", country=" + this.f37263b + ", name=" + this.f37264c + ", idNumber=" + this.f37265d + ", verifyCode=" + this.f37266e + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction$ToggleIsCheckedAgreement;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ToggleIsCheckedAgreement extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final ToggleIsCheckedAgreement f37267a = new ToggleIsCheckedAgreement();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ToggleIsCheckedAgreement);
            }

            public final int hashCode() {
                return -788991802;
            }

            public final String toString() {
                return "ToggleIsCheckedAgreement";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f37268a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return -1831872523;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/confirm/IdentityVerificationConfirmViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f37269a;

        /* JADX INFO: renamed from: b */
        public final String f37270b;

        /* JADX INFO: renamed from: c */
        public final boolean f37271c;

        /* JADX INFO: renamed from: d */
        public final boolean f37272d;

        public ViewState(String str, String str2, boolean z2, boolean z3) {
            this.f37269a = str;
            this.f37270b = str2;
            this.f37271c = z2;
            this.f37272d = z3;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13657a(ViewState viewState, String frontPhotoPath, String handPhotoPath, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                frontPhotoPath = viewState.f37269a;
            }
            if ((i & 2) != 0) {
                handPhotoPath = viewState.f37270b;
            }
            if ((i & 4) != 0) {
                z2 = viewState.f37271c;
            }
            if ((i & 8) != 0) {
                z3 = viewState.f37272d;
            }
            viewState.getClass();
            Intrinsics.m18599g(frontPhotoPath, "frontPhotoPath");
            Intrinsics.m18599g(handPhotoPath, "handPhotoPath");
            return new ViewState(frontPhotoPath, handPhotoPath, z2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37269a, viewState.f37269a) && Intrinsics.m18594b(this.f37270b, viewState.f37270b) && this.f37271c == viewState.f37271c && this.f37272d == viewState.f37272d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37272d) + AbstractC0455a.m2230e(AbstractC0000a.m5b(this.f37269a.hashCode() * 31, 31, this.f37270b), 31, this.f37271c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(frontPhotoPath=");
            sb.append(this.f37269a);
            sb.append(", handPhotoPath=");
            sb.append(this.f37270b);
            sb.append(", isCheckedAgreement=");
            sb.append(this.f37271c);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37272d, ')');
        }
    }

    public IdentityVerificationConfirmViewModel(UserRepository userRepository) {
        this.f37259f = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState("", "", false, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13656f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new IdentityVerificationConfirmViewModel$onAction$1(uiAction, this, null), 31);
    }
}
