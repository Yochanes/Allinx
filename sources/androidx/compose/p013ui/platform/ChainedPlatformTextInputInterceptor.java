package androidx.compose.p013ui.platform;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class ChainedPlatformTextInputInterceptor {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6104a(Owner owner, Function2 function2, ContinuationImpl continuationImpl) {
        ChainedPlatformTextInputInterceptor$textInputSession$1 chainedPlatformTextInputInterceptor$textInputSession$1;
        if (continuationImpl instanceof ChainedPlatformTextInputInterceptor$textInputSession$1) {
            chainedPlatformTextInputInterceptor$textInputSession$1 = (ChainedPlatformTextInputInterceptor$textInputSession$1) continuationImpl;
            int i = chainedPlatformTextInputInterceptor$textInputSession$1.f19323c;
            if ((i & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$1.f19323c = i - Integer.MIN_VALUE;
            } else {
                chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, continuationImpl);
            }
        }
        Object obj = chainedPlatformTextInputInterceptor$textInputSession$1.f19321a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = chainedPlatformTextInputInterceptor$textInputSession$1.f19323c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw AbstractC0455a.m2245t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(function2, this, null);
        chainedPlatformTextInputInterceptor$textInputSession$1.f19323c = 1;
        PlatformTextInputModifierNodeKt.m6171b(owner, null, chainedPlatformTextInputInterceptor$textInputSession$2, chainedPlatformTextInputInterceptor$textInputSession$1);
    }
}
