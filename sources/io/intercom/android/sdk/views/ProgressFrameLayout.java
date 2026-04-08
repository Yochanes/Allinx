package io.intercom.android.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ProgressFrameLayout extends FrameLayout implements UploadProgressListener {
    private final Twig twig;
    final UploadProgressBar uploadProgressBar;

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.ProgressFrameLayout$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC58551 implements Runnable {
        final /* synthetic */ byte val$percentUploaded;

        public RunnableC58551(byte b2) {
            this.val$percentUploaded = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressFrameLayout.this.uploadProgressBar.setProgress(this.val$percentUploaded);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.ProgressFrameLayout$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC58562 implements Runnable {
        public RunnableC58562() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressFrameLayout.this.uploadProgressBar.smoothEndAnimation();
        }
    }

    public ProgressFrameLayout(Context context) {
        this(context, null);
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadNotice(byte b2) {
        this.twig.internal("progress", "" + ((int) b2));
        post(new RunnableC58551(b2));
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadSmoothEnd() {
        post(new RunnableC58562());
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStarted() {
        this.uploadProgressBar.smoothStartAnimation();
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStopped() {
        this.uploadProgressBar.hideBar();
    }

    public ProgressFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.twig = LumberMill.getLogger();
        UploadProgressBar uploadProgressBar = new UploadProgressBar(context, attributeSet);
        this.uploadProgressBar = uploadProgressBar;
        addView(uploadProgressBar);
    }
}
