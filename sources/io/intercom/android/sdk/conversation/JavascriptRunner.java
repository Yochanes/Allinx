package io.intercom.android.sdk.conversation;

import android.webkit.WebView;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class JavascriptRunner {
    private final Collection<Runnable> actionsAfterLoad;
    private boolean hasLoaded;
    private final WebView webView;

    /* JADX INFO: renamed from: io.intercom.android.sdk.conversation.JavascriptRunner$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC52001 implements Runnable {
        final /* synthetic */ String val$script;

        public RunnableC52001(String str) {
            this.val$script = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavascriptRunner.access$000(JavascriptRunner.this).loadUrl("javascript:" + this.val$script);
        }
    }

    public JavascriptRunner(WebView webView) {
        this(webView, new ArrayList());
    }

    public static /* synthetic */ WebView access$000(JavascriptRunner javascriptRunner) {
        return javascriptRunner.webView;
    }

    public synchronized void clearPendingScripts() {
        this.actionsAfterLoad.clear();
    }

    public synchronized void reset() {
        this.hasLoaded = false;
        clearPendingScripts();
    }

    public synchronized void run(String str) {
        try {
            RunnableC52001 runnableC52001 = new RunnableC52001(str);
            if (this.hasLoaded) {
                this.webView.post(runnableC52001);
            } else {
                this.actionsAfterLoad.add(runnableC52001);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void runPendingScripts() {
        try {
            this.hasLoaded = true;
            Iterator<Runnable> it = this.actionsAfterLoad.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            clearPendingScripts();
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public JavascriptRunner(WebView webView, Collection<Runnable> collection) {
        this.hasLoaded = false;
        this.webView = webView;
        this.actionsAfterLoad = collection;
    }
}
