package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.collection.IndexBasedArrayIterator;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.appcompat.app.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0081a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f573a;

    public /* synthetic */ RunnableC0081a(Context context) {
        this.f573a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        LocaleListCompat localeListCompatM7652f;
        Object systemService;
        Context contextMo267e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            AppCompatDelegate.SerialExecutor serialExecutor = AppCompatDelegate.f391a;
            Context context = this.f573a;
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (i >= 33) {
                    Iterator it = AppCompatDelegate.f397i.iterator();
                    while (true) {
                        IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
                        if (!indexBasedArrayIterator.hasNext()) {
                            systemService = null;
                            break;
                        }
                        AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) indexBasedArrayIterator.next()).get();
                        if (appCompatDelegate != null && (contextMo267e = appCompatDelegate.mo267e()) != null) {
                            systemService = contextMo267e.getSystemService("locale");
                            break;
                        }
                    }
                    localeListCompatM7652f = systemService != null ? LocaleListCompat.m7652f(AppCompatDelegate.Api33Impl.m288a(systemService)) : LocaleListCompat.f23258b;
                    if (localeListCompatM7652f.m7654c()) {
                        String strM7398b = AppLocalesStorageHelper.m7398b(context);
                        Object systemService2 = context.getSystemService("locale");
                        if (systemService2 != null) {
                            AppCompatDelegate.Api33Impl.m289b(systemService2, AppCompatDelegate.Api24Impl.m287a(strM7398b));
                        }
                    }
                    context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                } else {
                    localeListCompatM7652f = AppCompatDelegate.f393c;
                    if (localeListCompatM7652f == null) {
                    }
                    if (localeListCompatM7652f.m7654c()) {
                    }
                    context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                }
            }
        }
        AppCompatDelegate.f396g = true;
    }
}
