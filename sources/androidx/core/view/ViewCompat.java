package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.camera.camera2.internal.AbstractC0157C;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import com.exchange.allin.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f23405a = null;

    /* JADX INFO: renamed from: b */
    public static Field f23406b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f23407c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f23408d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e */
    public static final C1471g f23409e = new C1471g();

    /* JADX INFO: renamed from: f */
    public static final AccessibilityPaneVisibilityManager f23410f = new AccessibilityPaneVisibilityManager();

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14531 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: a */
        public final Object mo7808a(View view) {
            return Boolean.valueOf(Api28Impl.m7841c(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: b */
        public final void mo7809b(View view, Object obj) {
            Api28Impl.m7844f(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: e */
        public final boolean mo7810e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$2 */
    /* JADX INFO: compiled from: Proguard */
    class C14542 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: a */
        public final Object mo7808a(View view) {
            return Api28Impl.m7839a(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: b */
        public final void mo7809b(View view, Object obj) {
            Api28Impl.m7843e(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: e */
        public final boolean mo7810e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$3 */
    /* JADX INFO: compiled from: Proguard */
    class C14553 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: a */
        public final Object mo7808a(View view) {
            return Api30Impl.m7847a(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: b */
        public final void mo7809b(View view, Object obj) {
            Api30Impl.m7849c(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: e */
        public final boolean mo7810e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.ViewCompat$4 */
    /* JADX INFO: compiled from: Proguard */
    class C14564 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: a */
        public final Object mo7808a(View view) {
            return Boolean.valueOf(Api28Impl.m7840b(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: b */
        public final void mo7809b(View view, Object obj) {
            Api28Impl.m7842d(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        /* JADX INFO: renamed from: e */
        public final boolean mo7810e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AccessibilityViewProperty<T> {

        /* JADX INFO: renamed from: a */
        public final int f23412a;

        /* JADX INFO: renamed from: b */
        public final Class f23413b;

        /* JADX INFO: renamed from: c */
        public final int f23414c;

        /* JADX INFO: renamed from: d */
        public final int f23415d;

        public AccessibilityViewProperty(int i, Class cls, int i2, int i3) {
            this.f23412a = i;
            this.f23413b = cls;
            this.f23415d = i2;
            this.f23414c = i3;
        }

        /* JADX INFO: renamed from: a */
        public abstract Object mo7808a(View view);

        /* JADX INFO: renamed from: b */
        public abstract void mo7809b(View view, Object obj);

        /* JADX INFO: renamed from: c */
        public final Object m7811c(View view) {
            if (Build.VERSION.SDK_INT >= this.f23414c) {
                return mo7808a(view);
            }
            Object tag = view.getTag(this.f23412a);
            if (this.f23413b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final void m7812d(View view, Object obj) {
            if (Build.VERSION.SDK_INT >= this.f23414c) {
                mo7809b(view, obj);
                return;
            }
            if (mo7810e(m7811c(view), obj)) {
                AccessibilityDelegateCompat accessibilityDelegateCompatM7786e = ViewCompat.m7786e(view);
                if (accessibilityDelegateCompatM7786e == null) {
                    accessibilityDelegateCompatM7786e = new AccessibilityDelegateCompat();
                }
                ViewCompat.m7765A(view, accessibilityDelegateCompatM7786e);
                view.setTag(this.f23412a, obj);
                ViewCompat.m7801t(this.f23415d, view);
            }
        }

        /* JADX INFO: renamed from: e */
        public boolean mo7810e(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api20Impl {
        /* JADX INFO: renamed from: a */
        public static WindowInsets m7813a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsets m7814b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: c */
        public static void m7815c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {

        /* JADX INFO: renamed from: androidx.core.view.ViewCompat$Api21Impl$1 */
        /* JADX INFO: compiled from: Proguard */
        public class ViewOnApplyWindowInsetsListenerC14571 implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public WindowInsetsCompat f23416a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f23417b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ OnApplyWindowInsetsListener f23418c;

            public ViewOnApplyWindowInsetsListenerC14571(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
                this.f23417b = view;
                this.f23418c = onApplyWindowInsetsListener;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompatM7893t = WindowInsetsCompat.m7893t(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f23418c;
                if (i < 30) {
                    Api21Impl.m7816a(windowInsets, this.f23417b);
                    if (windowInsetsCompatM7893t.equals(this.f23416a)) {
                        return onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompatM7893t).m7911s();
                    }
                }
                this.f23416a = windowInsetsCompatM7893t;
                WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsetsCompatM7893t);
                if (i >= 30) {
                    return windowInsetsCompatOnApplyWindowInsets.m7911s();
                }
                WeakHashMap weakHashMap = ViewCompat.f23405a;
                Api20Impl.m7815c(view);
                return windowInsetsCompatOnApplyWindowInsets.m7911s();
            }
        }

        /* JADX INFO: renamed from: a */
        public static void m7816a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* JADX INFO: renamed from: b */
        public static WindowInsetsCompat m7817b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets windowInsetsM7911s = windowInsetsCompat.m7911s();
            if (windowInsetsM7911s != null) {
                return WindowInsetsCompat.m7893t(view, view.computeSystemWindowInsets(windowInsetsM7911s, rect));
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        /* JADX INFO: renamed from: c */
        public static ColorStateList m7818c(View view) {
            return view.getBackgroundTintList();
        }

        /* JADX INFO: renamed from: d */
        public static PorterDuff.Mode m7819d(View view) {
            return view.getBackgroundTintMode();
        }

        /* JADX INFO: renamed from: e */
        public static float m7820e(View view) {
            return view.getElevation();
        }

        /* JADX INFO: renamed from: f */
        public static String m7821f(View view) {
            return view.getTransitionName();
        }

        /* JADX INFO: renamed from: g */
        public static float m7822g(View view) {
            return view.getTranslationZ();
        }

        /* JADX INFO: renamed from: h */
        public static float m7823h(@NonNull View view) {
            return view.getZ();
        }

        /* JADX INFO: renamed from: i */
        public static boolean m7824i(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* JADX INFO: renamed from: j */
        public static void m7825j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* JADX INFO: renamed from: k */
        public static void m7826k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* JADX INFO: renamed from: l */
        public static void m7827l(View view, float f) {
            view.setElevation(f);
        }

        /* JADX INFO: renamed from: m */
        public static void m7828m(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        /* JADX INFO: renamed from: n */
        public static void m7829n(@NonNull View view, @Nullable OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC14571(view, onApplyWindowInsetsListener));
            }
        }

        /* JADX INFO: renamed from: o */
        public static void m7830o(View view, String str) {
            view.setTransitionName(str);
        }

        /* JADX INFO: renamed from: p */
        public static void m7831p(View view, float f) {
            view.setTranslationZ(f);
        }

        /* JADX INFO: renamed from: q */
        public static void m7832q(@NonNull View view, float f) {
            view.setZ(f);
        }

        /* JADX INFO: renamed from: r */
        public static void m7833r(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static WindowInsetsCompat m7834a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatM7893t = WindowInsetsCompat.m7893t(null, rootWindowInsets);
            WindowInsetsCompat.Impl impl = windowInsetsCompatM7893t.f23465a;
            impl.mo7942t(windowInsetsCompatM7893t);
            impl.mo7926d(view.getRootView());
            return windowInsetsCompatM7893t;
        }

        /* JADX INFO: renamed from: b */
        public static void m7835b(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
        /* JADX INFO: renamed from: a */
        public static void m7836a(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static int m7837a(View view) {
            return view.getImportantForAutofill();
        }

        /* JADX INFO: renamed from: b */
        public static void m7838b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static CharSequence m7839a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m7840b(View view) {
            return view.isAccessibilityHeading();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m7841c(View view) {
            return view.isScreenReaderFocusable();
        }

        /* JADX INFO: renamed from: d */
        public static void m7842d(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        /* JADX INFO: renamed from: e */
        public static void m7843e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: renamed from: f */
        public static void m7844f(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m7845a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* JADX INFO: renamed from: b */
        public static void m7846b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static CharSequence m7847a(View view) {
            return view.getStateDescription();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static WindowInsetsControllerCompat m7848b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new WindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public static void m7849c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api31Impl {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static String[] m7850a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static ContentInfoCompat m7851b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo contentInfoMo7717i = contentInfoCompat.f23348a.mo7717i();
            Objects.requireNonNull(contentInfoMo7717i);
            ContentInfo contentInfoM846i = AbstractC0157C.m846i(contentInfoMo7717i);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM846i);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoM846i ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfoPerformReceiveContent));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusDirection {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRealDirection {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FocusRelativeDirection {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface NestedScrollType {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            new ContentInfoCompat.Compat31Impl(contentInfo);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnUnhandledKeyEventListenerCompat {
        /* JADX INFO: renamed from: a */
        boolean m7852a();
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollAxis {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollIndicators {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class UnhandledKeyEventManager {

        /* JADX INFO: renamed from: d */
        public static final ArrayList f23419d = new ArrayList();

        /* JADX INFO: renamed from: a */
        public WeakHashMap f23420a;

        /* JADX INFO: renamed from: b */
        public SparseArray f23421b;

        /* JADX INFO: renamed from: c */
        public WeakReference f23422c;

        /* JADX INFO: renamed from: b */
        public static boolean m7853b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).m7852a()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: a */
        public final View m7854a(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f23420a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM7854a = m7854a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewM7854a != null) {
                        return viewM7854a;
                    }
                }
            }
            if (m7853b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public static void m7765A(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (m7787f(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    /* JADX INFO: renamed from: B */
    public static void m7766B(View view, boolean z2) {
        new C14564(R.id.tag_accessibility_heading, Boolean.class, 0, 28).m7812d(view, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: C */
    public static void m7767C(View view, CharSequence charSequence) {
        new C14542(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m7812d(view, charSequence);
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = f23410f;
        if (charSequence == null) {
            accessibilityPaneVisibilityManager.f23411a.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
        } else {
            accessibilityPaneVisibilityManager.f23411a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m7768D(View view, ColorStateList colorStateList) {
        Api21Impl.m7825j(view, colorStateList);
    }

    /* JADX INFO: renamed from: E */
    public static void m7769E(View view, PorterDuff.Mode mode) {
        Api21Impl.m7826k(view, mode);
    }

    /* JADX INFO: renamed from: F */
    public static void m7770F(View view, float f) {
        Api21Impl.m7827l(view, f);
    }

    /* JADX INFO: renamed from: G */
    public static void m7771G(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7838b(viewGroup, i);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m7772H(View view) {
        Api21Impl.m7828m(view, true);
    }

    /* JADX INFO: renamed from: I */
    public static void m7773I(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.m7829n(view, onApplyWindowInsetsListener);
    }

    /* JADX INFO: renamed from: J */
    public static void m7774J(ViewGroup viewGroup, PointerIconCompat pointerIconCompat) {
        Api24Impl.m7836a(viewGroup, pointerIconCompat != null ? pointerIconCompat.f23391a : null);
    }

    /* JADX INFO: renamed from: K */
    public static void m7775K(View view, boolean z2) {
        new C14531(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).m7812d(view, Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: L */
    public static void m7776L(ViewGroup viewGroup, int i) {
        Api23Impl.m7835b(viewGroup, i, 3);
    }

    /* JADX INFO: renamed from: M */
    public static void m7777M(SwitchCompat switchCompat, CharSequence charSequence) {
        new C14553(R.id.tag_state_description, CharSequence.class, 64, 30).m7812d(switchCompat, charSequence);
    }

    /* JADX INFO: renamed from: N */
    public static void m7778N(View view, String str) {
        Api21Impl.m7830o(view, str);
    }

    /* JADX INFO: renamed from: O */
    public static void m7779O(View view, float f) {
        Api21Impl.m7831p(view, f);
    }

    /* JADX INFO: renamed from: P */
    public static void m7780P(View view, WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC1473i.m8094l(view, callback != null ? new WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback) : null);
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.Impl21.f23443e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (callback == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener impl21OnApplyWindowInsetsListener = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(view, callback);
        view.setTag(R.id.tag_window_insets_animation_callback, impl21OnApplyWindowInsetsListener);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(impl21OnApplyWindowInsetsListener);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m7781Q(View view, float f) {
        Api21Impl.m7832q(view, f);
    }

    /* JADX INFO: renamed from: a */
    public static ViewPropertyAnimatorCompat m7782a(View view) {
        if (f23405a == null) {
            f23405a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f23405a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f23405a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    /* JADX INFO: renamed from: b */
    public static void m7783b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        Api21Impl.m7817b(view, windowInsetsCompat, rect);
    }

    /* JADX INFO: renamed from: c */
    public static WindowInsetsCompat m7784c(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsM7911s = windowInsetsCompat.m7911s();
        if (windowInsetsM7911s != null) {
            WindowInsets windowInsetsM7813a = Api20Impl.m7813a(view, windowInsetsM7911s);
            if (!windowInsetsM7813a.equals(windowInsetsM7911s)) {
                return WindowInsetsCompat.m7893t(view, windowInsetsM7813a);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m7785d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = UnhandledKeyEventManager.f23419d;
        UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (unhandledKeyEventManager == null) {
            unhandledKeyEventManager = new UnhandledKeyEventManager();
            unhandledKeyEventManager.f23420a = null;
            unhandledKeyEventManager.f23421b = null;
            unhandledKeyEventManager.f23422c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, unhandledKeyEventManager);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = unhandledKeyEventManager.f23420a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = UnhandledKeyEventManager.f23419d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (unhandledKeyEventManager.f23420a == null) {
                            unhandledKeyEventManager.f23420a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = UnhandledKeyEventManager.f23419d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                unhandledKeyEventManager.f23420a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    unhandledKeyEventManager.f23420a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM7854a = unhandledKeyEventManager.m7854a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM7854a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (unhandledKeyEventManager.f23421b == null) {
                    unhandledKeyEventManager.f23421b = new SparseArray();
                }
                unhandledKeyEventManager.f23421b.put(keyCode, new WeakReference(viewM7854a));
            }
        }
        return viewM7854a != null;
    }

    /* JADX INFO: renamed from: e */
    public static AccessibilityDelegateCompat m7786e(View view) {
        View.AccessibilityDelegate accessibilityDelegateM7787f = m7787f(view);
        if (accessibilityDelegateM7787f == null) {
            return null;
        }
        return accessibilityDelegateM7787f instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) accessibilityDelegateM7787f).f23345a : new AccessibilityDelegateCompat(accessibilityDelegateM7787f);
    }

    /* JADX INFO: renamed from: f */
    public static View.AccessibilityDelegate m7787f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.m7845a(view);
        }
        if (f23407c) {
            return null;
        }
        if (f23406b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f23406b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f23407c = true;
                return null;
            }
        }
        try {
            Object obj = f23406b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f23407c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m7788g(View view) {
        return (CharSequence) new C14542(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).m7811c(view);
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m7789h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static ColorStateList m7790i(View view) {
        return Api21Impl.m7818c(view);
    }

    /* JADX INFO: renamed from: j */
    public static PorterDuff.Mode m7791j(View view) {
        return Api21Impl.m7819d(view);
    }

    /* JADX INFO: renamed from: k */
    public static float m7792k(View view) {
        return Api21Impl.m7820e(view);
    }

    /* JADX INFO: renamed from: l */
    public static int m7793l(RecyclerView recyclerView) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Api26Impl.m7837a(recyclerView);
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static String[] m7794m(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.m7850a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: n */
    public static WindowInsetsCompat m7795n(View view) {
        return Api23Impl.m7834a(view);
    }

    /* JADX INFO: renamed from: o */
    public static String m7796o(View view) {
        return Api21Impl.m7821f(view);
    }

    /* JADX INFO: renamed from: p */
    public static float m7797p(View view) {
        return Api21Impl.m7822g(view);
    }

    /* JADX INFO: renamed from: q */
    public static WindowInsetsControllerCompat m7798q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.m7848b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new WindowInsetsControllerCompat(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static float m7799r(View view) {
        return Api21Impl.m7823h(view);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7800s(View view) {
        return Api21Impl.m7824i(view);
    }

    /* JADX INFO: renamed from: t */
    public static void m7801t(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = m7788g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z2) {
                    accessibilityEventObtain.getText().add(m7788g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m7788g(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: u */
    public static WindowInsetsCompat m7802u(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsM7911s = windowInsetsCompat.m7911s();
        if (windowInsetsM7911s != null) {
            WindowInsets windowInsetsM7814b = Api20Impl.m7814b(view, windowInsetsM7911s);
            if (!windowInsetsM7814b.equals(windowInsetsM7911s)) {
                return WindowInsetsCompat.m7893t(view, windowInsetsM7814b);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static ContentInfoCompat m7803v(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.m7851b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = f23409e;
        if (onReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat contentInfoCompatMo7758a = onReceiveContentListener.mo7758a(view, contentInfoCompat);
        if (contentInfoCompatMo7758a == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.onReceiveContent(contentInfoCompatMo7758a);
    }

    /* JADX INFO: renamed from: w */
    public static void m7804w(int i, View view) {
        ArrayList arrayListM7789h = m7789h(view);
        for (int i2 = 0; i2 < arrayListM7789h.size(); i2++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) arrayListM7789h.get(i2)).m8024a() == i) {
                arrayListM7789h.remove(i2);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m7805x(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, String str, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && str == null) {
            m7804w(accessibilityActionCompat.m8024a(), view);
            m7801t(0, view);
            return;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.f23524b, str, accessibilityViewCommand, accessibilityActionCompat.f23525c);
        AccessibilityDelegateCompat accessibilityDelegateCompatM7786e = m7786e(view);
        if (accessibilityDelegateCompatM7786e == null) {
            accessibilityDelegateCompatM7786e = new AccessibilityDelegateCompat();
        }
        m7765A(view, accessibilityDelegateCompatM7786e);
        m7804w(accessibilityActionCompat2.m8024a(), view);
        m7789h(view).add(accessibilityActionCompat2);
        m7801t(0, view);
    }

    /* JADX INFO: renamed from: y */
    public static void m7806y(View view) {
        Api20Impl.m7815c(view);
    }

    /* JADX INFO: renamed from: z */
    public static void m7807z(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.m7846b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap f23411a = new WeakHashMap();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f23411a.entrySet()) {
                    View view = (View) entry.getKey();
                    boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                    boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
                    if (zBooleanValue != z2) {
                        ViewCompat.m7801t(z2 ? 16 : 32, view);
                        entry.setValue(Boolean.valueOf(z2));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
