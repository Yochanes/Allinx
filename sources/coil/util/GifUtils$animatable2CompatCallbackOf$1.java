package coil.util;

import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: coil.util.-GifUtils$animatable2CompatCallbackOf$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"coil/util/-GifUtils$animatable2CompatCallbackOf$1", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "coil-gif_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GifUtils$animatable2CompatCallbackOf$1 extends Animatable2Compat.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f33987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f33988b;

    public GifUtils$animatable2CompatCallbackOf$1(Function0 function0, Function0 function02) {
        this.f33987a = function0;
        this.f33988b = function02;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.f33988b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Function0 function0 = this.f33987a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
