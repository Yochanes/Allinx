package defpackage;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import p002B.C0001a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"LSpotWebSocketHelperTest;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SpotWebSocketHelperTest {

    /* JADX INFO: renamed from: a */
    public static final Lazy f30a = LazyKt.m18299b(new C0001a(5));

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:42:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c2 -> B:42:0x00c5). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m73a(Function1 function1, ContinuationImpl continuationImpl) {
        SpotWebSocketHelperTest$retries$1 spotWebSocketHelperTest$retries$1;
        Ref.BooleanRef booleanRef;
        Function1 function12;
        int i;
        Ref.IntRef intRef;
        Throwable th;
        Function1 function13;
        Object objM18312a;
        boolean z2;
        if (continuationImpl instanceof SpotWebSocketHelperTest$retries$1) {
            spotWebSocketHelperTest$retries$1 = (SpotWebSocketHelperTest$retries$1) continuationImpl;
            int i2 = spotWebSocketHelperTest$retries$1.f36g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                spotWebSocketHelperTest$retries$1.f36g = i2 - Integer.MIN_VALUE;
            } else {
                spotWebSocketHelperTest$retries$1 = new SpotWebSocketHelperTest$retries$1(continuationImpl);
            }
        }
        Object obj = spotWebSocketHelperTest$retries$1.f35f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = spotWebSocketHelperTest$retries$1.f36g;
        Unit unit = Unit.f51459a;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            booleanRef = new Ref.BooleanRef();
            function12 = function1;
            i = 3;
            intRef = intRef2;
            if (intRef.f51657a < i) {
            }
            if (!booleanRef.f51655a) {
            }
            return unit;
        }
        if (i3 == 1) {
            i = spotWebSocketHelperTest$retries$1.f34d;
            booleanRef = spotWebSocketHelperTest$retries$1.f33c;
            intRef = spotWebSocketHelperTest$retries$1.f32b;
            function13 = spotWebSocketHelperTest$retries$1.f31a;
            try {
                ResultKt.m18313b(obj);
            } catch (Throwable th2) {
                th = th2;
                objM18312a = ResultKt.m18312a(th);
                z2 = objM18312a instanceof Result.Failure;
                booleanRef.f51655a = !z2;
                if (z2) {
                }
                function12 = function13;
                if (intRef.f51657a < i) {
                }
                if (!booleanRef.f51655a) {
                }
                return unit;
            }
            objM18312a = unit;
            z2 = objM18312a instanceof Result.Failure;
            booleanRef.f51655a = !z2;
            if (z2) {
            }
            function12 = function13;
            if (intRef.f51657a < i) {
            }
            if (!booleanRef.f51655a) {
            }
            return unit;
        }
        if (i3 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = spotWebSocketHelperTest$retries$1.f34d;
        booleanRef = spotWebSocketHelperTest$retries$1.f33c;
        intRef = spotWebSocketHelperTest$retries$1.f32b;
        function13 = spotWebSocketHelperTest$retries$1.f31a;
        ResultKt.m18313b(obj);
        function12 = function13;
        if (intRef.f51657a < i || booleanRef.f51655a) {
            if (!booleanRef.f51655a) {
                Log.e("TAG", "retries: 连接失败，已达到最大重试次数");
            }
            return unit;
        }
        try {
        } catch (Throwable th3) {
            function13 = function12;
            th = th3;
            objM18312a = ResultKt.m18312a(th);
            z2 = objM18312a instanceof Result.Failure;
            booleanRef.f51655a = !z2;
            if (z2) {
            }
            function12 = function13;
            if (intRef.f51657a < i) {
            }
            if (!booleanRef.f51655a) {
            }
            return unit;
        }
        spotWebSocketHelperTest$retries$1.f31a = function12;
        spotWebSocketHelperTest$retries$1.f32b = intRef;
        spotWebSocketHelperTest$retries$1.f33c = booleanRef;
        spotWebSocketHelperTest$retries$1.f34d = i;
        spotWebSocketHelperTest$retries$1.f36g = 1;
        if (function12.invoke(spotWebSocketHelperTest$retries$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        function13 = function12;
        objM18312a = unit;
        z2 = objM18312a instanceof Result.Failure;
        booleanRef.f51655a = !z2;
        if (z2) {
            StringBuilder sb = new StringBuilder("retries:连接失败 - ");
            Throwable thM18311a = Result.m18311a(objM18312a);
            sb.append(thM18311a != null ? thM18311a.getMessage() : null);
            sb.append(' ');
            Log.e("TAG", sb.toString());
            intRef.f51657a++;
            spotWebSocketHelperTest$retries$1.f31a = function13;
            spotWebSocketHelperTest$retries$1.f32b = intRef;
            spotWebSocketHelperTest$retries$1.f33c = booleanRef;
            spotWebSocketHelperTest$retries$1.f34d = i;
            spotWebSocketHelperTest$retries$1.f36g = 2;
            if (DelayKt.m20574b(1000L, spotWebSocketHelperTest$retries$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        function12 = function13;
        if (intRef.f51657a < i) {
        }
        if (!booleanRef.f51655a) {
        }
        return unit;
    }
}
