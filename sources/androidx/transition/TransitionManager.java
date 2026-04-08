package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TransitionManager {

    /* JADX INFO: renamed from: a */
    public static final AutoTransition f32262a = new AutoTransition();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f32263b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f32264c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m11992a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = f32264c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f32262a;
        }
        Transition transitionClone = transition.clone();
        m11994c(viewGroup, transitionClone);
        viewGroup.setTag(com.exchange.allin.R.id.transition_current_scene, null);
        if (transitionClone != null) {
            MultiListener multiListener = new MultiListener();
            multiListener.f32265a = transitionClone;
            multiListener.f32266b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(multiListener);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayMap m11993b() {
        ArrayMap arrayMap;
        ThreadLocal threadLocal = f32263b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    /* JADX INFO: renamed from: c */
    public static void m11994c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) m11993b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).pause(viewGroup);
            }
        }
        if (transition != null) {
            transition.captureValues(viewGroup, true);
        }
        if (((Scene) viewGroup.getTag(com.exchange.allin.R.id.transition_current_scene)) != null) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public Transition f32265a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f32266b;

        /* JADX INFO: renamed from: androidx.transition.TransitionManager$MultiListener$1 */
        /* JADX INFO: compiled from: Proguard */
        class C22271 extends TransitionListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ArrayMap f32267a;

            public C22271(ArrayMap arrayMap) {
                this.f32267a = arrayMap;
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f32267a.get(MultiListener.this.f32266b)).remove(transition);
                transition.removeListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ViewGroup viewGroup = this.f32266b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList arrayList = TransitionManager.f32264c;
            ViewGroup viewGroup2 = this.f32266b;
            if (!arrayList.remove(viewGroup2)) {
                return true;
            }
            ArrayMap arrayMapM11993b = TransitionManager.m11993b();
            ArrayList arrayList2 = (ArrayList) arrayMapM11993b.get(viewGroup2);
            ArrayList arrayList3 = null;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                arrayMapM11993b.put(viewGroup2, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList3 = new ArrayList(arrayList2);
            }
            Transition transition = this.f32265a;
            arrayList2.add(transition);
            transition.addListener(new C22271(arrayMapM11993b));
            transition.captureValues(viewGroup2, false);
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(viewGroup2);
                }
            }
            transition.playTransition(viewGroup2);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f32266b;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList arrayList = TransitionManager.f32264c;
            ViewGroup viewGroup2 = this.f32266b;
            arrayList.remove(viewGroup2);
            ArrayList arrayList2 = (ArrayList) TransitionManager.m11993b().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).resume(viewGroup2);
                }
            }
            this.f32265a.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
