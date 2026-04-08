package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentDialog;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.KeyEventDispatcher;
import com.exchange.allin.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialog extends ComponentDialog implements AppCompatCallback {
    private AppCompatDelegate mDelegate;
    private final KeyEventDispatcher.Component mKeyDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatDialog(Context context, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        super(context, 0);
        Intrinsics.m18599g(context, "context");
        this.mKeyDispatcher = new C0085e(this);
        setCancelable(z2);
        setOnCancelListener(onCancelListener);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo263a(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().mo276o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.m7729b(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public <T extends View> T findViewById(@IdRes int i) {
        return (T) getDelegate().mo266d(i);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            AppCompatDelegate.SerialExecutor serialExecutor = AppCompatDelegate.f391a;
            this.mDelegate = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo271i();
    }

    @Override // android.app.Dialog
    @RestrictTo
    public void invalidateOptionsMenu() {
        getDelegate().mo273k();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().mo272j();
        super.onCreate(bundle);
        getDelegate().mo275n();
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().mo280s();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().mo282v(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().mo261A(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo281u(i);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().mo283w(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().mo261A(getContext().getString(i));
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().mo284x(view, layoutParams);
    }

    public AppCompatDialog(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.mKeyDispatcher = new C0085e(this);
        AppCompatDelegate delegate = getDelegate();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        delegate.mo286z(i);
        delegate.mo275n();
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }
}
