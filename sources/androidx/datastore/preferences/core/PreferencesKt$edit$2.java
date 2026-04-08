package androidx.datastore.preferences.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18302d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", m18559f = "Preferences.kt", m18560l = {329}, m18561m = "invokeSuspend")
final class PreferencesKt$edit$2 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {

    /* JADX INFO: renamed from: a */
    public int f23833a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SuspendLambda f23835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f23835c = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.f23835c, continuation);
        preferencesKt$edit$2.f23834b = obj;
        return preferencesKt$edit$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesKt$edit$2) create((Preferences) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f23833a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.f23834b;
            ResultKt.m18313b(obj);
            return mutablePreferences;
        }
        ResultKt.m18313b(obj);
        MutablePreferences mutablePreferences2 = new MutablePreferences(MapsKt.m18492o(((Preferences) this.f23834b).mo8287a()), false);
        this.f23834b = mutablePreferences2;
        this.f23833a = 1;
        return this.f23835c.invoke(mutablePreferences2, this) == coroutineSingletons ? coroutineSingletons : mutablePreferences2;
    }
}
