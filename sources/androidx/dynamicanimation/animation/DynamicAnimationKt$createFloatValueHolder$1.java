package androidx.dynamicanimation.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/dynamicanimation/animation/DynamicAnimationKt$createFloatValueHolder$1", "Landroidx/dynamicanimation/animation/FloatValueHolder;", "dynamicanimation-ktx_release"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class DynamicAnimationKt$createFloatValueHolder$1 extends FloatValueHolder {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f24258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function1 f24259c;

    public DynamicAnimationKt$createFloatValueHolder$1(Function0 function0, Function1 function1) {
        this.f24258b = function0;
        this.f24259c = function1;
    }

    @Override // androidx.dynamicanimation.animation.FloatValueHolder
    /* JADX INFO: renamed from: a */
    public final float mo8768a() {
        return ((Number) this.f24258b.invoke()).floatValue();
    }

    @Override // androidx.dynamicanimation.animation.FloatValueHolder
    /* JADX INFO: renamed from: b */
    public final void mo8769b(float f) {
        this.f24259c.invoke(Float.valueOf(f));
    }
}
