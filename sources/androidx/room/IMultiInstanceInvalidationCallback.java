package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IMultiInstanceInvalidationCallback extends IInterface {

    /* JADX INFO: renamed from: h */
    public static final String f31894h = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: d */
    void mo11794d(String[] strArr);

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IMultiInstanceInvalidationCallback {

            /* JADX INFO: renamed from: a */
            public IBinder f31895a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f31895a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            /* JADX INFO: renamed from: d */
            public final void mo11794d(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.f31894h);
                    parcelObtain.writeStringArray(strArr);
                    this.f31895a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IMultiInstanceInvalidationCallback.f31894h;
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
            ((MultiInstanceInvalidationClient$callback$1) this).mo11794d(parcel.createStringArray());
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        /* JADX INFO: renamed from: d */
        public final void mo11794d(String[] strArr) {
        }
    }
}
