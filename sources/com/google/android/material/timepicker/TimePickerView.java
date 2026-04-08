package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C3734R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {
    static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private OnDoubleTapListener onDoubleTapListener;
    private OnPeriodChangeListener onPeriodChangeListener;
    private OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC40411 implements View.OnClickListener {
        public ViewOnClickListenerC40411() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.access$000(TimePickerView.this) != null) {
                TimePickerView.access$000(TimePickerView.this).onSelectionChanged(((Integer) view.getTag(C3734R.id.selection_type)).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C40422 extends GestureDetector.SimpleOnGestureListener {
        public C40422() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            OnDoubleTapListener onDoubleTapListenerAccess$100 = TimePickerView.access$100(TimePickerView.this);
            if (onDoubleTapListenerAccess$100 == null) {
                return false;
            }
            onDoubleTapListenerAccess$100.onDoubleTap();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.TimePickerView$3 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnTouchListenerC40433 implements View.OnTouchListener {
        final /* synthetic */ GestureDetector val$gestureDetector;

        public ViewOnTouchListenerC40433(GestureDetector gestureDetector) {
            this.val$gestureDetector = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.val$gestureDetector.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnDoubleTapListener {
        void onDoubleTap();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnPeriodChangeListener {
        void onPeriodChange(int i);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnSelectionChange {
        void onSelectionChanged(int i);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ OnSelectionChange access$000(TimePickerView timePickerView) {
        return timePickerView.onSelectionChangeListener;
    }

    public static /* synthetic */ OnDoubleTapListener access$100(TimePickerView timePickerView) {
        return timePickerView.onDoubleTapListener;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m14751c(TimePickerView timePickerView, MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z2) {
        timePickerView.lambda$new$0(materialButtonToggleGroup, i, z2);
    }

    private /* synthetic */ void lambda$new$0(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z2) {
        OnPeriodChangeListener onPeriodChangeListener;
        if (z2 && (onPeriodChangeListener = this.onPeriodChangeListener) != null) {
            onPeriodChangeListener.onPeriodChange(i == C3734R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void setUpDisplay() {
        this.minuteView.setTag(C3734R.id.selection_type, 12);
        this.hourView.setTag(C3734R.id.selection_type, 10);
        this.minuteView.setOnClickListener(this.selectionListener);
        this.hourView.setOnClickListener(this.selectionListener);
        this.minuteView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
        this.hourView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
        ViewOnTouchListenerC40433 viewOnTouchListenerC40433 = new ViewOnTouchListenerC40433(new GestureDetector(getContext(), new C40422()));
        this.minuteView.setOnTouchListener(viewOnTouchListenerC40433);
        this.hourView.setOnTouchListener(viewOnTouchListenerC40433);
    }

    private void updateSelection(Chip chip, boolean z2) {
        chip.setChecked(z2);
        int i = z2 ? 2 : 0;
        WeakHashMap weakHashMap = ViewCompat.f23405a;
        chip.setAccessibilityLiveRegion(i);
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
        this.clockHandView.addOnRotateListener(onRotateListener);
    }

    public int getCurrentLevel() {
        return this.clockFace.getCurrentLevel();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.hourView.sendAccessibilityEvent(8);
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i) {
        updateSelection(this.minuteView, i == 12);
        updateSelection(this.hourView, i == 10);
    }

    public void setAnimateOnTouchUp(boolean z2) {
        this.clockHandView.setAnimateOnTouchUp(z2);
    }

    public void setCurrentLevel(int i) {
        this.clockFace.setCurrentLevel(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f) {
        this.clockHandView.setHandRotation(f);
    }

    public void setHourClickDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.m7765A(this.minuteView, accessibilityDelegateCompat);
    }

    public void setMinuteHourDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.m7765A(this.hourView, accessibilityDelegateCompat);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.clockHandView.setOnActionUpListener(onActionUpListener);
    }

    public void setOnDoubleTapListener(@Nullable OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
    }

    public void setOnPeriodChangeListener(OnPeriodChangeListener onPeriodChangeListener) {
        this.onPeriodChangeListener = onPeriodChangeListener;
    }

    public void setOnSelectionChangeListener(OnSelectionChange onSelectionChange) {
        this.onSelectionChangeListener = onSelectionChange;
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, @StringRes int i) {
        this.clockFace.setValues(strArr, i);
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i, int i2, int i3) {
        this.toggle.check(i == 1 ? C3734R.id.material_clock_period_pm_button : C3734R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i3));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
        if (!TextUtils.equals(this.minuteView.getText(), str)) {
            this.minuteView.setText(str);
        }
        if (TextUtils.equals(this.hourView.getText(), str2)) {
            return;
        }
        this.hourView.setText(str2);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setHandRotation(float f, boolean z2) {
        this.clockHandView.setHandRotation(f, z2);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.selectionListener = new ViewOnClickListenerC40411();
        LayoutInflater.from(context).inflate(C3734R.layout.material_timepicker, this);
        this.clockFace = (ClockFaceView) findViewById(C3734R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C3734R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new C4046c(this, 1));
        this.minuteView = (Chip) findViewById(C3734R.id.material_minute_tv);
        this.hourView = (Chip) findViewById(C3734R.id.material_hour_tv);
        this.clockHandView = (ClockHandView) findViewById(C3734R.id.material_clock_hand);
        setupDoubleTap();
        setUpDisplay();
    }
}
