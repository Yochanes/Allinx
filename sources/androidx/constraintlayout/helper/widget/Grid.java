package androidx.constraintlayout.helper.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Grid extends VirtualLayout {

    /* JADX INFO: renamed from: A */
    public float f22127A;

    /* JADX INFO: renamed from: B */
    public float f22128B;

    /* JADX INFO: renamed from: C */
    public int f22129C;

    /* JADX INFO: renamed from: D */
    public int f22130D;

    /* JADX INFO: renamed from: E */
    public boolean[][] f22131E;

    /* JADX INFO: renamed from: F */
    public int[] f22132F;

    /* JADX INFO: renamed from: q */
    public View[] f22133q;

    /* JADX INFO: renamed from: r */
    public ConstraintLayout f22134r;

    /* JADX INFO: renamed from: s */
    public int f22135s;

    /* JADX INFO: renamed from: t */
    public int f22136t;

    /* JADX INFO: renamed from: u */
    public int f22137u;

    /* JADX INFO: renamed from: v */
    public int f22138v;

    /* JADX INFO: renamed from: w */
    public String f22139w;

    /* JADX INFO: renamed from: x */
    public String f22140x;

    /* JADX INFO: renamed from: y */
    public String f22141y;

    /* JADX INFO: renamed from: z */
    public String f22142z;

    private int getNextPosition() {
        boolean z2 = false;
        int i = 0;
        while (!z2) {
            i = this.f22130D;
            int i2 = this.f22135s;
            int i3 = this.f22137u;
            if (i >= i2 * i3) {
                return -1;
            }
            int i4 = this.f22129C;
            int i5 = i4 == 1 ? i % i2 : i / i3;
            int i6 = i4 == 1 ? i / i2 : i % i3;
            boolean[] zArr = this.f22131E[i5];
            if (zArr[i6]) {
                zArr[i6] = false;
                z2 = true;
            }
            this.f22130D = i + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: s */
    public static void m7183s(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.f22632H = -1.0f;
        layoutParams.f22661f = -1;
        layoutParams.f22659e = -1;
        layoutParams.f22663g = -1;
        layoutParams.f22665h = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: t */
    public static void m7184t(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.f22633I = -1.0f;
        layoutParams.f22669j = -1;
        layoutParams.f22667i = -1;
        layoutParams.f22671k = -1;
        layoutParams.f22673l = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: x */
    public static int[][] m7185x(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: y */
    public static float[] m7186y(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    public String getColumnWeights() {
        return this.f22142z;
    }

    public int getColumns() {
        return this.f22138v;
    }

    public float getHorizontalGaps() {
        return this.f22127A;
    }

    public int getOrientation() {
        return this.f22129C;
    }

    public String getRowWeights() {
        return this.f22141y;
    }

    public int getRows() {
        return this.f22136t;
    }

    public String getSkips() {
        return this.f22140x;
    }

    public String getSpans() {
        return this.f22139w;
    }

    public float getVerticalGaps() {
        return this.f22128B;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22134r = (ConstraintLayout) getParent();
        m7187u(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.f22133q) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, 0.0f, right2, bottom - top, paint);
                canvas.drawRect(0.0f, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.f22142z;
        if (str2 == null || !str2.equals(str)) {
            this.f22142z = str;
            m7187u(true);
            invalidate();
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.f22138v != i) {
            this.f22138v = i;
            m7190z();
            m7188v();
            m7187u(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= 0.0f && this.f22127A != f) {
            this.f22127A = f;
            m7187u(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.f22129C != i) {
            this.f22129C = i;
            m7187u(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.f22141y;
        if (str2 == null || !str2.equals(str)) {
            this.f22141y = str;
            m7187u(true);
            invalidate();
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.f22136t != i) {
            this.f22136t = i;
            m7190z();
            m7188v();
            m7187u(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.f22140x;
        if (str2 == null || !str2.equals(str)) {
            this.f22140x = str;
            m7187u(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.f22139w;
        if (str == null || !str.contentEquals(charSequence)) {
            this.f22139w = charSequence.toString();
            m7187u(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= 0.0f && this.f22128B != f) {
            this.f22128B = f;
            m7187u(true);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m7187u(boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int[][] iArrM7185x;
        int[][] iArrM7185x2;
        if (this.f22134r == null || (i = this.f22135s) < 1 || (i2 = this.f22137u) < 1) {
            return;
        }
        if (z2) {
            for (int i5 = 0; i5 < this.f22131E.length; i5++) {
                int i6 = 0;
                while (true) {
                    boolean[][] zArr = this.f22131E;
                    if (i6 < zArr[0].length) {
                        zArr[i5][i6] = true;
                        i6++;
                    }
                }
            }
            throw null;
        }
        this.f22130D = 0;
        int iMax = Math.max(i, i2);
        if (iMax != this.f22133q.length) {
            View[] viewArr = new View[iMax];
            for (int i7 = 0; i7 < iMax; i7++) {
                View[] viewArr2 = this.f22133q;
                if (i7 < viewArr2.length) {
                    viewArr[i7] = viewArr2[i7];
                } else {
                    View view = new View(getContext());
                    view.setId(View.generateViewId());
                    view.setVisibility(4);
                    this.f22134r.addView(view, new ConstraintLayout.LayoutParams(0, 0));
                    viewArr[i7] = view;
                }
            }
            int i8 = iMax;
            while (true) {
                View[] viewArr3 = this.f22133q;
                if (i8 >= viewArr3.length) {
                    break;
                }
                this.f22134r.removeView(viewArr3[i8]);
                i8++;
            }
            this.f22133q = viewArr;
        }
        this.f22132F = new int[iMax];
        int i9 = 0;
        while (true) {
            View[] viewArr4 = this.f22133q;
            if (i9 >= viewArr4.length) {
                break;
            }
            this.f22132F[i9] = viewArr4[i9].getId();
            i9++;
        }
        int id = getId();
        int iMax2 = Math.max(this.f22135s, this.f22137u);
        float[] fArrM7186y = m7186y(this.f22135s, this.f22141y);
        if (this.f22135s == 1) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f22133q[0].getLayoutParams();
            m7184t(this.f22133q[0]);
            layoutParams.f22667i = id;
            layoutParams.f22673l = id;
            this.f22133q[0].setLayoutParams(layoutParams);
        } else {
            int i10 = 0;
            while (true) {
                i3 = this.f22135s;
                if (i10 >= i3) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f22133q[i10].getLayoutParams();
                m7184t(this.f22133q[i10]);
                if (fArrM7186y != null) {
                    layoutParams2.f22633I = fArrM7186y[i10];
                }
                if (i10 > 0) {
                    layoutParams2.f22669j = this.f22132F[i10 - 1];
                } else {
                    layoutParams2.f22667i = id;
                }
                if (i10 < this.f22135s - 1) {
                    layoutParams2.f22671k = this.f22132F[i10 + 1];
                } else {
                    layoutParams2.f22673l = id;
                }
                if (i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.f22127A;
                }
                this.f22133q[i10].setLayoutParams(layoutParams2);
                i10++;
            }
            while (i3 < iMax2) {
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.f22133q[i3].getLayoutParams();
                m7184t(this.f22133q[i3]);
                layoutParams3.f22667i = id;
                layoutParams3.f22673l = id;
                this.f22133q[i3].setLayoutParams(layoutParams3);
                i3++;
            }
        }
        int id2 = getId();
        int iMax3 = Math.max(this.f22135s, this.f22137u);
        float[] fArrM7186y2 = m7186y(this.f22137u, this.f22142z);
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.f22133q[0].getLayoutParams();
        if (this.f22137u == 1) {
            m7183s(this.f22133q[0]);
            layoutParams4.f22659e = id2;
            layoutParams4.f22665h = id2;
            this.f22133q[0].setLayoutParams(layoutParams4);
        } else {
            int i11 = 0;
            while (true) {
                i4 = this.f22137u;
                if (i11 >= i4) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) this.f22133q[i11].getLayoutParams();
                m7183s(this.f22133q[i11]);
                if (fArrM7186y2 != null) {
                    layoutParams5.f22632H = fArrM7186y2[i11];
                }
                if (i11 > 0) {
                    layoutParams5.f22661f = this.f22132F[i11 - 1];
                } else {
                    layoutParams5.f22659e = id2;
                }
                if (i11 < this.f22137u - 1) {
                    layoutParams5.f22663g = this.f22132F[i11 + 1];
                } else {
                    layoutParams5.f22665h = id2;
                }
                if (i11 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) this.f22127A;
                }
                this.f22133q[i11].setLayoutParams(layoutParams5);
                i11++;
            }
            while (i4 < iMax3) {
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) this.f22133q[i4].getLayoutParams();
                m7183s(this.f22133q[i4]);
                layoutParams6.f22659e = id2;
                layoutParams6.f22665h = id2;
                this.f22133q[i4].setLayoutParams(layoutParams6);
                i4++;
            }
        }
        String str = this.f22140x;
        if (str != null && !str.trim().isEmpty() && (iArrM7185x2 = m7185x(this.f22140x)) != null) {
            for (int[] iArr : iArrM7185x2) {
                int i12 = iArr[0];
                int i13 = this.f22129C;
                if (!m7189w(i13 == 1 ? i12 % this.f22135s : i12 / this.f22137u, i13 == 1 ? i12 / this.f22135s : i12 % this.f22137u, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.f22139w;
        if (str2 != null && !str2.trim().isEmpty() && (iArrM7185x = m7185x(this.f22139w)) != null) {
            int[] iArr2 = this.f22615a;
            View[] viewArrM7329j = m7329j(this.f22134r);
            if (iArrM7185x.length > 0) {
                int[] iArr3 = iArrM7185x[0];
                int i14 = iArr3[0];
                int i15 = this.f22129C;
                int i16 = i15 == 1 ? i14 % this.f22135s : i14 / this.f22137u;
                int i17 = i15 == 1 ? i14 / this.f22135s : i14 % this.f22137u;
                if (m7189w(i16, i17, iArr3[1], iArr3[2])) {
                    View view2 = viewArrM7329j[0];
                    int[] iArr4 = iArrM7185x[0];
                    int i18 = iArr4[1];
                    int i19 = iArr4[2];
                    ConstraintLayout.LayoutParams layoutParams7 = (ConstraintLayout.LayoutParams) view2.getLayoutParams();
                    int[] iArr5 = this.f22132F;
                    layoutParams7.f22659e = iArr5[i17];
                    layoutParams7.f22667i = iArr5[i16];
                    layoutParams7.f22665h = iArr5[(i17 + i19) - 1];
                    layoutParams7.f22673l = iArr5[(i16 + i18) - 1];
                    view2.setLayoutParams(layoutParams7);
                    int i20 = iArr2[0];
                    throw null;
                }
            }
        }
        m7329j(this.f22134r);
        if (this.f22616b <= 0) {
            return;
        }
        int i21 = this.f22615a[0];
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public final void m7188v() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f22135s, this.f22137u);
        this.f22131E = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7189w(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.f22131E;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final void m7190z() {
        int i;
        int i2 = this.f22136t;
        if (i2 != 0 && (i = this.f22138v) != 0) {
            this.f22135s = i2;
            this.f22137u = i;
            return;
        }
        int i3 = this.f22138v;
        if (i3 > 0) {
            this.f22137u = i3;
            this.f22135s = ((this.f22616b + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.f22135s = i2;
            this.f22137u = ((this.f22616b + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f22616b) + 1.5d);
            this.f22135s = iSqrt;
            this.f22137u = ((this.f22616b + iSqrt) - 1) / iSqrt;
        }
    }
}
