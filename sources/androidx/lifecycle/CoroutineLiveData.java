package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/lifecycle/CoroutineLiveData;", "T", "Landroidx/lifecycle/MediatorLiveData;", "lifecycle-livedata_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {

    /* JADX INFO: renamed from: m */
    public EmittedSource f24848m;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9115n(ContinuationImpl continuationImpl) throws Throwable {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        if (continuationImpl instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuationImpl;
            int i = coroutineLiveData$clearSource$1.f24851c;
            if ((i & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.f24851c = i - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuationImpl);
            }
        }
        Object obj = coroutineLiveData$clearSource$1.f24849a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = coroutineLiveData$clearSource$1.f24851c;
        Unit unit = Unit.f51459a;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            EmittedSource emittedSource = this.f24848m;
            if (emittedSource != null) {
                coroutineLiveData$clearSource$1.f24851c = 1;
                DefaultScheduler defaultScheduler = Dispatchers.f55294a;
                Object objM20509e = BuildersKt.m20509e(MainDispatcherLoader.f56350a.mo20642a1(), new EmittedSource$disposeNow$2(emittedSource, null), coroutineLiveData$clearSource$1);
                if (objM20509e != coroutineSingletons) {
                    objM20509e = unit;
                }
                if (objM20509e == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        this.f24848m = null;
        return unit;
    }
}
