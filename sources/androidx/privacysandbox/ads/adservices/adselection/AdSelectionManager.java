package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.media3.datasource.AbstractC1761c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "", "Api33Ext4Impl", "Companion", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class AdSelectionManager {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0097@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Api33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager;", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;", "adSelectionConfig", "Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionOutcome;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;", "reportImpressionRequest", "", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/ReportImpressionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension
    @SourceDebugExtension
    public static final class Api33Ext4Impl extends AdSelectionManager {
        @RequiresPermission
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: a */
        public Object m11429a(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull Continuation<? super Unit> continuation) {
            new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(continuation)).m20534p();
            AbstractC1761c.m9704A();
            reportImpressionRequest.getClass();
            AbstractC1761c.m9725r();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @RequiresPermission
        @DoNotInline
        @Nullable
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object m11430b(@NotNull AdSelectionConfig adSelectionConfig, @NotNull Continuation<? super AdSelectionOutcome> continuation) {
            AdSelectionManager$Api33Ext4Impl$selectAds$1 adSelectionManager$Api33Ext4Impl$selectAds$1;
            if (continuation instanceof AdSelectionManager$Api33Ext4Impl$selectAds$1) {
                adSelectionManager$Api33Ext4Impl$selectAds$1 = (AdSelectionManager$Api33Ext4Impl$selectAds$1) continuation;
                int i = adSelectionManager$Api33Ext4Impl$selectAds$1.f31414c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    adSelectionManager$Api33Ext4Impl$selectAds$1.f31414c = i - Integer.MIN_VALUE;
                } else {
                    adSelectionManager$Api33Ext4Impl$selectAds$1 = new AdSelectionManager$Api33Ext4Impl$selectAds$1(this, continuation);
                }
            }
            Object obj = adSelectionManager$Api33Ext4Impl$selectAds$1.f31412a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = adSelectionManager$Api33Ext4Impl$selectAds$1.f31414c;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                AbstractC1761c.m9725r();
                adSelectionConfig.getClass();
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            AbstractC1761c.m9712e(obj);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionManager$Companion;", "", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }
}
