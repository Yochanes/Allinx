package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class AnimationHandler {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal f24226f = new ThreadLocal();

    /* JADX INFO: renamed from: d */
    public FrameCallbackProvider16 f24230d;

    /* JADX INFO: renamed from: a */
    public final SimpleArrayMap f24227a = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: b */
    public final ArrayList f24228b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final AnimationCallbackDispatcher f24229c = new AnimationCallbackDispatcher();

    /* JADX INFO: renamed from: e */
    public boolean f24231e = false;

    /* JADX INFO: compiled from: Proguard */
    public class AnimationCallbackDispatcher {
        public AnimationCallbackDispatcher() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface AnimationFrameCallback {
        /* JADX INFO: renamed from: a */
        boolean mo8761a(long j);
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: a */
        public final AnimationCallbackDispatcher f24233a;

        public AnimationFrameCallbackProvider(AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.f24233a = animationCallbackDispatcher;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FrameCallbackProvider14 extends AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1 */
        /* JADX INFO: compiled from: Proguard */
        class RunnableC16151 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                SystemClock.uptimeMillis();
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class FrameCallbackProvider16 extends AnimationFrameCallbackProvider {

        /* JADX INFO: renamed from: b */
        public final Choreographer f24234b;

        /* JADX INFO: renamed from: c */
        public final Choreographer.FrameCallback f24235c;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider16$1 */
        /* JADX INFO: compiled from: Proguard */
        class ChoreographerFrameCallbackC16161 implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC16161() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ArrayList arrayList;
                AnimationCallbackDispatcher animationCallbackDispatcher = FrameCallbackProvider16.this.f24233a;
                animationCallbackDispatcher.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                AnimationHandler animationHandler = AnimationHandler.this;
                animationHandler.getClass();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i = 0;
                while (true) {
                    arrayList = animationHandler.f24228b;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    AnimationFrameCallback animationFrameCallback = (AnimationFrameCallback) arrayList.get(i);
                    if (animationFrameCallback != null) {
                        SimpleArrayMap simpleArrayMap = animationHandler.f24227a;
                        Long l = (Long) simpleArrayMap.get(animationFrameCallback);
                        if (l == null) {
                            animationFrameCallback.mo8761a(jUptimeMillis);
                        } else if (l.longValue() < jUptimeMillis2) {
                            simpleArrayMap.remove(animationFrameCallback);
                            animationFrameCallback.mo8761a(jUptimeMillis);
                        }
                    }
                    i++;
                }
                if (animationHandler.f24231e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    animationHandler.f24231e = false;
                }
                if (arrayList.size() > 0) {
                    if (animationHandler.f24230d == null) {
                        animationHandler.f24230d = new FrameCallbackProvider16(animationHandler.f24229c);
                    }
                    animationHandler.f24230d.m8762a();
                }
            }
        }

        public FrameCallbackProvider16(AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.f24234b = Choreographer.getInstance();
            this.f24235c = new ChoreographerFrameCallbackC16161();
        }

        /* JADX INFO: renamed from: a */
        public final void m8762a() {
            this.f24234b.postFrameCallback(this.f24235c);
        }
    }
}
