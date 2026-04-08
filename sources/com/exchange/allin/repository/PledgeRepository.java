package com.exchange.allin.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.net.api.NetworkApiKt;
import com.exchange.allin.net.api.service.PledgeService;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/repository/PledgeRepository;", "Lcom/mvi/base/BaseRepository;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class PledgeRepository extends BaseRepository {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m13488e(PledgeRepository pledgeRepository, Integer num, Integer num2, SuspendLambda suspendLambda, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        return pledgeRepository.m13492d(num, num2, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13489a(ContinuationImpl continuationImpl) {
        PledgeRepository$getPledgeConfigList$1 pledgeRepository$getPledgeConfigList$1;
        if (continuationImpl instanceof PledgeRepository$getPledgeConfigList$1) {
            pledgeRepository$getPledgeConfigList$1 = (PledgeRepository$getPledgeConfigList$1) continuationImpl;
            int i = pledgeRepository$getPledgeConfigList$1.f35763c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pledgeRepository$getPledgeConfigList$1.f35763c = i - Integer.MIN_VALUE;
            } else {
                pledgeRepository$getPledgeConfigList$1 = new PledgeRepository$getPledgeConfigList$1(this, continuationImpl);
            }
        }
        Object objM13333a = pledgeRepository$getPledgeConfigList$1.f35761a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pledgeRepository$getPledgeConfigList$1.f35763c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13333a);
            PledgeService pledgeServiceM13243g = NetworkApiKt.m13243g();
            pledgeRepository$getPledgeConfigList$1.f35763c = 1;
            objM13333a = pledgeServiceM13243g.m13333a(pledgeRepository$getPledgeConfigList$1);
            if (objM13333a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13333a);
        }
        return LaunchExtKt.m14203d((BaseResponse) objM13333a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13490b(Integer num, Integer num2, ContinuationImpl continuationImpl) {
        PledgeRepository$getRaiseRecord$1 pledgeRepository$getRaiseRecord$1;
        if (continuationImpl instanceof PledgeRepository$getRaiseRecord$1) {
            pledgeRepository$getRaiseRecord$1 = (PledgeRepository$getRaiseRecord$1) continuationImpl;
            int i = pledgeRepository$getRaiseRecord$1.f35766c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pledgeRepository$getRaiseRecord$1.f35766c = i - Integer.MIN_VALUE;
            } else {
                pledgeRepository$getRaiseRecord$1 = new PledgeRepository$getRaiseRecord$1(this, continuationImpl);
            }
        }
        PledgeRepository$getRaiseRecord$1 pledgeRepository$getRaiseRecord$12 = pledgeRepository$getRaiseRecord$1;
        Object objM13336d = pledgeRepository$getRaiseRecord$12.f35764a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pledgeRepository$getRaiseRecord$12.f35766c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13336d);
            PledgeService pledgeServiceM13243g = NetworkApiKt.m13243g();
            pledgeRepository$getRaiseRecord$12.f35766c = 1;
            objM13336d = pledgeServiceM13243g.m13336d(null, null, num, num2, pledgeRepository$getRaiseRecord$12);
            if (objM13336d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13336d);
        }
        List records = ((ApiPaging) LaunchExtKt.m14202c((BaseResponse) objM13336d, null, 7)).getRecords();
        return records == null ? EmptyList.f51496a : records;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13491c(Long l, Long l2, int i, Integer num, Integer num2, ContinuationImpl continuationImpl) {
        PledgeRepository$getReleaseRecord$1 pledgeRepository$getReleaseRecord$1;
        if (continuationImpl instanceof PledgeRepository$getReleaseRecord$1) {
            pledgeRepository$getReleaseRecord$1 = (PledgeRepository$getReleaseRecord$1) continuationImpl;
            int i2 = pledgeRepository$getReleaseRecord$1.f35769c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pledgeRepository$getReleaseRecord$1.f35769c = i2 - Integer.MIN_VALUE;
            } else {
                pledgeRepository$getReleaseRecord$1 = new PledgeRepository$getReleaseRecord$1(this, continuationImpl);
            }
        }
        PledgeRepository$getReleaseRecord$1 pledgeRepository$getReleaseRecord$12 = pledgeRepository$getReleaseRecord$1;
        Object objM13338f = pledgeRepository$getReleaseRecord$12.f35767a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = pledgeRepository$getReleaseRecord$12.f35769c;
        if (i3 == 0) {
            ResultKt.m18313b(objM13338f);
            PledgeService pledgeServiceM13243g = NetworkApiKt.m13243g();
            Integer num3 = new Integer(i);
            pledgeRepository$getReleaseRecord$12.f35769c = 1;
            objM13338f = pledgeServiceM13243g.m13338f(l, l2, num3, num, num2, pledgeRepository$getReleaseRecord$12);
            if (objM13338f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13338f);
        }
        List records = ((ApiPaging) LaunchExtKt.m14202c((BaseResponse) objM13338f, null, 7)).getRecords();
        return records == null ? EmptyList.f51496a : records;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13492d(Integer num, Integer num2, ContinuationImpl continuationImpl) {
        PledgeRepository$getSubscribeRecord$1 pledgeRepository$getSubscribeRecord$1;
        if (continuationImpl instanceof PledgeRepository$getSubscribeRecord$1) {
            pledgeRepository$getSubscribeRecord$1 = (PledgeRepository$getSubscribeRecord$1) continuationImpl;
            int i = pledgeRepository$getSubscribeRecord$1.f35772c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pledgeRepository$getSubscribeRecord$1.f35772c = i - Integer.MIN_VALUE;
            } else {
                pledgeRepository$getSubscribeRecord$1 = new PledgeRepository$getSubscribeRecord$1(this, continuationImpl);
            }
        }
        PledgeRepository$getSubscribeRecord$1 pledgeRepository$getSubscribeRecord$12 = pledgeRepository$getSubscribeRecord$1;
        Object objM13334b = pledgeRepository$getSubscribeRecord$12.f35770a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pledgeRepository$getSubscribeRecord$12.f35772c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13334b);
            PledgeService pledgeServiceM13243g = NetworkApiKt.m13243g();
            pledgeRepository$getSubscribeRecord$12.f35772c = 1;
            objM13334b = pledgeServiceM13243g.m13334b(null, null, num, num2, pledgeRepository$getSubscribeRecord$12);
            if (objM13334b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13334b);
        }
        List records = ((ApiPaging) LaunchExtKt.m14202c((BaseResponse) objM13334b, null, 7)).getRecords();
        return records == null ? EmptyList.f51496a : records;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13493f(long j, Long l, ContinuationImpl continuationImpl) {
        PledgeRepository$pledgeNexus$1 pledgeRepository$pledgeNexus$1;
        if (continuationImpl instanceof PledgeRepository$pledgeNexus$1) {
            pledgeRepository$pledgeNexus$1 = (PledgeRepository$pledgeNexus$1) continuationImpl;
            int i = pledgeRepository$pledgeNexus$1.f35775c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pledgeRepository$pledgeNexus$1.f35775c = i - Integer.MIN_VALUE;
            } else {
                pledgeRepository$pledgeNexus$1 = new PledgeRepository$pledgeNexus$1(this, continuationImpl);
            }
        }
        Object objM13337e = pledgeRepository$pledgeNexus$1.f35773a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pledgeRepository$pledgeNexus$1.f35775c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13337e);
            PledgeService pledgeServiceM13243g = NetworkApiKt.m13243g();
            pledgeRepository$pledgeNexus$1.f35775c = 1;
            objM13337e = pledgeServiceM13243g.m13337e(j, l, pledgeRepository$pledgeNexus$1);
            if (objM13337e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13337e);
        }
        return LaunchExtKt.m14202c((BaseResponse) objM13337e, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m13494g(long j, String str, ContinuationImpl continuationImpl) {
        PledgeRepository$pledgeNexusRaise$1 pledgeRepository$pledgeNexusRaise$1;
        if (continuationImpl instanceof PledgeRepository$pledgeNexusRaise$1) {
            pledgeRepository$pledgeNexusRaise$1 = (PledgeRepository$pledgeNexusRaise$1) continuationImpl;
            int i = pledgeRepository$pledgeNexusRaise$1.f35778c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pledgeRepository$pledgeNexusRaise$1.f35778c = i - Integer.MIN_VALUE;
            } else {
                pledgeRepository$pledgeNexusRaise$1 = new PledgeRepository$pledgeNexusRaise$1(this, continuationImpl);
            }
        }
        Object objM13335c = pledgeRepository$pledgeNexusRaise$1.f35776a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = pledgeRepository$pledgeNexusRaise$1.f35778c;
        if (i2 == 0) {
            ResultKt.m18313b(objM13335c);
            PledgeService pledgeServiceM13243g = NetworkApiKt.m13243g();
            pledgeRepository$pledgeNexusRaise$1.f35778c = 1;
            objM13335c = pledgeServiceM13243g.m13335c(j, str, pledgeRepository$pledgeNexusRaise$1);
            if (objM13335c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(objM13335c);
        }
        return LaunchExtKt.m14202c((BaseResponse) objM13335c, null, 7);
    }
}
