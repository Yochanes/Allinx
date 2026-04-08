package com.exchange.allin.p024ui.page.assets.transfer;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "<init>", "()V", "ViewState", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AssetsTransferViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction;", "", "ChangeTransferType", "ChangeCoinName", "ChangeAmount", "Submit", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$ChangeAmount;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$ChangeCoinName;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$ChangeTransferType;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$Submit;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$ChangeAmount;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeAmount extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38566a;

            public ChangeAmount(String value) {
                Intrinsics.m18599g(value, "value");
                this.f38566a = value;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAmount) && Intrinsics.m18594b(this.f38566a, ((ChangeAmount) obj).f38566a);
            }

            public final int hashCode() {
                return this.f38566a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeAmount(value="), this.f38566a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$ChangeCoinName;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCoinName extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38567a;

            public ChangeCoinName(String coinName) {
                Intrinsics.m18599g(coinName, "coinName");
                this.f38567a = coinName;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCoinName) && Intrinsics.m18594b(this.f38567a, ((ChangeCoinName) obj).f38567a);
            }

            public final int hashCode() {
                return this.f38567a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeCoinName(coinName="), this.f38567a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$ChangeTransferType;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeTransferType extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f38568a;

            public ChangeTransferType(String transferType) {
                Intrinsics.m18599g(transferType, "transferType");
                this.f38568a = transferType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeTransferType) && Intrinsics.m18594b(this.f38568a, ((ChangeTransferType) obj).f38568a);
            }

            public final int hashCode() {
                return this.f38568a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeTransferType(transferType="), this.f38568a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction$Submit;", "Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class Submit extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final Submit f38569a = new Submit();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Submit);
            }

            public final int hashCode() {
                return -938487551;
            }

            public final String toString() {
                return "Submit";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/transfer/AssetsTransferViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f38570a;

        /* JADX INFO: renamed from: b */
        public final String f38571b;

        /* JADX INFO: renamed from: c */
        public final String f38572c;

        /* JADX INFO: renamed from: d */
        public final float f38573d;

        /* JADX INFO: renamed from: e */
        public final boolean f38574e;

        public ViewState(String str, String str2, String str3, float f, boolean z2) {
            this.f38570a = str;
            this.f38571b = str2;
            this.f38572c = str3;
            this.f38573d = f;
            this.f38574e = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13803a(ViewState viewState, String str, String str2, String str3, float f, boolean z2, int i) {
            if ((i & 1) != 0) {
                str = viewState.f38570a;
            }
            String transferType = str;
            if ((i & 2) != 0) {
                str2 = viewState.f38571b;
            }
            String coinName = str2;
            if ((i & 4) != 0) {
                str3 = viewState.f38572c;
            }
            String amount = str3;
            if ((i & 8) != 0) {
                f = viewState.f38573d;
            }
            float f2 = f;
            if ((i & 16) != 0) {
                z2 = viewState.f38574e;
            }
            viewState.getClass();
            Intrinsics.m18599g(transferType, "transferType");
            Intrinsics.m18599g(coinName, "coinName");
            Intrinsics.m18599g(amount, "amount");
            return new ViewState(transferType, coinName, amount, f2, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f38570a, viewState.f38570a) && Intrinsics.m18594b(this.f38571b, viewState.f38571b) && Intrinsics.m18594b(this.f38572c, viewState.f38572c) && Float.compare(this.f38573d, viewState.f38573d) == 0 && this.f38574e == viewState.f38574e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f38574e) + AbstractC0455a.m2226a(AbstractC0000a.m5b(AbstractC0000a.m5b(this.f38570a.hashCode() * 31, 31, this.f38571b), 31, this.f38572c), this.f38573d, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(transferType=");
            sb.append(this.f38570a);
            sb.append(", coinName=");
            sb.append(this.f38571b);
            sb.append(", amount=");
            sb.append(this.f38572c);
            sb.append(", rotationAngle=");
            sb.append(this.f38573d);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f38574e, ')');
        }
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState("", "USDT", "", 0.0f, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m13802f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new AssetsTransferViewModel$onAction$1(uiAction, this, null), 31);
    }
}
