package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.C3734R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class BottomSheetDialog extends AppCompatDialog {

    @Nullable
    private MaterialBackOrchestrator backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;

    @NonNull
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C37711 implements OnApplyWindowInsetsListener {
        public C37711() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            if (BottomSheetDialog.access$000(BottomSheetDialog.this) != null) {
                BottomSheetDialog.access$100(BottomSheetDialog.this).removeBottomSheetCallback(BottomSheetDialog.access$000(BottomSheetDialog.this));
            }
            if (windowInsetsCompat != null) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                BottomSheetDialog.access$002(bottomSheetDialog, new EdgeToEdgeCallback(BottomSheetDialog.access$200(bottomSheetDialog), windowInsetsCompat, null));
                BottomSheetDialog.access$000(BottomSheetDialog.this).setWindow(BottomSheetDialog.this.getWindow());
                BottomSheetDialog.access$100(BottomSheetDialog.this).addBottomSheetCallback(BottomSheetDialog.access$000(BottomSheetDialog.this));
            }
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$2 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnClickListenerC37722 implements View.OnClickListener {
        public ViewOnClickListenerC37722() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C37733 extends AccessibilityDelegateCompat {
        public C37733() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (!BottomSheetDialog.this.cancelable) {
                accessibilityNodeInfoCompat.f23504a.setDismissable(false);
            } else {
                accessibilityNodeInfoCompat.m8005a(1048576);
                accessibilityNodeInfoCompat.f23504a.setDismissable(true);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.cancelable) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$4 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnTouchListenerC37744 implements View.OnTouchListener {
        public ViewOnTouchListenerC37744() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {

        @NonNull
        private final WindowInsetsCompat insetsCompat;

        @Nullable
        private final Boolean lightBottomSheet;
        private boolean lightStatusBar;

        @Nullable
        private Window window;

        public /* synthetic */ EdgeToEdgeCallback(View view, WindowInsetsCompat windowInsetsCompat, C37711 c37711) {
            this(view, windowInsetsCompat);
        }

        private void setPaddingForPosition(View view) {
            if (view.getTop() < this.insetsCompat.m7904k()) {
                Window window = this.window;
                if (window != null) {
                    Boolean bool = this.lightBottomSheet;
                    EdgeToEdgeUtils.setLightStatusBar(window, bool == null ? this.lightStatusBar : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.insetsCompat.m7904k() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.window;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.lightStatusBar);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onLayout(@NonNull View view) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            setPaddingForPosition(view);
        }

        public void setWindow(@Nullable Window window) {
            if (this.window == window) {
                return;
            }
            this.window = window;
            if (window != null) {
                this.lightStatusBar = new WindowInsetsControllerCompat(window, window.getDecorView()).m7955d();
            }
        }

        private EdgeToEdgeCallback(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.insetsCompat = windowInsetsCompat;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
            ColorStateList fillColor = materialShapeDrawable != null ? materialShapeDrawable.getFillColor() : ViewCompat.m7790i(view);
            if (fillColor != null) {
                this.lightBottomSheet = Boolean.valueOf(MaterialColors.isColorLight(fillColor.getDefaultColor()));
                return;
            }
            Integer backgroundColor = ViewUtils.getBackgroundColor(view);
            if (backgroundColor != null) {
                this.lightBottomSheet = Boolean.valueOf(MaterialColors.isColorLight(backgroundColor.intValue()));
            } else {
                this.lightBottomSheet = null;
            }
        }
    }

    public BottomSheetDialog(@NonNull Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C3734R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public static /* synthetic */ EdgeToEdgeCallback access$000(BottomSheetDialog bottomSheetDialog) {
        return bottomSheetDialog.edgeToEdgeCallback;
    }

    public static /* synthetic */ EdgeToEdgeCallback access$002(BottomSheetDialog bottomSheetDialog, EdgeToEdgeCallback edgeToEdgeCallback) {
        bottomSheetDialog.edgeToEdgeCallback = edgeToEdgeCallback;
        return edgeToEdgeCallback;
    }

    public static /* synthetic */ BottomSheetBehavior access$100(BottomSheetDialog bottomSheetDialog) {
        return bottomSheetDialog.behavior;
    }

    public static /* synthetic */ FrameLayout access$200(BottomSheetDialog bottomSheetDialog) {
        return bottomSheetDialog.bottomSheet;
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C3734R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(C3734R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(C3734R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout2);
            this.behavior = bottomSheetBehaviorFrom;
            bottomSheetBehaviorFrom.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.bottomSheet);
        }
        return this.container;
    }

    private static int getThemeResId(@NonNull Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C3734R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C3734R.style.Theme_Design_Light_BottomSheetDialog;
    }

    @Deprecated
    public static void setLightStatusBar(@NonNull View view, boolean z2) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z2 ? systemUiVisibility | UserMetadata.MAX_INTERNAL_KEY_SIZE : systemUiVisibility & (-8193));
    }

    private void updateListeningForBackCallbacks() {
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.cancelable) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View wrapInBottomSheet(int i, @Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(C3734R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            ViewCompat.m7773I(this.bottomSheet, new C37711());
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C3734R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC37722());
        ViewCompat.m7765A(this.bottomSheet, new C37733());
        this.bottomSheet.setOnTouchListener(new ViewOnTouchListenerC37744());
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z2 = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            WindowCompat.m7873a(window, !z2);
            EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.setWindow(window);
            }
        }
        updateListeningForBackCallbacks();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.setWindow(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.behavior.setState(4);
    }

    public void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        if (this.cancelable != z2) {
            this.cancelable = z2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z2);
            }
            if (getWindow() != null) {
                updateListeningForBackCallbacks();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z2;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    public void setDismissWithAnimation(boolean z2) {
        this.dismissWithAnimation = z2;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public BottomSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C37755();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C3734R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public BottomSheetDialog(@NonNull Context context, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z2, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C37755();
        supportRequestWindowFeature(1);
        this.cancelable = z2;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{C3734R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.BottomSheetDialog$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C37755 extends BottomSheetBehavior.BottomSheetCallback {
        public C37755() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(@NonNull View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(@NonNull View view, float f) {
        }
    }
}
