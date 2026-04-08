package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import com.exchange.allin.R;
import com.google.common.primitives.Ints;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DropDownListView extends ListView {

    /* JADX INFO: renamed from: a */
    public final Rect f1260a;

    /* JADX INFO: renamed from: b */
    public int f1261b;

    /* JADX INFO: renamed from: c */
    public int f1262c;

    /* JADX INFO: renamed from: d */
    public int f1263d;

    /* JADX INFO: renamed from: f */
    public int f1264f;

    /* JADX INFO: renamed from: g */
    public int f1265g;

    /* JADX INFO: renamed from: i */
    public GateKeeperDrawable f1266i;

    /* JADX INFO: renamed from: j */
    public boolean f1267j;

    /* JADX INFO: renamed from: n */
    public final boolean f1268n;

    /* JADX INFO: renamed from: o */
    public boolean f1269o;

    /* JADX INFO: renamed from: p */
    public ListViewAutoScrollHelper f1270p;

    /* JADX INFO: renamed from: q */
    public ResolveHoverRunnable f1271q;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m653a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {

        /* JADX INFO: renamed from: a */
        public static final Method f1272a;

        /* JADX INFO: renamed from: b */
        public static final Method f1273b;

        /* JADX INFO: renamed from: c */
        public static final Method f1274c;

        /* JADX INFO: renamed from: d */
        public static final boolean f1275d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f1272a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1273b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1274c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1275d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m654a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m655b(AbsListView absListView, boolean z2) {
            absListView.setSelectedChildViewEnabled(z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class GateKeeperDrawable extends DrawableWrapperCompat {

        /* JADX INFO: renamed from: a */
        public boolean f1276a;

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1276a) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.f1276a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1276a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1276a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z2, boolean z3) {
            if (this.f1276a) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PreApi33Impl {

        /* JADX INFO: renamed from: a */
        public static final Field f1277a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f1277a = declaredField;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ResolveHoverRunnable implements Runnable {
        public ResolveHoverRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f1271q = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1260a = new Rect();
        this.f1261b = 0;
        this.f1262c = 0;
        this.f1263d = 0;
        this.f1264f = 0;
        this.f1268n = z2;
        setCacheColorHint(0);
    }

    /* JADX INFO: renamed from: a */
    public int m651a(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m652b(MotionEvent motionEvent, int i) {
        boolean z2;
        boolean zM654a;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z3 = false;
        if (actionMasked == 1) {
            z2 = false;
        } else {
            if (actionMasked != 2) {
                z2 = actionMasked != 3;
                if (z2 || z3) {
                    this.f1269o = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f1265g - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z2) {
                    ListViewAutoScrollHelper listViewAutoScrollHelper = this.f1270p;
                    if (listViewAutoScrollHelper != null) {
                        if (listViewAutoScrollHelper.f23569u) {
                            listViewAutoScrollHelper.m8161e();
                        }
                        listViewAutoScrollHelper.f23569u = false;
                    }
                } else {
                    if (this.f1270p == null) {
                        this.f1270p = new ListViewAutoScrollHelper(this);
                    }
                    ListViewAutoScrollHelper listViewAutoScrollHelper2 = this.f1270p;
                    boolean z4 = listViewAutoScrollHelper2.f23569u;
                    listViewAutoScrollHelper2.f23569u = true;
                    listViewAutoScrollHelper2.onTouch(this, motionEvent);
                }
                return z2;
            }
            z2 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex >= 0) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y2);
            if (iPointToPosition == -1) {
                z3 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y2;
                this.f1269o = true;
                int i2 = Build.VERSION.SDK_INT;
                Api21Impl.m653a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f1265g;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1265g = iPointToPosition;
                Api21Impl.m653a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z5 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z5) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1260a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1261b;
                rect.top -= this.f1262c;
                rect.right += this.f1263d;
                rect.bottom += this.f1264f;
                if (i2 >= 33) {
                    zM654a = Api33Impl.m654a(this);
                } else {
                    Field field = PreApi33Impl.f1277a;
                    if (field != null) {
                        try {
                            zM654a = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM654a = false;
                        }
                    } else {
                        zM654a = false;
                    }
                }
                if (childAt3.isEnabled() != zM654a) {
                    boolean z6 = !zM654a;
                    if (Build.VERSION.SDK_INT >= 33) {
                        Api33Impl.m655b(this, z6);
                    } else {
                        Field field2 = PreApi33Impl.f1277a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z6));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z5) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                GateKeeperDrawable gateKeeperDrawable = this.f1266i;
                if (gateKeeperDrawable != null) {
                    gateKeeperDrawable.f1276a = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = true;
                z3 = false;
            }
        }
        if (z2) {
            this.f1269o = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1265g - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z2) {
        }
        return z2;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1260a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f1271q != null) {
            return;
        }
        super.drawableStateChanged();
        GateKeeperDrawable gateKeeperDrawable = this.f1266i;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.f1276a = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f1269o && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1268n || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1268n || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1268n || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1268n && this.f1267j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f1271q = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1271q == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.f1271q = resolveHoverRunnable;
            post(resolveHoverRunnable);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !Api30Impl.f1275d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        Api30Impl.f1272a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        Api30Impl.f1273b.invoke(this, Integer.valueOf(iPointToPosition));
                        Api30Impl.f1274c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f1269o && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1265g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.f1271q;
        if (resolveHoverRunnable != null) {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f1271q = null;
            dropDownListView.removeCallbacks(resolveHoverRunnable);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f1267j = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable;
        if (drawable != null) {
            gateKeeperDrawable = new GateKeeperDrawable(drawable);
            gateKeeperDrawable.f1276a = true;
        } else {
            gateKeeperDrawable = null;
        }
        this.f1266i = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1261b = rect.left;
        this.f1262c = rect.top;
        this.f1263d = rect.right;
        this.f1264f = rect.bottom;
    }
}
