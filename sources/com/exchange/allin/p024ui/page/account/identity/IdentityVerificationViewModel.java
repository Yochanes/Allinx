package com.exchange.allin.p024ui.page.account.identity;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.exchange.allin.data.Country;
import com.exchange.allin.repository.CommonRepository;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IdentityVerificationViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f37218f;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction;", "", "LoadData", "ChangeType", "ChangeCountry", "ChangeName", "ChangeIdNumber", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeIdNumber;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeName;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeType;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$LoadData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeCountry;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeCountry extends UiAction {

            /* JADX INFO: renamed from: a */
            public final Country f37219a;

            public ChangeCountry(Country country) {
                Intrinsics.m18599g(country, "country");
                this.f37219a = country;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCountry) && Intrinsics.m18594b(this.f37219a, ((ChangeCountry) obj).f37219a);
            }

            public final int hashCode() {
                return this.f37219a.hashCode();
            }

            public final String toString() {
                return "ChangeCountry(country=" + this.f37219a + ')';
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeIdNumber;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeIdNumber extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37220a;

            public ChangeIdNumber(String id) {
                Intrinsics.m18599g(id, "id");
                this.f37220a = id;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeIdNumber) && Intrinsics.m18594b(this.f37220a, ((ChangeIdNumber) obj).f37220a);
            }

            public final int hashCode() {
                return this.f37220a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeIdNumber(id="), this.f37220a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeName;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeName extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37221a;

            public ChangeName(String name) {
                Intrinsics.m18599g(name, "name");
                this.f37221a = name;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeName) && Intrinsics.m18594b(this.f37221a, ((ChangeName) obj).f37221a);
            }

            public final int hashCode() {
                return this.f37221a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeName(name="), this.f37221a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$ChangeType;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class ChangeType extends UiAction {

            /* JADX INFO: renamed from: a */
            public final String f37222a;

            public ChangeType(String type) {
                Intrinsics.m18599g(type, "type");
                this.f37222a = type;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeType) && Intrinsics.m18594b(this.f37222a, ((ChangeType) obj).f37222a);
            }

            public final int hashCode() {
                return this.f37222a.hashCode();
            }

            public final String toString() {
                return AbstractC0455a.m2241p(new StringBuilder("ChangeType(type="), this.f37222a, ')');
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction$LoadData;", "Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class LoadData extends UiAction {

            /* JADX INFO: renamed from: a */
            public static final LoadData f37223a = new LoadData();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadData);
            }

            public final int hashCode() {
                return -1111700819;
            }

            public final String toString() {
                return "LoadData";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/identity/IdentityVerificationViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final String f37224a;

        /* JADX INFO: renamed from: b */
        public final Country f37225b;

        /* JADX INFO: renamed from: c */
        public final String f37226c;

        /* JADX INFO: renamed from: d */
        public final String f37227d;

        /* JADX INFO: renamed from: e */
        public final List f37228e;

        public ViewState(String type, Country country, String str, String str2, List countryList) {
            Intrinsics.m18599g(type, "type");
            Intrinsics.m18599g(countryList, "countryList");
            this.f37224a = type;
            this.f37225b = country;
            this.f37226c = str;
            this.f37227d = str2;
            this.f37228e = countryList;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13654a(ViewState viewState, String str, Country country, String str2, String str3, List list, int i) {
            if ((i & 1) != 0) {
                str = viewState.f37224a;
            }
            String type = str;
            if ((i & 2) != 0) {
                country = viewState.f37225b;
            }
            Country country2 = country;
            if ((i & 4) != 0) {
                str2 = viewState.f37226c;
            }
            String name = str2;
            if ((i & 8) != 0) {
                str3 = viewState.f37227d;
            }
            String idNumber = str3;
            if ((i & 16) != 0) {
                list = viewState.f37228e;
            }
            List countryList = list;
            viewState.getClass();
            Intrinsics.m18599g(type, "type");
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(idNumber, "idNumber");
            Intrinsics.m18599g(countryList, "countryList");
            return new ViewState(type, country2, name, idNumber, countryList);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f37224a, viewState.f37224a) && Intrinsics.m18594b(this.f37225b, viewState.f37225b) && Intrinsics.m18594b(this.f37226c, viewState.f37226c) && Intrinsics.m18594b(this.f37227d, viewState.f37227d) && Intrinsics.m18594b(this.f37228e, viewState.f37228e);
        }

        public final int hashCode() {
            int iHashCode = this.f37224a.hashCode() * 31;
            Country country = this.f37225b;
            return this.f37228e.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b((iHashCode + (country == null ? 0 : country.hashCode())) * 31, 31, this.f37226c), 31, this.f37227d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(type=");
            sb.append(this.f37224a);
            sb.append(", country=");
            sb.append(this.f37225b);
            sb.append(", name=");
            sb.append(this.f37226c);
            sb.append(", idNumber=");
            sb.append(this.f37227d);
            sb.append(", countryList=");
            return AbstractC0455a.m2242q(sb, this.f37228e, ')');
        }
    }

    public IdentityVerificationViewModel(CommonRepository commonRepository) {
        this.f37218f = commonRepository;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        return new ViewState((String) CollectionsKt.m18398B(IdentityVerificationViewModelKt.f37232a), null, "", "", EmptyList.f51496a);
    }

    /* JADX INFO: renamed from: f */
    public final void m13653f(UiAction uiAction) {
        LaunchExtKt.m14205f(ViewModelKt.m9173a(this), null, null, null, null, new IdentityVerificationViewModel$onAction$1(uiAction, this, null), 31);
    }
}
