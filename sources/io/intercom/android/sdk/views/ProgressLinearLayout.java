package io.intercom.android.sdk.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ProgressLinearLayout extends LinearLayout implements UploadProgressListener {
    ImageView attachmentIcon;
    private final Twig twig;
    UploadProgressBar uploadProgressBar;

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.ProgressLinearLayout$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC58571 implements Runnable {
        final /* synthetic */ byte val$percentUploaded;

        public RunnableC58571(byte b2) {
            this.val$percentUploaded = b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadProgressBar uploadProgressBar = ProgressLinearLayout.this.uploadProgressBar;
            if (uploadProgressBar != null) {
                uploadProgressBar.setProgress(this.val$percentUploaded);
            }
        }
    }

    public ProgressLinearLayout(Context context) {
        this(context, null);
    }

    public void setAttachmentIcon(ImageView imageView) {
        this.attachmentIcon = imageView;
    }

    public void setUploadProgressBar(UploadProgressBar uploadProgressBar) {
        this.uploadProgressBar = uploadProgressBar;
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadNotice(byte b2) {
        this.twig.internal("progress", "" + ((int) b2));
        post(new RunnableC58571(b2));
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadSmoothEnd() {
        post(new RunnableC58582());
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStarted() {
        this.uploadProgressBar.smoothStartAnimation();
    }

    @Override // io.intercom.android.sdk.conversation.UploadProgressListener
    public void uploadStopped() {
        this.uploadProgressBar.hideBar();
    }

    public ProgressLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.twig = LumberMill.getLogger();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.views.ProgressLinearLayout$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC58582 implements Runnable {
        public RunnableC58582() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UploadProgressBar uploadProgressBar = ProgressLinearLayout.this.uploadProgressBar;
            if (uploadProgressBar != null) {
                uploadProgressBar.smoothEndAnimation(new AnonymousClass1());
            }
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.views.ProgressLinearLayout$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 implements Animator.AnimatorListener {
            public AnonymousClass1() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ProgressLinearLayout.this.uploadProgressBar.hideBar();
                ImageView imageView = ProgressLinearLayout.this.attachmentIcon;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ProgressLinearLayout.this.attachmentIcon, "alpha", 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(300L);
                    objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                    objectAnimatorOfFloat.start();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }
    }
}
