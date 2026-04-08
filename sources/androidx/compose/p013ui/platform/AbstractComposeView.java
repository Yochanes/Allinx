package androidx.compose.p013ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p013ui.InternalComposeUiApi;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0014\u0010\u0013J7\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J!\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010,J)\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010/J#\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b)\u00102J+\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b)\u00103J+\u00104\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u000100H\u0014¢\u0006\u0004\b4\u00105J3\u00104\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010+\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00106\u001a\u00020\u0016H\u0014¢\u0006\u0004\b4\u00107J\u000f\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u0010$R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010>\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR(\u0010E\u001a\u0004\u0018\u00010\u00022\b\u0010=\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bE\u0010F\"\u0004\bG\u0010\u0006R$\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010\fR0\u0010L\u001a\u00020\u00162\u0006\u0010=\u001a\u00020\u00168F@FX\u0087\u000e¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\f\u001a\u0004\bN\u0010$\"\u0004\bO\u0010&R\u0016\u0010Q\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010MR\u0016\u0010R\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010MR\u0014\u0010T\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bS\u0010$R\u0011\u0010V\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bU\u0010$¨\u0006W"}, m18302d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/runtime/CompositionContext;", "parent", "", "setParentCompositionContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V", "createComposition", "()V", "disposeComposition", "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "internalOnMeasure$ui_release", "internalOnMeasure", "", "changed", BlockAlignment.LEFT, VerticalAlignment.TOP, BlockAlignment.RIGHT, VerticalAlignment.BOTTOM, "onLayout", "(ZIIII)V", "internalOnLayout$ui_release", "internalOnLayout", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "isTransitionGroup", "()Z", "setTransitionGroup", "(Z)V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", FirebaseAnalytics.Param.INDEX, "(Landroid/view/View;I)V", "width", "height", "(Landroid/view/View;II)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "addViewInLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "preventRequestLayout", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Ljava/lang/ref/WeakReference;", "Landroid/os/IBinder;", "value", "previousAttachedWindowToken", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "Landroidx/compose/runtime/Composition;", "composition", "Landroidx/compose/runtime/Composition;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "setParentContext", "Lkotlin/Function0;", "disposeViewCompositionStrategy", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "showLayoutBounds", "Z", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "creatingComposition", "isTransitionGroupSet", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;

    @Nullable
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;

    @Nullable
    private Composition composition;
    private boolean creatingComposition;

    @Nullable
    private Function0<Unit> disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;

    @Nullable
    private CompositionContext parentContext;

    @Nullable
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public /* synthetic */ AbstractComposeView(Context context) {
        this(context, null, 0);
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    m5981b();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(Composer composer, int i);

    /* JADX INFO: renamed from: a */
    public final void m5980a() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child) {
        m5980a();
        super.addView(child);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        m5980a();
        return super.addViewInLayout(child, index, params);
    }

    /* JADX INFO: renamed from: b */
    public final void m5981b() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.m6197a(this, m5982c(), new ComposableLambdaImpl(-656146368, new AbstractComposeView$ensureCompositionCreated$1(this), true));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final CompositionContext m5982c() {
        Recomposer recomposerMo6194a;
        CompositionContext compositionContextM6196b = this.parentContext;
        if (compositionContextM6196b == null) {
            compositionContextM6196b = WindowRecomposer_androidKt.m6196b(this);
            if (compositionContextM6196b == null) {
                for (ViewParent parent = getParent(); compositionContextM6196b == null && (parent instanceof View); parent = parent.getParent()) {
                    compositionContextM6196b = WindowRecomposer_androidKt.m6196b((View) parent);
                }
            }
            if (compositionContextM6196b != null) {
                CompositionContext compositionContext = (!(compositionContextM6196b instanceof Recomposer) || ((Recomposer.State) ((Recomposer) compositionContextM6196b).f16480u.getValue()).compareTo(Recomposer.State.f16486b) > 0) ? compositionContextM6196b : null;
                if (compositionContext != null) {
                    this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext);
                }
            } else {
                compositionContextM6196b = null;
            }
            if (compositionContextM6196b == null) {
                WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference == null || (compositionContextM6196b = weakReference.get()) == null || ((compositionContextM6196b instanceof Recomposer) && ((Recomposer.State) ((Recomposer) compositionContextM6196b).f16480u.getValue()).compareTo(Recomposer.State.f16486b) <= 0)) {
                    compositionContextM6196b = null;
                }
                if (compositionContextM6196b == null) {
                    if (!isAttachedToWindow()) {
                        InlineClassHelperKt.m5597b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    CompositionContext compositionContextM6196b2 = WindowRecomposer_androidKt.m6196b(view);
                    if (compositionContextM6196b2 == null) {
                        recomposerMo6194a = ((WindowRecomposerFactory) WindowRecomposerPolicy.f19582a.get()).mo6194a(view);
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposerMo6194a);
                        GlobalScope globalScope = GlobalScope.f55316a;
                        Handler handler = view.getHandler();
                        int i = HandlerDispatcherKt.f55385a;
                        view.addOnAttachStateChangeListener(new WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(BuildersKt.m20507c(globalScope, new HandlerContext(handler, "windowRecomposer cleanup", false).f55382g, null, new C1298xbfd085b3(recomposerMo6194a, view, null), 2)));
                    } else {
                        if (!(compositionContextM6196b2 instanceof Recomposer)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        recomposerMo6194a = (Recomposer) compositionContextM6196b2;
                    }
                    Recomposer recomposer = ((Recomposer.State) recomposerMo6194a.f16480u.getValue()).compareTo(Recomposer.State.f16486b) > 0 ? recomposerMo6194a : null;
                    if (recomposer != null) {
                        this.cachedViewTreeCompositionContext = new WeakReference<>(recomposer);
                    }
                    return recomposerMo6194a;
                }
            }
        }
        return compositionContextM6196b;
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        m5981b();
    }

    public final void disposeComposition() {
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean changed, int left, int top, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (right - left) - getPaddingRight(), (bottom - top) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(widthMeasureSpec)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(heightMeasureSpec)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m5981b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        internalOnLayout$ui_release(changed, left, top, right, bottom);
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        m5981b();
        internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(layoutDirection);
    }

    public final void setParentCompositionContext(@Nullable CompositionContext parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.showLayoutBounds = z2;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z2);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(@NotNull ViewCompositionStrategy strategy) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.mo6190a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f19539a.mo6190a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index) {
        m5980a();
        super.addView(child, index);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params, boolean preventRequestLayout) {
        m5980a();
        return super.addViewInLayout(child, index, params, preventRequestLayout);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int width, int height) {
        m5980a();
        super.addView(child, width, height);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(@Nullable View child, @Nullable ViewGroup.LayoutParams params) {
        m5980a();
        super.addView(child, params);
    }

    @Override // android.view.ViewGroup
    public void addView(@Nullable View child, int index, @Nullable ViewGroup.LayoutParams params) {
        m5980a();
        super.addView(child, index, params);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
