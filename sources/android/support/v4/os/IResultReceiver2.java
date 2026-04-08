package android.support.v4.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IResultReceiver2 extends IInterface {

    /* JADX INFO: renamed from: d */
    public static final String f55d = "android$support$v4$os$IResultReceiver2".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IResultReceiver2 {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class _Parcel {
    }

    /* JADX INFO: renamed from: o */
    void m139o();

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IResultReceiver2 {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IResultReceiver2 {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IResultReceiver2.f55d;
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
            parcel.readInt();
            m139o();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
