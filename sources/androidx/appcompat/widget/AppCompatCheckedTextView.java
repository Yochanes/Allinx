package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckedTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCheckedTextView;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.exchange.allin.R;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements TintableCheckedTextView, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: a */
    public final AppCompatCheckedTextViewHelper f1081a;

    /* JADX INFO: renamed from: b */
    public final AppCompatBackgroundHelper f1082b;

    /* JADX INFO: renamed from: c */
    public final AppCompatTextHelper f1083c;

    /* JADX INFO: renamed from: d */
    public AppCompatEmojiTextHelper f1084d;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1085a;

        /* JADX INFO: renamed from: b */
        public int f1086b;

        /* JADX INFO: renamed from: c */
        public int f1087c;

        /* JADX INFO: renamed from: d */
        public int f1088d;

        /* JADX INFO: renamed from: e */
        public int f1089e;

        /* JADX INFO: renamed from: f */
        public int f1090f;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1085a = AbstractC0020a.m48b(propertyMapper);
            this.f1086b = AbstractC0020a.m60n(propertyMapper);
            this.f1087c = AbstractC0020a.m46D(propertyMapper);
            this.f1088d = AbstractC0020a.m62p(propertyMapper);
            this.f1089e = AbstractC0020a.m67u(propertyMapper);
            this.f1090f = AbstractC0020a.m70x(propertyMapper);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatCheckedTextView appCompatCheckedTextView = (AppCompatCheckedTextView) obj;
            AbstractC0020a.m54h(propertyReader, this.f1085a, appCompatCheckedTextView.getBackgroundTintList());
            AbstractC0020a.m55i(propertyReader, this.f1086b, appCompatCheckedTextView.getBackgroundTintMode());
            AbstractC0020a.m54h(propertyReader, this.f1087c, appCompatCheckedTextView.getCheckMarkTintList());
            AbstractC0020a.m55i(propertyReader, this.f1088d, appCompatCheckedTextView.getCheckMarkTintMode());
            AbstractC0020a.m54h(propertyReader, this.f1089e, appCompatCheckedTextView.getCompoundDrawableTintList());
            AbstractC0020a.m55i(propertyReader, this.f1090f, appCompatCheckedTextView.getCompoundDrawableTintMode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        TintContextWrapper.m702a(context);
        ThemeUtils.m697a(this, getContext());
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f1083c = appCompatTextHelper;
        appCompatTextHelper.m585f(attributeSet, R.attr.checkedTextViewStyle);
        appCompatTextHelper.m582b();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f1082b = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m531d(attributeSet, R.attr.checkedTextViewStyle);
        this.f1081a = new AppCompatCheckedTextViewHelper(this);
        Context context2 = getContext();
        int[] iArr = androidx.appcompat.R.styleable.f273l;
        TintTypedArray tintTypedArrayM704f = TintTypedArray.m704f(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = tintTypedArrayM704f.f1413b;
        ViewCompat.m7807z(this, getContext(), iArr, attributeSet, tintTypedArrayM704f.f1413b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AppCompatResources.m395a(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(AppCompatResources.m395a(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AppCompatResources.m395a(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(tintTypedArrayM704f.m705a(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(DrawableUtils.m649c(typedArray.getInt(3, -1), null));
            }
            tintTypedArrayM704f.m709g();
            getEmojiTextViewHelper().m552a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            tintTypedArrayM704f.m709g();
            throw th;
        }
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f1084d == null) {
            this.f1084d = new AppCompatEmojiTextHelper(this);
        }
        return this.f1084d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.f1083c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m528a();
        }
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1081a;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.m537a();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m8196g(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m529b();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m530c();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCheckMarkTintList() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1081a;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.f1092b;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1081a;
        if (appCompatCheckedTextViewHelper != null) {
            return appCompatCheckedTextViewHelper.f1093c;
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1083c.m583d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1083c.m584e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AppCompatHintHelper.m555a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m553b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m532e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m533f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@Nullable Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1081a;
        if (appCompatCheckedTextViewHelper != null) {
            if (appCompatCheckedTextViewHelper.f1096f) {
                appCompatCheckedTextViewHelper.f1096f = false;
            } else {
                appCompatCheckedTextViewHelper.f1096f = true;
                appCompatCheckedTextViewHelper.m537a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1083c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f1083c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m8197h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m554c(z2);
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m535h(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f1082b;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m536i(mode);
        }
    }

    @RestrictTo
    public void setSupportCheckMarkTintList(@Nullable ColorStateList colorStateList) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1081a;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.f1092b = colorStateList;
            appCompatCheckedTextViewHelper.f1094d = true;
            appCompatCheckedTextViewHelper.m537a();
        }
    }

    @RestrictTo
    public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatCheckedTextViewHelper appCompatCheckedTextViewHelper = this.f1081a;
        if (appCompatCheckedTextViewHelper != null) {
            appCompatCheckedTextViewHelper.f1093c = mode;
            appCompatCheckedTextViewHelper.f1095e = true;
            appCompatCheckedTextViewHelper.m537a();
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        AppCompatTextHelper appCompatTextHelper = this.f1083c;
        appCompatTextHelper.m590k(colorStateList);
        appCompatTextHelper.m582b();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatTextHelper appCompatTextHelper = this.f1083c;
        appCompatTextHelper.m591l(mode);
        appCompatTextHelper.m582b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f1083c;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m586g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@DrawableRes int i) {
        setCheckMarkDrawable(AppCompatResources.m395a(getContext(), i));
    }
}
