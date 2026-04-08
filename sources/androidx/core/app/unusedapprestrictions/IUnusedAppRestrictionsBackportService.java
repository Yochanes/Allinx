package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IUnusedAppRestrictionsBackportService extends IInterface {

    /* JADX INFO: renamed from: g */
    public static final String f23116g = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* JADX INFO: renamed from: g */
    void mo7482g(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback);

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IUnusedAppRestrictionsBackportService {

            /* JADX INFO: renamed from: a */
            public IBinder f23117a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f23117a;
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            /* JADX INFO: renamed from: g */
            public final void mo7482g(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnusedAppRestrictionsBackportService.f23116g);
                    parcelObtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.f23117a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: u */
        public static IUnusedAppRestrictionsBackportService m7483u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.f23116g);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) {
                return (IUnusedAppRestrictionsBackportService) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.f23117a = iBinder;
            return proxy;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback;
            String str = IUnusedAppRestrictionsBackportService.f23116g;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                iUnusedAppRestrictionsBackportCallback = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.f23114f);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) {
                    IUnusedAppRestrictionsBackportCallback.Stub.Proxy proxy = new IUnusedAppRestrictionsBackportCallback.Stub.Proxy();
                    proxy.f23115a = strongBinder;
                    iUnusedAppRestrictionsBackportCallback = proxy;
                } else {
                    iUnusedAppRestrictionsBackportCallback = (IUnusedAppRestrictionsBackportCallback) iInterfaceQueryLocalInterface;
                }
            }
            mo7482g(iUnusedAppRestrictionsBackportCallback);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        /* JADX INFO: renamed from: g */
        public final void mo7482g(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        }
    }
}
