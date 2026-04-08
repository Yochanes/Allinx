package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;
import okhttp3.Callback;

/* JADX INFO: renamed from: io.intercom.android.sdk.blocks.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC5150a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43570a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoPreviewView f43571b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f43572c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f43573d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Callback f43574f;

    public /* synthetic */ RunnableC5150a(Callback callback, VideoPreviewView videoPreviewView, String str, String str2, int i) {
        this.f43570a = i;
        this.f43574f = callback;
        this.f43571b = videoPreviewView;
        this.f43572c = str;
        this.f43573d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43570a) {
            case 0:
                Video.C51462.m15477a((Video.C51462) this.f43574f, this.f43571b, this.f43572c, this.f43573d);
                break;
            default:
                Video.C51473.m15478a((Video.C51473) this.f43574f, this.f43571b, this.f43572c, this.f43573d);
                break;
        }
    }
}
