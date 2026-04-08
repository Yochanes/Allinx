package com.engagelab.privates.common;

import android.content.Context;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.SystemUtil;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.engagelab.privates.common.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2478g extends AbstractC2477f {

    /* JADX INFO: renamed from: d */
    public Selector f35133d;

    /* JADX INFO: renamed from: e */
    public SocketChannel f35134e;

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: a */
    public String mo12960a() {
        return "TcpChannlClient";
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: b */
    public boolean mo12970b(Context context, String str, int i) throws IOException {
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.m13011e("TcpChannlClient", "can't connect, network is disConnected");
            return false;
        }
        MTCommonLog.m13010d("TcpChannlClient", "tcp connect " + str + ":" + i);
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i);
        SocketChannel socketChannelOpen = SocketChannel.open();
        this.f35134e = socketChannelOpen;
        socketChannelOpen.configureBlocking(false);
        Selector selectorOpen = Selector.open();
        this.f35133d = selectorOpen;
        this.f35134e.register(selectorOpen, 8);
        this.f35134e.connect(inetSocketAddress);
        this.f35133d.select();
        Set<SelectionKey> setSelectedKeys = this.f35133d.selectedKeys();
        if (setSelectedKeys == null) {
            MTCommonLog.m13010d("TcpChannlClient", "selectionKeys is null");
            return false;
        }
        if (setSelectedKeys.isEmpty()) {
            MTCommonLog.m13010d("TcpChannlClient", "selectionKeys is empty");
            return false;
        }
        SelectionKey next = setSelectedKeys.iterator().next();
        if (next == null || !next.isConnectable()) {
            MTCommonLog.m13010d("TcpChannlClient", "selectionKey is null");
            return false;
        }
        if (!next.isConnectable()) {
            MTCommonLog.m13010d("TcpChannlClient", "selectionKey is disConnected");
            return false;
        }
        SocketChannel socketChannel = (SocketChannel) next.channel();
        if (!socketChannel.isConnectionPending()) {
            MTCommonLog.m13010d("TcpChannlClient", "finish connect");
            return false;
        }
        socketChannel.finishConnect();
        socketChannel.register(this.f35133d, 1);
        MTCommonLog.m13010d("TcpChannlClient", "tcp connect success");
        return true;
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: c */
    public List<String> mo12971c(Context context) {
        return m12978i(context);
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: d */
    public byte[] mo12973d(Context context) {
        try {
        } catch (IOException e) {
            MTCommonLog.m13013w("TcpChannlClient", "receive IOException " + e.getMessage());
            m12963a(context, true);
        } catch (Throwable th) {
            AbstractC2929c.m13709n("TcpChannlClient", new StringBuilder("receive failed "), th);
            m12963a(context, true);
        }
        if (!m12968b()) {
            MTCommonLog.m13010d("TcpChannlClient", "tcp is not connecting");
            return null;
        }
        this.f35133d.select();
        if (!this.f35133d.isOpen()) {
            MTCommonLog.m13010d("TcpChannlClient", "selector is closed");
            return null;
        }
        Set<SelectionKey> setSelectedKeys = this.f35133d.selectedKeys();
        if (setSelectedKeys == null) {
            MTCommonLog.m13013w("TcpChannlClient", "selectionKeys is null");
            m12963a(context, true);
            return null;
        }
        if (setSelectedKeys.isEmpty()) {
            MTCommonLog.m13013w("TcpChannlClient", "selectionKeys is empty");
            m12963a(context, true);
            return null;
        }
        Iterator<SelectionKey> it = setSelectedKeys.iterator();
        if (!it.hasNext()) {
            MTCommonLog.m13013w("TcpChannlClient", "selectionKeys hasn't next");
            m12963a(context, true);
            return null;
        }
        SelectionKey next = it.next();
        if (next == null) {
            MTCommonLog.m13013w("TcpChannlClient", "selectionKey is null");
            m12963a(context, true);
            return null;
        }
        if (!next.isReadable()) {
            MTCommonLog.m13013w("TcpChannlClient", "selectionKey is disReadable");
            m12963a(context, true);
            return null;
        }
        SocketChannel socketChannel = (SocketChannel) next.channel();
        if (!socketChannel.isConnected()) {
            MTCommonLog.m13013w("TcpChannlClient", "socketChannel is disConnected");
            m12963a(context, true);
            return null;
        }
        if (m12968b()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            int i = socketChannel.read(byteBufferAllocate);
            if (i < 0) {
                MTCommonLog.m13013w("TcpChannlClient", "read ahead length = " + i);
                m12963a(context, true);
                return null;
            }
            byte[] bArrArray = byteBufferAllocate.array();
            int i2 = ByteBuffer.wrap(bArrArray).getShort() & 16383;
            if (i2 == 0) {
                MTCommonLog.m13013w("TcpChannlClient", "read total length = " + i2);
                m12963a(context, true);
                return null;
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2 - 2);
            while (byteBufferAllocate2.hasRemaining()) {
                long j = socketChannel.read(byteBufferAllocate2);
                if (j < 0) {
                    MTCommonLog.m13013w("TcpChannlClient", "read content n = " + j);
                    MTCommonLog.m13013w("TcpChannlClient", "read content position = " + byteBufferAllocate2.position());
                    MTCommonLog.m13013w("TcpChannlClient", "read content limit = " + byteBufferAllocate2.limit());
                    m12963a(context, true);
                    return null;
                }
            }
            byte[] bArrArray2 = byteBufferAllocate2.array();
            byte[] bArr = new byte[i2];
            System.arraycopy(bArrArray, 0, bArr, 0, bArrArray.length);
            System.arraycopy(bArrArray2, 0, bArr, bArrArray.length, bArrArray2.length);
            return bArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m12978i(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m12979j(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final Set<String> m12979j(Context context) {
        return C2485m.m13045n(context);
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: a */
    public void mo12961a(Context context) {
        MTCommonLog.m13010d("TcpChannlClient", "tcp disconnectImp");
        try {
            Selector selector = this.f35133d;
            if (selector != null && selector.isOpen()) {
                this.f35133d.close();
                this.f35133d = null;
            }
            SocketChannel socketChannel = this.f35134e;
            if (socketChannel == null || !socketChannel.isConnected()) {
                return;
            }
            this.f35134e.finishConnect();
            this.f35134e.close();
            this.f35134e = null;
        } catch (Throwable th) {
            AbstractC2929c.m13709n("TcpChannlClient", new StringBuilder("disconnect failed "), th);
        }
    }

    @Override // com.engagelab.privates.common.AbstractC2477f
    /* JADX INFO: renamed from: c */
    public boolean mo12972c(Context context, byte[] bArr) throws IOException {
        SocketChannel socketChannel = this.f35134e;
        if (socketChannel == null || !socketChannel.isConnected()) {
            return false;
        }
        this.f35134e.write(ByteBuffer.wrap(bArr));
        return true;
    }
}
