package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationChannelCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* JADX INFO: renamed from: d */
    public static String f23059d;

    /* JADX INFO: renamed from: g */
    public static SideChannelManager f23062g;

    /* JADX INFO: renamed from: a */
    public final Context f23063a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f23064b;

    /* JADX INFO: renamed from: c */
    public static final Object f23058c = new Object();

    /* JADX INFO: renamed from: e */
    public static HashSet f23060e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f23061f = new Object();

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static void m7468a(NotificationManager notificationManager, ArrayList arrayList) {
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CancelTask implements Task {
        @Override // androidx.core.app.NotificationManagerCompat.Task
        /* JADX INFO: renamed from: a */
        public final void mo7469a(INotificationSideChannel iNotificationSideChannel) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface InterruptionFilter {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class NotificationWithIdAndTag {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class NotifyTask implements Task {

        /* JADX INFO: renamed from: a */
        public final String f23065a;

        /* JADX INFO: renamed from: b */
        public final int f23066b;

        /* JADX INFO: renamed from: c */
        public final Notification f23067c;

        public NotifyTask(String str, int i, Notification notification) {
            this.f23065a = str;
            this.f23066b = i;
            this.f23067c = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        /* JADX INFO: renamed from: a */
        public final void mo7469a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.mo137t(this.f23065a, this.f23066b, null, this.f23067c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.f23065a);
            sb.append(", id:");
            return AbstractC0000a.m11h(this.f23066b, ", tag:null]", sb);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ServiceConnectedEvent {

        /* JADX INFO: renamed from: a */
        public final ComponentName f23068a;

        /* JADX INFO: renamed from: b */
        public final IBinder f23069b;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.f23068a = componentName;
            this.f23069b = iBinder;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SideChannelManager implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final Context f23070a;

        /* JADX INFO: renamed from: b */
        public final Handler f23071b;

        /* JADX INFO: renamed from: c */
        public final HashMap f23072c = new HashMap();

        /* JADX INFO: renamed from: d */
        public HashSet f23073d = new HashSet();

        /* JADX INFO: compiled from: Proguard */
        public static class ListenerRecord {

            /* JADX INFO: renamed from: a */
            public final ComponentName f23074a;

            /* JADX INFO: renamed from: c */
            public INotificationSideChannel f23076c;

            /* JADX INFO: renamed from: b */
            public boolean f23075b = false;

            /* JADX INFO: renamed from: d */
            public final ArrayDeque f23077d = new ArrayDeque();

            /* JADX INFO: renamed from: e */
            public int f23078e = 0;

            public ListenerRecord(ComponentName componentName) {
                this.f23074a = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.f23070a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f23071b = new Handler(handlerThread.getLooper(), this);
        }

        /* JADX INFO: renamed from: a */
        public final void m7470a(ListenerRecord listenerRecord) {
            boolean z2;
            ArrayDeque arrayDeque;
            boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = listenerRecord.f23074a;
            if (zIsLoggable) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + listenerRecord.f23077d.size() + " queued tasks");
            }
            if (listenerRecord.f23077d.isEmpty()) {
                return;
            }
            if (listenerRecord.f23075b) {
                z2 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f23070a;
                boolean zBindService = context.bindService(component, this, 33);
                listenerRecord.f23075b = zBindService;
                if (zBindService) {
                    listenerRecord.f23078e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z2 = listenerRecord.f23075b;
            }
            if (!z2 || listenerRecord.f23076c == null) {
                m7471b(listenerRecord);
                return;
            }
            while (true) {
                arrayDeque = listenerRecord.f23077d;
                Task task = (Task) arrayDeque.peek();
                if (task == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + task);
                    }
                    task.mo7469a(listenerRecord.f23076c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            m7471b(listenerRecord);
        }

        /* JADX INFO: renamed from: b */
        public final void m7471b(ListenerRecord listenerRecord) {
            Handler handler = this.f23071b;
            ComponentName componentName = listenerRecord.f23074a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = listenerRecord.f23078e;
            int i2 = i + 1;
            listenerRecord.f23078e = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
                return;
            }
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = listenerRecord.f23077d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(listenerRecord.f23078e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i = message.what;
            if (i == 0) {
                Task task = (Task) message.obj;
                Context context = this.f23070a;
                Object obj = NotificationManagerCompat.f23058c;
                String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                synchronized (NotificationManagerCompat.f23058c) {
                    if (string != null) {
                        try {
                            if (!string.equals(NotificationManagerCompat.f23059d)) {
                                String[] strArrSplit = string.split(":", -1);
                                HashSet hashSet2 = new HashSet(strArrSplit.length);
                                for (String str : strArrSplit) {
                                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                    if (componentNameUnflattenFromString != null) {
                                        hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                    }
                                }
                                NotificationManagerCompat.f23060e = hashSet2;
                                NotificationManagerCompat.f23059d = string;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    hashSet = NotificationManagerCompat.f23060e;
                }
                if (!hashSet.equals(this.f23073d)) {
                    this.f23073d = hashSet;
                    List<ResolveInfo> listQueryIntentServices = this.f23070a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet3 = new HashSet();
                    for (ResolveInfo resolveInfo : listQueryIntentServices) {
                        if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet3.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet3) {
                        if (!this.f23072c.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            this.f23072c.put(componentName2, new ListenerRecord(componentName2));
                        }
                    }
                    Iterator it = this.f23072c.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!hashSet3.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                            }
                            ListenerRecord listenerRecord = (ListenerRecord) entry.getValue();
                            if (listenerRecord.f23075b) {
                                this.f23070a.unbindService(this);
                                listenerRecord.f23075b = false;
                            }
                            listenerRecord.f23076c = null;
                            it.remove();
                        }
                    }
                }
                for (ListenerRecord listenerRecord2 : this.f23072c.values()) {
                    listenerRecord2.f23077d.add(task);
                    m7470a(listenerRecord2);
                }
            } else if (i == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                ComponentName componentName3 = serviceConnectedEvent.f23068a;
                IBinder iBinder = serviceConnectedEvent.f23069b;
                ListenerRecord listenerRecord3 = (ListenerRecord) this.f23072c.get(componentName3);
                if (listenerRecord3 != null) {
                    listenerRecord3.f23076c = INotificationSideChannel.Stub.m138u(iBinder);
                    listenerRecord3.f23078e = 0;
                    m7470a(listenerRecord3);
                    return true;
                }
            } else if (i == 2) {
                ListenerRecord listenerRecord4 = (ListenerRecord) this.f23072c.get((ComponentName) message.obj);
                if (listenerRecord4 != null) {
                    if (listenerRecord4.f23075b) {
                        this.f23070a.unbindService(this);
                        listenerRecord4.f23075b = false;
                    }
                    listenerRecord4.f23076c = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                ListenerRecord listenerRecord5 = (ListenerRecord) this.f23072c.get((ComponentName) message.obj);
                if (listenerRecord5 != null) {
                    m7470a(listenerRecord5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f23071b.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f23071b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Task {
        /* JADX INFO: renamed from: a */
        void mo7469a(INotificationSideChannel iNotificationSideChannel);
    }

    public NotificationManagerCompat(Context context) {
        this.f23063a = context;
        this.f23064b = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: a */
    public final void m7466a(List list) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannelCompat notificationChannelCompat = (NotificationChannelCompat) it.next();
            if (Build.VERSION.SDK_INT < 26) {
                notificationChannelCompat.getClass();
                notificationChannel = null;
            } else {
                NotificationChannel notificationChannelM7408a = NotificationChannelCompat.Api26Impl.m7408a(notificationChannelCompat.f22975c, notificationChannelCompat.f22973a, notificationChannelCompat.f22974b);
                NotificationChannelCompat.Api26Impl.m7411d(notificationChannelM7408a, notificationChannelCompat.f22976d);
                NotificationChannelCompat.Api26Impl.m7412e(notificationChannelM7408a);
                NotificationChannelCompat.Api26Impl.m7414g(notificationChannelM7408a);
                NotificationChannelCompat.Api26Impl.m7415h(notificationChannelM7408a, notificationChannelCompat.f22977e, notificationChannelCompat.f22978f);
                NotificationChannelCompat.Api26Impl.m7409b(notificationChannelM7408a);
                NotificationChannelCompat.Api26Impl.m7413f(notificationChannelM7408a);
                NotificationChannelCompat.Api26Impl.m7416i(notificationChannelM7408a);
                NotificationChannelCompat.Api26Impl.m7410c(notificationChannelM7408a);
                notificationChannel = notificationChannelM7408a;
            }
            arrayList.add(notificationChannel);
        }
        Api26Impl.m7468a(this.f23064b, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m7467b(int i, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f23064b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        NotifyTask notifyTask = new NotifyTask(this.f23063a.getPackageName(), i, notification);
        synchronized (f23061f) {
            try {
                if (f23062g == null) {
                    f23062g = new SideChannelManager(this.f23063a.getApplicationContext());
                }
                f23062g.f23071b.obtainMessage(0, notifyTask).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
}
