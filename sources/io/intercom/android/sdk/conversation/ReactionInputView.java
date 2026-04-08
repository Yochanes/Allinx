package io.intercom.android.sdk.conversation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import coil.request.ImageRequest;
import coil.target.Target;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.models.Reaction;
import io.intercom.android.sdk.models.ReactionReply;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ReactionInputView extends LinearLayout {
    private static final float REACTION_SCALE = 2.5f;
    private static final int VIBRATION_DURATION_MS = 10;
    private final ColorFilter deselectedFilter;
    Integer highlightedViewIndex;
    private ReactionListener listener;
    private ReactionReply reactionReply;
    private final List<ImageView> reactionViews;
    int reactionsLoaded;
    private final View.OnTouchListener touchListener;
    private final Twig twig;
    private final Vibrator vibrator;

    /* JADX INFO: renamed from: io.intercom.android.sdk.conversation.ReactionInputView$2 */
    /* JADX INFO: compiled from: Proguard */
    public class ViewOnTouchListenerC52022 implements View.OnTouchListener {
        private final Rect touchRect = new Rect();

        public ViewOnTouchListenerC52022() {
        }

        private void handleTouchMove(MotionEvent motionEvent) {
            ReactionInputView.this.getHitRect(this.touchRect);
            if (!this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                ReactionInputView reactionInputView = ReactionInputView.this;
                if (reactionInputView.highlightedViewIndex != null) {
                    reactionInputView.highlightSelectedReaction();
                }
                ReactionInputView.this.highlightedViewIndex = null;
                return;
            }
            for (int i = 0; i < ReactionInputView.this.getChildCount(); i++) {
                ReactionInputView.this.getChildAt(i).getHitRect(this.touchRect);
                if (this.touchRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    Integer num = ReactionInputView.this.highlightedViewIndex;
                    if (num == null || num.intValue() != i) {
                        ReactionInputView.this.vibrateForSelection();
                        ReactionInputView.this.selectViewAtIndex(ReactionInputView.REACTION_SCALE, i);
                    }
                    ReactionInputView reactionInputView2 = ReactionInputView.this;
                    Integer num2 = reactionInputView2.highlightedViewIndex;
                    if (num2 == null) {
                        Integer currentSelectedIndex = reactionInputView2.getCurrentSelectedIndex();
                        if (currentSelectedIndex != null && currentSelectedIndex.intValue() != i) {
                            ReactionInputView.this.deselectViewAtIndex(currentSelectedIndex.intValue());
                        }
                    } else if (num2.intValue() != i) {
                        ReactionInputView reactionInputView3 = ReactionInputView.this;
                        reactionInputView3.deselectViewAtIndex(reactionInputView3.highlightedViewIndex.intValue());
                    }
                    ReactionInputView.this.highlightedViewIndex = Integer.valueOf(i);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                handleTouchMove(motionEvent);
            } else if (actionMasked == 1) {
                ReactionInputView.this.handleTouchUp();
            } else if (actionMasked == 2) {
            }
            return true;
        }
    }

    public ReactionInputView(Context context) {
        this(context, null, 0);
    }

    private void resetView() {
        removeAllViews();
        this.reactionViews.clear();
    }

    public void deselectViewAtIndex(int i) {
        ImageView imageView = this.reactionViews.get(i);
        imageView.animate().setInterpolator(new OvershootInterpolator(0.6f)).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
        imageView.setColorFilter(this.deselectedFilter);
    }

    public Integer getCurrentSelectedIndex() {
        for (int i = 0; i < getChildCount(); i++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }

    public void handleTouchUp() {
        Reaction reaction;
        Integer num = this.highlightedViewIndex;
        if (num != null && num.intValue() >= 0 && this.highlightedViewIndex.intValue() < this.reactionReply.getReactionSet().size() && (reaction = this.reactionReply.getReactionSet().get(this.highlightedViewIndex.intValue())) != null && (this.reactionReply.getReactionIndex() == null || reaction.getIndex() != this.reactionReply.getReactionIndex().intValue())) {
            this.reactionReply.setReactionIndex(reaction.getIndex());
            ReactionListener reactionListener = this.listener;
            if (reactionListener != null) {
                reactionListener.onReactionSelected(reaction);
            }
        }
        highlightSelectedReaction();
        this.highlightedViewIndex = null;
    }

    public void highlightSelectedReaction() {
        for (int i = 0; i < getChildCount(); i++) {
            Integer reactionIndex = this.reactionReply.getReactionIndex();
            Reaction reaction = this.reactionReply.getReactionSet().get(i);
            if (reactionIndex == null || reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                selectViewAtIndex(1.0f, i);
            } else {
                deselectViewAtIndex(i);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchListener(this.touchListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setOnTouchListener(null);
    }

    public void preloadReactionImages(ReactionReply reactionReply) {
        for (Reaction reaction : reactionReply.getReactionSet()) {
            ImageRequest.Builder builder = new ImageRequest.Builder(getContext());
            builder.f33870c = reaction.getImageUrl();
            IntercomCoilKt.loadIntercomImage(getContext(), builder.m12499a());
        }
    }

    public void selectViewAtIndex(float f, int i) {
        ImageView imageView = this.reactionViews.get(i);
        imageView.animate().setInterpolator(new OvershootInterpolator(2.0f)).scaleX(f).scaleY(f).setDuration(200L).start();
        imageView.clearColorFilter();
    }

    public void setUpReactions(ReactionReply reactionReply, boolean z2, ReactionListener reactionListener) {
        Context context = getContext();
        this.reactionReply = reactionReply;
        this.listener = reactionListener;
        resetView();
        List<Reaction> reactionSet = reactionReply.getReactionSet();
        int size = reactionSet.size();
        int i = 0;
        while (i < reactionSet.size()) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            ImageView imageView = new ImageView(context);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C5101R.dimen.intercom_reaction_size);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
            imageView.setPivotY(getResources().getDimensionPixelSize(C5101R.dimen.intercom_reaction_offset));
            imageView.setPivotX(dimensionPixelSize / 2);
            this.reactionViews.add(imageView);
            frameLayout.addView(imageView);
            Reaction reaction = reactionSet.get(i);
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            boolean z3 = z2;
            builder.f33871d = new C52011(imageView, size, z3, context);
            builder.m12502d();
            builder.f33870c = reaction.getImageUrl();
            IntercomCoilKt.loadIntercomImage(context, builder.m12499a());
            Integer reactionIndex = reactionReply.getReactionIndex();
            if (reactionIndex != null && !reactionIndex.equals(Integer.valueOf(reaction.getIndex()))) {
                deselectViewAtIndex(i);
            }
            addView(frameLayout);
            i++;
            z2 = z3;
        }
    }

    @SuppressLint({"MissingPermission"})
    public void vibrateForSelection() {
        if (DeviceUtils.hasPermission(getContext(), "android.permission.VIBRATE")) {
            this.vibrator.vibrate(10L);
        }
    }

    public ReactionInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReactionInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.twig = LumberMill.getLogger();
        this.highlightedViewIndex = null;
        this.reactionsLoaded = 0;
        this.touchListener = new ViewOnTouchListenerC52022();
        this.reactionViews = new ArrayList();
        setVisibility(8);
        if (isInEditMode()) {
            this.vibrator = null;
        } else {
            this.vibrator = (Vibrator) context.getSystemService("vibrator");
        }
        this.deselectedFilter = ColorUtils.newGreyscaleFilter();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.conversation.ReactionInputView$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C52011 implements Target {
        final /* synthetic */ boolean val$animated;
        final /* synthetic */ Context val$context;
        final /* synthetic */ int val$reactionCount;
        final /* synthetic */ ImageView val$reactionImageView;

        public C52011(ImageView imageView, int i, boolean z2, Context context) {
            this.val$reactionImageView = imageView;
            this.val$reactionCount = i;
            this.val$animated = z2;
            this.val$context = context;
        }

        @Override // coil.target.Target
        public void onSuccess(@NotNull Drawable drawable) {
            this.val$reactionImageView.setImageDrawable(drawable);
            ReactionInputView reactionInputView = ReactionInputView.this;
            int i = reactionInputView.reactionsLoaded + 1;
            reactionInputView.reactionsLoaded = i;
            if (i == this.val$reactionCount) {
                if (!this.val$animated) {
                    reactionInputView.setVisibility(0);
                    return;
                }
                reactionInputView.setVisibility(0);
                ReactionInputView.this.setY(ScreenUtils.dpToPx(60.0f, this.val$context) + r4.getHeight());
                ReactionInputView.this.animate().setInterpolator(new OvershootInterpolator(0.6f)).translationY(0.0f).setDuration(300L).start();
            }
        }

        @Override // coil.target.Target
        public void onError(@Nullable Drawable drawable) {
        }

        @Override // coil.target.Target
        public void onStart(@Nullable Drawable drawable) {
        }
    }
}
