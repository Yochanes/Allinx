package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextClassifierHelper;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatBaseImpl;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.IntFunction;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;

    @NonNull
    private AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @Nullable
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;

    @Nullable
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1209a;

        /* JADX INFO: renamed from: b */
        public int f1210b;

        /* JADX INFO: renamed from: c */
        public int f1211c;

        /* JADX INFO: renamed from: d */
        public int f1212d;

        /* JADX INFO: renamed from: e */
        public int f1213e;

        /* JADX INFO: renamed from: f */
        public int f1214f;

        /* JADX INFO: renamed from: g */
        public int f1215g;

        /* JADX INFO: renamed from: h */
        public int f1216h;

        /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextView$InspectionCompanion$1 */
        /* JADX INFO: compiled from: Proguard */
        class C01181 implements IntFunction<String> {
            @Override // java.util.function.IntFunction
            public final String apply(int i) {
                return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
            }
        }

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1209a = AbstractC0020a.m71y(propertyMapper);
            this.f1210b = AbstractC0020a.m72z(propertyMapper);
            this.f1211c = AbstractC0020a.m43A(propertyMapper);
            this.f1212d = AbstractC0020a.m49c(propertyMapper, new C01181());
            this.f1213e = AbstractC0020a.m48b(propertyMapper);
            this.f1214f = AbstractC0020a.m60n(propertyMapper);
            this.f1215g = AbstractC0020a.m67u(propertyMapper);
            this.f1216h = AbstractC0020a.m70x(propertyMapper);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
            AbstractC0020a.m53g(propertyReader, this.f1209a, appCompatTextView.getAutoSizeMaxTextSize());
            AbstractC0020a.m53g(propertyReader, this.f1210b, appCompatTextView.getAutoSizeMinTextSize());
            AbstractC0020a.m53g(propertyReader, this.f1211c, appCompatTextView.getAutoSizeStepGranularity());
            AbstractC0020a.m61o(propertyReader, this.f1212d, appCompatTextView.getAutoSizeTextType());
            AbstractC0020a.m54h(propertyReader, this.f1213e, appCompatTextView.getBackgroundTintList());
            AbstractC0020a.m55i(propertyReader, this.f1214f, appCompatTextView.getBackgroundTintMode());
            AbstractC0020a.m54h(propertyReader, this.f1215g, appCompatTextView.getCompoundDrawableTintList());
            AbstractC0020a.m55i(propertyReader, this.f1216h, appCompatTextView.getCompoundDrawableTintMode());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SuperCaller {
        /* JADX INFO: renamed from: a */
        void mo602a(int[] iArr, int i);

        /* JADX INFO: renamed from: b */
        int[] mo603b();

        /* JADX INFO: renamed from: c */
        TextClassifier mo604c();

        /* JADX INFO: renamed from: d */
        int mo605d();

        /* JADX INFO: renamed from: e */
        void mo606e(TextClassifier textClassifier);

        /* JADX INFO: renamed from: f */
        void mo607f(int i);

        /* JADX INFO: renamed from: g */
        void mo608g(int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: h */
        int mo609h();

        /* JADX INFO: renamed from: i */
        int mo610i();

        /* JADX INFO: renamed from: j */
        void mo611j(int i);

        /* JADX INFO: renamed from: k */
        int mo612k();

        /* JADX INFO: renamed from: l */
        void mo613l(int i);

        /* JADX INFO: renamed from: m */
        void mo614m(int i, float f);
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class SuperCallerApi28 extends SuperCallerApi26 {
        public SuperCallerApi28() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: f */
        public final void mo607f(int i) {
            AppCompatTextView.access$1101(AppCompatTextView.this, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: j */
        public final void mo611j(int i) {
            AppCompatTextView.access$1001(AppCompatTextView.this, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class SuperCallerApi34 extends SuperCallerApi28 {
        public SuperCallerApi34() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: m */
        public final void mo614m(int i, float f) {
            AppCompatTextView.access$1201(AppCompatTextView.this, i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static /* synthetic */ int access$001(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeMaxTextSize();
    }

    public static /* synthetic */ void access$1001(AppCompatTextView appCompatTextView, int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    public static /* synthetic */ int access$101(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeMinTextSize();
    }

    public static /* synthetic */ void access$1101(AppCompatTextView appCompatTextView, int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    public static /* synthetic */ void access$1201(AppCompatTextView appCompatTextView, int i, float f) {
        super.setLineHeight(i, f);
    }

    public static /* synthetic */ int access$201(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeStepGranularity();
    }

    public static /* synthetic */ int[] access$301(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeTextAvailableSizes();
    }

    public static /* synthetic */ int access$401(AppCompatTextView appCompatTextView) {
        return super.getAutoSizeTextType();
    }

    public static /* synthetic */ TextClassifier access$501(AppCompatTextView appCompatTextView) {
        return super.getTextClassifier();
    }

    public static /* synthetic */ void access$601(AppCompatTextView appCompatTextView, int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static /* synthetic */ void access$701(AppCompatTextView appCompatTextView, int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static /* synthetic */ void access$801(AppCompatTextView appCompatTextView, int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    public static /* synthetic */ void access$901(AppCompatTextView appCompatTextView, TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new AppCompatEmojiTextHelper(this);
        }
        return this.mEmojiTextViewHelper;
    }

    /* JADX INFO: renamed from: c */
    public final void m601c() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.m8195f(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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
            return getSuperCaller().mo605d();
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
            return getSuperCaller().mo610i();
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
            return getSuperCaller().mo612k();
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
            return getSuperCaller().mo603b();
        }
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        return appCompatTextHelper != null ? appCompatTextHelper.f1197i.f1227f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo
    public int getAutoSizeTextType() {
        if (ViewUtils.f1492c) {
            return getSuperCaller().mo609h() == 1 ? 1 : 0;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @RequiresApi
    @UiThread
    public SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.mSuperCaller = new SuperCallerApi34();
            } else if (i >= 28) {
                this.mSuperCaller = new SuperCallerApi28();
            } else if (i >= 26) {
                this.mSuperCaller = new SuperCallerApi26();
            }
        }
        return this.mSuperCaller;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        m601c();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            return getSuperCaller().mo604c();
        }
        TextClassifier textClassifier = appCompatTextClassifierHelper.f1188b;
        return textClassifier == null ? AppCompatTextClassifierHelper.Api26Impl.m579a(appCompatTextClassifierHelper.f1187a) : textClassifier;
    }

    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.m8190a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().f1120b.m8837b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.m8110b(editorInfo, getText());
        }
        AppCompatHintHelper.m555a(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
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

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m601c();
        super.onMeasure(i, i2);
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
            getSuperCaller().mo608g(i, i2, i3, i4);
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
            getSuperCaller().mo602a(iArr, i);
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
            getSuperCaller().mo613l(i);
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
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
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

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f1120b.m8836a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo611j(i);
        } else {
            TextViewCompat.m8191b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange @Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo607f(i);
        } else {
            TextViewCompat.m8192c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange @Px int i) {
        TextViewCompat.m8193d(this, i);
    }

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.m8195f(this, precomputedTextCompat);
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
    @RequiresApi
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            getSuperCaller().mo606e(textClassifier);
        } else {
            appCompatTextClassifierHelper.f1188b = textClassifier;
        }
    }

    public void setTextFuture(@Nullable Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params params) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = params.f23325b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(params.f23324a);
        setBreakStrategy(params.f23326c);
        setHyphenationFrequency(params.f23327d);
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

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            TypefaceCompatBaseImpl typefaceCompatBaseImpl = TypefaceCompat.f23208a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.mIsSetTypefaceProcessing = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m702a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        ThemeUtils.m697a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.mBackgroundTintHelper = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m531d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.mTextHelper = appCompatTextHelper;
        appCompatTextHelper.m585f(attributeSet, i);
        appCompatTextHelper.m582b();
        AppCompatTextClassifierHelper appCompatTextClassifierHelper = new AppCompatTextClassifierHelper();
        appCompatTextClassifierHelper.f1187a = this;
        this.mTextClassifierHelper = appCompatTextClassifierHelper;
        getEmojiTextViewHelper().m552a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, @FloatRange float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo614m(i, f);
        } else {
            TextViewCompat.m8194e(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AppCompatResources.m395a(context, i) : null, i2 != 0 ? AppCompatResources.m395a(context, i2) : null, i3 != 0 ? AppCompatResources.m395a(context, i3) : null, i4 != 0 ? AppCompatResources.m395a(context, i4) : null);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AppCompatResources.m395a(context, i) : null, i2 != 0 ? AppCompatResources.m395a(context, i2) : null, i3 != 0 ? AppCompatResources.m395a(context, i3) : null, i4 != 0 ? AppCompatResources.m395a(context, i4) : null);
        AppCompatTextHelper appCompatTextHelper = this.mTextHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m582b();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class SuperCallerApi26 implements SuperCaller {
        public SuperCallerApi26() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: a */
        public final void mo602a(int[] iArr, int i) {
            AppCompatTextView.access$701(AppCompatTextView.this, iArr, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: b */
        public final int[] mo603b() {
            return AppCompatTextView.access$301(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: c */
        public final TextClassifier mo604c() {
            return AppCompatTextView.access$501(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: d */
        public final int mo605d() {
            return AppCompatTextView.access$001(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: e */
        public final void mo606e(TextClassifier textClassifier) {
            AppCompatTextView.access$901(AppCompatTextView.this, textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: g */
        public final void mo608g(int i, int i2, int i3, int i4) {
            AppCompatTextView.access$601(AppCompatTextView.this, i, i2, i3, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: h */
        public final int mo609h() {
            return AppCompatTextView.access$401(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: i */
        public final int mo610i() {
            return AppCompatTextView.access$101(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: k */
        public final int mo612k() {
            return AppCompatTextView.access$201(AppCompatTextView.this);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: l */
        public final void mo613l(int i) {
            AppCompatTextView.access$801(AppCompatTextView.this, i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: f */
        public void mo607f(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: j */
        public void mo611j(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        /* JADX INFO: renamed from: m */
        public void mo614m(int i, float f) {
        }
    }
}
