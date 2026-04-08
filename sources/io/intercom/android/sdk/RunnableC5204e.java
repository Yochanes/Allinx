package io.intercom.android.sdk;

/* JADX INFO: renamed from: io.intercom.android.sdk.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5204e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43591a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NexusWrapper f43592b;

    public /* synthetic */ RunnableC5204e(NexusWrapper nexusWrapper, int i) {
        this.f43591a = i;
        this.f43592b = nexusWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43591a) {
            case 0:
                NexusWrapper.m15466c(this.f43592b);
                break;
            default:
                NexusWrapper.m15465b(this.f43592b);
                break;
        }
    }
}
