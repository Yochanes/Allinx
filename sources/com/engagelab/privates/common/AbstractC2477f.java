package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.observer.MTObservable;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.common.utils.AESUtil;
import com.engagelab.privates.common.utils.SM4Util;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.api.Outputer;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.engagelab.privates.common.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2477f {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap<MTProtocol, String> f35130a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public boolean f35131b;

    /* JADX INFO: renamed from: c */
    public boolean f35132c;

    /* JADX INFO: renamed from: a */
    public abstract String mo12960a();

    /* JADX INFO: renamed from: a */
    public abstract void mo12961a(Context context);

    /* JADX INFO: renamed from: a */
    public final boolean m12964a(Context context, String str, int i) {
        try {
        } catch (Throwable th) {
            AbstractC2929c.m13709n(mo12960a(), new StringBuilder("tcp connect failed "), th);
            m12963a(context, false);
        }
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.m13011e(mo12960a(), "can't connect, network is disConnected");
            return false;
        }
        MTCommonLog.m13010d(mo12960a(), "tcp connect " + str + ":" + i);
        if (mo12970b(context, str, i)) {
            MTCommonLog.m13010d(mo12960a(), "tcp connect success");
            this.f35131b = true;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12969b(Context context) {
        MTProtocol threadName = new MTProtocol().setRid(MTCoreGlobal.getRid()).setCommand(1).setVersion(23).setBody(C2486n.m13059d(context)).setThreadName(MTCore.f35176c);
        if (threadName == null) {
            MTCommonLog.m13013w(mo12960a(), "login failed, send request failed");
            return false;
        }
        MTCommonLog.m13010d(mo12960a(), "send " + threadName.toString());
        m12967b(context, m12965a(context, threadName));
        MTProtocol mTProtocolM12959a = m12959a(context, mo12973d(context));
        if (mTProtocolM12959a == null) {
            MTCommonLog.m13013w(mo12960a(), "login failed, receive response failed");
            return false;
        }
        MTCommonLog.m13010d(mo12960a(), "receive " + mTProtocolM12959a.toString());
        if (C2486n.m13051a(context, mTProtocolM12959a.getBody()) != 0) {
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
            return false;
        }
        C2467a.m12880a().m12881a(context);
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("get_http_address", (ArrayList) MTCoreGlobal.getHttpAddress(context));
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_CONNECTED, bundle);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_CONNECTED, null);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo12970b(Context context, String str, int i);

    /* JADX INFO: renamed from: c */
    public abstract List<String> mo12971c(Context context);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo12972c(Context context, byte[] bArr);

    /* JADX INFO: renamed from: d */
    public abstract byte[] mo12973d(Context context);

    /* JADX INFO: renamed from: e */
    public final void m12974e(Context context) {
        byte[] bArrMo12973d;
        MTCommonLog.m13010d(mo12960a(), "receiving......");
        while (this.f35131b && (bArrMo12973d = mo12973d(context)) != null) {
            MTProtocol mTProtocolM12959a = m12959a(context, bArrMo12973d);
            if (mTProtocolM12959a == null) {
                MTCommonLog.m13010d(mo12960a(), "parseResponse failed");
            } else {
                m12966b(context, mTProtocolM12959a);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12975f(Context context) {
        long jM13049r = C2485m.m13049r(context);
        String strM13041j = C2485m.m13041j(context);
        String strM13038g = C2485m.m13038g(context);
        MTCommonLog.m13010d(mo12960a(), "register uid:" + jM13049r + ",rid:" + strM13041j + ",password:" + strM13038g);
        if (jM13049r > 0 && !TextUtils.isEmpty(strM13041j) && !TextUtils.isEmpty(strM13038g)) {
            return true;
        }
        MTProtocol threadName = new MTProtocol().setRid(MTCoreGlobal.getRid()).setCommand(0).setVersion(19).setBody(C2486n.m13060e(context)).setThreadName(MTCore.f35176c);
        if (threadName == null) {
            MTCommonLog.m13013w(mo12960a(), "register failed, send request failed");
            return false;
        }
        MTCommonLog.m13010d(mo12960a(), "send " + threadName.toString());
        m12967b(context, m12965a(context, threadName));
        MTProtocol mTProtocolM12959a = m12959a(context, mo12973d(context));
        if (mTProtocolM12959a == null) {
            MTCommonLog.m13013w(mo12960a(), "register failed, receive response failed");
            return false;
        }
        MTCommonLog.m13010d(mo12960a(), "receive " + mTProtocolM12959a.toString());
        if (C2486n.m13054b(context, mTProtocolM12959a.getBody()) == 0) {
            C2467a.m12880a().m12883b(context);
            return true;
        }
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m12976g(Context context) {
        this.f35132c = true;
        if (this.f35131b) {
            MTCommonLog.m13010d(mo12960a(), "can't connect, isTcpConnecting");
            return;
        }
        this.f35131b = true;
        List<String> listMo12971c = mo12971c(context);
        if (listMo12971c.isEmpty()) {
            MTCommonLog.m13013w(mo12960a(), "there are no tcp connect address");
            m12963a(context, false);
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(listMo12971c);
        int connectRetryCount = MTCoreGlobal.getConnectRetryCount();
        boolean z2 = false;
        for (int i = 0; i < connectRetryCount; i++) {
            MTCommonLog.m13010d(mo12960a(), "connect retry count is " + i);
            for (String str : arrayList) {
                if (!C2485m.m13029c(context)) {
                    MTCommonLog.m13010d(mo12960a(), "can't connect ,connect state is false");
                    return;
                }
                if (!this.f35132c) {
                    MTCommonLog.m13010d(mo12960a(), "can't connect ,tcp state is false");
                    return;
                }
                String[] strArrSplit = str.split(":");
                String str2 = strArrSplit[strArrSplit.length - 1];
                if (m12964a(context, str.substring(0, (str.length() - str2.length()) - 1), Integer.parseInt(str2))) {
                    if (m12975f(context) && m12969b(context)) {
                        m12974e(context);
                    } else {
                        m12963a(context, false);
                    }
                    z2 = false;
                } else {
                    m12963a(context, false);
                    z2 = true;
                }
            }
        }
        if (z2) {
            MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12977h(Context context) {
        this.f35132c = false;
        m12963a(context, false);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED, null);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_TCP_DISCONNECTED, null);
    }

    /* JADX INFO: renamed from: a */
    public void m12962a(Context context, Bundle bundle) {
        try {
            if (bundle == null) {
                MTCommonLog.m13010d(mo12960a(), "can't send, bundle is null");
                return;
            }
            if (bundle.containsKey("data")) {
                if (this.f35131b && SystemUtil.isNetworkConnecting(context)) {
                    m12967b(context, bundle.getByteArray("data"));
                    return;
                }
                MTCommonLog.m13010d(mo12960a(), "can't send data, tcp is not connected");
                m12963a(context, false);
                return;
            }
            bundle.setClassLoader(MTProtocol.class.getClassLoader());
            MTProtocol mTProtocol = (MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL);
            if (!SystemUtil.isNetworkConnecting(context)) {
                MTCommonLog.m13010d(mo12960a(), "can't send command:" + mTProtocol.getCommand() + ", network is disConnected");
                m12963a(context, false);
                MTCommonPrivatesApi.sendMessageDelayed(context, mTProtocol.getThreadName(), mTProtocol.getCommand(), bundle, 0L);
                return;
            }
            if (!this.f35131b) {
                MTCommonLog.m13010d(mo12960a(), "can't send command:" + mTProtocol.getCommand() + ", tcp is disConnected");
                m12963a(context, false);
                MTCommonPrivatesApi.sendMessageDelayed(context, mTProtocol.getThreadName(), mTProtocol.getCommand(), bundle, 0L);
                return;
            }
            if (mTProtocol.getRid() == 0) {
                mTProtocol.setRid(MTCoreGlobal.getRid());
            }
            MTCommonLog.m13010d(mo12960a(), "send " + mTProtocol.toString());
            String threadName = mTProtocol.getThreadName();
            byte[] bArrM12965a = m12965a(context, mTProtocol);
            if (bArrM12965a == null) {
                return;
            }
            m12967b(context, bArrM12965a);
            if (TextUtils.isEmpty(threadName)) {
                return;
            }
            this.f35130a.put(mTProtocol, threadName);
            MTCommonPrivatesApi.sendMessageDelayed(context, threadName, mTProtocol.getCommand(), bundle, 10000L);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(mo12960a(), new StringBuilder("send failed "), th);
            m12963a(context, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12967b(Context context, byte[] bArr) {
        try {
            if (!this.f35131b) {
                MTCommonLog.m13010d(mo12960a(), "can't send, tcp is not connected");
                return;
            }
            boolean zMo12972c = mo12972c(context, bArr);
            MTCommonLog.m13010d(mo12960a(), "sendImp :" + zMo12972c);
        } catch (IOException e) {
            String message = e.getMessage();
            MTCommonLog.m13013w(mo12960a(), "send IOException " + message);
            if (message != null && message.startsWith("MyCertificateException:")) {
                C2485m.m13016a(context, -1);
            }
            m12963a(context, true);
        } catch (NotYetConnectedException e2) {
            MTCommonLog.m13013w(mo12960a(), "send NotYetConnectedException " + e2.getMessage());
            m12963a(context, true);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(mo12960a(), new StringBuilder("send throwable "), th);
            m12963a(context, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12966b(Context context, MTProtocol mTProtocol) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, mTProtocol);
        Iterator<MTProtocol> it = this.f35130a.keySet().iterator();
        while (it.hasNext()) {
            MTProtocol next = it.next();
            if (next.getRid() == mTProtocol.getRid()) {
                String str = this.f35130a.get(next);
                mTProtocol.setThreadName(str);
                MTCommonLog.m13010d(mo12960a(), "receive " + mTProtocol.toString());
                it.remove();
                MTCommonPrivatesApi.removeMessages(context, str, next.getCommand());
                MTCommonPrivatesApi.sendMessage(context, str, mTProtocol.getCommand(), bundle);
                return;
            }
        }
        for (MTObserver mTObserver : MTObservable.getInstance().observeQueue) {
            if (mTObserver.isSupport(mTProtocol.getCommand())) {
                String str2 = mTObserver.getThreadName()[0];
                mTProtocol.setThreadName(str2);
                MTCommonLog.m13010d(mo12960a(), "receive " + mTProtocol.toString());
                MTCommonPrivatesApi.sendMessage(context, str2, mTProtocol.getCommand(), bundle);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12963a(Context context, boolean z2) {
        MTCommonLog.m13010d(mo12960a(), "tcp disconnect");
        this.f35131b = false;
        MTCommonPrivatesApi.removeMessages(context, MTCore.f35174a, MTCoreConstants.RemoteWhat.START_HEARTBEAT);
        try {
            mo12961a(context);
        } catch (Throwable th) {
            AbstractC2929c.m13709n(mo12960a(), new StringBuilder("disconnect failed "), th);
        }
        if (z2) {
            MTCommonLog.m13010d(mo12960a(), "tcp retry connect");
            if (!SystemUtil.isNetworkConnecting(context)) {
                MTCommonLog.m13010d(mo12960a(), "tcp retry connect not has net");
                return;
            }
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
            String str = MTCore.f35174a;
            MTCommonPrivatesApi.removeMessages(context, str, MTCoreConstants.RemoteWhat.RETRY_CONNECT);
            MTCommonPrivatesApi.sendMessageDelayed(context, str, MTCoreConstants.RemoteWhat.RETRY_CONNECT, null, 2000L);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m12968b() {
        return this.f35131b;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m12965a(Context context, MTProtocol mTProtocol) {
        try {
            int command = mTProtocol.getCommand();
            int version = mTProtocol.getVersion();
            long jM13049r = C2485m.m13049r(context);
            int iM13042k = C2485m.m13042k(context);
            long rid = mTProtocol.getRid();
            int encryptType = MTGlobal.getEncryptType();
            Outputer outputer = new Outputer(27);
            outputer.writeU8(27);
            outputer.writeU8(1);
            outputer.writeU8(command ^ 90);
            outputer.writeU8(version ^ 90);
            outputer.writeU64(jM13049r ^ 6510615555426900570L);
            outputer.writeU32(iM13042k);
            outputer.writeU64(rid ^ 6510615555426900570L);
            outputer.writeU16(0);
            outputer.writeU8(encryptType);
            byte[] byteArray = outputer.toByteArray();
            byte[] body = mTProtocol.getBody();
            String md5AesKey = AESUtil.getMd5AesKey(C2485m.m13049r(context));
            if (encryptType == 2) {
                body = SM4Util.encryptBytes(body, md5AesKey, md5AesKey.substring(0, 16));
            }
            int length = body.length;
            int i = length + 29;
            byte[] bArr = body;
            byte b2 = (byte) ((i >>> 8) & 255);
            byte[] bArr2 = {b2, (byte) (i & 255)};
            byte b3 = (byte) (b2 | UnsignedBytes.MAX_POWER_OF_TWO);
            bArr2[0] = b3;
            bArr2[0] = (byte) (b3 | SignedBytes.MAX_POWER_OF_TWO);
            MTCommonLog.m13010d(mo12960a(), "send ahead length:2, encryption:1, expand:1, totalLength:" + i);
            MTCommonLog.m13010d(mo12960a(), "send head  length:27, headVersion:1, command:" + command + ", version:" + version + ", uid:" + jM13049r + ", rid:" + rid + ", crc16:0, encrypt:" + encryptType);
            String strMo12960a = mo12960a();
            StringBuilder sb = new StringBuilder("send body  length:");
            sb.append(length);
            MTCommonLog.m13010d(strMo12960a, sb.toString());
            byte[] bArr3 = new byte[i];
            System.arraycopy(bArr2, 0, bArr3, 0, 2);
            System.arraycopy(byteArray, 0, bArr3, 2, 27);
            System.arraycopy(bArr, 0, bArr3, 29, length);
            return bArr3;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final MTProtocol m12959a(Context context, byte[] bArr) {
        byte b2;
        byte b3;
        if (bArr == null) {
            return null;
        }
        try {
            MTProtocol mTProtocol = new MTProtocol();
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, 0, bArr2, 0, 2);
            short s = ByteBuffer.wrap(bArr2).getShort();
            int i = (s >>> 15) & 1;
            int i2 = (s >>> 14) & 1;
            int i3 = s & 16383;
            MTCommonLog.m13010d(mo12960a(), "receive ahead length:2, encryption:" + i + ", expand:" + i2 + ", totalLength:" + i3);
            int i4 = i3 + (-2);
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr, 2, bArr3, 0, i4);
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr3);
            if (i2 == 1) {
                b2 = byteBufferWrap.get();
                b3 = byteBufferWrap.get();
            } else {
                b2 = Ascii.DC4;
                b3 = 0;
            }
            int i5 = byteBufferWrap.get() ^ 90;
            int i6 = byteBufferWrap.get() ^ 90;
            long j = byteBufferWrap.getLong() ^ 6510615555426900570L;
            long j2 = byteBufferWrap.getLong() ^ 6510615555426900570L;
            short s2 = byteBufferWrap.getShort();
            byte b4 = (i2 == 1 && b3 == 1) ? byteBufferWrap.get() : (byte) 2;
            mTProtocol.setCommand(i5);
            mTProtocol.setVersion(i6);
            mTProtocol.setRid(j2);
            MTCommonLog.m13010d(mo12960a(), "receive head  length:" + ((int) b2) + ", headVersion:" + ((int) b3) + ", command:" + i5 + ", version:" + i6 + ", uid:" + j + ", rid:" + j2 + ", crc16:" + ((int) s2) + ", encrypt:" + ((int) b4));
            int i7 = (i3 - b2) + (-2);
            byte[] bArrDecryptBytes = new byte[i7];
            System.arraycopy(bArr3, b2, bArrDecryptBytes, 0, i7);
            String md5AesKey = AESUtil.getMd5AesKey(C2485m.m13049r(context));
            if (b4 == 2) {
                bArrDecryptBytes = SM4Util.decryptBytes(bArrDecryptBytes, md5AesKey);
            }
            mTProtocol.setBody(bArrDecryptBytes);
            MTCommonLog.m13010d(mo12960a(), "receive body  length:" + i7 + ", decryptBodyLength:" + bArrDecryptBytes.length);
            return mTProtocol;
        } catch (Throwable unused) {
            return null;
        }
    }
}
