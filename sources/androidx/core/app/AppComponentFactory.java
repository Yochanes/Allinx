package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class AppComponentFactory extends android.app.AppComponentFactory {
    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Activity) CoreComponentFactory.m7401a((Activity) Class.forName(str, false, classLoader).asSubclass(Activity.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final Application instantiateApplication(ClassLoader classLoader, String str) {
        try {
            return (Application) CoreComponentFactory.m7401a((Application) Class.forName(str, false, classLoader).asSubclass(Application.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        try {
            return (ContentProvider) CoreComponentFactory.m7401a((ContentProvider) Class.forName(str, false, classLoader).asSubclass(ContentProvider.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (BroadcastReceiver) CoreComponentFactory.m7401a((BroadcastReceiver) Class.forName(str, false, classLoader).asSubclass(BroadcastReceiver.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        try {
            return (Service) CoreComponentFactory.m7401a((Service) Class.forName(str, false, classLoader).asSubclass(Service.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException("Couldn't call constructor", e);
        }
    }
}
