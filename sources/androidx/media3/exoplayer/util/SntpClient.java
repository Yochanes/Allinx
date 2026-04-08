package androidx.media3.exoplayer.util;

import android.os.SystemClock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SntpClient {

    /* JADX INFO: renamed from: a */
    public static final Object f27762a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f27763b = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean f27764c;

    /* JADX INFO: compiled from: Proguard */
    public interface InitializationCallback {
    }

    /* JADX INFO: renamed from: a */
    public static void m10683a() {
        byte b2;
        SocketTimeoutException socketTimeoutException;
        int i;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f27763b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b3 = 0;
            SocketTimeoutException socketTimeoutException2 = null;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i2], 123);
                bArr[b3] = Ascii.ESC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr, 40, 48, b3);
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    i = 40;
                } else {
                    long j = jCurrentTimeMillis / 1000;
                    b2 = b3;
                    socketTimeoutException = socketTimeoutException2;
                    i = 40;
                    bArr[40] = (byte) (r4 >> 24);
                    bArr[41] = (byte) (r4 >> 16);
                    bArr[42] = (byte) (r4 >> 8);
                    bArr[43] = (byte) (j + 2208988800L);
                    long j2 = ((jCurrentTimeMillis - (j * 1000)) * 4294967296L) / 1000;
                    bArr[44] = (byte) (j2 >> 24);
                    bArr[45] = (byte) (j2 >> 16);
                    bArr[46] = (byte) (j2 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    SystemClock.elapsedRealtime();
                    byte b4 = bArr[b2];
                    int i4 = bArr[1] & UnsignedBytes.MAX_VALUE;
                    m10686d(24, bArr);
                    m10686d(32, bArr);
                    m10684b((byte) ((b4 >> 6) & 3), (byte) (b4 & 7), i4, m10686d(i, bArr));
                    datagramSocket.close();
                    return;
                } catch (SocketTimeoutException e) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException2 = e;
                    } else {
                        SocketTimeoutException socketTimeoutException3 = socketTimeoutException;
                        socketTimeoutException3.addSuppressed(e);
                        socketTimeoutException2 = socketTimeoutException3;
                    }
                    int i5 = i3 + 1;
                    if (i3 >= 10) {
                        socketTimeoutException2.getClass();
                        throw socketTimeoutException2;
                    }
                    i2++;
                    i3 = i5;
                    b3 = b2;
                }
            }
            socketTimeoutException2.getClass();
            throw socketTimeoutException2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10684b(byte b2, byte b3, int i, long j) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            throw new IOException(AbstractC0000a.m9f(b3, "SNTP: Untrusted mode: "));
        }
        if (i == 0 || i > 15) {
            throw new IOException(AbstractC0000a.m9f(i, "SNTP: Untrusted stratum: "));
        }
        if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m10685c(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i2 = (i2 & 127) + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i3 = (i3 & 127) + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i4 = (i4 & 127) + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i5 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 128) {
            i5 = (i5 & 127) + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* JADX INFO: renamed from: d */
    public static long m10686d(int i, byte[] bArr) {
        long jM10685c = m10685c(i, bArr);
        long jM10685c2 = m10685c(i + 4, bArr);
        if (jM10685c == 0 && jM10685c2 == 0) {
            return 0L;
        }
        return ((jM10685c2 * 1000) / 4294967296L) + ((jM10685c - 2208988800L) * 1000);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NtpTimeLoadable implements Loader.Loadable {
        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        /* JADX INFO: renamed from: a */
        public final void mo10549a() {
            synchronized (SntpClient.f27762a) {
                Object obj = SntpClient.f27763b;
                synchronized (obj) {
                    if (SntpClient.f27764c) {
                        return;
                    }
                    SntpClient.m10683a();
                    synchronized (obj) {
                        SystemClock.elapsedRealtime();
                        SntpClient.f27764c = true;
                    }
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
        /* JADX INFO: renamed from: b */
        public final void mo10550b() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NtpTimeCallback implements Loader.Callback<Loader.Loadable> {
        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* JADX INFO: renamed from: d */
        public final Loader.LoadErrorAction mo10538d(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
            return Loader.f27724d;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* JADX INFO: renamed from: q */
        public final void mo10541q(Loader.Loadable loadable, long j, long j2) {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* JADX INFO: renamed from: u */
        public final void mo10542u(Loader.Loadable loadable, long j, long j2, boolean z2) {
        }
    }
}
