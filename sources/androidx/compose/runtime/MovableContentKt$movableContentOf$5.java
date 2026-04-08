package androidx.compose.runtime;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u00022\u0006\u0010\u0007\u001a\u0002H\u00032\u0006\u0010\b\u001a\u0002H\u00042\u0006\u0010\t\u001a\u0002H\u0005H\u000b¢\u0006\u0004\b\n\u0010\u000b"}, m18302d2 = {"<anonymous>", "", "P1", "P2", "P3", "P4", "p1", "p2", "p3", "p4", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MovableContentKt$movableContentOf$5 extends Lambda implements Function6<Object, Object, Object, Object, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function6
    /* JADX INFO: renamed from: n */
    public final Object mo3628n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        Composer composer = (Composer) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? composer.mo4220M(obj) : composer.mo4235m(obj) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? composer.mo4220M(obj2) : composer.mo4235m(obj2) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= (iIntValue & 512) == 0 ? composer.mo4220M(obj3) : composer.mo4235m(obj3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((iIntValue & 3072) == 0) {
            i |= (iIntValue & 4096) == 0 ? composer.mo4220M(obj4) : composer.mo4235m(obj4) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (composer.mo4212E(i & 1, (i & 9363) != 9362)) {
            composer.mo4248z(new Object[]{obj, obj2, obj3, obj4});
        } else {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
