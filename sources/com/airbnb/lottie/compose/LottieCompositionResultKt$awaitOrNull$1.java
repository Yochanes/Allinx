package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import io.intercom.android.sdk.survey.SurveyViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.airbnb.lottie.compose.LottieCompositionResultKt", m18559f = "LottieCompositionResult.kt", m18560l = {SurveyViewModel.ENTITY_TYPE}, m18561m = "awaitOrNull")
final class LottieCompositionResultKt$awaitOrNull$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34422a;

    /* JADX INFO: renamed from: b */
    public int f34423b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f34422a = obj;
        int i = (this.f34423b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f34423b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        try {
            if (i == 0) {
                ResultKt.m18313b(obj);
                this.f34423b = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return (LottieComposition) obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
