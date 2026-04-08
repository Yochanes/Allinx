package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C3734R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.TimePickerView;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class TimePickerTextInputPresenter implements TimePickerView.OnSelectionChange, TimePickerPresenter {
    private final TimePickerTextInputKeyController controller;
    private final EditText hourEditText;
    private final ChipTextInputComboView hourTextInput;
    private final EditText minuteEditText;
    private final ChipTextInputComboView minuteTextInput;
    private final TimeModel time;
    private final LinearLayout timePickerView;
    private MaterialButtonToggleGroup toggle;
    private final TextWatcher minuteTextWatcher = new C40361();
    private final TextWatcher hourTextWatcher = new C40372();

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C40361 extends TextWatcherAdapter {
        public C40361() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.access$000(TimePickerTextInputPresenter.this).setMinute(0);
                } else {
                    TimePickerTextInputPresenter.access$000(TimePickerTextInputPresenter.this).setMinute(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40372 extends TextWatcherAdapter {
        public C40372() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    TimePickerTextInputPresenter.access$000(TimePickerTextInputPresenter.this).setHour(0);
                } else {
                    TimePickerTextInputPresenter.access$000(TimePickerTextInputPresenter.this).setHour(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$3 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC40383 implements View.OnClickListener {
        public ViewOnClickListenerC40383() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerTextInputPresenter.this.onSelectionChanged(((Integer) view.getTag(C3734R.id.selection_type)).intValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C40394 extends ClickActionDelegate {
        final /* synthetic */ TimeModel val$time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40394(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.val$time = timeModel;
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m8018o(view.getResources().getString(this.val$time.getHourContentDescriptionResId(), String.valueOf(this.val$time.getHourForDisplay())));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerTextInputPresenter$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C40405 extends ClickActionDelegate {
        final /* synthetic */ TimeModel val$time;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40405(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.val$time = timeModel;
        }

        @Override // com.google.android.material.timepicker.ClickActionDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m8018o(view.getResources().getString(C3734R.string.material_minute_suffix, String.valueOf(this.val$time.minute)));
        }
    }

    public TimePickerTextInputPresenter(LinearLayout linearLayout, TimeModel timeModel) {
        this.timePickerView = linearLayout;
        this.time = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C3734R.id.material_minute_text_input);
        this.minuteTextInput = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C3734R.id.material_hour_text_input);
        this.hourTextInput = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(C3734R.id.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(C3734R.id.material_label);
        textView.setText(resources.getString(C3734R.string.material_timepicker_minute));
        textView2.setText(resources.getString(C3734R.string.material_timepicker_hour));
        chipTextInputComboView.setTag(C3734R.id.selection_type, 12);
        chipTextInputComboView2.setTag(C3734R.id.selection_type, 10);
        if (timeModel.format == 0) {
            setupPeriodToggle();
        }
        ViewOnClickListenerC40383 viewOnClickListenerC40383 = new ViewOnClickListenerC40383();
        chipTextInputComboView2.setOnClickListener(viewOnClickListenerC40383);
        chipTextInputComboView.setOnClickListener(viewOnClickListenerC40383);
        chipTextInputComboView2.addInputFilter(timeModel.getHourInputValidator());
        chipTextInputComboView.addInputFilter(timeModel.getMinuteInputValidator());
        this.hourEditText = chipTextInputComboView2.getTextInput().getEditText();
        this.minuteEditText = chipTextInputComboView.getTextInput().getEditText();
        this.controller = new TimePickerTextInputKeyController(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new C40394(linearLayout.getContext(), C3734R.string.material_hour_selection, timeModel));
        chipTextInputComboView.setChipDelegate(new C40405(linearLayout.getContext(), C3734R.string.material_minute_selection, timeModel));
        initialize();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14750a(TimePickerTextInputPresenter timePickerTextInputPresenter, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z2) {
        timePickerTextInputPresenter.lambda$setupPeriodToggle$0(materialButtonToggleGroup, i, z2);
    }

    public static /* synthetic */ TimeModel access$000(TimePickerTextInputPresenter timePickerTextInputPresenter) {
        return timePickerTextInputPresenter.time;
    }

    private void addTextWatchers() {
        this.hourEditText.addTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.addTextChangedListener(this.minuteTextWatcher);
    }

    private /* synthetic */ void lambda$setupPeriodToggle$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z2) {
        if (z2) {
            this.time.setPeriod(i == C3734R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void removeTextWatchers() {
        this.hourEditText.removeTextChangedListener(this.hourTextWatcher);
        this.minuteEditText.removeTextChangedListener(this.minuteTextWatcher);
    }

    private static void setCursorDrawableColor(EditText editText, @ColorInt int i) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable drawableM395a = AppCompatResources.m395a(context, i2);
            drawableM395a.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{drawableM395a, drawableM395a});
        } catch (Throwable unused) {
        }
    }

    private void setTime(TimeModel timeModel) {
        removeTextWatchers();
        Locale locale = this.timePickerView.getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.minute));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(timeModel.getHourForDisplay()));
        this.minuteTextInput.setText(str);
        this.hourTextInput.setText(str2);
        addTextWatchers();
        updateSelection();
    }

    private void setupPeriodToggle() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.timePickerView.findViewById(C3734R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new C4046c(this, 0));
        this.toggle.setVisibility(0);
        updateSelection();
    }

    private void updateSelection() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.toggle;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(this.time.period == 0 ? C3734R.id.material_clock_period_am_button : C3734R.id.material_clock_period_pm_button);
    }

    public void clearCheck() {
        this.minuteTextInput.setChecked(false);
        this.hourTextInput.setChecked(false);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
        View focusedChild = this.timePickerView.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        this.timePickerView.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
        addTextWatchers();
        setTime(this.time);
        this.controller.bind();
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
        setTime(this.time);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int i) {
        this.time.selection = i;
        this.minuteTextInput.setChecked(i == 12);
        this.hourTextInput.setChecked(i == 10);
        updateSelection();
    }

    public void resetChecked() {
        this.minuteTextInput.setChecked(this.time.selection == 12);
        this.hourTextInput.setChecked(this.time.selection == 10);
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
        this.timePickerView.setVisibility(0);
        onSelectionChanged(this.time.selection);
    }
}
