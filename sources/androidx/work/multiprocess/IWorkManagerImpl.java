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
public interface IWorkManagerImpl extends IInterface {

    /* JADX INFO: renamed from: k */
    public static final String f33192k = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    void m12339a();

    /* JADX INFO: renamed from: b */
    void m12340b();

    /* JADX INFO: renamed from: c */
    void m12341c();

    /* JADX INFO: renamed from: e */
    void m12342e();

    /* JADX INFO: renamed from: i */
    void m12343i();

    /* JADX INFO: renamed from: j */
    void m12344j();

    /* JADX INFO: renamed from: l */
    void m12345l();

    /* JADX INFO: renamed from: m */
    void m12346m();

    /* JADX INFO: renamed from: n */
    void m12347n();

    /* JADX INFO: renamed from: p */
    void m12348p();

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IWorkManagerImpl {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IWorkManagerImpl.f33192k;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12342e();
                    return true;
                case 2:
                    parcel.readString();
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12344j();
                    return true;
                case 3:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12347n();
                    return true;
                case 4:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12348p();
                    return true;
                case 5:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12340b();
                    return true;
                case 6:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12339a();
                    return true;
                case 7:
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12345l();
                    return true;
                case 8:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12343i();
                    return true;
                case 9:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12341c();
                    return true;
                case 10:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.m12349u(parcel.readStrongBinder());
                    m12346m();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
