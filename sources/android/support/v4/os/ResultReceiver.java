package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C00261();

    /* JADX INFO: renamed from: a */
    public IResultReceiver f56a;

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C00261 implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            IResultReceiver iResultReceiver;
            ResultReceiver resultReceiver = new ResultReceiver();
            IBinder strongBinder = parcel.readStrongBinder();
            int i = IResultReceiver.Stub.f53a;
            if (strongBinder == null) {
                iResultReceiver = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IResultReceiver.f52e);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver)) {
                    IResultReceiver.Stub.Proxy proxy = new IResultReceiver.Stub.Proxy();
                    proxy.f54a = strongBinder;
                    iResultReceiver = proxy;
                } else {
                    iResultReceiver = (IResultReceiver) iInterfaceQueryLocalInterface;
                }
            }
            resultReceiver.f56a = iResultReceiver;
            return resultReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
            attachInterface(this, IResultReceiver.f52e);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class MyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f56a == null) {
                    this.f56a = new MyResultReceiver();
                }
                parcel.writeStrongBinder(this.f56a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
