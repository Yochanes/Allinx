package com.king.zxing.analyze;

import androidx.camera.core.SettableImageProxy;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import com.google.zxing.Result;
import com.king.camera.scan.AnalyzeResult;
import com.king.camera.scan.analyze.Analyzer;
import com.king.camera.scan.util.ImageUtils;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageAnalyzer implements Analyzer<Result> {

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f43299a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f43300b = new AtomicBoolean(false);

    @Override // com.king.camera.scan.analyze.Analyzer
    /* JADX INFO: renamed from: a */
    public final void mo15335a(SettableImageProxy settableImageProxy, Analyzer.OnAnalyzeListener onAnalyzeListener) {
        Result resultMo15397b;
        AtomicBoolean atomicBoolean = this.f43300b;
        boolean z2 = atomicBoolean.get();
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f43299a;
        int i = settableImageProxy.f2360i;
        int i2 = settableImageProxy.f2359g;
        if (!z2) {
            int i3 = i * i2;
            concurrentLinkedQueue.add(new byte[AbstractC1610a.m8746x(i3, 4, 2, i3)]);
            atomicBoolean.set(true);
        }
        byte[] bArr = (byte[]) concurrentLinkedQueue.poll();
        if (bArr == null) {
            return;
        }
        try {
            int iMo1197d = settableImageProxy.f2358f.mo1197d();
            ImageUtils.m15341a(settableImageProxy, bArr);
            if (iMo1197d == 90 || iMo1197d == 270) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i4 = 0; i4 < i; i4++) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        bArr2[(((i5 * i) + i) - i4) - 1] = bArr[(i4 * i2) + i5];
                    }
                }
                resultMo15397b = mo15397b(bArr2, i, i2);
            } else {
                resultMo15397b = mo15397b(bArr, i2, i);
            }
            if (resultMo15397b != null) {
                atomicBoolean.set(false);
                onAnalyzeListener.mo15324a(new AnalyzeResult());
            } else {
                concurrentLinkedQueue.add(bArr);
                onAnalyzeListener.onFailure();
            }
        } catch (Exception unused) {
            concurrentLinkedQueue.add(bArr);
            onAnalyzeListener.onFailure();
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Result mo15397b(byte[] bArr, int i, int i2);
}
