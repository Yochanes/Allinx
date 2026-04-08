package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class TintTypedArray {

    /* JADX INFO: renamed from: a */
    public final Context f1412a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f1413b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1414c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m710a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m711b(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public TintTypedArray(Context context, TypedArray typedArray) {
        this.f1412a = context;
        this.f1413b = typedArray;
    }

    /* JADX INFO: renamed from: e */
    public static TintTypedArray m703e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: f */
    public static TintTypedArray m704f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new TintTypedArray(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: a */
    public final ColorStateList m705a(int i) {
        int resourceId;
        ColorStateList colorStateListM7485b;
        TypedArray typedArray = this.f1413b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM7485b = ContextCompat.m7485b(this.f1412a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM7485b;
    }

    /* JADX INFO: renamed from: b */
    public final Drawable m706b(int i) {
        int resourceId;
        TypedArray typedArray = this.f1413b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AppCompatResources.m395a(this.f1412a, resourceId);
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m707c(int i) {
        int resourceId;
        Drawable drawableM678e;
        if (!this.f1413b.hasValue(i) || (resourceId = this.f1413b.getResourceId(i, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManagerM540a = AppCompatDrawableManager.m540a();
        Context context = this.f1412a;
        synchronized (appCompatDrawableManagerM540a) {
            drawableM678e = appCompatDrawableManagerM540a.f1105a.m678e(context, resourceId, true);
        }
        return drawableM678e;
    }

    /* JADX INFO: renamed from: d */
    public final Typeface m708d(int i, int i2, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1413b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1414c == null) {
            this.f1414c = new TypedValue();
        }
        TypedValue typedValue = this.f1414c;
        ThreadLocal threadLocal = ResourcesCompat.f23171a;
        Context context = this.f1412a;
        if (context.isRestricted()) {
            return null;
        }
        return ResourcesCompat.m7542c(context, resourceId, typedValue, i2, fontCallback, true, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m709g() {
        this.f1413b.recycle();
    }
}
