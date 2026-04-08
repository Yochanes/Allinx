package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
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
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "", "Api33Ext4Impl", "Companion", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class AppSetIdManager {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager$Api33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager;", "Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @RequiresExtension
    @SourceDebugExtension
    public static final class Api33Ext4Impl extends AppSetIdManager {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m11431a(@NotNull Continuation<? super AppSetId> continuation) {
            AppSetIdManager$Api33Ext4Impl$getAppSetId$1 appSetIdManager$Api33Ext4Impl$getAppSetId$1;
            if (continuation instanceof AppSetIdManager$Api33Ext4Impl$getAppSetId$1) {
                appSetIdManager$Api33Ext4Impl$getAppSetId$1 = (AppSetIdManager$Api33Ext4Impl$getAppSetId$1) continuation;
                int i = appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31420d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31420d = i - Integer.MIN_VALUE;
                } else {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$1 = new AppSetIdManager$Api33Ext4Impl$getAppSetId$1(this, continuation);
                }
            }
            Object obj = appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31418b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31420d;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31417a = this;
                appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31420d = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(appSetIdManager$Api33Ext4Impl$getAppSetId$1));
                cancellableContinuationImpl.m20534p();
                new ExecutorC0154a(1);
                OutcomeReceiverKt.m7658a(cancellableContinuationImpl);
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Api33Ext4Impl api33Ext4Impl = (Api33Ext4Impl) appSetIdManager$Api33Ext4Impl$getAppSetId$1.f31417a;
            ResultKt.m18313b(obj);
            android.adservices.appsetid.AppSetId appSetIdM9713f = AbstractC1761c.m9713f(obj);
            api33Ext4Impl.getClass();
            if (AbstractC1761c.m9708a(appSetIdM9713f) == 1) {
                String strM9722o = AbstractC1761c.m9722o(appSetIdM9713f);
                Intrinsics.m18598f(strM9722o, "response.id");
                return new AppSetId(strM9722o, 1);
            }
            String strM9722o2 = AbstractC1761c.m9722o(appSetIdM9713f);
            Intrinsics.m18598f(strM9722o2, "response.id");
            return new AppSetId(strM9722o2, 2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetIdManager$Companion;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }
}
