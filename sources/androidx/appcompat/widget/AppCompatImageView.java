package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements TintableBackgroundView, TintableImageSourceView {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private boolean mHasLevel;
    private final AppCompatImageHelper mImageHelper;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1128a;

        /* JADX INFO: renamed from: b */
        public int f1129b;

        /* JADX INFO: renamed from: c */
        public int f1130c;

        /* JADX INFO: renamed from: d */
        public int f1131d;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1128a = AbstractC0020a.m48b(propertyMapper);
            this.f1129b = AbstractC0020a.m60n(propertyMapper);
            this.f1130c = AbstractC0020a.m63q(propertyMapper);
            this.f1131d = AbstractC0020a.m64r(propertyMapper);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
            AbstractC0020a.m54h(propertyReader, this.f1128a, appCompatImageView.getBackgroundTintList());
            AbstractC0020a.m55i(propertyReader, this.f1129b, appCompatImageView.getBackgroundTintMode());
            AbstractC0020a.m54h(propertyReader, this.f1130c, appCompatImageView.getImageTintList());
            AbstractC0020a.m55i(propertyReader, this.f1131d, appCompatImageView.getImageTintMode());
        }
    }

    public AppCompatImageView(Context context) {
        this(context, null, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m528a();
        }
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m556a();
        }
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m529b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m530c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportImageTintList() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.f1126b) == null) {
            return null;
        }
        return tintInfo.f1408a;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportImageTintMode() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.f1126b) == null) {
            return null;
        }
        return tintInfo.f1409b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f1125a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m532e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m533f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m556a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null && drawable != null && !this.mHasLevel) {
            appCompatImageHelper.f1127c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper2 = this.mImageHelper;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.m556a();
            if (this.mHasLevel) {
                return;
            }
            AppCompatImageHelper appCompatImageHelper3 = this.mImageHelper;
            ImageView imageView = appCompatImageHelper3.f1125a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(appCompatImageHelper3.f1127c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m558c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m556a();
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m535h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m536i(mode);
        }
    }

    @RestrictTo
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            if (appCompatImageHelper.f1126b == null) {
                appCompatImageHelper.f1126b = new TintInfo();
            }
            TintInfo tintInfo = appCompatImageHelper.f1126b;
            tintInfo.f1408a = colorStateList;
            tintInfo.f1411d = true;
            appCompatImageHelper.m556a();
        }
    }

    @RestrictTo
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.mImageHelper;
        if (appCompatImageHelper != null) {
            if (appCompatImageHelper.f1126b == null) {
                appCompatImageHelper.f1126b = new TintInfo();
            }
            TintInfo tintInfo = appCompatImageHelper.f1126b;
            tintInfo.f1409b = mode;
            tintInfo.f1410c = true;
            appCompatImageHelper.m556a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m702a(context);
        this.mHasLevel = false;
        ThemeUtils.m697a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m531d(attributeSet, i);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.mImageHelper = appCompatImageHelper;
        appCompatImageHelper.m557b(attributeSet, i);
    }
}
