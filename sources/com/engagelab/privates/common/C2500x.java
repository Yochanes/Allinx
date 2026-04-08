package com.engagelab.privates.common;

import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.engagelab.privates.common.x */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2500x {

    /* JADX INFO: renamed from: a */
    public static ConcurrentLinkedQueue<Long> f35169a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: a */
    public int m13156a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (f35169a.size() < 10) {
            f35169a.offer(Long.valueOf(jCurrentTimeMillis));
            return 0;
        }
        long jLongValue = jCurrentTimeMillis - f35169a.element().longValue();
        if (jLongValue < 0) {
            f35169a.clear();
            MTCommonLog.m13013w("MTOperationBusiness", "set tags/alias failed, time shaft error，please try again");
            return MTPushPrivatesApi.Code.INVOKE_TOO_SOON;
        }
        if (jLongValue <= 10000) {
            MTCommonLog.m13013w("MTOperationBusiness", "set tags/alias too soon, over 10 times in 10s");
            return MTPushPrivatesApi.Code.INVOKE_TOO_SOON;
        }
        while (f35169a.size() >= 10) {
            f35169a.poll();
        }
        f35169a.offer(Long.valueOf(jCurrentTimeMillis));
        return 0;
    }
}
