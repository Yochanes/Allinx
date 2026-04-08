package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface INotificationSideChannel extends IInterface {

    /* JADX INFO: renamed from: c */
    public static final String f50c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class _Parcel {
    }

    /* JADX INFO: renamed from: f */
    void mo135f(String str);

    /* JADX INFO: renamed from: h */
    void mo136h(int i, String str, String str2);

    /* JADX INFO: renamed from: t */
    void mo137t(String str, int i, String str2, Notification notification);

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements INotificationSideChannel {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements INotificationSideChannel {

            /* JADX INFO: renamed from: a */
            public IBinder f51a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f51a;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            /* JADX INFO: renamed from: f */
            public final void mo135f(String str) {
                throw null;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            /* JADX INFO: renamed from: h */
            public final void mo136h(int i, String str, String str2) {
                throw null;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            /* JADX INFO: renamed from: t */
            public final void mo137t(String str, int i, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.f50c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(null);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.f51a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: u */
        public static INotificationSideChannel m138u(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.f50c);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) {
                return (INotificationSideChannel) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.f51a = iBinder;
            return proxy;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = INotificationSideChannel.f50c;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                mo137t(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
                throw null;
            }
            if (i == 2) {
                mo136h(parcel.readInt(), parcel.readString(), parcel.readString());
                throw null;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo135f(parcel.readString());
            throw null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements INotificationSideChannel {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* JADX INFO: renamed from: f */
        public final void mo135f(String str) {
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* JADX INFO: renamed from: h */
        public final void mo136h(int i, String str, String str2) {
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        /* JADX INFO: renamed from: t */
        public final void mo137t(String str, int i, String str2, Notification notification) {
        }
    }
}
