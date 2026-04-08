package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.google.android.material.C3734R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends LinearLayout {

    @Nullable
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;

    @NonNull
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @NonNull
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;

    @NonNull
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @Nullable
    private CharSequence suffixText;

    @NonNull
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;

    @Nullable
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    /* JADX INFO: renamed from: com.google.android.material.textfield.EndCompoundLayout$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40091 extends TextWatcherAdapter {
        public C40091() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.EndCompoundLayout$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40102 implements TextInputLayout.OnEditTextAttachedListener {
        public C40102() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
        public void onEditTextAttached(@NonNull TextInputLayout textInputLayout) {
            if (EndCompoundLayout.access$000(EndCompoundLayout.this) == textInputLayout.getEditText()) {
                return;
            }
            if (EndCompoundLayout.access$000(EndCompoundLayout.this) != null) {
                EndCompoundLayout.access$000(EndCompoundLayout.this).removeTextChangedListener(EndCompoundLayout.access$100(EndCompoundLayout.this));
                if (EndCompoundLayout.access$000(EndCompoundLayout.this).getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                    EndCompoundLayout.access$000(EndCompoundLayout.this).setOnFocusChangeListener(null);
                }
            }
            EndCompoundLayout.access$002(EndCompoundLayout.this, textInputLayout.getEditText());
            if (EndCompoundLayout.access$000(EndCompoundLayout.this) != null) {
                EndCompoundLayout.access$000(EndCompoundLayout.this).addTextChangedListener(EndCompoundLayout.access$100(EndCompoundLayout.this));
            }
            EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.access$000(EndCompoundLayout.this));
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            EndCompoundLayout.access$200(endCompoundLayout, endCompoundLayout.getEndIconDelegate());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.EndCompoundLayout$3 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnAttachStateChangeListenerC40113 implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC40113() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            EndCompoundLayout.access$300(EndCompoundLayout.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            EndCompoundLayout.access$400(EndCompoundLayout.this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.f1413b.getResourceId(C3734R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.f1413b.getResourceId(C3734R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }

        public static /* synthetic */ int access$500(EndIconDelegates endIconDelegates) {
            return endIconDelegates.customEndIconDrawableId;
        }

        private EndIconDelegate create(int i) {
            if (i == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Invalid end icon mode: "));
        }

        public EndIconDelegate get(int i) {
            EndIconDelegate endIconDelegate = this.delegates.get(i);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i);
            this.delegates.append(i, endIconDelegateCreate);
            return endIconDelegateCreate;
        }
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new C40091();
        C40102 c40102 = new C40102();
        this.onEditTextAttachedListener = c40102;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, C3734R.id.text_input_error_icon);
        this.errorIconView = checkableImageButtonCreateIconView;
        CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, C3734R.id.text_input_end_icon);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.suffixTextView = appCompatTextView;
        initErrorIconView(tintTypedArray);
        initEndIconView(tintTypedArray);
        initSuffixTextView(tintTypedArray);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(c40102);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC40113());
    }

    public static /* synthetic */ EditText access$000(EndCompoundLayout endCompoundLayout) {
        return endCompoundLayout.editText;
    }

    public static /* synthetic */ EditText access$002(EndCompoundLayout endCompoundLayout, EditText editText) {
        endCompoundLayout.editText = editText;
        return editText;
    }

    public static /* synthetic */ TextWatcher access$100(EndCompoundLayout endCompoundLayout) {
        return endCompoundLayout.editTextWatcher;
    }

    public static /* synthetic */ void access$200(EndCompoundLayout endCompoundLayout, EndIconDelegate endIconDelegate) {
        endCompoundLayout.setOnFocusChangeListenersIfNeeded(endIconDelegate);
    }

    public static /* synthetic */ void access$300(EndCompoundLayout endCompoundLayout) {
        endCompoundLayout.addTouchExplorationStateChangeListenerIfNeeded();
    }

    public static /* synthetic */ void access$400(EndCompoundLayout endCompoundLayout) {
        endCompoundLayout.removeTouchExplorationStateChangeListenerIfNeeded();
    }

    private void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        if (isAttachedToWindow()) {
            AccessibilityManagerCompat.m8002a(this.accessibilityManager, this.touchExplorationStateChangeListener);
        }
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C3734R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int iAccess$500 = EndIconDelegates.access$500(this.endIconDelegates);
        return iAccess$500 == 0 ? endIconDelegate.getIconDrawableResId() : iAccess$500;
    }

    private void initEndIconView(TintTypedArray tintTypedArray) {
        boolean zHasValue = tintTypedArray.f1413b.hasValue(C3734R.styleable.TextInputLayout_passwordToggleEnabled);
        TypedArray typedArray = tintTypedArray.f1413b;
        if (!zHasValue) {
            if (typedArray.hasValue(C3734R.styleable.TextInputLayout_endIconTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, C3734R.styleable.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(C3734R.styleable.TextInputLayout_endIconTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(C3734R.styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(C3734R.styleable.TextInputLayout_endIconMode)) {
            setEndIconMode(typedArray.getInt(C3734R.styleable.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(C3734R.styleable.TextInputLayout_endIconContentDescription)) {
                setEndIconContentDescription(typedArray.getText(C3734R.styleable.TextInputLayout_endIconContentDescription));
            }
            setEndIconCheckable(typedArray.getBoolean(C3734R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(C3734R.styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(C3734R.styleable.TextInputLayout_passwordToggleTint)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, C3734R.styleable.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(C3734R.styleable.TextInputLayout_passwordToggleTintMode)) {
                this.endIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(C3734R.styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            setEndIconMode(typedArray.getBoolean(C3734R.styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            setEndIconContentDescription(typedArray.getText(C3734R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(typedArray.getDimensionPixelSize(C3734R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(C3734R.dimen.mtrl_min_touch_target_size)));
        if (typedArray.hasValue(C3734R.styleable.TextInputLayout_endIconScaleType)) {
            setEndIconScaleType(IconHelper.convertScaleType(typedArray.getInt(C3734R.styleable.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void initErrorIconView(TintTypedArray tintTypedArray) {
        if (tintTypedArray.f1413b.hasValue(C3734R.styleable.TextInputLayout_errorIconTint)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, C3734R.styleable.TextInputLayout_errorIconTint);
        }
        int i = C3734R.styleable.TextInputLayout_errorIconTintMode;
        TypedArray typedArray = tintTypedArray.f1413b;
        if (typedArray.hasValue(i)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(C3734R.styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(C3734R.styleable.TextInputLayout_errorIconDrawable)) {
            setErrorIconDrawable(tintTypedArray.m706b(C3734R.styleable.TextInputLayout_errorIconDrawable));
        }
        this.errorIconView.setContentDescription(getResources().getText(C3734R.string.error_icon_content_description));
        CheckableImageButton checkableImageButton = this.errorIconView;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        checkableImageButton.setImportantForAccessibility(2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(C3734R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        TextView textView = this.suffixTextView;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        textView.setAccessibilityLiveRegion(1);
        setSuffixTextAppearance(tintTypedArray.f1413b.getResourceId(C3734R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i = C3734R.styleable.TextInputLayout_suffixTextColor;
        TypedArray typedArray = tintTypedArray.f1413b;
        if (typedArray.hasValue(i)) {
            setSuffixTextColor(tintTypedArray.m705a(C3734R.styleable.TextInputLayout_suffixTextColor));
        }
        setSuffixText(typedArray.getText(C3734R.styleable.TextInputLayout_suffixText));
    }

    private void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        AccessibilityManagerCompat.m8003b(accessibilityManager, touchExplorationStateChangeListener);
    }

    private void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void setUpDelegate(@NonNull EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(@NonNull EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void tintEndIconOnError(boolean z2) {
        if (!z2 || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = getEndIconDrawable().mutate();
        drawableMutate.setTint(this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        this.textInputLayout.updateDummyDrawables();
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i) {
            getEndIconDelegate().onSuffixVisibilityChanged(i == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    @Nullable
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public int getSuffixTextEndOffset() {
        int measuredWidth = (isEndIconVisible() || isErrorIconVisible()) ? this.endIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()).getMarginStart() : 0;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        return this.suffixTextView.getPaddingEnd() + getPaddingEnd() + measuredWidth;
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconChecked() {
        return hasEndIcon() && this.endIconView.isChecked();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void onHintStateChanged(boolean z2) {
        this.hintExpanded = z2;
        updateSuffixTextVisibility();
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void refreshIconState(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z4 = true;
        if (!endIconDelegate.isIconCheckable() || (zIsChecked = this.endIconView.isChecked()) == endIconDelegate.isIconChecked()) {
            z3 = false;
        } else {
            this.endIconView.setChecked(!zIsChecked);
            z3 = true;
        }
        if (!endIconDelegate.isIconActivable() || (zIsActivated = this.endIconView.isActivated()) == endIconDelegate.isIconActivated()) {
            z4 = z3;
        } else {
            setEndIconActivated(!zIsActivated);
        }
        if (z2 || z4) {
            refreshEndIconDrawableState();
        }
    }

    public void removeOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setEndIconActivated(boolean z2) {
        this.endIconView.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.endIconView.setCheckable(z2);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        setEndIconDrawable(i != 0 ? AppCompatResources.m395a(getContext(), i) : null);
    }

    public void setEndIconMinSize(@Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.endIconMinSize) {
            this.endIconMinSize = i;
            IconHelper.setIconMinSize(this.endIconView, i);
            IconHelper.setIconMinSize(this.errorIconView, i);
        }
    }

    public void setEndIconMode(int i) {
        if (this.endIconMode == i) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (!endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (isEndIconVisible() != z2) {
            this.endIconView.setVisibility(z2 ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        setErrorIconDrawable(i != 0 ? AppCompatResources.m395a(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AppCompatResources.m395a(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z2) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        this.suffixTextView.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean z2) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z2) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        int paddingEnd;
        if (this.textInputLayout.editText == null) {
            return;
        }
        if (isEndIconVisible() || isErrorIconVisible()) {
            paddingEnd = 0;
        } else {
            EditText editText = this.textInputLayout.editText;
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            paddingEnd = editText.getPaddingEnd();
        }
        TextView textView = this.suffixTextView;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C3734R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.textInputLayout.editText.getPaddingTop();
        int paddingBottom = this.textInputLayout.editText.getPaddingBottom();
        WeakHashMap weakHashMap2 = ViewCompat.f23405a;
        textView.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }
}
