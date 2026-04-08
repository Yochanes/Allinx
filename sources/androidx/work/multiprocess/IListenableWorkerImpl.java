package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.work.multiprocess.IWorkManagerImplCallback;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IListenableWorkerImpl extends IInterface {

    /* JADX INFO: renamed from: j */
    public static final String f33191j = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    void m12337k();

    /* JADX INFO: renamed from: s */
    void m12338s();

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IListenableWorkerImpl {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IListenableWorkerImpl.f33191j;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                parcel.createByteArray();
                IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                m12337k();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.createByteArray();
            IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
            m12338s();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
