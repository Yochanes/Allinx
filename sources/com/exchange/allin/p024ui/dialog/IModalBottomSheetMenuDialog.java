package com.exchange.allin.p024ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.p013ui.platform.ComposeView;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.exchange.allin.R;
import com.exchange.allin.p024ui.common.C2571b;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import defpackage.C0023a;
import defpackage.DialogInterfaceOnShowListenerC2357b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/dialog/IModalBottomSheetMenuDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "Lcom/exchange/allin/ui/helper/ConfigHelper$ViewState;", "configState", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class IModalBottomSheetMenuDialog extends BottomSheetDialog {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f36123a = 0;

    public IModalBottomSheetMenuDialog(Context context, C2571b c2571b, ComposableLambdaImpl composableLambdaImpl) {
        Activity activity;
        C0023a c0023a = new C0023a(25);
        Intrinsics.m18599g(context, "context");
        super(context, R.style.BottomSheetMenuDialog);
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setContent(new ComposableLambdaImpl(1621041882, new IModalBottomSheetMenuDialog$composeView$1$1(this, composableLambdaImpl), true));
        for (Context context2 = getContext(); context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
            if (context2 instanceof Activity) {
                activity = (Activity) context2;
                break;
            } else {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                }
            }
        }
        activity = null;
        Window window = getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        if (activity != null && decorView != null) {
            ViewTreeLifecycleOwner.m9181b(decorView, activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null);
            ViewTreeViewModelStoreOwner.m9183b(decorView, activity instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) activity : null);
            ViewTreeSavedStateRegistryOwner.m11887b(decorView, activity instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) activity : null);
        }
        setContentView(composeView);
        setOnShowListener(new DialogInterfaceOnShowListenerC2357b(c0023a, this, 2));
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new DialogInterfaceOnDismissListenerC2575a(c2571b));
    }
}
