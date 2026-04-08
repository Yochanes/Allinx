package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.activity.AbstractC0050i;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.exchange.allin.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: compiled from: Proguard */
    public static final class AccessibilityDelegateAdapter extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final AccessibilityDelegateCompat f23345a;

        public AccessibilityDelegateAdapter(AccessibilityDelegateCompat accessibilityDelegateCompat) {
            this.f23345a = accessibilityDelegateCompat;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f23345a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProviderCompat accessibilityNodeProvider = this.f23345a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return accessibilityNodeProvider.f23529a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f23345a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int iKeyAt;
            int i = 1;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            int i2 = 0;
            Boolean bool = (Boolean) new ViewCompat.C14531(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).m7811c(view);
            boolean z2 = bool != null && bool.booleanValue();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                AbstractC0050i.m218w(accessibilityNodeInfo, z2);
            } else {
                accessibilityNodeInfoCompat.m8012i(1, z2);
            }
            Boolean bool2 = (Boolean) new ViewCompat.C14564(R.id.tag_accessibility_heading, Boolean.class, 0, 28).m7811c(view);
            accessibilityNodeInfoCompat.m8019p(bool2 != null && bool2.booleanValue());
            CharSequence charSequenceM7788g = ViewCompat.m7788g(view);
            if (i3 >= 28) {
                AbstractC0050i.m217v(accessibilityNodeInfo, charSequenceM7788g);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceM7788g);
            }
            accessibilityNodeInfoCompat.m8022s((CharSequence) new ViewCompat.C14553(R.id.tag_state_description, CharSequence.class, 64, 30).m7811c(view));
            this.f23345a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i6 = 0;
                    while (i6 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i6];
                        int i7 = i2;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                iKeyAt = AccessibilityNodeInfoCompat.f23503d;
                                AccessibilityNodeInfoCompat.f23503d = iKeyAt + 1;
                                break;
                            } else {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                    iKeyAt = sparseArray2.keyAt(i7);
                                    break;
                                }
                                i7 += i;
                            }
                        }
                        sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i6]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                        Spanned spanned = (Spanned) text;
                        accessibilityNodeInfoCompat.m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        accessibilityNodeInfoCompat.m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        accessibilityNodeInfoCompat.m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        accessibilityNodeInfoCompat.m8007c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                        i6++;
                        i = i;
                        i2 = 0;
                    }
                }
            }
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = AccessibilityDelegateCompat.getActionList(view);
            for (int i8 = 0; i8 < actionList.size(); i8++) {
                accessibilityNodeInfoCompat.m8006b(actionList.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f23345a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f23345a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f23345a.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f23345a.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f23345a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public AccessibilityDelegateCompat() {
        this(DEFAULT_DELEGATE);
    }

    public static List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(View view) {
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Nullable
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f23504a);
    }

    public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@NonNull View view, int i, @Nullable Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        AccessibilityViewCommand.CommandArguments commandArguments;
        List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList(view);
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = actionList.get(i2);
            if (accessibilityActionCompat.m8024a() == i) {
                AccessibilityViewCommand accessibilityViewCommand = accessibilityActionCompat.f23526d;
                if (accessibilityViewCommand != null) {
                    Class cls = accessibilityActionCompat.f23525c;
                    if (cls != null) {
                        try {
                            commandArguments = (AccessibilityViewCommand.CommandArguments) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        } catch (Exception e) {
                            e = e;
                            commandArguments = null;
                        }
                        try {
                            commandArguments.getClass();
                        } catch (Exception e2) {
                            e = e2;
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    } else {
                        commandArguments = null;
                    }
                    zPerformAccessibilityAction = accessibilityViewCommand.perform(view, commandArguments);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i4++;
            }
        }
        return z2;
    }

    public void sendAccessibilityEvent(@NonNull View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new AccessibilityDelegateAdapter(this);
    }
}
