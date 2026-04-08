package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.function.IntFunction;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView, EmojiCompatConfigurationView {

    @NonNull
    private AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1067a;

        /* JADX INFO: renamed from: b */
        public int f1068b;

        /* JADX INFO: renamed from: c */
        public int f1069c;

        /* JADX INFO: renamed from: d */
        public int f1070d;

        /* JADX INFO: renamed from: e */
        public int f1071e;

        /* JADX INFO: renamed from: f */
        public int f1072f;

        /* JADX INFO: renamed from: g */
        public int f1073g;

        /* JADX INFO: renamed from: h */
        public int f1074h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatButton$InspectionCompanion$1 */
        /* JADX INFO: compiled from: Proguard */
        class C01081 implements IntFunction<String> {
            @Override // java.util.function.IntFunction
            public final String apply(int i) {
                return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
            }
        }

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1067a = AbstractC0020a.m71y(propertyMapper);
            this.f1068b = AbstractC0020a.m72z(propertyMapper);
            this.f1069c = AbstractC0020a.m43A(propertyMapper);
            this.f1070d = AbstractC0020a.m49c(propertyMapper, new C01081());
            this.f1071e = AbstractC0020a.m48b(propertyMapper);
            this.f1072f = AbstractC0020a.m60n(propertyMapper);
            this.f1073g = AbstractC0020a.m67u(propertyMapper);
            this.f1074h = AbstractC0020a.m70x(propertyMapper);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatButton appCompatButton = (AppCompatButton) obj;
            AbstractC0020a.m53g(propertyReader, this.f1067a, appCompatButton.getAutoSizeMaxTextSize());
            AbstractC0020a.m53g(propertyReader, this.f1068b, appCompatButton.getAutoSizeMinTextSize());
            AbstractC0020a.m53g(propertyReader, this.f1069c, appCompatButton.getAutoSizeStepGranularity());
            AbstractC0020a.m61o(propertyReader, this.f1070d, appCompatButton.getAutoSizeTextType());
            AbstractC0020a.m54h(propertyReader, this.f1071e, appCompatButton.getBackgroundTintList());
            AbstractC0020a.m55i(propertyReader, this.f1072f, appCompatButton.getBackgroundTintMode());
            AbstractC0020a.m54h(propertyReader, this.f1073g, appCompatButton.getCompoundDrawableTintList());
            AbstractC0020a.m55i(propertyReader, this.f1074h, appCompatButton.getCompoundDrawableTintMode());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m702a(context);
        ThemeUtils.m697a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m531d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.m585f(attributeSet, i);
        appCompatTextHelper.m582b();
        getEmojiTextViewHelper().m552a(attributeSet, i);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m528a();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.f1492c) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f1197i.f1226e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.f1492c) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f1197i.f1225d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.f1492c) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f1197i.f1224c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.f1492c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        return appCompatTextHelper != null ? appCompatTextHelper.f1197i.f1227f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo
    public int getAutoSizeTextType() {
        if (ViewUtils.f1492c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f1197i.f1222a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m8196g(super.getCustomSelectionActionModeCallback());
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
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.m583d();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.m584e();
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1120b.m8837b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null || ViewUtils.f1492c) {
            return;
        }
        appCompatTextHelper.f1197i.m618a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null || ViewUtils.f1492c || !appCompatTextHelper.f1197i.m620f()) {
            return;
        }
        this.mTextHelper.f1197i.m618a();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m553b(z2);
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ViewUtils.f1492c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m587h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) {
        if (ViewUtils.f1492c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m588i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ViewUtils.f1492c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m589j(i);
        }
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m8197h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m554c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1120b.m8836a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.f1189a.setAllCaps(z2);
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
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.m590k(colorStateList);
        this.mTextHelper.m582b();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m591l(mode);
        this.mTextHelper.m582b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m586g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z2 = ViewUtils.f1492c;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper == null || z2) {
            return;
        }
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = appCompatTextHelper.f1197i;
        if (appCompatTextViewAutoSizeHelper.m620f()) {
            return;
        }
        appCompatTextViewAutoSizeHelper.m621g(f, i);
    }
}
