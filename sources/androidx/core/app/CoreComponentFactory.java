package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public class CoreComponentFactory extends android.app.AppComponentFactory {

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface CompatWrapped {
        /* JADX INFO: renamed from: a */
        Object m7402a();
    }

    /* JADX INFO: renamed from: a */
    public static Object m7401a(Object obj) {
        Object objM7402a;
        return (!(obj instanceof CompatWrapped) || (objM7402a = ((CompatWrapped) obj).m7402a()) == null) ? obj : objM7402a;
    }

    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m7401a(super.instantiateActivity(classLoader, str, intent));
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m7401a(super.instantiateApplication(classLoader, str));
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m7401a(super.instantiateProvider(classLoader, str));
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m7401a(super.instantiateReceiver(classLoader, str, intent));
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m7401a(super.instantiateService(classLoader, str, intent));
    }
}
