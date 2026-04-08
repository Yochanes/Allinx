package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {

    /* JADX INFO: renamed from: f */
    public static final String f23114f = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* JADX INFO: compiled from: Proguard */
    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    void mo7481r(boolean z2, boolean z3);

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        /* JADX INFO: compiled from: Proguard */
        public static class Proxy implements IUnusedAppRestrictionsBackportCallback {

            /* JADX INFO: renamed from: a */
            public IBinder f23115a;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f23115a;
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IUnusedAppRestrictionsBackportCallback.f23114f;
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
            mo7481r(parcel.readInt() != 0, parcel.readInt() != 0);
            throw null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}
