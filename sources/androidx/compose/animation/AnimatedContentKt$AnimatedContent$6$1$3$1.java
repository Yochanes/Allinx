package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "S", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnimatedContentKt$AnimatedContent$6$1$3$1 extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f3931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$3$1(Object obj) {
        super(1);
        this.f3931a = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.m18594b(obj, this.f3931a));
    }
}
