package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010L.AbstractC0020a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DrawableUtils {

    /* JADX INFO: renamed from: a */
    public static final int[] f1251a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f1252b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f1253c = new Rect();

    /* JADX INFO: compiled from: Proguard */
    public static class Api18Impl {

        /* JADX INFO: renamed from: a */
        public static final boolean f1254a;

        /* JADX INFO: renamed from: b */
        public static final Method f1255b;

        /* JADX INFO: renamed from: c */
        public static final Field f1256c;

        /* JADX INFO: renamed from: d */
        public static final Field f1257d;

        /* JADX INFO: renamed from: e */
        public static final Field f1258e;

        /* JADX INFO: renamed from: f */
        public static final Field f1259f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z2;
            Class<?> cls;
            try {
                cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField(BlockAlignment.LEFT);
                } catch (ClassNotFoundException unused) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                } catch (NoSuchFieldException unused2) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z2 = false;
                    if (z2) {
                    }
                }
            } catch (ClassNotFoundException unused4) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused5) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused6) {
                method = null;
                field = null;
            }
            try {
                field2 = cls.getField(VerticalAlignment.TOP);
                try {
                    field3 = cls.getField(BlockAlignment.RIGHT);
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                    field3 = null;
                }
                try {
                    field4 = cls.getField(VerticalAlignment.BOTTOM);
                    z2 = true;
                } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                    field4 = null;
                    z2 = false;
                }
            } catch (ClassNotFoundException unused9) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchFieldException unused10) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchMethodException unused11) {
                field2 = null;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
            if (z2) {
                f1255b = method;
                f1256c = field;
                f1257d = field2;
                f1258e = field3;
                f1259f = field4;
                f1254a = true;
                return;
            }
            f1255b = null;
            f1256c = null;
            f1257d = null;
            f1258e = null;
            f1259f = null;
            f1254a = false;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Insets m650a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m647a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1251a);
        } else {
            drawable.setState(f1252b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: b */
    public static Rect m648b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM650a = Api29Impl.m650a(drawable);
            return new Rect(AbstractC0020a.m47a(insetsM650a), AbstractC0020a.m59m(insetsM650a), AbstractC0020a.m66t(insetsM650a), AbstractC0020a.m69w(insetsM650a));
        }
        Drawable drawableM7609d = DrawableCompat.m7609d(drawable);
        if (i >= 29) {
            boolean z2 = Api18Impl.f1254a;
        } else if (Api18Impl.f1254a) {
            try {
                Object objInvoke = Api18Impl.f1255b.invoke(drawableM7609d, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(Api18Impl.f1256c.getInt(objInvoke), Api18Impl.f1257d.getInt(objInvoke), Api18Impl.f1258e.getInt(objInvoke), Api18Impl.f1259f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1253c;
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m649c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
