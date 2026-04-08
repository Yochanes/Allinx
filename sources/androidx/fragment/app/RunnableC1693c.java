package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1693c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24802b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f24803c;

    public /* synthetic */ RunnableC1693c(int i, Object obj, Object obj2) {
        this.f24801a = i;
        this.f24802b = obj;
        this.f24803c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24801a) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect this$0 = (DefaultSpecialEffectsController.TransitionEffect) this.f24802b;
                Intrinsics.m18599g(this$0, "this$0");
                ViewGroup container = (ViewGroup) this.f24803c;
                Intrinsics.m18599g(container, "$container");
                Iterator it = this$0.f24508c.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).f24507a;
                    View view = operation.f24775c.getView();
                    if (view != null) {
                        operation.f24773a.m9103a(view, container);
                    }
                }
                break;
            case 1:
                DefaultSpecialEffectsController this$02 = (DefaultSpecialEffectsController) this.f24802b;
                Intrinsics.m18599g(this$02, "this$0");
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) this.f24803c;
                Intrinsics.m18599g(operation2, "$operation");
                this$02.m9087a(operation2);
                break;
            default:
                FragmentTransitionImpl.m9074j((Rect) this.f24803c, (View) this.f24802b);
                break;
        }
    }

    public /* synthetic */ RunnableC1693c(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        this.f24801a = 2;
        this.f24802b = view;
        this.f24803c = rect;
    }
}
