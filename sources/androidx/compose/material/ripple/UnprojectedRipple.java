package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.graphics.Color;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple;", "Landroid/graphics/drawable/RippleDrawable;", "Companion", "MRadiusHelper", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class UnprojectedRipple extends RippleDrawable {

    /* JADX INFO: renamed from: a */
    public final boolean f11936a;

    /* JADX INFO: renamed from: b */
    public Color f11937b;

    /* JADX INFO: renamed from: c */
    public Integer f11938c;

    /* JADX INFO: renamed from: d */
    public boolean f11939d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$Companion;", "", "", "setMaxRadiusFetched", "Z", "Ljava/lang/reflect/Method;", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$MRadiusHelper;", "", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class MRadiusHelper {
    }

    public UnprojectedRipple(boolean z2) {
        super(ColorStateList.valueOf(-16777216), null, z2 ? new ColorDrawable(-1) : null);
        this.f11936a = z2;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f11936a) {
            this.f11939d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f11939d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f11939d;
    }
}
