package android.support.v4.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IResultReceiver extends IInterface {

    /* JADX INFO: renamed from: e */
    public static final String f52e = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IResultReceiver {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class _Parcel {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IResultReceiver {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f53a = 0;

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IResultReceiver {

            /* JADX INFO: renamed from: a */
            public IBinder f54a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f54a;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IResultReceiver.f52e;
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
            ResultReceiver.this.getClass();
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
