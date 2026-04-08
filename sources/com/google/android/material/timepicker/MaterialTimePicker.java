package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.C3734R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.timepicker.TimePickerView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.OnDoubleTapListener {
    public static final int INPUT_MODE_CLOCK = 0;
    static final String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final String NEGATIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";
    static final String NEGATIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";
    static final String OVERRIDE_THEME_RES_ID = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    static final String POSITIVE_BUTTON_TEXT_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT";
    static final String POSITIVE_BUTTON_TEXT_RES_EXTRA = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";
    static final String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";

    @Nullable
    private TimePickerPresenter activePresenter;
    private Button cancelButton;

    @DrawableRes
    private int clockIcon;

    @DrawableRes
    private int keyboardIcon;
    private MaterialButton modeButton;
    private CharSequence negativeButtonText;
    private CharSequence positiveButtonText;
    private ViewStub textInputStub;
    private TimeModel time;

    @Nullable
    private TimePickerClockPresenter timePickerClockPresenter;

    @Nullable
    private TimePickerTextInputPresenter timePickerTextInputPresenter;
    private TimePickerView timePickerView;
    private CharSequence titleText;
    private final Set<View.OnClickListener> positiveButtonListeners = new LinkedHashSet();
    private final Set<View.OnClickListener> negativeButtonListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnCancelListener> cancelListeners = new LinkedHashSet();
    private final Set<DialogInterface.OnDismissListener> dismissListeners = new LinkedHashSet();

    @StringRes
    private int titleResId = 0;

    @StringRes
    private int positiveButtonTextResId = 0;

    @StringRes
    private int negativeButtonTextResId = 0;
    private int inputMode = 0;
    private int overrideThemeResId = 0;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.MaterialTimePicker$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC40301 implements View.OnClickListener {
        public ViewOnClickListenerC40301() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.access$900(MaterialTimePicker.this).iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.MaterialTimePicker$2 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC40312 implements View.OnClickListener {
        public ViewOnClickListenerC40312() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = MaterialTimePicker.access$1000(MaterialTimePicker.this).iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialTimePicker.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.MaterialTimePicker$3 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC40323 implements View.OnClickListener {
        public ViewOnClickListenerC40323() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            MaterialTimePicker.access$1102(materialTimePicker, MaterialTimePicker.access$1100(materialTimePicker) == 0 ? 1 : 0);
            MaterialTimePicker materialTimePicker2 = MaterialTimePicker.this;
            MaterialTimePicker.access$1300(materialTimePicker2, MaterialTimePicker.access$1200(materialTimePicker2));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        private Integer inputMode;
        private CharSequence negativeButtonText;
        private CharSequence positiveButtonText;
        private CharSequence titleText;
        private TimeModel time = new TimeModel();

        @StringRes
        private int titleTextResId = 0;

        @StringRes
        private int positiveButtonTextResId = 0;

        @StringRes
        private int negativeButtonTextResId = 0;
        private int overrideThemeResId = 0;

        public static /* synthetic */ TimeModel access$000(Builder builder) {
            return builder.time;
        }

        public static /* synthetic */ Integer access$100(Builder builder) {
            return builder.inputMode;
        }

        public static /* synthetic */ int access$200(Builder builder) {
            return builder.titleTextResId;
        }

        public static /* synthetic */ CharSequence access$300(Builder builder) {
            return builder.titleText;
        }

        public static /* synthetic */ int access$400(Builder builder) {
            return builder.positiveButtonTextResId;
        }

        public static /* synthetic */ CharSequence access$500(Builder builder) {
            return builder.positiveButtonText;
        }

        public static /* synthetic */ int access$600(Builder builder) {
            return builder.negativeButtonTextResId;
        }

        public static /* synthetic */ CharSequence access$700(Builder builder) {
            return builder.negativeButtonText;
        }

        public static /* synthetic */ int access$800(Builder builder) {
            return builder.overrideThemeResId;
        }

        @NonNull
        public MaterialTimePicker build() {
            return MaterialTimePicker.access$1400(this);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHour(@IntRange int i) {
            this.time.setHourOfDay(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int i) {
            this.inputMode = Integer.valueOf(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMinute(@IntRange int i) {
            this.time.setMinute(i);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int i) {
            this.negativeButtonTextResId = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int i) {
            this.positiveButtonTextResId = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int i) {
            this.overrideThemeResId = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i) {
            TimeModel timeModel = this.time;
            int i2 = timeModel.hour;
            int i3 = timeModel.minute;
            TimeModel timeModel2 = new TimeModel(i);
            this.time = timeModel2;
            timeModel2.setMinute(i3);
            this.time.setHourOfDay(i2);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int i) {
            this.titleTextResId = i;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.negativeButtonText = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.positiveButtonText = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence) {
            this.titleText = charSequence;
            return this;
        }
    }

    public static /* synthetic */ Set access$1000(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.negativeButtonListeners;
    }

    public static /* synthetic */ int access$1100(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.inputMode;
    }

    public static /* synthetic */ int access$1102(MaterialTimePicker materialTimePicker, int i) {
        materialTimePicker.inputMode = i;
        return i;
    }

    public static /* synthetic */ MaterialButton access$1200(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.modeButton;
    }

    public static /* synthetic */ void access$1300(MaterialTimePicker materialTimePicker, MaterialButton materialButton) {
        materialTimePicker.updateInputMode(materialButton);
    }

    public static /* synthetic */ MaterialTimePicker access$1400(Builder builder) {
        return newInstance(builder);
    }

    public static /* synthetic */ Set access$900(MaterialTimePicker materialTimePicker) {
        return materialTimePicker.positiveButtonListeners;
    }

    private Pair<Integer, Integer> dataForMode(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.keyboardIcon), Integer.valueOf(C3734R.string.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.clockIcon), Integer.valueOf(C3734R.string.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException(AbstractC0000a.m9f(i, "no icon for mode: "));
    }

    private int getThemeResId() {
        int i = this.overrideThemeResId;
        if (i != 0) {
            return i;
        }
        TypedValue typedValueResolve = MaterialAttributes.resolve(requireContext(), C3734R.attr.materialTimePickerTheme);
        if (typedValueResolve == null) {
            return 0;
        }
        return typedValueResolve.data;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m14749i(MaterialTimePicker materialTimePicker) {
        materialTimePicker.lambda$onViewCreated$0();
    }

    private TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int i, @NonNull TimePickerView timePickerView, @NonNull ViewStub viewStub) {
        if (i != 0) {
            if (this.timePickerTextInputPresenter == null) {
                this.timePickerTextInputPresenter = new TimePickerTextInputPresenter((LinearLayout) viewStub.inflate(), this.time);
            }
            this.timePickerTextInputPresenter.clearCheck();
            return this.timePickerTextInputPresenter;
        }
        TimePickerClockPresenter timePickerClockPresenter = this.timePickerClockPresenter;
        if (timePickerClockPresenter == null) {
            timePickerClockPresenter = new TimePickerClockPresenter(timePickerView, this.time);
        }
        this.timePickerClockPresenter = timePickerClockPresenter;
        return timePickerClockPresenter;
    }

    private /* synthetic */ void lambda$onViewCreated$0() {
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter instanceof TimePickerTextInputPresenter) {
            ((TimePickerTextInputPresenter) timePickerPresenter).resetChecked();
        }
    }

    @NonNull
    private static MaterialTimePicker newInstance(@NonNull Builder builder) {
        MaterialTimePicker materialTimePicker = new MaterialTimePicker();
        Bundle bundle = new Bundle();
        bundle.putParcelable(TIME_MODEL_EXTRA, Builder.access$000(builder));
        if (Builder.access$100(builder) != null) {
            bundle.putInt(INPUT_MODE_EXTRA, Builder.access$100(builder).intValue());
        }
        bundle.putInt(TITLE_RES_EXTRA, Builder.access$200(builder));
        if (Builder.access$300(builder) != null) {
            bundle.putCharSequence(TITLE_TEXT_EXTRA, Builder.access$300(builder));
        }
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, Builder.access$400(builder));
        if (Builder.access$500(builder) != null) {
            bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, Builder.access$500(builder));
        }
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, Builder.access$600(builder));
        if (Builder.access$700(builder) != null) {
            bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, Builder.access$700(builder));
        }
        bundle.putInt(OVERRIDE_THEME_RES_ID, Builder.access$800(builder));
        materialTimePicker.setArguments(bundle);
        return materialTimePicker;
    }

    private void restoreState(@Nullable Bundle bundle) {
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable(TIME_MODEL_EXTRA);
        this.time = timeModel;
        if (timeModel == null) {
            this.time = new TimeModel();
        }
        this.inputMode = bundle.getInt(INPUT_MODE_EXTRA, this.time.format != 1 ? 0 : 1);
        this.titleResId = bundle.getInt(TITLE_RES_EXTRA, 0);
        this.titleText = bundle.getCharSequence(TITLE_TEXT_EXTRA);
        this.positiveButtonTextResId = bundle.getInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.positiveButtonText = bundle.getCharSequence(POSITIVE_BUTTON_TEXT_EXTRA);
        this.negativeButtonTextResId = bundle.getInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, 0);
        this.negativeButtonText = bundle.getCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA);
        this.overrideThemeResId = bundle.getInt(OVERRIDE_THEME_RES_ID, 0);
    }

    private void updateCancelButtonVisibility() {
        Button button = this.cancelButton;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    private void updateInputMode(MaterialButton materialButton) {
        if (materialButton == null || this.timePickerView == null || this.textInputStub == null) {
            return;
        }
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.hide();
        }
        TimePickerPresenter timePickerPresenterInitializeOrRetrieveActivePresenterForMode = initializeOrRetrieveActivePresenterForMode(this.inputMode, this.timePickerView, this.textInputStub);
        this.activePresenter = timePickerPresenterInitializeOrRetrieveActivePresenterForMode;
        timePickerPresenterInitializeOrRetrieveActivePresenterForMode.show();
        this.activePresenter.invalidate();
        Pair<Integer, Integer> pairDataForMode = dataForMode(this.inputMode);
        materialButton.setIconResource(((Integer) pairDataForMode.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pairDataForMode.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.cancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.dismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.negativeButtonListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.positiveButtonListeners.clear();
    }

    @IntRange
    public int getHour() {
        return this.time.hour % 24;
    }

    public int getInputMode() {
        return this.inputMode;
    }

    @IntRange
    public int getMinute() {
        return this.time.minute;
    }

    @Nullable
    public TimePickerClockPresenter getTimePickerClockPresenter() {
        return this.timePickerClockPresenter;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.cancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        restoreState(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getThemeResId());
        Context context = dialog.getContext();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, C3734R.attr.materialTimePickerStyle, C3734R.style.Widget_MaterialComponents_TimePicker);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C3734R.styleable.MaterialTimePicker, C3734R.attr.materialTimePickerStyle, C3734R.style.Widget_MaterialComponents_TimePicker);
        this.clockIcon = typedArrayObtainStyledAttributes.getResourceId(C3734R.styleable.MaterialTimePicker_clockIcon, 0);
        this.keyboardIcon = typedArrayObtainStyledAttributes.getResourceId(C3734R.styleable.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(C3734R.styleable.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(ViewCompat.m7792k(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C3734R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C3734R.id.material_timepicker_view);
        this.timePickerView = timePickerView;
        timePickerView.setOnDoubleTapListener(this);
        this.textInputStub = (ViewStub) viewGroup2.findViewById(C3734R.id.material_textinput_timepicker);
        this.modeButton = (MaterialButton) viewGroup2.findViewById(C3734R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(C3734R.id.header_title);
        int i = this.titleResId;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.titleText)) {
            textView.setText(this.titleText);
        }
        updateInputMode(this.modeButton);
        Button button = (Button) viewGroup2.findViewById(C3734R.id.material_timepicker_ok_button);
        button.setOnClickListener(new ViewOnClickListenerC40301());
        int i2 = this.positiveButtonTextResId;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.positiveButtonText)) {
            button.setText(this.positiveButtonText);
        }
        Button button2 = (Button) viewGroup2.findViewById(C3734R.id.material_timepicker_cancel_button);
        this.cancelButton = button2;
        button2.setOnClickListener(new ViewOnClickListenerC40312());
        int i3 = this.negativeButtonTextResId;
        if (i3 != 0) {
            this.cancelButton.setText(i3);
        } else if (!TextUtils.isEmpty(this.negativeButtonText)) {
            this.cancelButton.setText(this.negativeButtonText);
        }
        updateCancelButtonVisibility();
        this.modeButton.setOnClickListener(new ViewOnClickListenerC40323());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.activePresenter = null;
        this.timePickerClockPresenter = null;
        this.timePickerTextInputPresenter = null;
        TimePickerView timePickerView = this.timePickerView;
        if (timePickerView != null) {
            timePickerView.setOnDoubleTapListener(null);
            this.timePickerView = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.dismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener
    @RestrictTo
    public void onDoubleTap() {
        this.inputMode = 1;
        updateInputMode(this.modeButton);
        this.timePickerTextInputPresenter.resetChecked();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(TIME_MODEL_EXTRA, this.time);
        bundle.putInt(INPUT_MODE_EXTRA, this.inputMode);
        bundle.putInt(TITLE_RES_EXTRA, this.titleResId);
        bundle.putCharSequence(TITLE_TEXT_EXTRA, this.titleText);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_EXTRA, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_EXTRA, this.positiveButtonText);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_EXTRA, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_EXTRA, this.negativeButtonText);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.activePresenter instanceof TimePickerTextInputPresenter) {
            view.postDelayed(new RunnableC4045b(this, 1), 100L);
        }
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.cancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.dismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.negativeButtonListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.positiveButtonListeners.remove(onClickListener);
    }

    @VisibleForTesting
    public void setActivePresenter(@Nullable TimePickerPresenter timePickerPresenter) {
        this.activePresenter = timePickerPresenter;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        updateCancelButtonVisibility();
    }

    public void setHour(@IntRange int i) {
        this.time.setHour(i);
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }

    public void setMinute(@IntRange int i) {
        this.time.setMinute(i);
        TimePickerPresenter timePickerPresenter = this.activePresenter;
        if (timePickerPresenter != null) {
            timePickerPresenter.invalidate();
        }
    }
}
