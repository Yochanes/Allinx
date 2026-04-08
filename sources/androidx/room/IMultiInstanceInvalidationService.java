package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.room.IMultiInstanceInvalidationCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IMultiInstanceInvalidationService extends IInterface {

    /* JADX INFO: renamed from: i */
    public static final String f31896i = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* JADX INFO: renamed from: q */
    void mo11795q(String[] strArr, int i);

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f31897a = 0;

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IMultiInstanceInvalidationService {

            /* JADX INFO: renamed from: a */
            public IBinder f31898a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f31898a;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            /* JADX INFO: renamed from: q */
            public final void mo11795q(String[] strArr, int i) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.f31896i);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f31898a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IMultiInstanceInvalidationService.f31896i;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            IMultiInstanceInvalidationCallback callback = null;
            IMultiInstanceInvalidationCallback callback2 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    ((MultiInstanceInvalidationService$binder$1) this).mo11795q(parcel.createStringArray(), parcel.readInt());
                    return true;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.f31894h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                        IMultiInstanceInvalidationCallback.Stub.Proxy proxy = new IMultiInstanceInvalidationCallback.Stub.Proxy();
                        proxy.f31895a = strongBinder;
                        callback2 = proxy;
                    } else {
                        callback2 = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
                    }
                }
                int i3 = parcel.readInt();
                Intrinsics.m18599g(callback2, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = ((MultiInstanceInvalidationService$binder$1) this).f31931b;
                synchronized (multiInstanceInvalidationService.f31929c) {
                    multiInstanceInvalidationService.f31929c.unregister(callback2);
                }
                parcel2.writeNoException();
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMultiInstanceInvalidationCallback.f31894h);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                    IMultiInstanceInvalidationCallback.Stub.Proxy proxy2 = new IMultiInstanceInvalidationCallback.Stub.Proxy();
                    proxy2.f31895a = strongBinder2;
                    callback = proxy2;
                } else {
                    callback = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface2;
                }
            }
            String string = parcel.readString();
            MultiInstanceInvalidationService$binder$1 multiInstanceInvalidationService$binder$1 = (MultiInstanceInvalidationService$binder$1) this;
            Intrinsics.m18599g(callback, "callback");
            int i4 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = multiInstanceInvalidationService$binder$1.f31931b;
                synchronized (multiInstanceInvalidationService2.f31929c) {
                    try {
                        int i5 = multiInstanceInvalidationService2.f31927a + 1;
                        multiInstanceInvalidationService2.f31927a = i5;
                        if (multiInstanceInvalidationService2.f31929c.register(callback, Integer.valueOf(i5))) {
                            multiInstanceInvalidationService2.f31928b.put(Integer.valueOf(i5), string);
                            i4 = i5;
                        } else {
                            multiInstanceInvalidationService2.f31927a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IMultiInstanceInvalidationService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        /* JADX INFO: renamed from: q */
        public final void mo11795q(String[] strArr, int i) {
        }
    }
}
