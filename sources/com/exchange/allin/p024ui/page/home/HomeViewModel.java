package com.exchange.allin.p024ui.page.home;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.config.AppConfig;
import com.exchange.allin.data.GuessTopic;
import com.exchange.allin.repository.CommonRepository;
import com.exchange.allin.repository.GuessRepository;
import com.mvi.base.BaseViewModel;
import com.mvi.base.IViewEvent;
import com.mvi.base.IViewState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/exchange/allin/ui/page/home/HomeViewModel;", "Lcom/mvi/base/BaseViewModel;", "Lcom/exchange/allin/ui/page/home/HomeViewModel$ViewState;", "Lcom/mvi/base/IViewEvent;", "ViewState", "UiAction", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class HomeViewModel extends BaseViewModel<ViewState, IViewEvent> {

    /* JADX INFO: renamed from: f */
    public final CommonRepository f39880f;

    /* JADX INFO: renamed from: g */
    public final GuessRepository f39881g;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/page/home/HomeViewModel$UiAction;", "", "LoadData", "Lcom/exchange/allin/ui/page/home/HomeViewModel$UiAction$LoadData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static abstract class UiAction {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/home/HomeViewModel$UiAction$LoadData;", "Lcom/exchange/allin/ui/page/home/HomeViewModel$UiAction;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final /* data */ class LoadData extends UiAction {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadData);
            }

            public final int hashCode() {
                return 545058311;
            }

            public final String toString() {
                return "LoadData";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/home/HomeViewModel$ViewState;", "Lcom/mvi/base/IViewState;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final /* data */ class ViewState implements IViewState {

        /* JADX INFO: renamed from: a */
        public final List f39882a;

        /* JADX INFO: renamed from: b */
        public final List f39883b;

        /* JADX INFO: renamed from: c */
        public final GuessTopic f39884c;

        /* JADX INFO: renamed from: d */
        public final boolean f39885d;

        public ViewState(List bannerList, List announcementList, GuessTopic guessTopic, boolean z2) {
            Intrinsics.m18599g(bannerList, "bannerList");
            Intrinsics.m18599g(announcementList, "announcementList");
            this.f39882a = bannerList;
            this.f39883b = announcementList;
            this.f39884c = guessTopic;
            this.f39885d = z2;
        }

        /* JADX INFO: renamed from: a */
        public static ViewState m13939a(ViewState viewState, List bannerList, List announcementList, GuessTopic guessTopic, boolean z2, int i) {
            if ((i & 1) != 0) {
                bannerList = viewState.f39882a;
            }
            if ((i & 2) != 0) {
                announcementList = viewState.f39883b;
            }
            if ((i & 4) != 0) {
                guessTopic = viewState.f39884c;
            }
            if ((i & 8) != 0) {
                z2 = viewState.f39885d;
            }
            viewState.getClass();
            Intrinsics.m18599g(bannerList, "bannerList");
            Intrinsics.m18599g(announcementList, "announcementList");
            return new ViewState(bannerList, announcementList, guessTopic, z2);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GuessTopic getF39884c() {
            return this.f39884c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.m18594b(this.f39882a, viewState.f39882a) && Intrinsics.m18594b(this.f39883b, viewState.f39883b) && Intrinsics.m18594b(this.f39884c, viewState.f39884c) && this.f39885d == viewState.f39885d;
        }

        public final int hashCode() {
            int iM2233h = AbstractC0455a.m2233h(this.f39883b, this.f39882a.hashCode() * 31, 31);
            GuessTopic guessTopic = this.f39884c;
            return Boolean.hashCode(this.f39885d) + ((iM2233h + (guessTopic == null ? 0 : guessTopic.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(bannerList=");
            sb.append(this.f39882a);
            sb.append(", announcementList=");
            sb.append(this.f39883b);
            sb.append(", topic=");
            sb.append(this.f39884c);
            sb.append(", isLoading=");
            return AbstractC0455a.m2243r(sb, this.f39885d, ')');
        }
    }

    public HomeViewModel(CommonRepository commonRepository, GuessRepository guessRepository) {
        this.f39880f = commonRepository;
        this.f39881g = guessRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13936f(HomeViewModel homeViewModel, ContinuationImpl continuationImpl) {
        HomeViewModel$getAnnouncementList$1 homeViewModel$getAnnouncementList$1;
        homeViewModel.getClass();
        if (continuationImpl instanceof HomeViewModel$getAnnouncementList$1) {
            homeViewModel$getAnnouncementList$1 = (HomeViewModel$getAnnouncementList$1) continuationImpl;
            int i = homeViewModel$getAnnouncementList$1.f39889d;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeViewModel$getAnnouncementList$1.f39889d = i - Integer.MIN_VALUE;
            } else {
                homeViewModel$getAnnouncementList$1 = new HomeViewModel$getAnnouncementList$1(homeViewModel, continuationImpl);
            }
        }
        Object objM13424a = homeViewModel$getAnnouncementList$1.f39887b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = homeViewModel$getAnnouncementList$1.f39889d;
        if (i2 == 0) {
            ResultKt.m18313b(objM13424a);
            homeViewModel$getAnnouncementList$1.f39886a = homeViewModel;
            homeViewModel$getAnnouncementList$1.f39889d = 1;
            objM13424a = homeViewModel.f39880f.m13424a(1, 10, homeViewModel$getAnnouncementList$1);
            if (objM13424a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeViewModel = homeViewModel$getAnnouncementList$1.f39886a;
            ResultKt.m18313b(objM13424a);
        }
        homeViewModel.m15414e(new C3273f((List) objM13424a, 0));
        return Unit.f51459a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13937g(HomeViewModel homeViewModel, ContinuationImpl continuationImpl) {
        HomeViewModel$getBanners$1 homeViewModel$getBanners$1;
        homeViewModel.getClass();
        if (continuationImpl instanceof HomeViewModel$getBanners$1) {
            homeViewModel$getBanners$1 = (HomeViewModel$getBanners$1) continuationImpl;
            int i = homeViewModel$getBanners$1.f39893d;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeViewModel$getBanners$1.f39893d = i - Integer.MIN_VALUE;
            } else {
                homeViewModel$getBanners$1 = new HomeViewModel$getBanners$1(homeViewModel, continuationImpl);
            }
        }
        Object objM13425b = homeViewModel$getBanners$1.f39891b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = homeViewModel$getBanners$1.f39893d;
        if (i2 == 0) {
            ResultKt.m18313b(objM13425b);
            homeViewModel$getBanners$1.f39890a = homeViewModel;
            homeViewModel$getBanners$1.f39893d = 1;
            objM13425b = homeViewModel.f39880f.m13425b(homeViewModel$getBanners$1);
            if (objM13425b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeViewModel = homeViewModel$getBanners$1.f39890a;
            ResultKt.m18313b(objM13425b);
        }
        homeViewModel.m15414e(new C3273f((List) objM13425b, 1));
        return Unit.f51459a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13938h(HomeViewModel homeViewModel, ContinuationImpl continuationImpl) {
        HomeViewModel$getGuessTopic$1 homeViewModel$getGuessTopic$1;
        homeViewModel.getClass();
        if (continuationImpl instanceof HomeViewModel$getGuessTopic$1) {
            homeViewModel$getGuessTopic$1 = (HomeViewModel$getGuessTopic$1) continuationImpl;
            int i = homeViewModel$getGuessTopic$1.f39897d;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeViewModel$getGuessTopic$1.f39897d = i - Integer.MIN_VALUE;
            } else {
                homeViewModel$getGuessTopic$1 = new HomeViewModel$getGuessTopic$1(homeViewModel, continuationImpl);
            }
        }
        HomeViewModel$getGuessTopic$1 homeViewModel$getGuessTopic$12 = homeViewModel$getGuessTopic$1;
        Object objM13471g = homeViewModel$getGuessTopic$12.f39895b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = homeViewModel$getGuessTopic$12.f39897d;
        if (i2 == 0) {
            ResultKt.m18313b(objM13471g);
            AppConfig.Host.f35238a.getClass();
            homeViewModel$getGuessTopic$12.f39894a = homeViewModel;
            homeViewModel$getGuessTopic$12.f39897d = 1;
            objM13471g = homeViewModel.f39881g.m13471g(1, null, 1, 10, homeViewModel$getGuessTopic$12);
            if (objM13471g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeViewModel = homeViewModel$getGuessTopic$12.f39894a;
            ResultKt.m18313b(objM13471g);
        }
        homeViewModel.m15414e(new C3273f((List) objM13471g, 2));
        return Unit.f51459a;
    }

    @Override // com.mvi.base.BaseViewModel
    /* JADX INFO: renamed from: b */
    public final IViewState mo13645b() {
        EmptyList emptyList = EmptyList.f51496a;
        return new ViewState(emptyList, emptyList, null, false);
    }
}
