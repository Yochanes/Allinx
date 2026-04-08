package androidx.compose.p013ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p013ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.p013ui.platform.AbstractComposeView;
import androidx.compose.p013ui.platform.ViewRootForInspector;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RB\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019RB\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0014\u0010%\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m18302d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "G", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "value", "I", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "setSavableRegistryEntry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;)V", "savableRegistryEntry", "Lkotlin/Function1;", "", "J", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "K", "getResetBlock", "setResetBlock", "resetBlock", "L", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {

    /* JADX INFO: renamed from: F */
    public final View f20680F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: H */
    public final SaveableStateRegistry f20682H;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public SaveableStateRegistry.Entry savableRegistryEntry;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public Function1 updateBlock;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Function1 resetBlock;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Function1 releaseBlock;

    public ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i, Owner owner) {
        View view = (View) function1.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        super(context, compositionContext, i, nestedScrollDispatcher, view, owner);
        this.f20680F = view;
        this.dispatcher = nestedScrollDispatcher;
        this.f20682H = saveableStateRegistry;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo3081c = saveableStateRegistry != null ? saveableStateRegistry.mo3081c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo3081c instanceof SparseArray ? (SparseArray) objMo3081c : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.mo3082d(strValueOf, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
        Function1 function12 = AndroidView_androidKt.f20642a;
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.f20660a;
        this.updateBlock = androidView_androidKt$NoOpUpdate$1;
        this.resetBlock = androidView_androidKt$NoOpUpdate$1;
        this.releaseBlock = androidView_androidKt$NoOpUpdate$1;
    }

    /* JADX INFO: renamed from: f */
    public static final void m6715f(ViewFactoryHolder viewFactoryHolder) {
        viewFactoryHolder.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    @NotNull
    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    @Nullable
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(@NotNull Function1<? super T, Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(@NotNull Function1<? super T, Unit> function1) {
        this.resetBlock = function1;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }
}
