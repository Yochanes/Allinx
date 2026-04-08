package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.arch.core.executor.ExecutorC0154a;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.customaudience.AbstractC2096a;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m18302d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "b", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ads-adservices_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SuppressLint({"NewApi"})
@RequiresExtension
@RestrictTo
@SourceDebugExtension
public class TopicsManagerImplCommon extends TopicsManager {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @RequiresPermission
    @DoNotInline
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m11488c(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation) {
        TopicsManagerImplCommon$getTopics$1 topicsManagerImplCommon$getTopics$1;
        if (continuation instanceof TopicsManagerImplCommon$getTopics$1) {
            topicsManagerImplCommon$getTopics$1 = (TopicsManagerImplCommon$getTopics$1) continuation;
            int i = topicsManagerImplCommon$getTopics$1.f31471d;
            if ((i & Integer.MIN_VALUE) != 0) {
                topicsManagerImplCommon$getTopics$1.f31471d = i - Integer.MIN_VALUE;
            } else {
                topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, continuation);
            }
        }
        Object obj = topicsManagerImplCommon$getTopics$1.f31469b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = topicsManagerImplCommon$getTopics$1.f31471d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            topicsManagerImplCommon.mo11487a(getTopicsRequest);
            topicsManagerImplCommon$getTopics$1.f31468a = topicsManagerImplCommon;
            topicsManagerImplCommon$getTopics$1.f31471d = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.m18556b(topicsManagerImplCommon$getTopics$1));
            cancellableContinuationImpl.m20534p();
            new ExecutorC0154a(1);
            OutcomeReceiverKt.m7658a(cancellableContinuationImpl);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        TopicsManagerImplCommon topicsManagerImplCommon2 = topicsManagerImplCommon$getTopics$1.f31468a;
        ResultKt.m18313b(obj);
        android.adservices.topics.GetTopicsResponse response = AbstractC2096a.m11448k(obj);
        topicsManagerImplCommon2.getClass();
        Intrinsics.m18599g(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC2096a.m11452o(response).iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicM11449l = AbstractC2096a.m11449l(it.next());
            arrayList.add(new Topic(AbstractC2096a.m11440c(topicM11449l), AbstractC2096a.m11459v(topicM11449l), AbstractC2096a.m11439b(topicM11449l)));
        }
        return new GetTopicsResponse(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public android.adservices.topics.GetTopicsRequest mo11487a(GetTopicsRequest request) {
        Intrinsics.m18599g(request, "request");
        android.adservices.topics.GetTopicsRequest getTopicsRequestM11447j = AbstractC2096a.m11447j(AbstractC2096a.m11446i(AbstractC2096a.m11445h()));
        Intrinsics.m18598f(getTopicsRequestM11447j, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestM11447j;
    }

    @RequiresPermission
    @DoNotInline
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object m11489b(@NotNull GetTopicsRequest getTopicsRequest, @NotNull Continuation<? super GetTopicsResponse> continuation) {
        return m11488c(this, getTopicsRequest, continuation);
    }
}
