package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollingChildHelper {

    /* JADX INFO: renamed from: a */
    public ViewParent f23381a;

    /* JADX INFO: renamed from: b */
    public ViewParent f23382b;

    /* JADX INFO: renamed from: c */
    public final View f23383c;

    /* JADX INFO: renamed from: d */
    public boolean f23384d;

    /* JADX INFO: renamed from: e */
    public int[] f23385e;

    public NestedScrollingChildHelper(View view) {
        this.f23383c = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7749a(float f, float f2, boolean z2) {
        ViewParent viewParentM7753e;
        if (this.f23384d && (viewParentM7753e = m7753e(0)) != null) {
            try {
                return viewParentM7753e.onNestedFling(this.f23383c, f, f2, z2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM7753e + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7750b(float f, float f2) {
        ViewParent viewParentM7753e;
        if (this.f23384d && (viewParentM7753e = m7753e(0)) != null) {
            try {
                return viewParentM7753e.onNestedPreFling(this.f23383c, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM7753e + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7751c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM7753e;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f23384d || (viewParentM7753e = m7753e(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f23383c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f23385e == null) {
                this.f23385e = new int[2];
            }
            iArr3 = this.f23385e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z2 = viewParentM7753e instanceof NestedScrollingParent2;
        View view2 = this.f23383c;
        if (z2) {
            ((NestedScrollingParent2) viewParentM7753e).onNestedPreScroll(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentM7753e.onNestedPreScroll(view2, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM7753e + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7752d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM7753e;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f23384d && (viewParentM7753e = m7753e(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                View view = this.f23383c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f23385e == null) {
                        this.f23385e = new int[2];
                    }
                    int[] iArr4 = this.f23385e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z2 = viewParentM7753e instanceof NestedScrollingParent3;
                View view2 = this.f23383c;
                if (z2) {
                    ((NestedScrollingParent3) viewParentM7753e).onNestedScroll(view2, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM7753e instanceof NestedScrollingParent2) {
                        ((NestedScrollingParent2) viewParentM7753e).onNestedScroll(view2, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM7753e.onNestedScroll(view2, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM7753e + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final ViewParent m7753e(int i) {
        if (i == 0) {
            return this.f23381a;
        }
        if (i != 1) {
            return null;
        }
        return this.f23382b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7754f(int i) {
        return m7753e(i) != null;
    }

    /* JADX INFO: renamed from: g */
    public final void m7755g(boolean z2) {
        if (this.f23384d) {
            WeakHashMap weakHashMap = ViewCompat.f23405a;
            ViewCompat.Api21Impl.m7833r(this.f23383c);
        }
        this.f23384d = z2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7756h(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m7754f(i2)) {
            if (this.f23384d) {
                View view = this.f23383c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof NestedScrollingParent2;
                    if (z2) {
                        zOnStartNestedScroll = ((NestedScrollingParent2) parent).onStartNestedScroll(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.f23381a = parent;
                        } else if (i2 == 1) {
                            this.f23382b = parent;
                        }
                        if (z2) {
                            ((NestedScrollingParent2) parent).onNestedScrollAccepted(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m7757i(int i) {
        ViewParent viewParentM7753e = m7753e(i);
        if (viewParentM7753e != null) {
            boolean z2 = viewParentM7753e instanceof NestedScrollingParent2;
            View view = this.f23383c;
            if (z2) {
                ((NestedScrollingParent2) viewParentM7753e).onStopNestedScroll(view, i);
            } else if (i == 0) {
                try {
                    viewParentM7753e.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM7753e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f23381a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f23382b = null;
            }
        }
    }
}
