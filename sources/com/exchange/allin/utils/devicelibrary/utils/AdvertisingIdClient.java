package com.exchange.allin.utils.devicelibrary.utils;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class AdvertisingIdClient {

    /* JADX INFO: compiled from: Proguard */
    public static final class AdvertisingInterface implements IInterface {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AdvertisingConnection implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            throw null;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
