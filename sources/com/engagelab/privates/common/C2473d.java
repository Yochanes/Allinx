package com.engagelab.privates.common;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.MTCore;
import com.engagelab.privates.core.api.MTProtocol;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.core.global.MTCoreGlobal;
import java.nio.ByteBuffer;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: com.engagelab.privates.common.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2473d {

    /* JADX INFO: renamed from: d */
    public static volatile C2473d f35125d;

    /* JADX INFO: renamed from: a */
    public final C2482j f35126a = new C2482j();

    /* JADX INFO: renamed from: b */
    public final AbstractC2477f f35127b = C2480h.m12980a();

    /* JADX INFO: renamed from: c */
    public int f35128c = 0;

    /* JADX INFO: renamed from: a */
    public static C2473d m12935a() {
        if (f35125d == null) {
            synchronized (C2473d.class) {
                try {
                    if (f35125d == null) {
                        f35125d = new C2473d();
                    }
                } finally {
                }
            }
        }
        return f35125d;
    }

    /* JADX INFO: renamed from: b */
    public void m12939b(Context context, Bundle bundle) {
        this.f35127b.m12962a(context, bundle);
    }

    /* JADX INFO: renamed from: c */
    public void m12941c(Context context) {
        MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
        if (commonReceiver == null) {
            return;
        }
        commonReceiver.onConnectStatus(context, false);
    }

    /* JADX INFO: renamed from: d */
    public void m12942d(Context context) {
        if (!C2485m.m13029c(context)) {
            MTCommonLog.m13013w("MTConnectBusiness", "connect state is false, can't startConnect");
            return;
        }
        C2484l.m13009c(context);
        MTCommonLog.m13010d("MTConnectBusiness", "startConnect");
        this.f35126a.m12996d(context);
        this.f35127b.m12976g(context);
    }

    /* JADX INFO: renamed from: e */
    public void m12943e(Context context) {
        MTCommonLog.m13010d("MTConnectBusiness", "startHeartbeat");
        String str = MTCore.f35174a;
        MTCommonPrivatesApi.sendMessageDelayed(context, str, MTCoreConstants.RemoteWhat.START_HEARTBEAT, null, MTCoreGlobal.getHeartbeatInterval());
        MTProtocol threadName = new MTProtocol().setCommand(2).setVersion(4).setBody(C2486n.m13058c(context)).setThreadName(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL, threadName);
        m12939b(context, bundle);
    }

    /* JADX INFO: renamed from: f */
    public void m12944f(Context context) {
        MTCommonLog.m13010d("MTConnectBusiness", "stopConnect");
        this.f35126a.m12998f(context);
        this.f35127b.m12977h(context);
    }

    /* JADX INFO: renamed from: g */
    public void m12945g(Context context) {
        MTCommonLog.m13010d("MTConnectBusiness", "stopHeartbeat");
        MTCommonPrivatesApi.removeMessages(context, MTCore.f35174a, MTCoreConstants.RemoteWhat.START_HEARTBEAT);
    }

    /* JADX INFO: renamed from: h */
    public void m12946h(Context context) {
        MTCommonLog.m13010d("MTConnectBusiness", "turnOffConnect");
        C2485m.m13020a(context, false);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
    }

    /* JADX INFO: renamed from: i */
    public void m12947i(Context context) {
        MTCommonLog.m13010d("MTConnectBusiness", "turnOnConnect");
        C2485m.m13020a(context, true);
        MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
    }

    /* JADX INFO: renamed from: b */
    public void m12938b(Context context) {
        MTCommonReceiver commonReceiver = MTGlobal.getCommonReceiver(context);
        if (commonReceiver == null) {
            return;
        }
        commonReceiver.onConnectStatus(context, true);
    }

    /* JADX INFO: renamed from: b */
    public boolean m12940b() {
        return this.f35127b.m12968b();
    }

    /* JADX INFO: renamed from: a */
    public void m12937a(Context context, Bundle bundle) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(((MTProtocol) bundle.getParcelable(MTCoreConstants.Protocol.KEY_PROTOCOL)).getBody());
        byte b2 = byteBufferWrap.get();
        byte b3 = byteBufferWrap.get();
        byte b4 = byteBufferWrap.get();
        long j = byteBufferWrap.getLong();
        StringBuilder sbM24u = AbstractC0000a.m24u("onAckSuccess command:", ", result:", ", code:", b2, b3);
        sbM24u.append((int) b4);
        sbM24u.append(", serverTime:");
        sbM24u.append(j);
        MTCommonLog.m13010d("MTConnectBusiness", sbM24u.toString());
        if (b2 == 2) {
            MTCommonLog.m13012i("MTConnectBusiness", "onHeartbeatSuccess");
            this.f35128c = 0;
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.MainWhat.ON_HEARTBEAT, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.ON_HEARTBEAT, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.REPORT, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12936a(Context context) {
        this.f35128c++;
        MTCommonLog.m13010d("MTConnectBusiness", "onAckFailed :" + this.f35128c);
        if (this.f35128c < 5) {
            m12945g(context);
            m12943e(context);
        } else {
            this.f35128c = 0;
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.STOP_CONNECT, null);
            MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCoreConstants.RemoteWhat.START_CONNECT, null);
        }
    }
}
