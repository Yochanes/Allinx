package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.fragment.app.RunnableC1693c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<TransitionValues> mEndValuesList;
    private EpicenterCallback mEpicenterCallback;
    private TransitionListener[] mListenersCache;
    private ArrayMap<String, String> mNameOverrides;
    TransitionPropagation mPropagation;
    SeekController mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<TransitionValues> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new C22241();
    private static ThreadLocal<ArrayMap<Animator, AnimationInfo>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private TransitionValuesMaps mStartValues = new TransitionValuesMaps();
    private TransitionValuesMaps mEndValues = new TransitionValuesMaps();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private Transition mCloneParent = null;
    private ArrayList<TransitionListener> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: androidx.transition.Transition$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C22241 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Transition$2 */
    /* JADX INFO: compiled from: Proguard */
    class C22252 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayMap f32241a;

        public C22252(ArrayMap arrayMap) {
            this.f32241a = arrayMap;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f32241a.remove(animator);
            Transition.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Transition.this.mCurrentAnimators.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.Transition$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C22263 extends AnimatorListenerAdapter {
        public C22263() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Transition.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class AnimationInfo {

        /* JADX INFO: renamed from: a */
        public View f32244a;

        /* JADX INFO: renamed from: b */
        public String f32245b;

        /* JADX INFO: renamed from: c */
        public TransitionValues f32246c;

        /* JADX INFO: renamed from: d */
        public WindowId f32247d;

        /* JADX INFO: renamed from: e */
        public Transition f32248e;

        /* JADX INFO: renamed from: f */
        public Animator f32249f;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ArrayListManager {
        /* JADX INFO: renamed from: a */
        public static ArrayList m11981a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public static ArrayList m11982b(Object obj, ArrayList arrayList) {
            if (arrayList != null) {
                arrayList.remove(obj);
                if (arrayList.isEmpty()) {
                    return null;
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class EpicenterCallback {
        /* JADX INFO: renamed from: a */
        public abstract Rect mo11969a();
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Impl26 {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static long m11983a(Animator animator) {
            return animator.getTotalDuration();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m11984b(Animator animator, long j) {
            AbstractC1329b.m6465o((AnimatorSet) animator, j);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MatchOrder {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {

        /* JADX INFO: renamed from: a */
        public long f32250a = -1;

        /* JADX INFO: renamed from: b */
        public boolean f32251b;

        /* JADX INFO: renamed from: c */
        public boolean f32252c;

        /* JADX INFO: renamed from: d */
        public SpringAnimation f32253d;

        /* JADX INFO: renamed from: e */
        public final VelocityTracker1D f32254e;

        /* JADX INFO: renamed from: f */
        public RunnableC1693c f32255f;

        public SeekController() {
            VelocityTracker1D velocityTracker1D = new VelocityTracker1D();
            long[] jArr = new long[20];
            velocityTracker1D.f32290a = jArr;
            velocityTracker1D.f32291b = new float[20];
            velocityTracker1D.f32292c = 0;
            Arrays.fill(jArr, Long.MIN_VALUE);
            this.f32254e = velocityTracker1D;
        }

        @Override // androidx.transition.TransitionSeekController
        /* JADX INFO: renamed from: a */
        public final boolean mo11985a() {
            return this.f32251b;
        }

        @Override // androidx.transition.TransitionSeekController
        /* JADX INFO: renamed from: b */
        public final void mo11986b(RunnableC1693c runnableC1693c) {
            this.f32255f = runnableC1693c;
            m11990g();
            this.f32253d.m8770e(0.0f);
        }

        @Override // androidx.transition.TransitionSeekController
        /* JADX INFO: renamed from: c */
        public final long mo11987c() {
            return Transition.this.getTotalDurationMillis();
        }

        @Override // androidx.transition.TransitionSeekController
        /* JADX INFO: renamed from: d */
        public final void mo11988d(long j) {
            if (this.f32253d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j2 = this.f32250a;
            if (j == j2 || !this.f32251b) {
                return;
            }
            if (!this.f32252c) {
                Transition transition = Transition.this;
                if (j != 0 || j2 <= 0) {
                    long totalDurationMillis = transition.getTotalDurationMillis();
                    if (j == totalDurationMillis && this.f32250a < totalDurationMillis) {
                        j = 1 + totalDurationMillis;
                    }
                } else {
                    j = -1;
                }
                long j3 = this.f32250a;
                if (j != j3) {
                    transition.setCurrentPlayTimeMillis(j, j3);
                    this.f32250a = j;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            VelocityTracker1D velocityTracker1D = this.f32254e;
            int i = (velocityTracker1D.f32292c + 1) % 20;
            velocityTracker1D.f32292c = i;
            velocityTracker1D.f32290a[i] = jCurrentAnimationTimeMillis;
            velocityTracker1D.f32291b[i] = j;
        }

        @Override // androidx.transition.TransitionSeekController
        /* JADX INFO: renamed from: e */
        public final void mo11989e() {
            m11990g();
            this.f32253d.m8770e(Transition.this.getTotalDurationMillis() + 1);
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        /* JADX INFO: renamed from: f */
        public final void mo8767f(float f) {
            Transition transition = Transition.this;
            long jMax = Math.max(-1L, Math.min(transition.getTotalDurationMillis() + 1, Math.round(f)));
            transition.setCurrentPlayTimeMillis(jMax, this.f32250a);
            this.f32250a = jMax;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
        /* JADX INFO: renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m11990g() {
            float f;
            float fSqrt;
            int i;
            long[] jArr;
            if (this.f32253d != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f2 = this.f32250a;
            VelocityTracker1D velocityTracker1D = this.f32254e;
            boolean z2 = true;
            char c2 = 20;
            int i2 = (velocityTracker1D.f32292c + 1) % 20;
            velocityTracker1D.f32292c = i2;
            velocityTracker1D.f32290a[i2] = jCurrentAnimationTimeMillis;
            velocityTracker1D.f32291b[i2] = f2;
            this.f32253d = new SpringAnimation(new FloatValueHolder());
            SpringForce springForce = new SpringForce();
            springForce.m8774a();
            springForce.m8775b(200.0f);
            SpringAnimation springAnimation = this.f32253d;
            springAnimation.f24262s = springForce;
            springAnimation.f24244b = this.f32250a;
            springAnimation.f24245c = true;
            if (springAnimation.f24248f) {
                throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
            }
            ArrayList arrayList = springAnimation.f24254l;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            SpringAnimation springAnimation2 = this.f32253d;
            int i3 = velocityTracker1D.f32292c;
            long[] jArr2 = velocityTracker1D.f32290a;
            if (i3 == 0 && jArr2[i3] == Long.MIN_VALUE) {
                fSqrt = 0.0f;
            } else {
                long j = jArr2[i3];
                int i4 = 0;
                long j2 = j;
                while (true) {
                    long j3 = jArr2[i3];
                    if (j3 == Long.MIN_VALUE) {
                        f = 0.0f;
                        break;
                    }
                    boolean z3 = z2;
                    f = 0.0f;
                    float f3 = j - j3;
                    float fAbs = Math.abs(j3 - j2);
                    if (f3 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4++;
                    if (i4 >= 20) {
                        break;
                    }
                    j2 = j3;
                    z2 = z3;
                }
                if (i4 < 2) {
                    fSqrt = f;
                } else {
                    float[] fArr = velocityTracker1D.f32291b;
                    float f4 = 1000.0f;
                    if (i4 == 2) {
                        int i5 = velocityTracker1D.f32292c;
                        int i6 = i5 == 0 ? 19 : i5 - 1;
                        float f5 = jArr2[i5] - jArr2[i6];
                        if (f5 != f) {
                            fSqrt = ((fArr[i5] - fArr[i6]) / f5) * 1000.0f;
                        }
                    } else {
                        int i7 = velocityTracker1D.f32292c;
                        int i8 = ((i7 - i4) + 21) % 20;
                        int i9 = (i7 + 21) % 20;
                        long j4 = jArr2[i8];
                        float f6 = fArr[i8];
                        int i10 = i8 + 1;
                        int i11 = i10 % 20;
                        float f7 = f;
                        while (i11 != i9) {
                            long j5 = jArr2[i11];
                            float f8 = f4;
                            char c3 = c2;
                            float f9 = j5 - j4;
                            if (f9 == f) {
                                i = i9;
                                jArr = jArr2;
                            } else {
                                float f10 = fArr[i11];
                                i = i9;
                                jArr = jArr2;
                                float f11 = (f10 - f6) / f9;
                                float fAbs2 = (Math.abs(f11) * (f11 - ((float) (Math.sqrt(2.0f * Math.abs(f7)) * ((double) Math.signum(f7)))))) + f7;
                                if (i11 == i10) {
                                    fAbs2 *= 0.5f;
                                }
                                f7 = fAbs2;
                                f6 = f10;
                                j4 = j5;
                            }
                            i11 = (i11 + 1) % 20;
                            c2 = c3;
                            f4 = f8;
                            jArr2 = jArr;
                            i9 = i;
                        }
                        fSqrt = ((float) (Math.sqrt(Math.abs(f7) * 2.0f) * ((double) Math.signum(f7)))) * f4;
                    }
                }
            }
            springAnimation2.f24243a = fSqrt;
            this.f32253d.f24249g = Transition.this.getTotalDurationMillis() + 1;
            SpringAnimation springAnimation3 = this.f32253d;
            springAnimation3.f24250h = -1.0f;
            springAnimation3.f24252j = 4.0f;
            C2232a c2232a = new C2232a(this);
            ArrayList arrayList2 = springAnimation3.f24253k;
            if (arrayList2.contains(c2232a)) {
                return;
            }
            arrayList2.add(c2232a);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            this.f32252c = true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TransitionListener {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        default void onTransitionEnd(Transition transition, boolean z2) {
            onTransitionEnd(transition);
        }

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);

        default void onTransitionStart(Transition transition, boolean z2) {
            onTransitionStart(transition);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TransitionNotification {

        /* JADX INFO: renamed from: a */
        public static final C2233b f32257a = new C2233b(0);

        /* JADX INFO: renamed from: b */
        public static final C2233b f32258b = new C2233b(1);

        /* JADX INFO: renamed from: c */
        public static final C2233b f32259c = new C2233b(2);

        /* JADX INFO: renamed from: d */
        public static final C2233b f32260d = new C2233b(3);

        /* JADX INFO: renamed from: e */
        public static final C2233b f32261e = new C2233b(4);

        /* JADX INFO: renamed from: a */
        void mo11991a(TransitionListener transitionListener, Transition transition, boolean z2);
    }

    /* JADX INFO: renamed from: a */
    public static void m11976a(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.f32284a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = transitionValuesMaps.f32285b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM7796o = ViewCompat.m7796o(view);
        if (strM7796o != null) {
            ArrayMap arrayMap = transitionValuesMaps.f32287d;
            if (arrayMap.containsKey(strM7796o)) {
                arrayMap.put(strM7796o, null);
            } else {
                arrayMap.put(strM7796o, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                LongSparseArray longSparseArray = transitionValuesMaps.f32286c;
                if (longSparseArray.m2003e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.m2005h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) longSparseArray.m2001c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.m2005h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static /* synthetic */ Transition access$000(Transition transition) {
        return transition.mCloneParent;
    }

    public static /* synthetic */ Transition access$002(Transition transition, Transition transition2) {
        transition.mCloneParent = transition2;
        return transition2;
    }

    /* JADX INFO: renamed from: c */
    public static ArrayMap m11977c() {
        ArrayMap<Animator, AnimationInfo> arrayMap = sRunningAnimators.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, AnimationInfo> arrayMap2 = new ArrayMap<>(0);
        sRunningAnimators.set(arrayMap2);
        return arrayMap2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11978d(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f32281a.get(str);
        Object obj2 = transitionValues2.f32281a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @RestrictTo
    public void animate(@Nullable Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C22263());
        animator.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m11979b(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    TransitionValues transitionValues = new TransitionValues(view);
                    if (z2) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.f32283c.add(this);
                    capturePropagationValues(transitionValues);
                    if (z2) {
                        m11976a(this.mStartValues, view, transitionValues);
                    } else {
                        m11976a(this.mEndValues, view, transitionValues);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m11979b(viewGroup.getChildAt(i3), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    @RestrictTo
    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.f32259c, false);
    }

    public abstract void captureEndValues(TransitionValues transitionValues);

    public void capturePropagationValues(TransitionValues transitionValues) {
        if (this.mPropagation == null || transitionValues.f32281a.isEmpty()) {
            return;
        }
        this.mPropagation.getClass();
        String[] strArr = VisibilityPropagation.f32322a;
        for (int i = 0; i < 2; i++) {
            if (!transitionValues.f32281a.containsKey(strArr[i])) {
                this.mPropagation.mo11995a(transitionValues);
                return;
            }
        }
    }

    public abstract void captureStartValues(TransitionValues transitionValues);

    public void captureValues(@NonNull ViewGroup viewGroup, boolean z2) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        ArrayMap<String, String> arrayMap;
        clearValues(z2);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    TransitionValues transitionValues = new TransitionValues(viewFindViewById);
                    if (z2) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.f32283c.add(this);
                    capturePropagationValues(transitionValues);
                    if (z2) {
                        m11976a(this.mStartValues, viewFindViewById, transitionValues);
                    } else {
                        m11976a(this.mEndValues, viewFindViewById, transitionValues);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                TransitionValues transitionValues2 = new TransitionValues(view);
                if (z2) {
                    captureStartValues(transitionValues2);
                } else {
                    captureEndValues(transitionValues2);
                }
                transitionValues2.f32283c.add(this);
                capturePropagationValues(transitionValues2);
                if (z2) {
                    m11976a(this.mStartValues, view, transitionValues2);
                } else {
                    m11976a(this.mEndValues, view, transitionValues2);
                }
            }
        } else {
            m11979b(viewGroup, z2);
        }
        if (z2 || (arrayMap = this.mNameOverrides) == null) {
            return;
        }
        int i3 = arrayMap.f3884c;
        ArrayList arrayList3 = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList3.add((View) this.mStartValues.f32287d.remove((String) this.mNameOverrides.m2128j(i4)));
        }
        for (int i5 = 0; i5 < i3; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.mStartValues.f32287d.put((String) this.mNameOverrides.m2131m(i5), view2);
            }
        }
    }

    public void clearValues(boolean z2) {
        if (z2) {
            this.mStartValues.f32284a.clear();
            this.mStartValues.f32285b.clear();
            this.mStartValues.f32286c.m1999a();
        } else {
            this.mEndValues.f32284a.clear();
            this.mEndValues.f32285b.clear();
            this.mEndValues.f32286c.m1999a();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo21933clone() {
        return clone();
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull TransitionValuesMaps transitionValuesMaps, @NonNull TransitionValuesMaps transitionValuesMaps2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        Animator animatorCreateAnimator;
        int i;
        boolean z2;
        int i2;
        View view;
        TransitionValues transitionValues;
        Animator animator;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap arrayMapM11977c = m11977c();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z3 = getRootTransition().mSeekController != null;
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            TransitionValues transitionValues3 = arrayList.get(i3);
            TransitionValues transitionValues4 = arrayList2.get(i3);
            if (transitionValues3 != null && !transitionValues3.f32283c.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f32283c.contains(this)) {
                transitionValues4 = null;
            }
            if (!(transitionValues3 == null && transitionValues4 == null) && ((transitionValues3 == null || transitionValues4 == null || isTransitionRequired(transitionValues3, transitionValues4)) && (animatorCreateAnimator = createAnimator(viewGroup, transitionValues3, transitionValues4)) != null)) {
                if (transitionValues4 != null) {
                    view = transitionValues4.f32282b;
                    String[] transitionProperties = getTransitionProperties();
                    i = size;
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        transitionValues2 = new TransitionValues(view);
                        z2 = z3;
                        i2 = i3;
                        TransitionValues transitionValues5 = (TransitionValues) transitionValuesMaps2.f32284a.get(view);
                        if (transitionValues5 != null) {
                            int i4 = 0;
                            while (i4 < transitionProperties.length) {
                                HashMap map = transitionValues2.f32281a;
                                int i5 = i4;
                                String str = transitionProperties[i5];
                                map.put(str, transitionValues5.f32281a.get(str));
                                i4 = i5 + 1;
                            }
                        }
                        int i6 = arrayMapM11977c.f3884c;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                animator2 = animatorCreateAnimator;
                                break;
                            }
                            AnimationInfo animationInfo = (AnimationInfo) arrayMapM11977c.get((Animator) arrayMapM11977c.m2128j(i7));
                            if (animationInfo.f32246c != null && animationInfo.f32244a == view && animationInfo.f32245b.equals(getName()) && animationInfo.f32246c.equals(transitionValues2)) {
                                animator2 = null;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        z2 = z3;
                        i2 = i3;
                        animator2 = animatorCreateAnimator;
                        transitionValues2 = null;
                    }
                    animator = animator2;
                    transitionValues = transitionValues2;
                } else {
                    i = size;
                    z2 = z3;
                    i2 = i3;
                    view = transitionValues3.f32282b;
                    transitionValues = null;
                    animator = animatorCreateAnimator;
                }
                if (animator != null) {
                    TransitionPropagation transitionPropagation = this.mPropagation;
                    if (transitionPropagation != null) {
                        long jMo11964b = transitionPropagation.mo11964b(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.mAnimators.size(), (int) jMo11964b);
                        jMin = Math.min(jMo11964b, jMin);
                    }
                    String name = getName();
                    WindowId windowId = viewGroup.getWindowId();
                    AnimationInfo animationInfo2 = new AnimationInfo();
                    animationInfo2.f32244a = view;
                    animationInfo2.f32245b = name;
                    animationInfo2.f32246c = transitionValues;
                    animationInfo2.f32247d = windowId;
                    animationInfo2.f32248e = this;
                    animationInfo2.f32249f = animator;
                    Object obj = animator;
                    if (z2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        obj = animatorSet;
                    }
                    arrayMapM11977c.put(obj, animationInfo2);
                    this.mAnimators.add((Animator) obj);
                }
            } else {
                i = size;
                z2 = z3;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
            z3 = z2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                AnimationInfo animationInfo3 = (AnimationInfo) arrayMapM11977c.get(this.mAnimators.get(sparseIntArray.keyAt(i8)));
                animationInfo3.f32249f.setStartDelay(animationInfo3.f32249f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - jMin));
            }
        }
    }

    @NonNull
    @RequiresApi
    public TransitionSeekController createSeekController() {
        SeekController seekController = new SeekController();
        this.mSeekController = seekController;
        addListener(seekController);
        return this.mSeekController;
    }

    /* JADX INFO: renamed from: e */
    public final void m11980e(Transition transition, TransitionNotification transitionNotification, boolean z2) {
        Transition transition2 = this.mCloneParent;
        if (transition2 != null) {
            transition2.m11980e(transition, transitionNotification, z2);
        }
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        TransitionListener[] transitionListenerArr = this.mListenersCache;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.mListenersCache = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.mListeners.toArray(transitionListenerArr);
        for (int i = 0; i < size; i++) {
            transitionNotification.mo11991a(transitionListenerArr2[i], transition, z2);
            transitionListenerArr2[i] = null;
        }
        this.mListenersCache = transitionListenerArr2;
    }

    @RestrictTo
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(TransitionNotification.f32258b, false);
            for (int i2 = 0; i2 < this.mStartValues.f32286c.m2007j(); i2++) {
                View view = (View) this.mStartValues.f32286c.m2008k(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f32286c.m2007j(); i3++) {
                View view2 = (View) this.mEndValues.f32286c.m2008k(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z2) {
        ArrayList<View> arrayListM11981a = this.mTargetChildExcludes;
        if (view != null) {
            arrayListM11981a = z2 ? ArrayListManager.m11981a(view, arrayListM11981a) : ArrayListManager.m11982b(view, arrayListM11981a);
        }
        this.mTargetChildExcludes = arrayListM11981a;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z2) {
        ArrayList<View> arrayListM11981a = this.mTargetExcludes;
        if (view != null) {
            arrayListM11981a = z2 ? ArrayListManager.m11981a(view, arrayListM11981a) : ArrayListManager.m11982b(view, arrayListM11981a);
        }
        this.mTargetExcludes = arrayListM11981a;
        return this;
    }

    @RestrictTo
    public void forceToEnd(@Nullable ViewGroup viewGroup) {
        ArrayMap arrayMapM11977c = m11977c();
        int i = arrayMapM11977c.f3884c;
        if (viewGroup == null || i == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        ArrayMap arrayMap = new ArrayMap(arrayMapM11977c);
        arrayMapM11977c.clear();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            AnimationInfo animationInfo = (AnimationInfo) arrayMap.m2131m(i2);
            if (animationInfo.f32244a != null && windowId.equals(animationInfo.f32247d)) {
                ((Animator) arrayMap.m2128j(i2)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        EpicenterCallback epicenterCallback = this.mEpicenterCallback;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.mo11969a();
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.mEndValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.mStartValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TransitionValues getMatchedTransitionValues(View view, boolean z2) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z2);
        }
        ArrayList<TransitionValues> arrayList = z2 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            TransitionValues transitionValues = arrayList.get(i);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.f32282b == view) {
                break;
            }
            i++;
        }
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public TransitionPropagation getPropagation() {
        return this.mPropagation;
    }

    @NonNull
    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.mParent;
        return transitionSet != null ? transitionSet.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view, boolean z2) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z2);
        }
        return (TransitionValues) (z2 ? this.mStartValues : this.mEndValues).f32284a.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (m11978d(transitionValues, transitionValues2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = transitionValues.f32281a.keySet().iterator();
                while (it.hasNext()) {
                    if (m11978d(transitionValues, transitionValues2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && ViewCompat.m7796o(view) != null && this.mTargetNameExcludes.contains(ViewCompat.m7796o(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.m7796o(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(TransitionNotification transitionNotification, boolean z2) {
        m11980e(this, transitionNotification, z2);
    }

    @RestrictTo
    public void pause(@Nullable View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.f32260d, false);
        this.mPaused = true;
    }

    public void playTransition(@NonNull ViewGroup viewGroup) {
        AnimationInfo animationInfo;
        View view;
        TransitionValues transitionValues;
        View view2;
        View view3;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        TransitionValuesMaps transitionValuesMaps = this.mStartValues;
        TransitionValuesMaps transitionValuesMaps2 = this.mEndValues;
        ArrayMap arrayMap = new ArrayMap(transitionValuesMaps.f32284a);
        ArrayMap arrayMap2 = new ArrayMap(transitionValuesMaps2.f32284a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                for (int i3 = arrayMap.f3884c - 1; i3 >= 0; i3--) {
                    View view4 = (View) arrayMap.m2128j(i3);
                    if (view4 != null && isValidTarget(view4) && (transitionValues = (TransitionValues) arrayMap2.remove(view4)) != null && isValidTarget(transitionValues.f32282b)) {
                        this.mStartValuesList.add((TransitionValues) arrayMap.mo2129k(i3));
                        this.mEndValuesList.add(transitionValues);
                    }
                }
            } else if (i2 == 2) {
                ArrayMap arrayMap3 = transitionValuesMaps.f32287d;
                ArrayMap arrayMap4 = transitionValuesMaps2.f32287d;
                int i4 = arrayMap3.f3884c;
                for (int i5 = 0; i5 < i4; i5++) {
                    View view5 = (View) arrayMap3.m2131m(i5);
                    if (view5 != null && isValidTarget(view5) && (view2 = (View) arrayMap4.get(arrayMap3.m2128j(i5))) != null && isValidTarget(view2)) {
                        TransitionValues transitionValues2 = (TransitionValues) arrayMap.get(view5);
                        TransitionValues transitionValues3 = (TransitionValues) arrayMap2.get(view2);
                        if (transitionValues2 != null && transitionValues3 != null) {
                            this.mStartValuesList.add(transitionValues2);
                            this.mEndValuesList.add(transitionValues3);
                            arrayMap.remove(view5);
                            arrayMap2.remove(view2);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray sparseArray = transitionValuesMaps.f32285b;
                SparseArray sparseArray2 = transitionValuesMaps2.f32285b;
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    View view6 = (View) sparseArray.valueAt(i6);
                    if (view6 != null && isValidTarget(view6) && (view3 = (View) sparseArray2.get(sparseArray.keyAt(i6))) != null && isValidTarget(view3)) {
                        TransitionValues transitionValues4 = (TransitionValues) arrayMap.get(view6);
                        TransitionValues transitionValues5 = (TransitionValues) arrayMap2.get(view3);
                        if (transitionValues4 != null && transitionValues5 != null) {
                            this.mStartValuesList.add(transitionValues4);
                            this.mEndValuesList.add(transitionValues5);
                            arrayMap.remove(view6);
                            arrayMap2.remove(view3);
                        }
                    }
                }
            } else if (i2 == 4) {
                LongSparseArray longSparseArray = transitionValuesMaps.f32286c;
                int iM2007j = longSparseArray.m2007j();
                for (int i7 = 0; i7 < iM2007j; i7++) {
                    View view7 = (View) longSparseArray.m2008k(i7);
                    if (view7 != null && isValidTarget(view7)) {
                        View view8 = (View) transitionValuesMaps2.f32286c.m2001c(longSparseArray.m2004f(i7));
                        if (view8 != null && isValidTarget(view8)) {
                            TransitionValues transitionValues6 = (TransitionValues) arrayMap.get(view7);
                            TransitionValues transitionValues7 = (TransitionValues) arrayMap2.get(view8);
                            if (transitionValues6 != null && transitionValues7 != null) {
                                this.mStartValuesList.add(transitionValues6);
                                this.mEndValuesList.add(transitionValues7);
                                arrayMap.remove(view7);
                                arrayMap2.remove(view8);
                            }
                        }
                    }
                }
            }
            i++;
        }
        for (int i8 = 0; i8 < arrayMap.f3884c; i8++) {
            TransitionValues transitionValues8 = (TransitionValues) arrayMap.m2131m(i8);
            if (isValidTarget(transitionValues8.f32282b)) {
                this.mStartValuesList.add(transitionValues8);
                this.mEndValuesList.add(null);
            }
        }
        for (int i9 = 0; i9 < arrayMap2.f3884c; i9++) {
            TransitionValues transitionValues9 = (TransitionValues) arrayMap2.m2131m(i9);
            if (isValidTarget(transitionValues9.f32282b)) {
                this.mEndValuesList.add(transitionValues9);
                this.mStartValuesList.add(null);
            }
        }
        ArrayMap arrayMapM11977c = m11977c();
        int i10 = arrayMapM11977c.f3884c;
        WindowId windowId = viewGroup.getWindowId();
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            Animator animator = (Animator) arrayMapM11977c.m2128j(i11);
            if (animator != null && (animationInfo = (AnimationInfo) arrayMapM11977c.get(animator)) != null && (view = animationInfo.f32244a) != null && windowId.equals(animationInfo.f32247d)) {
                TransitionValues transitionValues10 = getTransitionValues(view, true);
                TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues10 == null && matchedTransitionValues == null) {
                    matchedTransitionValues = (TransitionValues) this.mEndValues.f32284a.get(view);
                }
                if (transitionValues10 != null || matchedTransitionValues != null) {
                    Transition transition = animationInfo.f32248e;
                    if (transition.isTransitionRequired(animationInfo.f32246c, matchedTransitionValues)) {
                        if (transition.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            transition.mCurrentAnimators.remove(animator);
                            arrayMapM11977c.remove(animator);
                            if (transition.mCurrentAnimators.size() == 0) {
                                transition.notifyListeners(TransitionNotification.f32259c, false);
                                if (!transition.mEnded) {
                                    transition.mEnded = true;
                                    transition.notifyListeners(TransitionNotification.f32258b, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            arrayMapM11977c.remove(animator);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            SeekController seekController = this.mSeekController;
            Transition transition2 = Transition.this;
            long j = transition2.getTotalDurationMillis() == 0 ? 1L : 0L;
            transition2.setCurrentPlayTimeMillis(j, seekController.f32250a);
            seekController.f32250a = j;
            this.mSeekController.f32251b = true;
        }
    }

    @RequiresApi
    public void prepareAnimatorsForSeeking() {
        ArrayMap arrayMapM11977c = m11977c();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = this.mAnimators.get(i);
            AnimationInfo animationInfo = (AnimationInfo) arrayMapM11977c.get(animator);
            if (animator != null && animationInfo != null) {
                long duration = getDuration();
                Animator animator2 = animationInfo.f32249f;
                if (duration >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, Impl26.m11983a(animator));
            }
        }
        this.mAnimators.clear();
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
        Transition transition;
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(transitionListener) && (transition = this.mCloneParent) != null) {
                transition.removeListener(transitionListener);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @RestrictTo
    public void resume(@Nullable View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(TransitionNotification.f32261e, false);
            }
            this.mPaused = false;
        }
    }

    @RestrictTo
    public void runAnimators() {
        start();
        ArrayMap arrayMapM11977c = m11977c();
        for (Animator animator : this.mAnimators) {
            if (arrayMapM11977c.containsKey(animator)) {
                start();
                if (animator != null) {
                    animator.addListener(new C22252(arrayMapM11977c));
                    animate(animator);
                }
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z2) {
        this.mCanRemoveViews = z2;
    }

    @RequiresApi
    public void setCurrentPlayTimeMillis(long j, long j2) {
        long totalDurationMillis = getTotalDurationMillis();
        int i = 0;
        boolean z2 = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(TransitionNotification.f32257a, z2);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i < size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            Impl26.m11984b(animator, Math.min(Math.max(0L, j), Impl26.m11983a(animator)));
            i++;
            totalDurationMillis = totalDurationMillis;
        }
        long j3 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.mEnded = true;
        }
        notifyListeners(TransitionNotification.f32258b, z2);
    }

    @NonNull
    public Transition setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback epicenterCallback) {
        this.mEpicenterCallback = epicenterCallback;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@Nullable int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 < 1 || i2 > 4) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            for (int i3 = 0; i3 < i; i3++) {
                if (iArr[i3] == i2) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        this.mPropagation = transitionPropagation;
    }

    @NonNull
    public Transition setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    @RestrictTo
    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(TransitionNotification.f32257a, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    @NonNull
    public String toString() {
        return toString("");
    }

    @NonNull
    public Transition addTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @NonNull
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new TransitionValuesMaps();
            transition.mEndValues = new TransitionValuesMaps();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            transition.mSeekController = null;
            transition.mCloneParent = this;
            transition.mListeners = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public Transition removeTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i, boolean z2) {
        ArrayList<Integer> arrayListM11982b = this.mTargetIdChildExcludes;
        if (i > 0) {
            if (z2) {
                arrayListM11982b = ArrayListManager.m11981a(Integer.valueOf(i), arrayListM11982b);
            } else {
                arrayListM11982b = ArrayListManager.m11982b(Integer.valueOf(i), arrayListM11982b);
            }
        }
        this.mTargetIdChildExcludes = arrayListM11982b;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i, boolean z2) {
        ArrayList<Integer> arrayListM11982b = this.mTargetIdExcludes;
        if (i > 0) {
            if (z2) {
                arrayListM11982b = ArrayListManager.m11981a(Integer.valueOf(i), arrayListM11982b);
            } else {
                arrayListM11982b = ArrayListManager.m11982b(Integer.valueOf(i), arrayListM11982b);
            }
        }
        this.mTargetIdExcludes = arrayListM11982b;
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z2) {
        ArrayList<Class<?>> arrayListM11982b = this.mTargetTypeChildExcludes;
        if (cls != null) {
            if (z2) {
                arrayListM11982b = ArrayListManager.m11981a(cls, arrayListM11982b);
            } else {
                arrayListM11982b = ArrayListManager.m11982b(cls, arrayListM11982b);
            }
        }
        this.mTargetTypeChildExcludes = arrayListM11982b;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z2) {
        ArrayList<String> arrayListM11982b = this.mTargetNameExcludes;
        if (str != null) {
            if (z2) {
                arrayListM11982b = ArrayListManager.m11981a(str, arrayListM11982b);
            } else {
                arrayListM11982b = ArrayListManager.m11982b(str, arrayListM11982b);
            }
        }
        this.mTargetNameExcludes = arrayListM11982b;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z2) {
        ArrayList<Class<?>> arrayListM11982b = this.mTargetTypeExcludes;
        if (cls != null) {
            if (z2) {
                arrayListM11982b = ArrayListManager.m11981a(cls, arrayListM11982b);
            } else {
                arrayListM11982b = ArrayListManager.m11982b(cls, arrayListM11982b);
            }
        }
        this.mTargetTypeExcludes = arrayListM11982b;
        return this;
    }
}
