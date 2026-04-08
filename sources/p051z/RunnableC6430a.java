package p051z;

import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import java.util.Map;

/* JADX INFO: renamed from: z.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6430a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HelpCenterWebViewInterface f59488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f59489c;

    public /* synthetic */ RunnableC6430a(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map, int i) {
        this.f59487a = i;
        this.f59488b = helpCenterWebViewInterface;
        this.f59489c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f59487a) {
            case 0:
                HelpCenterWebViewInterface.m15525b(this.f59488b, this.f59489c);
                break;
            default:
                HelpCenterWebViewInterface.m15524a(this.f59488b, this.f59489c);
                break;
        }
    }
}
