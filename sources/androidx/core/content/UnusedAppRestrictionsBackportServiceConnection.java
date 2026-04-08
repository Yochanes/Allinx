package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public IUnusedAppRestrictionsBackportService f23123a;

    /* JADX INFO: renamed from: androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1 */
    /* JADX INFO: compiled from: Proguard */
    class BinderC14281 extends IUnusedAppRestrictionsBackportCallback.Stub {
        public BinderC14281() {
            attachInterface(this, IUnusedAppRestrictionsBackportCallback.f23114f);
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        /* JADX INFO: renamed from: r */
        public final void mo7481r(boolean z2, boolean z3) {
            UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection = UnusedAppRestrictionsBackportServiceConnection.this;
            if (!z2) {
                unusedAppRestrictionsBackportServiceConnection.getClass();
                throw null;
            }
            if (z3) {
                unusedAppRestrictionsBackportServiceConnection.getClass();
                throw null;
            }
            unusedAppRestrictionsBackportServiceConnection.getClass();
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportServiceM7483u = IUnusedAppRestrictionsBackportService.Stub.m7483u(iBinder);
        this.f23123a = iUnusedAppRestrictionsBackportServiceM7483u;
        try {
            iUnusedAppRestrictionsBackportServiceM7483u.mo7482g(new BinderC14281());
        } catch (RemoteException unused) {
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f23123a = null;
    }
}
