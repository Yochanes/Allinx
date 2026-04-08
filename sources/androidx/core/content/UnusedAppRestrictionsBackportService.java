package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportService$1 */
    /* JADX INFO: compiled from: Proguard */
    public class BinderC14271 extends IUnusedAppRestrictionsBackportService.Stub {
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        /* JADX INFO: renamed from: g */
        public final void mo7482g(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
            if (iUnusedAppRestrictionsBackportCallback != null) {
                throw null;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
