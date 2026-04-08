package io.intercom.android.sdk.blocks;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

/* JADX INFO: renamed from: io.intercom.android.sdk.blocks.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC5151b implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ImageView f43575a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WebView f43576b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f43577c;

    public /* synthetic */ ViewOnClickListenerC5151b(ImageView imageView, WebView webView, String str) {
        this.f43575a = imageView;
        this.f43576b = webView;
        this.f43577c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VideoFile.m15479a(this.f43575a, this.f43576b, this.f43577c, view);
    }
}
