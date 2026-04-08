package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import com.engagelab.privates.core.constants.MTCoreConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class UdpDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final int f25906e;

    /* JADX INFO: renamed from: f */
    public final byte[] f25907f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f25908g;

    /* JADX INFO: renamed from: h */
    public Uri f25909h;

    /* JADX INFO: renamed from: i */
    public DatagramSocket f25910i;

    /* JADX INFO: renamed from: j */
    public MulticastSocket f25911j;

    /* JADX INFO: renamed from: k */
    public InetAddress f25912k;

    /* JADX INFO: renamed from: l */
    public boolean f25913l;

    /* JADX INFO: renamed from: m */
    public int f25914m;

    /* JADX INFO: compiled from: Proguard */
    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.f25906e = 8000;
        byte[] bArr = new byte[2000];
        this.f25907f = bArr;
        this.f25908g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25909h = null;
        MulticastSocket multicastSocket = this.f25911j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f25912k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f25911j = null;
        }
        DatagramSocket datagramSocket = this.f25910i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f25910i = null;
        }
        this.f25912k = null;
        this.f25914m = 0;
        if (this.f25913l) {
            this.f25913l = false;
            m9673l();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25909h;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws UdpDataSourceException {
        Uri uri = dataSpec.f25819a;
        this.f25909h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f25909h.getPort();
        m9674m(dataSpec);
        try {
            this.f25912k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f25912k, port);
            if (this.f25912k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f25911j = multicastSocket;
                multicastSocket.joinGroup(this.f25912k);
                this.f25910i = this.f25911j;
            } else {
                this.f25910i = new DatagramSocket(inetSocketAddress);
            }
            this.f25910i.setSoTimeout(this.f25906e);
            this.f25913l = true;
            m9675n(dataSpec);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSourceException(e, MTCoreConstants.MainWhat.ON_TCP_CONNECTED);
        } catch (SecurityException e2) {
            throw new UdpDataSourceException(e2, 2006);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f25914m;
        DatagramPacket datagramPacket = this.f25908g;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f25910i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f25914m = length;
                m9672k(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, MTCoreConstants.MainWhat.ON_TCP_CONNECTED);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f25914m;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f25907f, length2 - i4, bArr, i, iMin);
        this.f25914m -= iMin;
        return iMin;
    }
}
