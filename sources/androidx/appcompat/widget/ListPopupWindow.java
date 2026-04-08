package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.exchange.allin.R;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {

    /* JADX INFO: renamed from: F */
    public static final Method f1301F;

    /* JADX INFO: renamed from: G */
    public static final Method f1302G;

    /* JADX INFO: renamed from: A */
    public final Handler f1303A;

    /* JADX INFO: renamed from: B */
    public final Rect f1304B;

    /* JADX INFO: renamed from: C */
    public Rect f1305C;

    /* JADX INFO: renamed from: D */
    public boolean f1306D;

    /* JADX INFO: renamed from: E */
    public final PopupWindow f1307E;

    /* JADX INFO: renamed from: a */
    public final Context f1308a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f1309b;

    /* JADX INFO: renamed from: c */
    public DropDownListView f1310c;

    /* JADX INFO: renamed from: d */
    public final int f1311d;

    /* JADX INFO: renamed from: f */
    public int f1312f;

    /* JADX INFO: renamed from: g */
    public int f1313g;

    /* JADX INFO: renamed from: i */
    public int f1314i;

    /* JADX INFO: renamed from: j */
    public final int f1315j;

    /* JADX INFO: renamed from: n */
    public boolean f1316n;

    /* JADX INFO: renamed from: o */
    public boolean f1317o;

    /* JADX INFO: renamed from: p */
    public boolean f1318p;

    /* JADX INFO: renamed from: q */
    public int f1319q;

    /* JADX INFO: renamed from: r */
    public final int f1320r;

    /* JADX INFO: renamed from: s */
    public DataSetObserver f1321s;

    /* JADX INFO: renamed from: t */
    public View f1322t;

    /* JADX INFO: renamed from: u */
    public AdapterView.OnItemClickListener f1323u;

    /* JADX INFO: renamed from: v */
    public AdapterView.OnItemSelectedListener f1324v;

    /* JADX INFO: renamed from: w */
    public final ResizePopupRunnable f1325w;

    /* JADX INFO: renamed from: x */
    public final PopupTouchInterceptor f1326x;

    /* JADX INFO: renamed from: y */
    public final PopupScrollListener f1327y;

    /* JADX INFO: renamed from: z */
    public final ListSelectorHider f1328z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$1 */
    /* JADX INFO: compiled from: Proguard */
    class C01211 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        /* JADX INFO: renamed from: b */
        public final /* bridge */ /* synthetic */ ShowableListMenu mo439b() {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$2 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC01222 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m664a(PopupWindow popupWindow, View view, int i, boolean z2) {
            return popupWindow.getMaxAvailableHeight(view, i, z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m665a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m666b(PopupWindow popupWindow, boolean z2) {
            popupWindow.setIsClippedToScreen(z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ListSelectorHider implements Runnable {
        public ListSelectorHider() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = ListPopupWindow.this.f1310c;
            if (dropDownListView != null) {
                dropDownListView.setListSelectionHidden(true);
                dropDownListView.requestLayout();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class PopupDataSetObserver extends DataSetObserver {
        public PopupDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.f1307E.isShowing()) {
                listPopupWindow.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class PopupTouchInterceptor implements View.OnTouchListener {
        public PopupTouchInterceptor() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (popupWindow = listPopupWindow.f1307E) != null && popupWindow.isShowing() && x >= 0 && x < listPopupWindow.f1307E.getWidth() && y2 >= 0 && y2 < listPopupWindow.f1307E.getHeight()) {
                listPopupWindow.f1303A.postDelayed(listPopupWindow.f1325w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            listPopupWindow.f1303A.removeCallbacks(listPopupWindow.f1325w);
            return false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ResizePopupRunnable implements Runnable {
        public ResizePopupRunnable() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            DropDownListView dropDownListView = listPopupWindow.f1310c;
            if (dropDownListView == null || !dropDownListView.isAttachedToWindow() || listPopupWindow.f1310c.getCount() <= listPopupWindow.f1310c.getChildCount() || listPopupWindow.f1310c.getChildCount() > listPopupWindow.f1320r) {
                return;
            }
            listPopupWindow.f1307E.setInputMethodMode(2);
            listPopupWindow.show();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1301F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1302G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* JADX INFO: renamed from: a */
    public final boolean mo448a() {
        return this.f1307E.isShowing();
    }

    /* JADX INFO: renamed from: b */
    public final int m657b() {
        return this.f1313g;
    }

    /* JADX INFO: renamed from: d */
    public final void m658d(int i) {
        this.f1313g = i;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        PopupWindow popupWindow = this.f1307E;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f1310c = null;
        this.f1303A.removeCallbacks(this.f1325w);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m659f() {
        return this.f1307E.getBackground();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    /* JADX INFO: renamed from: g */
    public final ListView mo453g() {
        return this.f1310c;
    }

    /* JADX INFO: renamed from: i */
    public final void m660i(int i) {
        this.f1314i = i;
        this.f1316n = true;
    }

    /* JADX INFO: renamed from: l */
    public final int m661l() {
        if (this.f1316n) {
            return this.f1314i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public void mo577n(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1321s;
        if (dataSetObserver == null) {
            this.f1321s = new PopupDataSetObserver();
        } else {
            ListAdapter listAdapter2 = this.f1309b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1309b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1321s);
        }
        DropDownListView dropDownListView = this.f1310c;
        if (dropDownListView != null) {
            dropDownListView.setAdapter(this.f1309b);
        }
    }

    /* JADX INFO: renamed from: o */
    public DropDownListView mo662o(Context context, boolean z2) {
        return new DropDownListView(context, z2);
    }

    /* JADX INFO: renamed from: p */
    public final void m663p(int i) {
        Drawable background = this.f1307E.getBackground();
        if (background == null) {
            this.f1312f = i;
            return;
        }
        Rect rect = this.f1304B;
        background.getPadding(rect);
        this.f1312f = rect.left + rect.right + i;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f1307E.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        int i;
        int paddingBottom;
        DropDownListView dropDownListView;
        DropDownListView dropDownListView2 = this.f1310c;
        PopupWindow popupWindow = this.f1307E;
        Context context = this.f1308a;
        if (dropDownListView2 == null) {
            DropDownListView dropDownListViewMo662o = mo662o(context, !this.f1306D);
            this.f1310c = dropDownListViewMo662o;
            dropDownListViewMo662o.setAdapter(this.f1309b);
            this.f1310c.setOnItemClickListener(this.f1323u);
            this.f1310c.setFocusable(true);
            this.f1310c.setFocusableInTouchMode(true);
            this.f1310c.setOnItemSelectedListener(new C01233());
            this.f1310c.setOnScrollListener(this.f1327y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1324v;
            if (onItemSelectedListener != null) {
                this.f1310c.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f1310c);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f1304B;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f1316n) {
                this.f1314i = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iM664a = Api24Impl.m664a(popupWindow, this.f1322t, this.f1314i, popupWindow.getInputMethodMode() == 2);
        int i3 = this.f1311d;
        if (i3 == -1) {
            paddingBottom = iM664a + i;
        } else {
            int i4 = this.f1312f;
            int iM651a = this.f1310c.m651a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Ints.MAX_POWER_OF_TWO) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iM664a);
            paddingBottom = iM651a + (iM651a > 0 ? this.f1310c.getPaddingBottom() + this.f1310c.getPaddingTop() + i : 0);
        }
        boolean z2 = this.f1307E.getInputMethodMode() == 2;
        popupWindow.setWindowLayoutType(this.f1315j);
        if (popupWindow.isShowing()) {
            if (this.f1322t.isAttachedToWindow()) {
                int width = this.f1312f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f1322t.getWidth();
                }
                if (i3 == -1) {
                    i3 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f1312f == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f1312f == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view = this.f1322t;
                int i5 = this.f1313g;
                int i6 = this.f1314i;
                if (width < 0) {
                    width = -1;
                }
                popupWindow.update(view, i5, i6, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.f1312f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f1322t.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1301F;
            if (method != null) {
                try {
                    method.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            Api29Impl.m666b(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f1326x);
        if (this.f1318p) {
            popupWindow.setOverlapAnchor(this.f1317o);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1302G;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, this.f1305C);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            Api29Impl.m665a(popupWindow, this.f1305C);
        }
        popupWindow.showAsDropDown(this.f1322t, this.f1313g, this.f1314i, this.f1319q);
        this.f1310c.setSelection(-1);
        if ((!this.f1306D || this.f1310c.isInTouchMode()) && (dropDownListView = this.f1310c) != null) {
            dropDownListView.setListSelectionHidden(true);
            dropDownListView.requestLayout();
        }
        if (this.f1306D) {
            return;
        }
        this.f1303A.post(this.f1328z);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this.f1311d = -2;
        this.f1312f = -2;
        this.f1315j = MTCommonConstants.MainWhat.ON_SERVICE_DISCONNECTED;
        this.f1319q = 0;
        this.f1320r = Integer.MAX_VALUE;
        this.f1325w = new ResizePopupRunnable();
        this.f1326x = new PopupTouchInterceptor();
        this.f1327y = new PopupScrollListener();
        this.f1328z = new ListSelectorHider();
        this.f1304B = new Rect();
        this.f1308a = context;
        this.f1303A = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f277p, i, 0);
        this.f1313g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1314i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1316n = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.f281t, i, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            appCompatPopupWindow.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        appCompatPopupWindow.setBackgroundDrawable(tintTypedArray.m706b(0));
        tintTypedArray.m709g();
        this.f1307E = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ListPopupWindow$3 */
    /* JADX INFO: compiled from: Proguard */
    class C01233 implements AdapterView.OnItemSelectedListener {
        public C01233() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            DropDownListView dropDownListView;
            if (i == -1 || (dropDownListView = ListPopupWindow.this.f1310c) == null) {
                return;
            }
            dropDownListView.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class PopupScrollListener implements AbsListView.OnScrollListener {
        public PopupScrollListener() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (listPopupWindow.f1307E.getInputMethodMode() == 2 || listPopupWindow.f1307E.getContentView() == null) {
                    return;
                }
                Handler handler = listPopupWindow.f1303A;
                ResizePopupRunnable resizePopupRunnable = listPopupWindow.f1325w;
                handler.removeCallbacks(resizePopupRunnable);
                resizePopupRunnable.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }
    }
}
