package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.exchange.allin.R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f660f;

    /* JADX INFO: renamed from: a */
    public int f661a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f662b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f663c;

    /* JADX INFO: renamed from: d */
    public Configuration f664d;

    /* JADX INFO: renamed from: e */
    public Resources f665e;

    public ContextThemeWrapper(Context context, int i) {
        super(context);
        this.f661a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m419a(Configuration configuration) {
        if (this.f665e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f664d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f664d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m420b() {
        if (this.f662b == null) {
            this.f662b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f662b.setTo(theme);
            }
        }
        this.f662b.applyStyle(this.f661a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f665e == null) {
            Configuration configuration = this.f664d;
            if (configuration == null) {
                this.f665e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f660f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f660f = configuration2;
                    }
                    if (configuration.equals(f660f)) {
                    }
                }
                this.f665e = createConfigurationContext(this.f664d).getResources();
            }
        }
        return this.f665e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f663c == null) {
            this.f663c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f663c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f662b;
        if (theme != null) {
            return theme;
        }
        if (this.f661a == 0) {
            this.f661a = R.style.Theme_AppCompat_Light;
        }
        m420b();
        return this.f662b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f661a != i) {
            this.f661a = i;
            m420b();
        }
    }
}
