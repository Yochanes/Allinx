package com.exchange.allin.p024ui.page.pledge.subscribe;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.repository.PledgeRepository;
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
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewState;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewEvent;", "ViewState", "ViewEvent", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SubscribeConfirmViewModel extends BaseViewModel<ViewState, ViewEvent> {

    /* JADX INFO: renamed from: f */
    public final PledgeRepository f40448f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction;", "", "ChangeLevel", "ChangePeriod", "ChangeInviteUID", "PledgeNexus", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$ChangeInviteUID;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$ChangeLevel;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$ChangePeriod;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$PledgeNexus;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$ChangeInviteUID;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeInviteUID extends UiAction {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeInviteUID)) {
                    return false;
                }
                ((ChangeInviteUID) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ChangeInviteUID(value=null)";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$ChangeLevel;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeLevel extends UiAction {

            /* JADX INFO: renamed from: a */
            public final int f40449a;

            public ChangeLevel(int i) {
                this.f40449a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeLevel) && this.f40449a == ((ChangeLevel) obj).f40449a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f40449a);
            }

            public final String toString() {
                return AbstractC0000a.m17n(new StringBuilder("ChangeLevel(index="), this.f40449a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$ChangePeriod;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangePeriod extends UiAction {

            /* JADX INFO: renamed from: a */
            public final int f40450a;

            public ChangePeriod(int i) {
                this.f40450a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangePeriod) && this.f40450a == ((ChangePeriod) obj).f40450a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f40450a);
            }

            public final String toString() {
                return AbstractC0000a.m17n(new StringBuilder("ChangePeriod(index="), this.f40450a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction$PledgeNexus;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class PledgeNexus extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final PledgeNexus f40451a = new PledgeNexus();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PledgeNexus);
            }

            public final int hashCode() {
                return -77764016;
            }

            public final String toString() {
                return "PledgeNexus";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewEvent;", "Lcom/mvi/base/IViewEvent;", "Result", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewEvent$Result;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class ViewEvent implements IViewEvent {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewEvent$Result;", "Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewEvent;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Result extends ViewEvent {

            /* JADX INFO: renamed from: a */
            public static final Result f40452a = new Result();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Result);
            }

            public final int hashCode() {
                return -1417094396;
            }

            public final String toString() {
                return "Result";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/pledge/subscribe/SubscribeConfirmViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final int f40453a;

        /* JADX INFO: renamed from: b */
        public final int f40454b;

        /* JADX INFO: renamed from: c */
        public final String f40455c;

        /* JADX INFO: renamed from: d */
        public final boolean f40456d;

        public ViewState(String str, int i, int i2, boolean z2) {
            this.f40453a = i;
            this.f40454b = i2;
            this.f40455c = str;
            this.f40456d = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m14011a(ViewState viewState, int i, int i2, boolean z2, int i3) {
            if ((i3 & 1) != 0) {
                i = viewState.f40453a;
            }
            if ((i3 & 2) != 0) {
                i2 = viewState.f40454b;
            }
            String inviteUID = (i3 & 4) != 0 ? viewState.f40455c : null;
            if ((i3 & 8) != 0) {
                z2 = viewState.f40456d;
            }
            viewState.getClass();
            Intrinsics.m18599g(inviteUID, "inviteUID");
            return new ViewState(inviteUID, i, i2, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f40453a == viewState.f40453a && this.f40454b == viewState.f40454b && Intrinsics.m18594b(this.f40455c, viewState.f40455c) && this.f40456d == viewState.f40456d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f40456d) + AbstractC0000a.m5b(AbstractC0455a.m2228c(this.f40454b, Integer.hashCode(this.f40453a) * 31, 31), 31, this.f40455c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(levelIndex=");
            sb.append(this.f40453a);
            sb.append(", periodIndex=");
            sb.append(this.f40454b);
            sb.append(", inviteUID=");
            sb.append(this.f40455c);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f40456d, ')');
        }
    }

    public SubscribeConfirmViewModel(PledgeRepository pledgeRepository) {
        this.f40448f = pledgeRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState("", 0, 0, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m14010f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new SubscribeConfirmViewModel$onAction$1(uiAction, this, null), 31);
    }
}
