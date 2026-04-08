package com.exchange.allin.p024ui.page.account.security.google.verify;

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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class GoogleAuthVerifyViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: renamed from: f */
    public final UserRepository f37802f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction;", "", "ChangeCode", "SendCode", "Submit", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction$ChangeCode;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction$SendCode;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction$Submit;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction$ChangeCode;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37803a;

            public ChangeCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f37803a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCode) && Intrinsics.m18594b(this.f37803a, ((ChangeCode) obj).f37803a);
            }

            public final int hashCode() {
                return this.f37803a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCode(value="), this.f37803a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction$SendCode;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SendCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SendCode f37804a = new SendCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SendCode);
            }

            public final int hashCode() {
                return -321510029;
            }

            public final String toString() {
                return "SendCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37805a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return 31971190;
            }

            public final String toString() {
                return "Submit";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f37806a;

            public Result(VerifyData verifyData) {
                this.f37806a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Result) && Intrinsics.m18594b(this.f37806a, ((Result) obj).f37806a);
            }

            public final int hashCode() {
                return this.f37806a.hashCode();
            }

            public final String toString() {
                return "Result(data=" + this.f37806a + ')';
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/security/google/verify/GoogleAuthVerifyViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f37807a;

        /* JADX INFO: renamed from: b */
        public final String f37808b;

        /* JADX INFO: renamed from: c */
        public final boolean f37809c;

        public ViewState(String str, String str2, boolean z2) {
            this.f37807a = str;
            this.f37808b = str2;
            this.f37809c = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13728a(ViewState viewState, String code, String codeTime, boolean z2, int i) {
            if ((i & 1) != 0) {
                code = viewState.f37807a;
            }
            if ((i & 2) != 0) {
                codeTime = viewState.f37808b;
            }
            if ((i & 4) != 0) {
                z2 = viewState.f37809c;
            }
            viewState.getClass();
            Intrinsics.m18599g(code, "code");
            Intrinsics.m18599g(codeTime, "codeTime");
            return new ViewState(code, codeTime, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37807a, viewState.f37807a) && Intrinsics.m18594b(this.f37808b, viewState.f37808b) && this.f37809c == viewState.f37809c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37809c) + AbstractC0000a.m5b(this.f37807a.hashCode() * 31, 31, this.f37808b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(code=");
            sb.append(this.f37807a);
            sb.append(", codeTime=");
            sb.append(this.f37808b);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37809c, ')');
        }
    }

    public GoogleAuthVerifyViewModel(UserRepository userRepository) {
        this.f37802f = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState("", "", false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13727f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new GoogleAuthVerifyViewModel$onAction$1(uiAction, this, null), 31);
    }
}
