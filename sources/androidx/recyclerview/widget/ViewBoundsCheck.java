package androidx.recyclerview.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ViewBoundsCheck {

    /* JADX INFO: renamed from: a */
    public final Callback f31829a;

    /* JADX INFO: renamed from: b */
    public final BoundFlags f31830b;

    /* JADX INFO: compiled from: Proguard */
    public static class BoundFlags {

        /* JADX INFO: renamed from: a */
        public int f31831a;

        /* JADX INFO: renamed from: b */
        public int f31832b;

        /* JADX INFO: renamed from: c */
        public int f31833c;

        /* JADX INFO: renamed from: d */
        public int f31834d;

        /* JADX INFO: renamed from: e */
        public int f31835e;

        /* JADX INFO: renamed from: a */
        public final boolean m11753a() {
            int i = this.f31831a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f31834d;
                int i4 = this.f31832b;
                if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.f31834d;
                int i6 = this.f31833c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.f31835e;
                int i8 = this.f31832b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.f31835e;
                int i10 = this.f31833c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
        /* JADX INFO: renamed from: a */
        int mo11678a(View view);

        /* JADX INFO: renamed from: b */
        int mo11679b();

        /* JADX INFO: renamed from: c */
        int mo11680c();

        /* JADX INFO: renamed from: d */
        View mo11681d(int i);

        /* JADX INFO: renamed from: e */
        int mo11682e(View view);
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewBounds {
    }

    public ViewBoundsCheck(Callback callback) {
        this.f31829a = callback;
        BoundFlags boundFlags = new BoundFlags();
        boundFlags.f31831a = 0;
        this.f31830b = boundFlags;
    }

    /* JADX INFO: renamed from: a */
    public final View m11751a(int i, int i2, int i3, int i4) {
        Callback callback = this.f31829a;
        int iMo11679b = callback.mo11679b();
        int iMo11680c = callback.mo11680c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo11681d = callback.mo11681d(i);
            int iMo11678a = callback.mo11678a(viewMo11681d);
            int iMo11682e = callback.mo11682e(viewMo11681d);
            BoundFlags boundFlags = this.f31830b;
            boundFlags.f31832b = iMo11679b;
            boundFlags.f31833c = iMo11680c;
            boundFlags.f31834d = iMo11678a;
            boundFlags.f31835e = iMo11682e;
            if (i3 != 0) {
                boundFlags.f31831a = i3;
                if (boundFlags.m11753a()) {
                    return viewMo11681d;
                }
            }
            if (i4 != 0) {
                boundFlags.f31831a = i4;
                if (boundFlags.m11753a()) {
                    view = viewMo11681d;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11752b(View view) {
        Callback callback = this.f31829a;
        int iMo11679b = callback.mo11679b();
        int iMo11680c = callback.mo11680c();
        int iMo11678a = callback.mo11678a(view);
        int iMo11682e = callback.mo11682e(view);
        BoundFlags boundFlags = this.f31830b;
        boundFlags.f31832b = iMo11679b;
        boundFlags.f31833c = iMo11680c;
        boundFlags.f31834d = iMo11678a;
        boundFlags.f31835e = iMo11682e;
        boundFlags.f31831a = 24579;
        return boundFlags.m11753a();
    }
}
