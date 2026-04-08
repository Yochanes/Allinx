package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "Landroidx/compose/material3/internal/AnchoredDragScope;", "anchors", "Landroidx/compose/material3/internal/DraggableAnchors;", "latestTarget"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2", m18559f = "AnchoredDraggable.kt", m18560l = {}, m18561m = "invokeSuspend")
final class AnchoredDraggableKt$snapTo$2 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<Object>, Object, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ AnchoredDragScope f15400a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ DraggableAnchors f15401b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f15402c;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$snapTo$2 anchoredDraggableKt$snapTo$2 = new AnchoredDraggableKt$snapTo$2(4, (Continuation) obj4);
        anchoredDraggableKt$snapTo$2.f15400a = (AnchoredDragScope) obj;
        anchoredDraggableKt$snapTo$2.f15401b = (DraggableAnchors) obj2;
        anchoredDraggableKt$snapTo$2.f15402c = obj3;
        Unit unit = Unit.f51459a;
        anchoredDraggableKt$snapTo$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        AnchoredDragScope anchoredDragScope = this.f15400a;
        float fMo4163c = this.f15401b.mo4163c(this.f15402c);
        if (!Float.isNaN(fMo4163c)) {
            AnchoredDragScope.m4124b(anchoredDragScope, fMo4163c);
        }
        return Unit.f51459a;
    }
}
