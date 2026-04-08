package com.google.firebase.sessions.settings;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "", "msg", ""}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m18559f = "RemoteSettings.kt", m18560l = {}, m18561m = "invokeSuspend")
public final class RemoteSettings$updateSettings$2$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public RemoteSettings$updateSettings$2$2(Continuation<? super RemoteSettings$updateSettings$2$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((String) obj, (Continuation<? super Unit>) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        Log.e(RemoteSettings.TAG, "Error failing to fetch the remote configs: " + ((String) this.L$0));
        return Unit.f51459a;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(Unit.f51459a);
    }
}
