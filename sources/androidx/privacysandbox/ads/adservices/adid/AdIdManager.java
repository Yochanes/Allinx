package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.arch.core.executor.ExecutorC0154a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.media3.datasource.AbstractC1761c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "", "Api33Ext4Impl", "Companion", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class AdIdManager {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager$Api33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @RequiresExtension
    @SourceDebugExtension
    public static final class Api33Ext4Impl extends AdIdManager {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @RequiresPermission
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m11428a(@NotNull Continuation<? super AdId> continuation) {
            AdIdManager$Api33Ext4Impl$getAdId$1 adIdManager$Api33Ext4Impl$getAdId$1;
            if (continuation instanceof AdIdManager$Api33Ext4Impl$getAdId$1) {
                adIdManager$Api33Ext4Impl$getAdId$1 = (AdIdManager$Api33Ext4Impl$getAdId$1) continuation;
                int i = adIdManager$Api33Ext4Impl$getAdId$1.f31411d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    adIdManager$Api33Ext4Impl$getAdId$1.f31411d = i - Integer.MIN_VALUE;
                } else {
                    adIdManager$Api33Ext4Impl$getAdId$1 = new AdIdManager$Api33Ext4Impl$getAdId$1(this, continuation);
                }
            }
            Object obj = adIdManager$Api33Ext4Impl$getAdId$1.f31409b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = adIdManager$Api33Ext4Impl$getAdId$1.f31411d;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                adIdManager$Api33Ext4Impl$getAdId$1.f31408a = this;
                adIdManager$Api33Ext4Impl$getAdId$1.f31411d = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(adIdManager$Api33Ext4Impl$getAdId$1));
                cancellableContinuationImpl.m20534p();
                new ExecutorC0154a(1);
                OutcomeReceiverKt.m7658a(cancellableContinuationImpl);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Api33Ext4Impl api33Ext4Impl = (Api33Ext4Impl) adIdManager$Api33Ext4Impl$getAdId$1.f31408a;
            ResultKt.m18313b(obj);
            android.adservices.adid.AdId adIdM9711d = AbstractC1761c.m9711d(obj);
            api33Ext4Impl.getClass();
            String strM9721n = AbstractC1761c.m9721n(adIdM9711d);
            Intrinsics.m18598f(strM9721n, "response.adId");
            return new AdId(strM9721n, AbstractC1761c.m9731x(adIdM9711d));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager$Companion;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }
}
