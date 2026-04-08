package com.engagelab.privates.common;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: com.engagelab.privates.common.i */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2481i extends AbstractC2477f {

    /* JADX INFO: renamed from: d */
    public SSLSocket f35136d;

    /* JADX INFO: renamed from: com.engagelab.privates.common.i$a */
    /* JADX INFO: compiled from: Proguard */
    public static class a implements X509TrustManager {

        /* JADX INFO: renamed from: a */
        public X509TrustManager f35137a;

        /* JADX INFO: renamed from: b */
        public X509Certificate f35138b;

        /* JADX INFO: renamed from: com.engagelab.privates.common.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        public static class C6440a extends CertificateException {
            public C6440a(String str) {
                super(AbstractC0000a.m13j("MyCertificateException:", str));
            }
        }

        public a(String str) throws C6440a {
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
                X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                byteArrayInputStream.close();
                this.f35138b = x509Certificate;
                KeyStore.TrustedCertificateEntry trustedCertificateEntry = new KeyStore.TrustedCertificateEntry(x509Certificate);
                KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setEntry("ca_root", trustedCertificateEntry, null);
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f35137a = (X509TrustManager) trustManager;
                        return;
                    }
                }
            } catch (Throwable th) {
                MTCommonLog.m13011e("SSLTrustManager", "init trustManager failed, error:" + th);
                throw new C6440a("SSLTrustManager init : " + th);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            MTCommonLog.m13010d("SSLTrustManager", "checkClientTrusted");
            this.f35137a.checkClientTrusted(x509CertificateArr, str);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            MTCommonLog.m13010d("SSLTrustManager", "checkServerTrusted");
            if (x509CertificateArr != null && x509CertificateArr.length != 0) {
                if (x509CertificateArr[0] != null) {
                    try {
                        for (X509Certificate x509Certificate : x509CertificateArr) {
                            x509Certificate.checkValidity();
                            x509Certificate.verify(this.f35138b.getPublicKey());
                        }
                        return;
                    } catch (InvalidKeyException e) {
                        MTCommonLog.m13011e("SSLTrustManager", ":checkServerTrusted: InvalidKeyException:" + e);
                        throw new C6440a("InvalidKeyException:" + e);
                    } catch (NoSuchAlgorithmException e2) {
                        MTCommonLog.m13011e("SSLTrustManager", ":checkServerTrusted: NoSuchAlgorithmException:" + e2);
                        throw new C6440a("NoSuchAlgorithmException:" + e2);
                    } catch (NoSuchProviderException e3) {
                        MTCommonLog.m13011e("SSLTrustManager", ":checkServerTrusted: NoSuchProviderException:" + e3);
                        throw new C6440a("NoSuchProviderException:" + e3);
                    } catch (SignatureException e4) {
                        MTCommonLog.m13011e("SSLTrustManager", ":checkServerTrusted: SignatureException:" + e4);
                        throw new C6440a("SignatureException:" + e4);
                    } catch (CertificateExpiredException e5) {
                        MTCommonLog.m13011e("SSLTrustManager", ":checkServerTrusted: CertificateExpiredException:" + e5);
                        throw new C6440a("CertificateExpiredException:" + e5);
                    } catch (CertificateNotYetValidException e6) {
                        MTCommonLog.m13011e("SSLTrustManager", ":checkServerTrusted: CertificateNotYetValidException:" + e6);
                        throw new C6440a("CertificateNotYetValidException:" + e6);
                    }
                }
            }
            throw new C6440a("Check Server x509Certificates is empty");
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            MTCommonLog.m13010d("SSLTrustManager", "getAcceptedIssuers");
            return this.f35137a.getAcceptedIssuers();
        }
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: a */
    public String mo12960a() {
        return "TcpSSLClient";
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: b */
    public boolean mo12970b(Context context, String str, int i) {
        SSLSocket sSLSocketM12982c = m12982c(context, str, i);
        if (sSLSocketM12982c == null) {
            MTCommonLog.m13010d("TcpSSLClient", "tcp connect fai");
            return false;
        }
        this.f35136d = sSLSocketM12982c;
        MTCommonLog.m13010d("TcpSSLClient", "tcp connect success");
        return true;
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: c */
    public List<String> mo12971c(Context context) {
        return m12983i(context);
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: d */
    public byte[] mo12973d(Context context) {
        try {
        } catch (IOException e) {
            MTCommonLog.m13013w("TcpSSLClient", "receive IOException " + e.getMessage());
            m12963a(context, true);
        } catch (Throwable th) {
            AbstractC2929c.m13709n("TcpSSLClient", new StringBuilder("receive failed "), th);
            m12963a(context, true);
        }
        if (!m12968b()) {
            MTCommonLog.m13010d("TcpSSLClient", "tcp is not connecting");
            return null;
        }
        if (!this.f35136d.isConnected()) {
            MTCommonLog.m13013w("TcpSSLClient", "socketChannel is disConnected");
            m12963a(context, true);
            return null;
        }
        if (m12968b()) {
            byte[] bArr = new byte[2];
            int i = this.f35136d.getInputStream().read(bArr);
            if (i < 0) {
                MTCommonLog.m13013w("TcpSSLClient", "read ahead length = " + i);
                m12963a(context, true);
                return null;
            }
            int i2 = ByteBuffer.wrap(bArr).getShort() & 16383;
            MTCommonLog.m13010d("TcpSSLClient", "read total length = " + i2);
            if (i2 == 0) {
                m12963a(context, true);
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2 - 2);
            while (byteBufferAllocate.hasRemaining()) {
                byte[] bArr2 = new byte[byteBufferAllocate.remaining()];
                int i3 = this.f35136d.getInputStream().read(bArr2);
                MTCommonLog.m13013w("TcpSSLClient", "read content length = " + i3);
                if (i3 <= 0) {
                    m12963a(context, true);
                    return null;
                }
                byteBufferAllocate.put(bArr2);
            }
            byte[] bArrArray = byteBufferAllocate.array();
            MTCommonLog.m13010d("TcpSSLClient", "read total contentBytes.length = " + bArrArray.length);
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, 0, bArr3, 0, 2);
            System.arraycopy(bArrArray, 0, bArr3, 2, bArrArray.length);
            return bArr3;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m12983i(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m12984j(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final Set<String> m12984j(Context context) {
        return C2485m.m13046o(context);
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: a */
    public void mo12961a(Context context) {
        try {
            MTCommonLog.m13010d("TcpSSLClient", "tcp disconnectImp");
            SSLSocket sSLSocket = this.f35136d;
            if (sSLSocket != null) {
                sSLSocket.close();
                this.f35136d = null;
            }
        } catch (Throwable th) {
            AbstractC2929c.m13709n("TcpSSLClient", new StringBuilder("disconnect failed "), th);
        }
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: c */
    public boolean mo12972c(Context context, byte[] bArr) throws IOException {
        SSLSocket sSLSocket = this.f35136d;
        if (sSLSocket == null || !sSLSocket.isConnected()) {
            return false;
        }
        this.f35136d.getOutputStream().write(bArr);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final SSLSocket m12982c(Context context, String str, int i) {
        SSLSocket sSLSocket = null;
        try {
            String strM13014a = C2485m.m13014a(context);
            if (TextUtils.isEmpty(strM13014a)) {
                MTCommonLog.m13011e("TcpSSLClient", "ssl cer is null");
                return null;
            }
            MTCommonLog.m13010d("TcpSSLClient", "host:" + str + ",port:" + i);
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, new TrustManager[]{m12981a(strM13014a)}, new SecureRandom());
            SSLSocket sSLSocket2 = (SSLSocket) sSLContext.getSocketFactory().createSocket(str, i);
            try {
                sSLSocket2.setKeepAlive(true);
                return sSLSocket2;
            } catch (SocketException e) {
                sSLSocket = sSLSocket2;
                e = e;
                MTCommonLog.m13011e("TcpSSLClient", "ssl SocketException:" + e.getMessage());
                return sSLSocket;
            } catch (UnknownHostException e2) {
                sSLSocket = sSLSocket2;
                e = e2;
                MTCommonLog.m13011e("TcpSSLClient", "ssl UnknownHostException:" + e.getMessage());
                return sSLSocket;
            } catch (IOException e3) {
                sSLSocket = sSLSocket2;
                e = e3;
                MTCommonLog.m13011e("TcpSSLClient", "ssl IOException:" + e.getMessage());
                return sSLSocket;
            } catch (KeyManagementException e4) {
                sSLSocket = sSLSocket2;
                e = e4;
                MTCommonLog.m13011e("TcpSSLClient", "ssl KeyManagementException:" + e.getMessage());
                return sSLSocket;
            } catch (NoSuchAlgorithmException e5) {
                sSLSocket = sSLSocket2;
                e = e5;
                MTCommonLog.m13011e("TcpSSLClient", "ssl NoSuchAlgorithmException:" + e.getMessage());
                return sSLSocket;
            } catch (CertificateException e6) {
                sSLSocket = sSLSocket2;
                e = e6;
                MTCommonLog.m13011e("TcpSSLClient", "ssl CertificateException:" + e.getMessage());
                return sSLSocket;
            }
        } catch (SocketException e7) {
            e = e7;
        } catch (UnknownHostException e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        } catch (KeyManagementException e10) {
            e = e10;
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
        } catch (CertificateException e12) {
            e = e12;
        }
    }

    /* JADX INFO: renamed from: a */
    public final TrustManager m12981a(String str) {
        return new a(str);
    }
}
