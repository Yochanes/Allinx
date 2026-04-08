package com.airbnb.lottie;

import com.airbnb.lottie.model.layer.CompositionLayer;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.airbnb.lottie.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2408f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34456b;

    public /* synthetic */ RunnableC2408f(Object obj, int i) {
        this.f34455a = i;
        this.f34456b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34455a) {
            case 0:
                HashMap map = LottieCompositionFactory.f34054a;
                Utils.m12750b((InputStream) this.f34456b);
                return;
            case 1:
                LottieDrawable lottieDrawable = (LottieDrawable) this.f34456b;
                Semaphore semaphore = lottieDrawable.f34067J;
                CompositionLayer compositionLayer = lottieDrawable.f34082q;
                if (compositionLayer == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    compositionLayer.mo12665o(lottieDrawable.f34072b.m12738c());
                    break;
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
            default:
                LottieTask lottieTask = (LottieTask) this.f34456b;
                LottieResult lottieResult = lottieTask.f34106d;
                if (lottieResult == null) {
                    return;
                }
                Object obj = lottieResult.f34100a;
                if (obj != null) {
                    synchronized (lottieTask) {
                        Iterator it = new ArrayList(lottieTask.f34103a).iterator();
                        while (it.hasNext()) {
                            ((LottieListener) it.next()).onResult(obj);
                            break;
                        }
                    }
                    return;
                }
                Throwable th2 = lottieResult.f34101b;
                synchronized (lottieTask) {
                    ArrayList arrayList = new ArrayList(lottieTask.f34104b);
                    if (arrayList.isEmpty()) {
                        Logger.m12737c("Lottie encountered an error but no failure listener was added:", th2);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((LottieListener) it2.next()).onResult(th2);
                    }
                    return;
                }
        }
    }
}
