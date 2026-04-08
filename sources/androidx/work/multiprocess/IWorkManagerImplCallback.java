package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IWorkManagerImplCallback extends IInterface {

    /* JADX INFO: renamed from: l */
    public static final String f33193l = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    void onFailure();

    void onSuccess();

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IWorkManagerImplCallback {

            /* JADX INFO: renamed from: a */
            public IBinder f33194a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f33194a;
            }
        }

        /* JADX INFO: renamed from: u */
        public static IWorkManagerImplCallback m12349u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImplCallback.f33193l);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.f33194a = iBinder;
            return proxy;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IWorkManagerImplCallback.f33193l;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                parcel.createByteArray();
                onSuccess();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.readString();
            onFailure();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
