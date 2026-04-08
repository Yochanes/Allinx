package com.exchange.kline;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.engagelab.privates.common.observer.MTObservable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/kline/QuotaThread;", "Landroid/os/HandlerThread;", "Landroid/os/Handler$Callback;", "Companion", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class QuotaThread extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public Handler f42111a;

    /* JADX INFO: renamed from: b */
    public Handler f42112b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Lcom/exchange/kline/QuotaThread$Companion;", "", "", "HANDLER_QUOTA_LIST", "I", "HANDLER_QUOTA_SINGLE", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public final void m14294a(Message message, int i, boolean z2) {
        if (this.f42111a == null) {
            return;
        }
        try {
            Object obj = message.obj;
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.collections.List<com.exchange.kline.KData>");
            List list = (List) obj;
            QuotaUtil.m14299d(list, z2);
            QuotaUtil.m14298c(list, z2);
            QuotaUtil.m14301f(list, z2);
            QuotaUtil.m14300e(list, z2);
            QuotaUtil.m14303h(list, z2);
            QuotaUtil.m14302g(list, z2);
            Message messageObtain = Message.obtain((Handler) null, i);
            Handler handler = this.f42111a;
            Intrinsics.m18596d(handler);
            handler.sendMessage(messageObtain);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14295b(ArrayList arrayList) {
        if (this.f42112b == null) {
            return;
        }
        Message messageObtain = Message.obtain((Handler) null, MTObservable.WHAT_OBSERVER);
        messageObtain.obj = arrayList;
        Handler handler = this.f42112b;
        Intrinsics.m18596d(handler);
        handler.sendMessage(messageObtain);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        Intrinsics.m18599g(msg, "msg");
        int i = msg.what;
        if (i == 100) {
            m14294a(msg, 100, false);
        } else if (i == 101) {
            m14294a(msg, MTObservable.WHAT_OBSERVER, true);
        }
        return true;
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f42112b = new Handler(getLooper(), this);
    }
}
