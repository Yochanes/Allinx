package com.exchange.allin.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.net.api.NetworkApiKt;
import com.exchange.allin.net.api.service.CommonService;
import com.exchange.allin.net.response.ApiPaging;
import com.exchange.allin.utils.ext.LaunchExtKt;
import com.mvi.base.BaseRepository;
import com.mvi.net.response.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/repository/CommonRepository;", "Lcom/mvi/base/BaseRepository;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class CommonRepository extends BaseRepository {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13424a(int i, int i2, ContinuationImpl continuationImpl) {
        CommonRepository$getAnnouncementList$1 commonRepository$getAnnouncementList$1;
        if (continuationImpl instanceof CommonRepository$getAnnouncementList$1) {
            commonRepository$getAnnouncementList$1 = (CommonRepository$getAnnouncementList$1) continuationImpl;
            int i3 = commonRepository$getAnnouncementList$1.f35498c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonRepository$getAnnouncementList$1.f35498c = i3 - Integer.MIN_VALUE;
            } else {
                commonRepository$getAnnouncementList$1 = new CommonRepository$getAnnouncementList$1(this, continuationImpl);
            }
        }
        Object objM13266d = commonRepository$getAnnouncementList$1.f35496a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i4 = commonRepository$getAnnouncementList$1.f35498c;
        if (i4 == 0) {
            ResultKt.m18313b(objM13266d);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getAnnouncementList$1.f35498c = 1;
            objM13266d = commonServiceM13238b.m13266d(i2, i, commonRepository$getAnnouncementList$1);
            if (objM13266d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13266d);
        }
        List records = ((ApiPaging) LaunchExtKt.m14202c((BaseResponse) objM13266d, null, 7)).getRecords();
        return records == null ? EmptyList.f51496a : records;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13425b(ContinuationImpl continuationImpl) {
        CommonRepository$getBanners$1 commonRepository$getBanners$1;
        if (continuationImpl instanceof CommonRepository$getBanners$1) {
            commonRepository$getBanners$1 = (CommonRepository$getBanners$1) continuationImpl;
            int i = commonRepository$getBanners$1.f35501c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getBanners$1.f35501c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getBanners$1 = new CommonRepository$getBanners$1(this, continuationImpl);
            }
        }
        Object objM13264b = commonRepository$getBanners$1.f35499a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getBanners$1.f35501c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13264b);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getBanners$1.f35501c = 1;
            objM13264b = commonServiceM13238b.m13264b(commonRepository$getBanners$1);
            if (objM13264b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13264b);
        }
        return LaunchExtKt.m14203d((BaseResponse) objM13264b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13426c(ContinuationImpl continuationImpl) {
        CommonRepository$getCountries$1 commonRepository$getCountries$1;
        if (continuationImpl instanceof CommonRepository$getCountries$1) {
            commonRepository$getCountries$1 = (CommonRepository$getCountries$1) continuationImpl;
            int i = commonRepository$getCountries$1.f35504c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getCountries$1.f35504c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getCountries$1 = new CommonRepository$getCountries$1(this, continuationImpl);
            }
        }
        Object objM13267e = commonRepository$getCountries$1.f35502a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getCountries$1.f35504c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13267e);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getCountries$1.f35504c = 1;
            objM13267e = commonServiceM13238b.m13267e(commonRepository$getCountries$1);
            if (objM13267e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13267e);
        }
        return LaunchExtKt.m14203d((BaseResponse) objM13267e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13427d(ContinuationImpl continuationImpl) {
        CommonRepository$getCurrencyRate$1 commonRepository$getCurrencyRate$1;
        if (continuationImpl instanceof CommonRepository$getCurrencyRate$1) {
            commonRepository$getCurrencyRate$1 = (CommonRepository$getCurrencyRate$1) continuationImpl;
            int i = commonRepository$getCurrencyRate$1.f35507c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getCurrencyRate$1.f35507c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getCurrencyRate$1 = new CommonRepository$getCurrencyRate$1(this, continuationImpl);
            }
        }
        Object objM13268f = commonRepository$getCurrencyRate$1.f35505a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getCurrencyRate$1.f35507c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13268f);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getCurrencyRate$1.f35507c = 1;
            objM13268f = commonServiceM13238b.m13268f(commonRepository$getCurrencyRate$1);
            if (objM13268f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13268f);
        }
        return LaunchExtKt.m14203d((BaseResponse) objM13268f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13428e(ContinuationImpl continuationImpl) {
        CommonRepository$getIp$1 commonRepository$getIp$1;
        if (continuationImpl instanceof CommonRepository$getIp$1) {
            commonRepository$getIp$1 = (CommonRepository$getIp$1) continuationImpl;
            int i = commonRepository$getIp$1.f35510c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getIp$1.f35510c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getIp$1 = new CommonRepository$getIp$1(this, continuationImpl);
            }
        }
        Object objM13270h = commonRepository$getIp$1.f35508a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getIp$1.f35510c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13270h);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getIp$1.f35510c = 1;
            objM13270h = commonServiceM13238b.m13270h(commonRepository$getIp$1);
            if (objM13270h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13270h);
        }
        return LaunchExtKt.m14202c((BaseResponse) objM13270h, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13429f(ContinuationImpl continuationImpl) {
        CommonRepository$getTokens$1 commonRepository$getTokens$1;
        if (continuationImpl instanceof CommonRepository$getTokens$1) {
            commonRepository$getTokens$1 = (CommonRepository$getTokens$1) continuationImpl;
            int i = commonRepository$getTokens$1.f35513c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getTokens$1.f35513c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getTokens$1 = new CommonRepository$getTokens$1(this, continuationImpl);
            }
        }
        CommonRepository$getTokens$1 commonRepository$getTokens$12 = commonRepository$getTokens$1;
        Object objM13269g = commonRepository$getTokens$12.f35511a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getTokens$12.f35513c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13269g);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getTokens$12.f35513c = 1;
            objM13269g = commonServiceM13238b.m13269g(null, null, null, 1, commonRepository$getTokens$12);
            if (objM13269g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13269g);
        }
        List records = ((ApiPaging) LaunchExtKt.m14202c((BaseResponse) objM13269g, null, 7)).getRecords();
        return records == null ? EmptyList.f51496a : records;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13430g(ContinuationImpl continuationImpl) {
        CommonRepository$getTranslate$1 commonRepository$getTranslate$1;
        if (continuationImpl instanceof CommonRepository$getTranslate$1) {
            commonRepository$getTranslate$1 = (CommonRepository$getTranslate$1) continuationImpl;
            int i = commonRepository$getTranslate$1.f35516c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getTranslate$1.f35516c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getTranslate$1 = new CommonRepository$getTranslate$1(this, continuationImpl);
            }
        }
        Object objM13265c = commonRepository$getTranslate$1.f35514a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getTranslate$1.f35516c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13265c);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getTranslate$1.f35516c = 1;
            objM13265c = commonServiceM13238b.m13265c("android", commonRepository$getTranslate$1);
            if (objM13265c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13265c);
        }
        return LaunchExtKt.m14202c((BaseResponse) objM13265c, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13431h(ContinuationImpl continuationImpl) {
        CommonRepository$getVersion$1 commonRepository$getVersion$1;
        if (continuationImpl instanceof CommonRepository$getVersion$1) {
            commonRepository$getVersion$1 = (CommonRepository$getVersion$1) continuationImpl;
            int i = commonRepository$getVersion$1.f35519c;
            if ((i & Integer.MIN_VALUE) != 0) {
                commonRepository$getVersion$1.f35519c = i - Integer.MIN_VALUE;
            } else {
                commonRepository$getVersion$1 = new CommonRepository$getVersion$1(this, continuationImpl);
            }
        }
        Object objM13263a = commonRepository$getVersion$1.f35517a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = commonRepository$getVersion$1.f35519c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13263a);
            CommonService commonServiceM13238b = NetworkApiKt.m13238b();
            commonRepository$getVersion$1.f35519c = 1;
            objM13263a = commonServiceM13238b.m13263a(commonRepository$getVersion$1);
            if (objM13263a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13263a);
        }
        return LaunchExtKt.m14202c((BaseResponse) objM13263a, null, 7);
    }
}
