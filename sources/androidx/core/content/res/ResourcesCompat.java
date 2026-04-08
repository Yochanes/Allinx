package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.RunnableC1407a;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.graphics.TypefaceCompat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ResourcesCompat {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f23171a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f23172b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c */
    public static final Object f23173c = new Object();

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ColorStateListCacheEntry {

        /* JADX INFO: renamed from: a */
        public final ColorStateList f23174a;

        /* JADX INFO: renamed from: b */
        public final Configuration f23175b;

        /* JADX INFO: renamed from: c */
        public final int f23176c;

        public ColorStateListCacheEntry(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f23174a = colorStateList;
            this.f23175b = configuration;
            this.f23176c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ColorStateListCacheKey {

        /* JADX INFO: renamed from: a */
        public final Resources f23177a;

        /* JADX INFO: renamed from: b */
        public final Resources.Theme f23178b;

        public ColorStateListCacheKey(Resources resources, Resources.Theme theme) {
            this.f23177a = resources;
            this.f23178b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ColorStateListCacheKey.class == obj.getClass()) {
                ColorStateListCacheKey colorStateListCacheKey = (ColorStateListCacheKey) obj;
                if (this.f23177a.equals(colorStateListCacheKey.f23177a) && Objects.equals(this.f23178b, colorStateListCacheKey.f23178b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f23177a, this.f23178b);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class FontCallback {
        @NonNull
        @RestrictTo
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo
        public final void callbackFailAsync(int i, @Nullable Handler handler) {
            getHandler(handler).post(new RunnableC1431a(i, 0, this));
        }

        @RestrictTo
        public final void callbackSuccessAsync(@NonNull Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new RunnableC1407a(1, this, typeface));
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ThemeCompat {

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api23Impl {

            /* JADX INFO: renamed from: a */
            public static final Object f23179a = new Object();

            /* JADX INFO: renamed from: b */
            public static Method f23180b;

            /* JADX INFO: renamed from: c */
            public static boolean f23181c;
        }

        /* JADX INFO: compiled from: Proguard */
        @RequiresApi
        public static class Api29Impl {
            /* JADX INFO: renamed from: a */
            public static void m7544a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void m7543a(Resources.Theme theme) {
            Method method;
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.m7544a(theme);
                return;
            }
            synchronized (Api23Impl.f23179a) {
                if (Api23Impl.f23181c) {
                    method = Api23Impl.f23180b;
                    if (method != null) {
                    }
                } else {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        Api23Impl.f23180b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                    }
                    Api23Impl.f23181c = true;
                    method = Api23Impl.f23180b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            Api23Impl.f23180b = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4.f23176c == r9.hashCode()) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m7540a(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateListM7533a;
        ColorStateList colorStateList;
        ColorStateListCacheEntry colorStateListCacheEntry;
        ColorStateListCacheKey colorStateListCacheKey = new ColorStateListCacheKey(resources, theme);
        synchronized (f23173c) {
            try {
                SparseArray sparseArray = (SparseArray) f23172b.get(colorStateListCacheKey);
                colorStateListM7533a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (colorStateListCacheEntry = (ColorStateListCacheEntry) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (colorStateListCacheEntry.f23175b.equals(resources.getConfiguration())) {
                        if (theme != null || colorStateListCacheEntry.f23176c != 0) {
                            if (theme != null) {
                            }
                        }
                        colorStateList = colorStateListCacheEntry.f23174a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } finally {
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f23171a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM7533a = ColorStateListInflaterCompat.m7533a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM7533a == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (f23173c) {
            try {
                WeakHashMap weakHashMap = f23172b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(colorStateListCacheKey);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(colorStateListCacheKey, sparseArray2);
                }
                sparseArray2.append(i, new ColorStateListCacheEntry(colorStateListM7533a, colorStateListCacheKey.f23177a.getConfiguration(), theme));
            } finally {
            }
        }
        return colorStateListM7533a;
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m7541b(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m7542c(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m7542c(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceM7575c = null;
        if (string.startsWith("res/")) {
            Typeface typeface = (Typeface) TypefaceCompat.f23209b.get(TypefaceCompat.m7577e(resources, i, string, typedValue.assetCookie, i2));
            if (typeface != null) {
                if (fontCallback != null) {
                    fontCallback.callbackSuccessAsync(typeface, null);
                }
                typefaceM7575c = typeface;
            } else if (!z3) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        FontResourcesParserCompat.FamilyResourceEntry familyResourceEntryM7537a = FontResourcesParserCompat.m7537a(resources.getXml(i), resources);
                        if (familyResourceEntryM7537a == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (fontCallback != null) {
                                fontCallback.callbackFailAsync(-3, null);
                            }
                        } else {
                            try {
                                typefaceM7575c = TypefaceCompat.m7575c(context, familyResourceEntryM7537a, resources, i, string, typedValue.assetCookie, i2, fontCallback, z2);
                            } catch (IOException e) {
                                e = e;
                                string = string;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                                if (fontCallback != null) {
                                    fontCallback.callbackFailAsync(-3, null);
                                }
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                string = string;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e);
                                if (fontCallback != null) {
                                }
                            }
                        }
                    } else {
                        Typeface typefaceM7576d = TypefaceCompat.m7576d(context, resources, i, string, typedValue.assetCookie, i2);
                        if (fontCallback != null) {
                            if (typefaceM7576d != null) {
                                fontCallback.callbackSuccessAsync(typefaceM7576d, null);
                            } else {
                                fontCallback.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceM7575c = typefaceM7576d;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (XmlPullParserException e4) {
                    e = e4;
                }
            }
        } else if (fontCallback != null) {
            fontCallback.callbackFailAsync(-3, null);
        }
        if (typefaceM7575c != null || fontCallback != null || z3) {
            return typefaceM7575c;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
