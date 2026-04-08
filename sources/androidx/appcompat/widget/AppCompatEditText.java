package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatReceiveContentHelper;
import androidx.appcompat.widget.AppCompatTextClassifierHelper;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.C1476a;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    @NonNull
    private final AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;

    @Nullable
    private SuperCaller mSuperCaller;
    private final AppCompatTextClassifierHelper mTextClassifierHelper;
    private final AppCompatTextHelper mTextHelper;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a */
        public int f1112a;

        /* JADX INFO: renamed from: b */
        public int f1113b;

        /* JADX INFO: renamed from: c */
        public int f1114c;

        /* JADX INFO: renamed from: d */
        public int f1115d;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f1112a = AbstractC0020a.m48b(propertyMapper);
            this.f1113b = AbstractC0020a.m60n(propertyMapper);
            this.f1114c = AbstractC0020a.m67u(propertyMapper);
            this.f1115d = AbstractC0020a.m70x(propertyMapper);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) obj;
            AbstractC0020a.m54h(propertyReader, this.f1112a, appCompatEditText.getBackgroundTintList());
            AbstractC0020a.m55i(propertyReader, this.f1113b, appCompatEditText.getBackgroundTintMode());
            AbstractC0020a.m54h(propertyReader, this.f1114c, appCompatEditText.getCompoundDrawableTintList());
            AbstractC0020a.m55i(propertyReader, this.f1115d, appCompatEditText.getCompoundDrawableTintMode());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class SuperCaller {
        public SuperCaller() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) throws Throwable {
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
        AppCompatTextClassifierHelper appCompatTextClassifierHelper = new AppCompatTextClassifierHelper();
        appCompatTextClassifierHelper.f1187a = this;
        this.mTextClassifierHelper = appCompatTextClassifierHelper;
        this.mDefaultOnReceiveContentListener = new TextViewOnReceiveContentListener();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.mAppCompatEmojiEditTextHelper = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.m551b(attributeSet, i);
        initEmojiKeyListener(appCompatEmojiEditTextHelper);
    }

    public static /* synthetic */ TextClassifier access$001(AppCompatEditText appCompatEditText) {
        return super.getTextClassifier();
    }

    public static /* synthetic */ void access$101(AppCompatEditText appCompatEditText, TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @NonNull
    @RequiresApi
    @UiThread
    private SuperCaller getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new SuperCaller();
        }
        return this.mSuperCaller;
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

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.mTextClassifierHelper) == null) {
            return access$001(AppCompatEditText.this);
        }
        TextClassifier textClassifier = appCompatTextClassifierHelper.f1188b;
        return textClassifier == null ? AppCompatTextClassifierHelper.Api26Impl.m579a(appCompatTextClassifierHelper.f1187a) : textClassifier;
    }

    public void initEmojiKeyListener(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        KeyListener keyListener = getKeyListener();
        appCompatEmojiEditTextHelper.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM550a = appCompatEmojiEditTextHelper.m550a(keyListener);
        if (keyListenerM550a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM550a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.f1118b.m8833b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM7794m;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.m8110b(editorInfo, getText());
        }
        AppCompatHintHelper.m555a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM7794m = ViewCompat.m7794m(this)) != null) {
            EditorInfoCompat.m8109a(editorInfo, strArrM7794m);
            inputConnectionOnCreateInputConnection = InputConnectionCompat.m8115a(inputConnectionOnCreateInputConnection, editorInfo, new C1476a(this));
        }
        return this.mAppCompatEmojiEditTextHelper.f1118b.m8834c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zM561a = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ViewCompat.m7794m(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM561a = AppCompatReceiveContentHelper.OnDropApi24Impl.m561a(dragEvent, this, activity);
            }
        }
        if (zM561a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.mDefaultOnReceiveContentListener.mo7758a(this, contentInfoCompat);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.m7794m(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ContentInfoCompat.Builder builder = new ContentInfoCompat.Builder(primaryClip, 1);
            builder.m7710c(i == 16908322 ? 0 : 1);
            ViewCompat.m7803v(this, builder.m7708a());
        }
        return true;
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
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m8197h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) throws Throwable {
        this.mAppCompatEmojiEditTextHelper.f1118b.m8835d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.m550a(keyListener));
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
            access$101(AppCompatEditText.this, textClassifier);
        } else {
            appCompatTextClassifierHelper.f1188b = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
