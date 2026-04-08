package androidx.compose.p013ui.scrollcapture;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class RelativeScroller {

    /* JADX INFO: renamed from: a */
    public final int f19700a;

    /* JADX INFO: renamed from: b */
    public final Function2 f19701b;

    /* JADX INFO: renamed from: c */
    public float f19702c;

    public RelativeScroller(Function2 function2, int i) {
        this.f19700a = i;
        this.f19701b = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6259a(float f, ContinuationImpl continuationImpl) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        RelativeScroller relativeScroller;
        if (continuationImpl instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) continuationImpl;
            int i = relativeScroller$scrollBy$1.f19706d;
            if ((i & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.f19706d = i - Integer.MIN_VALUE;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, continuationImpl);
            }
        }
        Object objInvoke = relativeScroller$scrollBy$1.f19704b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = relativeScroller$scrollBy$1.f19706d;
        if (i2 == 0) {
            ResultKt.m18313b(objInvoke);
            Float f2 = new Float(f);
            relativeScroller$scrollBy$1.f19703a = this;
            relativeScroller$scrollBy$1.f19706d = 1;
            objInvoke = ((ComposeScrollCaptureCallback$scrollTracker$1) this.f19701b).invoke(f2, relativeScroller$scrollBy$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
            relativeScroller = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            relativeScroller = (RelativeScroller) relativeScroller$scrollBy$1.f19703a;
            ResultKt.m18313b(objInvoke);
        }
        relativeScroller.f19702c += ((Number) objInvoke).floatValue();
        return Unit.f51459a;
    }
}
