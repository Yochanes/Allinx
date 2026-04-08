package com.exchange.allin.p024ui.page.account.mine.info.name;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.User;
import com.exchange.allin.p024ui.helper.UserHelper;
import com.exchange.allin.repository.UserRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewState;", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ModifyUserNameViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final UserRepository f37510f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction;", "", "ChangeName", "Submit", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction$ChangeName;", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction$Submit;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction$ChangeName;", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeName extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37511a;

            public ChangeName(String name) {
                Intrinsics.m18599g(name, "name");
                this.f37511a = name;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeName) && Intrinsics.m18594b(this.f37511a, ((ChangeName) obj).f37511a);
            }

            public final int hashCode() {
                return this.f37511a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeName(name="), this.f37511a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f37512a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -1906774128;
            }

            public final String toString() {
                return "Submit";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f37513a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return -1515959038;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/name/ModifyUserNameViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f37514a;

        /* JADX INFO: renamed from: b */
        public final boolean f37515b;

        public ViewState(String str, boolean z2) {
            this.f37514a = str;
            this.f37515b = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13679a(ViewState viewState, String name, boolean z2, int i) {
            if ((i & 1) != 0) {
                name = viewState.f37514a;
            }
            if ((i & 2) != 0) {
                z2 = viewState.f37515b;
            }
            viewState.getClass();
            Intrinsics.m18599g(name, "name");
            return new ViewState(name, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37514a, viewState.f37514a) && this.f37515b == viewState.f37515b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f37515b) + (this.f37514a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(name=");
            sb.append(this.f37514a);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f37515b, ')');
        }
    }

    public ModifyUserNameViewModel(UserRepository userRepository) {
        this.f37510f = userRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        String nickName;
        User user = ((UserHelper.ViewState) UserHelper.f37040b.getValue()).f37043a;
        if (user == null || (nickName = user.getNickName()) == null) {
            nickName = "";
        }
        return new ViewState(nickName, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13678f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new ModifyUserNameViewModel$onAction$1(uiAction, this, null), 31);
    }
}
