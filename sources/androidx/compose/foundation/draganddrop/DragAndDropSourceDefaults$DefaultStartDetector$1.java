package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p013ui.geometry.Offset;
import com.google.zxing.aztec.encoder.Encoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/draganddrop/DragAndDropStartDetectorScope;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", m18559f = "AndroidDragAndDropSource.android.kt", m18560l = {Encoder.DEFAULT_EC_PERCENT}, m18561m = "invokeSuspend")
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements Function2<DragAndDropStartDetectorScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f5286a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f5287b;

    /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "offset", "Landroidx/compose/ui/geometry/Offset;", "invoke-k-4lQ0M", "(J)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C05001 extends Lambda implements Function1<Offset, Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DragAndDropStartDetectorScope f5288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05001(DragAndDropStartDetectorScope dragAndDropStartDetectorScope) {
            super(1);
            this.f5288a = dragAndDropStartDetectorScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            this.f5288a.mo2558r(((Offset) obj).f17524a);
            return Unit.f51459a;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(2, continuation);
        dragAndDropSourceDefaults$DefaultStartDetector$1.f5287b = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create((DragAndDropStartDetectorScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f5286a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.f5287b;
            C05001 c05001 = new C05001(dragAndDropStartDetectorScope);
            this.f5286a = 1;
            if (TapGestureDetectorKt.m2663g(dragAndDropStartDetectorScope, c05001, null, null, this, 13) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
        }
        return Unit.f51459a;
    }
}
