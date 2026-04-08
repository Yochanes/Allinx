package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class Recomposer$performRecompose$1$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableScatterSet f16499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ControlledComposition f16500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        super(0);
        this.f16499a = mutableScatterSet;
        this.f16500b = controlledComposition;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        MutableScatterSet mutableScatterSet = this.f16499a;
        Object[] objArr = mutableScatterSet.f3847b;
        long[] jArr = mutableScatterSet.f3846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f16500b.mo4342p(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return Unit.f51459a;
    }
}
