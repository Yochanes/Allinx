package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.CommandsCompletedListener {

    /* JADX INFO: renamed from: d */
    public static final String f32871d = Logger.m12101g("SystemAlarmService");

    /* JADX INFO: renamed from: b */
    public SystemAlarmDispatcher f32872b;

    /* JADX INFO: renamed from: c */
    public boolean f32873c;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.f32872b = systemAlarmDispatcher;
        if (systemAlarmDispatcher.f32862n != null) {
            Logger.m12100e().mo12104c(SystemAlarmDispatcher.f32853q, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            systemAlarmDispatcher.f32862n = this;
        }
        this.f32873c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f32873c = true;
        SystemAlarmDispatcher systemAlarmDispatcher = this.f32872b;
        systemAlarmDispatcher.getClass();
        Logger.m12100e().mo12102a(SystemAlarmDispatcher.f32853q, "Destroying SystemAlarmDispatcher");
        systemAlarmDispatcher.f32857d.m12122f(systemAlarmDispatcher);
        systemAlarmDispatcher.f32862n = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f32873c) {
            Logger.m12100e().mo12106f(f32871d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            SystemAlarmDispatcher systemAlarmDispatcher = this.f32872b;
            systemAlarmDispatcher.getClass();
            Logger loggerM12100e = Logger.m12100e();
            String str = SystemAlarmDispatcher.f32853q;
            loggerM12100e.mo12102a(str, "Destroying SystemAlarmDispatcher");
            systemAlarmDispatcher.f32857d.m12122f(systemAlarmDispatcher);
            systemAlarmDispatcher.f32862n = null;
            SystemAlarmDispatcher systemAlarmDispatcher2 = new SystemAlarmDispatcher(this);
            this.f32872b = systemAlarmDispatcher2;
            if (systemAlarmDispatcher2.f32862n != null) {
                Logger.m12100e().mo12104c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                systemAlarmDispatcher2.f32862n = this;
            }
            this.f32873c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f32872b.m12173a(i2, intent);
        return 3;
    }
}
