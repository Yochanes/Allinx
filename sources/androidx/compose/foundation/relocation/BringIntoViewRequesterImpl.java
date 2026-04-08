package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.relocation.BringIntoViewModifierNodeKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {

    /* JADX INFO: renamed from: a */
    public final MutableVector f7909a = new MutableVector(new BringIntoViewRequesterNode[16], 0);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:19:0x0064). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3176a(Rect rect, ContinuationImpl continuationImpl) {
        BringIntoViewRequesterImpl$bringIntoView$1 bringIntoViewRequesterImpl$bringIntoView$1;
        Rect rect2;
        int i;
        Object[] objArr;
        int i2;
        if (continuationImpl instanceof BringIntoViewRequesterImpl$bringIntoView$1) {
            bringIntoViewRequesterImpl$bringIntoView$1 = (BringIntoViewRequesterImpl$bringIntoView$1) continuationImpl;
            int i3 = bringIntoViewRequesterImpl$bringIntoView$1.f7916i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bringIntoViewRequesterImpl$bringIntoView$1.f7916i = i3 - Integer.MIN_VALUE;
            } else {
                bringIntoViewRequesterImpl$bringIntoView$1 = new BringIntoViewRequesterImpl$bringIntoView$1(this, continuationImpl);
            }
        }
        Object obj = bringIntoViewRequesterImpl$bringIntoView$1.f7914f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i4 = bringIntoViewRequesterImpl$bringIntoView$1.f7916i;
        if (i4 == 0) {
            ResultKt.m18313b(obj);
            MutableVector mutableVector = this.f7909a;
            Object[] objArr2 = mutableVector.f16734a;
            int i5 = mutableVector.f16736c;
            rect2 = rect;
            i = i5;
            objArr = objArr2;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = bringIntoViewRequesterImpl$bringIntoView$1.f7913d;
            i2 = bringIntoViewRequesterImpl$bringIntoView$1.f7912c;
            objArr = bringIntoViewRequesterImpl$bringIntoView$1.f7911b;
            Rect rect3 = bringIntoViewRequesterImpl$bringIntoView$1.f7910a;
            ResultKt.m18313b(obj);
            rect2 = rect3;
            i2++;
            if (i2 < i) {
                BringIntoViewRequesterNode bringIntoViewRequesterNode = (BringIntoViewRequesterNode) objArr[i2];
                BringIntoViewRequesterImpl$bringIntoView$2$1 bringIntoViewRequesterImpl$bringIntoView$2$1 = new BringIntoViewRequesterImpl$bringIntoView$2$1(rect2);
                bringIntoViewRequesterImpl$bringIntoView$1.f7910a = rect2;
                bringIntoViewRequesterImpl$bringIntoView$1.f7911b = objArr;
                bringIntoViewRequesterImpl$bringIntoView$1.f7912c = i2;
                bringIntoViewRequesterImpl$bringIntoView$1.f7913d = i;
                bringIntoViewRequesterImpl$bringIntoView$1.f7916i = 1;
                if (BringIntoViewModifierNodeKt.m6255a(bringIntoViewRequesterNode, bringIntoViewRequesterImpl$bringIntoView$2$1, bringIntoViewRequesterImpl$bringIntoView$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i2++;
                if (i2 < i) {
                    return Unit.f51459a;
                }
            }
        }
    }
}
