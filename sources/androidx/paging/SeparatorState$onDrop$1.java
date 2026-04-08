package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u0002H\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18302d2 = {"<anonymous>", "", "R", "", "T", "stash", "Landroidx/paging/TransformablePage;", "invoke", "(Landroidx/paging/TransformablePage;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class SeparatorState$onDrop$1 extends Lambda implements Function1<TransformablePage<Object>, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IntRange f31245a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onDrop$1(IntRange intRange) {
        super(1);
        this.f31245a = intRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransformablePage stash = (TransformablePage) obj;
        Intrinsics.m18599g(stash, "stash");
        int[] iArr = stash.f31353a;
        int length = iArr.length;
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (this.f31245a.m18653j(iArr[i])) {
                z2 = true;
                break;
            }
            i++;
        }
        return Boolean.valueOf(z2);
    }
}
