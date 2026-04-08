package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.PackageManagerHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", m18559f = "UnfinishedWorkListener.kt", m18560l = {}, m18561m = "invokeSuspend")
final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f32702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f32703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.f32703b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2(this.f32703b, continuation);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2.f32702a = ((Boolean) obj).booleanValue();
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2 = (UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2) create(bool, (Continuation) obj2);
        Unit unit = Unit.f51459a;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        PackageManagerHelper.m12282a(this.f32703b, RescheduleReceiver.class, this.f32702a);
        return Unit.f51459a;
    }
}
