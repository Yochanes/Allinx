package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f23228k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f23229a;

    /* JADX INFO: renamed from: b */
    public Object f23230b;

    /* JADX INFO: renamed from: c */
    public byte[] f23231c;

    /* JADX INFO: renamed from: d */
    public Parcelable f23232d;

    /* JADX INFO: renamed from: e */
    public int f23233e;

    /* JADX INFO: renamed from: f */
    public int f23234f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f23235g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f23236h;

    /* JADX INFO: renamed from: i */
    public String f23237i;

    /* JADX INFO: renamed from: j */
    public String f23238j;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static Icon m7620a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static int m7621a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        public static String m7622b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        public static int m7623c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        public static Uri m7624d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        /* JADX INFO: renamed from: a */
        public static Icon m7625a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IconType {
    }

    @RestrictTo
    public IconCompat() {
        this.f23229a = -1;
        this.f23231c = null;
        this.f23232d = null;
        this.f23233e = 0;
        this.f23234f = 0;
        this.f23235g = null;
        this.f23236h = f23228k;
        this.f23237i = null;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m7611a(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z2) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m7612b(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f23230b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public static IconCompat m7613c(Context context, int i) {
        context.getClass();
        return m7614d(context.getResources(), context.getPackageName(), i);
    }

    /* JADX INFO: renamed from: d */
    public static IconCompat m7614d(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f23233e = i;
        if (resources != null) {
            try {
                iconCompat.f23230b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f23230b = str;
        }
        iconCompat.f23238j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: e */
    public final int m7615e() {
        int i = this.f23229a;
        if (i != -1) {
            if (i == 2) {
                return this.f23233e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f23230b;
        if (i2 >= 28) {
            return Api28Impl.m7621a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m7616f() {
        int i = this.f23229a;
        if (i != -1) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f23230b;
        if (i2 >= 28) {
            return Api28Impl.m7623c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e3);
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Uri m7617g() {
        int i = this.f23229a;
        if (i != -1) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f23230b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f23230b;
        if (i2 >= 28) {
            return Api28Impl.m7624d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final InputStream m7618h(Context context) {
        Uri uriM7617g = m7617g();
        String scheme = uriM7617g.getScheme();
        if (FirebaseAnalytics.Param.CONTENT.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM7617g);
            } catch (Exception e) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM7617g, e);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f23230b));
        } catch (FileNotFoundException e2) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM7617g, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Icon m7619i(Context context) {
        Icon iconCreateWithBitmap;
        String strM7622b;
        int i = Build.VERSION.SDK_INT;
        switch (this.f23229a) {
            case -1:
                return (Icon) this.f23230b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f23230b);
                break;
            case 2:
                int i2 = this.f23229a;
                if (i2 == -1) {
                    int i3 = Build.VERSION.SDK_INT;
                    Object obj = this.f23230b;
                    if (i3 >= 28) {
                        strM7622b = Api28Impl.m7622b(obj);
                    } else {
                        try {
                            strM7622b = (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                            strM7622b = null;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                            strM7622b = null;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                            strM7622b = null;
                        }
                    }
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f23238j;
                    strM7622b = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f23230b).split(":", -1)[0] : this.f23238j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM7622b, this.f23233e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f23230b, this.f23233e, this.f23234f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f23230b);
                break;
            case 5:
                iconCreateWithBitmap = i < 26 ? Icon.createWithBitmap(m7611a((Bitmap) this.f23230b, false)) : Api26Impl.m7620a((Bitmap) this.f23230b);
                break;
            case 6:
                if (i >= 30) {
                    iconCreateWithBitmap = Api30Impl.m7625a(m7617g());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m7617g());
                    }
                    InputStream inputStreamM7618h = m7618h(context);
                    if (inputStreamM7618h == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m7617g());
                    }
                    if (i < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(m7611a(BitmapFactory.decodeStream(inputStreamM7618h), false));
                    } else {
                        iconCreateWithBitmap = Api26Impl.m7620a(BitmapFactory.decodeStream(inputStreamM7618h));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f23235g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f23236h;
        if (mode != f23228k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f23229a == -1) {
            return String.valueOf(this.f23230b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f23229a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f23229a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f23230b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f23230b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f23238j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m7615e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f23233e);
                if (this.f23234f != 0) {
                    sb.append(" off=");
                    sb.append(this.f23234f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f23230b);
                break;
        }
        if (this.f23235g != null) {
            sb.append(" tint=");
            sb.append(this.f23235g);
        }
        if (this.f23236h != f23228k) {
            sb.append(" mode=");
            sb.append(this.f23236h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.f23231c = null;
        this.f23232d = null;
        this.f23233e = 0;
        this.f23234f = 0;
        this.f23235g = null;
        this.f23236h = f23228k;
        this.f23237i = null;
        this.f23229a = i;
    }
}
