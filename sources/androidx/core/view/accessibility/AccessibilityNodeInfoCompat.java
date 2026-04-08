package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.AbstractC0050i;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import androidx.core.text.util.AbstractC1451a;
import androidx.core.view.AbstractC1473i;
import androidx.core.view.AbstractC1477j;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* JADX INFO: renamed from: d */
    public static int f23503d;

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f23504a;

    /* JADX INFO: renamed from: b */
    public int f23505b = -1;

    /* JADX INFO: renamed from: c */
    public int f23506c = -1;

    /* JADX INFO: compiled from: Proguard */
    public static class AccessibilityActionCompat {

        /* JADX INFO: renamed from: e */
        public static final AccessibilityActionCompat f23507e = new AccessibilityActionCompat(1, (String) null);

        /* JADX INFO: renamed from: f */
        public static final AccessibilityActionCompat f23508f = new AccessibilityActionCompat(2, (String) null);

        /* JADX INFO: renamed from: g */
        public static final AccessibilityActionCompat f23509g;

        /* JADX INFO: renamed from: h */
        public static final AccessibilityActionCompat f23510h;

        /* JADX INFO: renamed from: i */
        public static final AccessibilityActionCompat f23511i;

        /* JADX INFO: renamed from: j */
        public static final AccessibilityActionCompat f23512j;

        /* JADX INFO: renamed from: k */
        public static final AccessibilityActionCompat f23513k;

        /* JADX INFO: renamed from: l */
        public static final AccessibilityActionCompat f23514l;

        /* JADX INFO: renamed from: m */
        public static final AccessibilityActionCompat f23515m;

        /* JADX INFO: renamed from: n */
        public static final AccessibilityActionCompat f23516n;

        /* JADX INFO: renamed from: o */
        public static final AccessibilityActionCompat f23517o;

        /* JADX INFO: renamed from: p */
        public static final AccessibilityActionCompat f23518p;

        /* JADX INFO: renamed from: q */
        public static final AccessibilityActionCompat f23519q;

        /* JADX INFO: renamed from: r */
        public static final AccessibilityActionCompat f23520r;

        /* JADX INFO: renamed from: s */
        public static final AccessibilityActionCompat f23521s;

        /* JADX INFO: renamed from: t */
        public static final AccessibilityActionCompat f23522t;

        /* JADX INFO: renamed from: a */
        public final Object f23523a;

        /* JADX INFO: renamed from: b */
        public final int f23524b;

        /* JADX INFO: renamed from: c */
        public final Class f23525c;

        /* JADX INFO: renamed from: d */
        public final AccessibilityViewCommand f23526d;

        static {
            new AccessibilityActionCompat(4, (String) null);
            new AccessibilityActionCompat(8, (String) null);
            f23509g = new AccessibilityActionCompat(16, (String) null);
            f23510h = new AccessibilityActionCompat(32, (String) null);
            f23511i = new AccessibilityActionCompat(64, (String) null);
            f23512j = new AccessibilityActionCompat(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, (String) null);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveAtGranularityArguments.class, 256);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveAtGranularityArguments.class, 512);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveHtmlArguments.class, UserMetadata.MAX_ATTRIBUTE_SIZE);
            new AccessibilityActionCompat(AccessibilityViewCommand.MoveHtmlArguments.class, 2048);
            f23513k = new AccessibilityActionCompat(4096, (String) null);
            f23514l = new AccessibilityActionCompat(UserMetadata.MAX_INTERNAL_KEY_SIZE, (String) null);
            new AccessibilityActionCompat(16384, (String) null);
            new AccessibilityActionCompat(32768, (String) null);
            new AccessibilityActionCompat(65536, (String) null);
            new AccessibilityActionCompat(AccessibilityViewCommand.SetSelectionArguments.class, 131072);
            f23515m = new AccessibilityActionCompat(262144, (String) null);
            f23516n = new AccessibilityActionCompat(524288, (String) null);
            f23517o = new AccessibilityActionCompat(1048576, (String) null);
            new AccessibilityActionCompat(AccessibilityViewCommand.SetTextArguments.class, 2097152);
            int i = Build.VERSION.SDK_INT;
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.ScrollToPositionArguments.class);
            f23518p = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f23519q = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f23520r = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f23521s = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new AccessibilityActionCompat(i >= 29 ? AbstractC1477j.m8136g() : null, R.id.accessibilityActionPageUp, null, null, null);
            new AccessibilityActionCompat(i >= 29 ? AbstractC1477j.m8152w() : null, R.id.accessibilityActionPageDown, null, null, null);
            new AccessibilityActionCompat(i >= 29 ? AbstractC1477j.m8126A() : null, R.id.accessibilityActionPageLeft, null, null, null);
            new AccessibilityActionCompat(i >= 29 ? AbstractC1477j.m8128C() : null, R.id.accessibilityActionPageRight, null, null, null);
            new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f23522t = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.SetProgressArguments.class);
            new AccessibilityActionCompat(i >= 26 ? AbstractC1329b.m6463m() : null, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.MoveWindowArguments.class);
            new AccessibilityActionCompat(i >= 28 ? AbstractC1465b.m8066n() : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new AccessibilityActionCompat(i >= 28 ? AbstractC1465b.m8050B() : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new AccessibilityActionCompat(i >= 30 ? AbstractC1473i.m8093k() : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new AccessibilityActionCompat(i >= 30 ? AbstractC1473i.m8103u() : null, R.id.accessibilityActionImeEnter, null, null, null);
            new AccessibilityActionCompat(i >= 32 ? AbstractC1464a.m8040d() : null, R.id.accessibilityActionDragStart, null, null, null);
            new AccessibilityActionCompat(i >= 32 ? AbstractC1464a.m8046j() : null, R.id.accessibilityActionDragDrop, null, null, null);
            new AccessibilityActionCompat(i >= 32 ? AbstractC1464a.m8048l() : null, R.id.accessibilityActionDragCancel, null, null, null);
            new AccessibilityActionCompat(i >= 33 ? AbstractC1451a.m7678c() : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            new AccessibilityActionCompat(i >= 34 ? Api34Impl.m8029a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public AccessibilityActionCompat(int i, String str) {
            this(null, i, str, null, null);
        }

        /* JADX INFO: renamed from: a */
        public final int m8024a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f23523a).getId();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            Object obj2 = ((AccessibilityActionCompat) obj).f23523a;
            Object obj3 = this.f23523a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public final int hashCode() {
            Object obj = this.f23523a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strM8004d = AccessibilityNodeInfoCompat.m8004d(this.f23524b);
            if (strM8004d.equals("ACTION_UNKNOWN")) {
                Object obj = this.f23523a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strM8004d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strM8004d);
            return sb.toString();
        }

        public AccessibilityActionCompat(Class cls, int i) {
            this(null, i, null, null, cls);
        }

        public AccessibilityActionCompat(Object obj, int i, String str, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.f23524b = i;
            this.f23526d = accessibilityViewCommand;
            if (obj == null) {
                this.f23523a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
            } else {
                this.f23523a = obj;
            }
            this.f23525c = cls;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static CharSequence m8025a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* JADX INFO: renamed from: b */
        public static void m8026b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        /* JADX INFO: renamed from: a */
        public static String m8027a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m8028b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m8029a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* JADX INFO: renamed from: b */
        public static void m8030b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m8031c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m8032d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api35Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CollectionInfoCompat {

        /* JADX INFO: renamed from: a */
        public final AccessibilityNodeInfo.CollectionInfo f23527a;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        public CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f23527a = collectionInfo;
        }

        /* JADX INFO: renamed from: a */
        public static CollectionInfoCompat m8033a(int i, int i2, int i3, boolean z2) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z2, i3));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CollectionItemInfoCompat {

        /* JADX INFO: renamed from: a */
        public final AccessibilityNodeInfo.CollectionItemInfo f23528a;

        /* JADX INFO: compiled from: Proguard */
        public static final class Builder {
        }

        public CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f23528a = collectionItemInfo;
        }

        /* JADX INFO: renamed from: a */
        public static CollectionItemInfoCompat m8034a(int i, int i2, int i3, int i4, boolean z2, boolean z3) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z2, z3));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RangeInfoCompat {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TouchDelegateInfoCompat {
    }

    public AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f23504a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: d */
    public static String m8004d(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case UserMetadata.MAX_ATTRIBUTE_SIZE /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case UserMetadata.MAX_INTERNAL_KEY_SIZE /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8005a(int i) {
        this.f23504a.addAction(i);
    }

    /* JADX INFO: renamed from: b */
    public final void m8006b(AccessibilityActionCompat accessibilityActionCompat) {
        this.f23504a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f23523a);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m8007c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23504a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8008e(int i) {
        Bundle extras = this.f23504a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f23504a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f23504a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f23506c == accessibilityNodeInfoCompat.f23506c && this.f23505b == accessibilityNodeInfoCompat.f23505b;
    }

    /* JADX INFO: renamed from: f */
    public final void m8009f(Rect rect) {
        this.f23504a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m8010g() {
        boolean zIsEmpty = m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23504a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListM8007c = m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListM8007c2 = m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListM8007c3 = m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListM8007c4 = m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListM8007c.size(); i++) {
            spannableString.setSpan(new AccessibilityClickableSpanCompat(((Integer) arrayListM8007c4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM8007c.get(i)).intValue(), ((Integer) arrayListM8007c2.get(i)).intValue(), ((Integer) arrayListM8007c3.get(i)).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: h */
    public final void m8011h(AccessibilityActionCompat accessibilityActionCompat) {
        this.f23504a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f23523a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23504a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m8012i(int i, boolean z2) {
        Bundle extras = this.f23504a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z2) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8013j(Rect rect) {
        this.f23504a.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: k */
    public final void m8014k(CharSequence charSequence) {
        this.f23504a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public final void m8015l(boolean z2) {
        this.f23504a.setClickable(z2);
    }

    /* JADX INFO: renamed from: m */
    public final void m8016m(CollectionInfoCompat collectionInfoCompat) {
        this.f23504a.setCollectionInfo(collectionInfoCompat == null ? null : collectionInfoCompat.f23527a);
    }

    /* JADX INFO: renamed from: n */
    public final void m8017n(CollectionItemInfoCompat collectionItemInfoCompat) {
        this.f23504a.setCollectionItemInfo(collectionItemInfoCompat.f23528a);
    }

    /* JADX INFO: renamed from: o */
    public final void m8018o(CharSequence charSequence) {
        this.f23504a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public final void m8019p(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0050i.m195D(this.f23504a, z2);
        } else {
            m8012i(2, z2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8020q(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23504a;
        if (i >= 26) {
            AbstractC1329b.m6472v(accessibilityNodeInfo, str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8021r(boolean z2) {
        this.f23504a.setScrollable(z2);
    }

    /* JADX INFO: renamed from: s */
    public final void m8022s(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23504a;
        if (i >= 30) {
            Api30Impl.m8026b(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8023t(CharSequence charSequence) {
        this.f23504a.setText(charSequence);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m8009f(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f23504a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            Api34Impl.m8030b(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m8010g());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? Api30Impl.m8025a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? AbstractC0050i.m208m(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? Api33Impl.m8027a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? Api34Impl.m8031c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(m8008e(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? Api33Impl.m8028b(accessibilityNodeInfo) : m8008e(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? Api34Impl.m8032d(accessibilityNodeInfo) : m8008e(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) arrayList.get(i3);
            String strM8004d = m8004d(accessibilityActionCompat.m8024a());
            if (strM8004d.equals("ACTION_UNKNOWN")) {
                Object obj = accessibilityActionCompat.f23523a;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    strM8004d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(strM8004d);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
