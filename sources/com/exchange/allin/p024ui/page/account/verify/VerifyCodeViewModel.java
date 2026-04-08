package com.exchange.allin.p024ui.page.account.verify;

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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class VerifyCodeViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final UserRepository f38022f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction;", "", "InitData", "ChangeCode", "GetCode", "SubmitData", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$ChangeCode;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$GetCode;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$SubmitData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$ChangeCode;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38023a;

            public ChangeCode(String value) {
                Intrinsics.m18599g(value, "value");
                this.f38023a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCode) && Intrinsics.m18594b(this.f38023a, ((ChangeCode) obj).f38023a);
            }

            public final int hashCode() {
                return this.f38023a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCode(value="), this.f38023a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$GetCode;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class GetCode extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final GetCode f38024a = new GetCode();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GetCode);
            }

            public final int hashCode() {
                return -791690568;
            }

            public final String toString() {
                return "GetCode";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$InitData;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class InitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public final VerifyData f38025a;

            public InitData(VerifyData verifyData) {
                this.f38025a = verifyData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitData) && Intrinsics.m18594b(this.f38025a, ((InitData) obj).f38025a);
            }

            public final int hashCode() {
                return this.f38025a.hashCode();
            }

            public final String toString() {
                return "InitData(data=" + this.f38025a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction$SubmitData;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class SubmitData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final SubmitData f38026a = new SubmitData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmitData);
            }

            public final int hashCode() {
                return -1349234835;
            }

            public final String toString() {
                return "SubmitData";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "VerifyResult", "VerifyNext", "GotoForgetPasswordSetting", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent$GotoForgetPasswordSetting;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent$VerifyNext;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent$VerifyResult;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent$GotoForgetPasswordSetting;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class GotoForgetPasswordSetting extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f38027a;

            public GotoForgetPasswordSetting(VerifyData data) {
                Intrinsics.m18599g(data, "data");
                this.f38027a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GotoForgetPasswordSetting) && Intrinsics.m18594b(this.f38027a, ((GotoForgetPasswordSetting) obj).f38027a);
            }

            public final int hashCode() {
                return this.f38027a.hashCode();
            }

            public final String toString() {
                return "GotoForgetPasswordSetting(data=" + this.f38027a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent$VerifyNext;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyNext extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public final VerifyData f38028a;

            public VerifyNext(VerifyData data) {
                Intrinsics.m18599g(data, "data");
                this.f38028a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof VerifyNext) && Intrinsics.m18594b(this.f38028a, ((VerifyNext) obj).f38028a);
            }

            public final int hashCode() {
                return this.f38028a.hashCode();
            }

            public final String toString() {
                return "VerifyNext(data=" + this.f38028a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent$VerifyResult;", "Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class VerifyResult extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final VerifyResult f38029a = new VerifyResult();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof VerifyResult);
            }

            public final int hashCode() {
                return -1022713304;
            }

            public final String toString() {
                return "VerifyResult";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/verify/VerifyCodeViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final VerifyData f38030a;

        /* JADX INFO: renamed from: b */
        public final String f38031b;

        /* JADX INFO: renamed from: c */
        public final String f38032c;

        /* JADX INFO: renamed from: d */
        public final boolean f38033d;

        /* JADX INFO: renamed from: e */
        public final boolean f38034e;

        public ViewState(VerifyData verifyData, String str, String str2, boolean z2, boolean z3) {
            this.f38030a = verifyData;
            this.f38031b = str;
            this.f38032c = str2;
            this.f38033d = z2;
            this.f38034e = z3;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13749a(ViewState viewState, VerifyData verifyData, String str, String str2, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                verifyData = viewState.f38030a;
            }
            VerifyData verifyData2 = verifyData;
            if ((i & 2) != 0) {
                str = viewState.f38031b;
            }
            String code = str;
            if ((i & 4) != 0) {
                str2 = viewState.f38032c;
            }
            String codeTime = str2;
            if ((i & 8) != 0) {
                z2 = viewState.f38033d;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                z3 = viewState.f38034e;
            }
            viewState.getClass();
            Intrinsics.m18599g(code, "code");
            Intrinsics.m18599g(codeTime, "codeTime");
            return new ViewState(verifyData2, code, codeTime, z4, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f38030a, viewState.f38030a) && Intrinsics.m18594b(this.f38031b, viewState.f38031b) && Intrinsics.m18594b(this.f38032c, viewState.f38032c) && this.f38033d == viewState.f38033d && this.f38034e == viewState.f38034e;
        }

        public final int hashCode() {
            VerifyData verifyData = this.f38030a;
            return Boolean.hashCode(this.f38034e) + AbstractC0455a.m2230e(AbstractC0000a.m5b(AbstractC0000a.m5b((verifyData == null ? 0 : verifyData.hashCode()) * 31, 31, this.f38031b), 31, this.f38032c), 31, this.f38033d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(verifyData=");
            sb.append(this.f38030a);
            sb.append(", code=");
            sb.append(this.f38031b);
            sb.append(", codeTime=");
            sb.append(this.f38032c);
            sb.append(", isCodeError=");
            sb.append(this.f38033d);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f38034e, ')');
        }
    }

    public VerifyCodeViewModel(UserRepository userRepository) {
        this.f38022f = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState(null, "", "", false, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13748f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new VerifyCodeViewModel$onAction$1(uiAction, this, null), 31);
    }
}
