package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.p013ui.node.DelegatableNode;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* JADX INFO: renamed from: a */
    public final Density f4805a;

    /* JADX INFO: renamed from: b */
    public long f4806b = 9205357640488583168L;

    /* JADX INFO: renamed from: c */
    public final EdgeEffectWrapper f4807c;

    /* JADX INFO: renamed from: d */
    public final MutableState f4808d;

    /* JADX INFO: renamed from: e */
    public final boolean f4809e;

    /* JADX INFO: renamed from: f */
    public boolean f4810f;

    /* JADX INFO: renamed from: g */
    public long f4811g;

    /* JADX INFO: renamed from: h */
    public long f4812h;

    /* JADX INFO: renamed from: i */
    public final DelegatingNode f4813i;

    public AndroidEdgeEffectOverscrollEffect(Context context, Density density, long j, PaddingValuesImpl paddingValuesImpl) {
        this.f4805a = density;
        EdgeEffectWrapper edgeEffectWrapper = new EdgeEffectWrapper(context, ColorKt.m5201j(j));
        this.f4807c = edgeEffectWrapper;
        this.f4808d = SnapshotStateKt.m4524f(Unit.f51459a, SnapshotStateKt.m4526h());
        this.f4809e = true;
        this.f4811g = 0L;
        this.f4812h = -1L;
        SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImplM5574a = SuspendingPointerInputFilterKt.m5574a(new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1(this));
        this.f4813i = Build.VERSION.SDK_INT >= 31 ? new StretchOverscrollNode(suspendingPointerInputModifierNodeImplM5574a, this, edgeEffectWrapper) : new GlowOverscrollNode(suspendingPointerInputModifierNodeImplM5574a, this, edgeEffectWrapper, paddingValuesImpl);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: C */
    public final DelegatableNode mo2413C() {
        return this.f4813i;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[PHI: r7
      0x012b: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x0159, B:62:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e5  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo2414D(long j, int i, Function1 function1) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fM2422f;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jM5057g;
        boolean z2;
        boolean zM2452f;
        long j3;
        float f;
        float f2;
        boolean z3;
        int i3;
        boolean z4;
        if (Size.m5084e(this.f4811g)) {
            return ((Offset) function1.invoke(new Offset(j))).f17524a;
        }
        boolean z5 = this.f4810f;
        boolean z6 = true;
        EdgeEffectWrapper edgeEffectWrapper = this.f4807c;
        if (!z5) {
            if (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4971f)) {
                m2421e(0L);
            }
            if (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4972g)) {
                m2422f(0L);
            }
            if (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4969d)) {
                m2423g(0L);
            }
            if (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4970e)) {
                m2420d(0L);
            }
            this.f4810f = true;
        }
        int i4 = AndroidOverscroll_androidKt.f4830a;
        float f3 = i == 2 ? 4.0f : 1.0f;
        long jM5059i = Offset.m5059i(f3, j);
        int i5 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            if (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4969d) || Float.intBitsToFloat(i5) >= 0.0f) {
                j2 = 4294967295L;
                if (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4970e) && Float.intBitsToFloat(i5) > 0.0f) {
                    float fM2420d = m2420d(jM5059i);
                    if (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4970e)) {
                        edgeEffectWrapper.m2455b().finish();
                    }
                    fIntBitsToFloat = fM2420d == Float.intBitsToFloat((int) (jM5059i & 4294967295L)) ? Float.intBitsToFloat(i5) : fM2420d / f3;
                }
            } else {
                float fM2423g = m2423g(jM5059i);
                j2 = 4294967295L;
                if (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4969d)) {
                    edgeEffectWrapper.m2458e().finish();
                }
                fIntBitsToFloat = fM2423g == Float.intBitsToFloat((int) (jM5059i & 4294967295L)) ? Float.intBitsToFloat(i5) : fM2423g / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4971f) && Float.intBitsToFloat(i2) < 0.0f) {
                    fM2422f = m2421e(jM5059i);
                    if (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4971f)) {
                        edgeEffectWrapper.m2456c().finish();
                    }
                    if (fM2422f == Float.intBitsToFloat((int) (jM5059i >> 32))) {
                        fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                } else if (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4972g) || Float.intBitsToFloat(i2) <= 0.0f) {
                    fIntBitsToFloat2 = 0.0f;
                } else {
                    fM2422f = m2422f(jM5059i);
                    if (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4972g)) {
                        edgeEffectWrapper.m2457d().finish();
                    }
                    fIntBitsToFloat2 = fM2422f == Float.intBitsToFloat((int) (jM5059i >> 32)) ? Float.intBitsToFloat(i2) : fM2422f / f3;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!Offset.m5053c(jFloatToRawIntBits, 0L)) {
                m2419c();
            }
            jM5057g = Offset.m5057g(j, jFloatToRawIntBits);
            long j4 = ((Offset) function1.invoke(new Offset(jM5057g))).f17524a;
            long jM5057g2 = Offset.m5057g(jM5057g, j4);
            if ((Float.intBitsToFloat((int) (jM5057g >> 32)) == 0.0f || Float.intBitsToFloat((int) (jM5057g & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4971f) || EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4969d) || EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4972g) || EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4970e)))) {
                m2417a();
            }
            if (i != 1) {
                int i6 = (int) (jM5057g2 >> 32);
                if (Float.intBitsToFloat(i6) > 0.5f) {
                    j3 = jM5057g2;
                    m2421e(j3);
                } else {
                    j3 = jM5057g2;
                    if (Float.intBitsToFloat(i6) < -0.5f) {
                        m2422f(j3);
                    } else {
                        f = 0.5f;
                        f2 = -0.5f;
                        z3 = false;
                        i3 = (int) (j3 & j2);
                        if (Float.intBitsToFloat(i3) <= f) {
                            m2423g(j3);
                        } else if (Float.intBitsToFloat(i3) < f2) {
                            m2420d(j3);
                        } else {
                            z4 = false;
                            z2 = !z3 || z4;
                        }
                        z4 = true;
                        if (z3) {
                        }
                    }
                }
                z3 = true;
                f = 0.5f;
                f2 = -0.5f;
                i3 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i3) <= f) {
                }
                z4 = true;
                if (z3) {
                }
            }
            if (!Offset.m5053c(jM5057g, 0L)) {
                if (!EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4971f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zM2452f = false;
                } else {
                    EdgeEffectCompat.m2451e(edgeEffectWrapper.m2456c(), Float.intBitsToFloat(i2));
                    zM2452f = EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4971f);
                }
                if (EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4972g) && Float.intBitsToFloat(i2) > 0.0f) {
                    EdgeEffectCompat.m2451e(edgeEffectWrapper.m2457d(), Float.intBitsToFloat(i2));
                    zM2452f = zM2452f || EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4972g);
                }
                if (EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4969d) && Float.intBitsToFloat(i5) < 0.0f) {
                    EdgeEffectCompat.m2451e(edgeEffectWrapper.m2458e(), Float.intBitsToFloat(i5));
                    zM2452f = zM2452f || EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4969d);
                }
                if (EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4970e) && Float.intBitsToFloat(i5) > 0.0f) {
                    EdgeEffectCompat.m2451e(edgeEffectWrapper.m2455b(), Float.intBitsToFloat(i5));
                    zM2452f = zM2452f || EdgeEffectWrapper.m2452f(edgeEffectWrapper.f4970e);
                }
                if (!zM2452f && !z2) {
                    z6 = false;
                }
                z2 = z6;
            }
            if (z2) {
                m2419c();
            }
            return Offset.m5058h(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!Offset.m5053c(jFloatToRawIntBits, 0L)) {
        }
        jM5057g = Offset.m5057g(j, jFloatToRawIntBits);
        long j42 = ((Offset) function1.invoke(new Offset(jM5057g))).f17524a;
        long jM5057g22 = Offset.m5057g(jM5057g, j42);
        if (Float.intBitsToFloat((int) (jM5057g >> 32)) == 0.0f) {
            m2417a();
        } else {
            m2417a();
        }
        if (i != 1) {
        }
        if (!Offset.m5053c(jM5057g, 0L)) {
        }
        if (z2) {
        }
        return Offset.m5058h(jFloatToRawIntBits, j42);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2415E(long j, Function2 function2, Continuation continuation) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        long jM6687d;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            int i = androidEdgeEffectOverscrollEffect$applyToFling$1.f4818f;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.f4818f = i - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, (ContinuationImpl) continuation);
            }
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.f4816c;
        Object obj = CoroutineSingletons.f51584a;
        int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.f4818f;
        Unit unit = Unit.f51459a;
        if (i2 == 0) {
            ResultKt.m18313b(objInvoke);
            if (Size.m5084e(this.f4811g)) {
                Object velocity = new Velocity(j);
                androidEdgeEffectOverscrollEffect$applyToFling$1.f4818f = 1;
                if (function2.invoke(velocity, androidEdgeEffectOverscrollEffect$applyToFling$1) != obj) {
                    return unit;
                }
            } else {
                EdgeEffectWrapper edgeEffectWrapper = this.f4807c;
                boolean zM2453g = EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4971f);
                Density density = this.f4805a;
                long jM6691a = VelocityKt.m6691a((!zM2453g || Velocity.m6685b(j) >= 0.0f) ? (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4972g) || Velocity.m6685b(j) <= 0.0f) ? 0.0f : -EdgeEffectCompat.m2447a(edgeEffectWrapper.m2457d(), -Velocity.m6685b(j), Float.intBitsToFloat((int) (this.f4811g >> 32)), density) : EdgeEffectCompat.m2447a(edgeEffectWrapper.m2456c(), Velocity.m6685b(j), Float.intBitsToFloat((int) (this.f4811g >> 32)), density), (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4969d) || Velocity.m6686c(j) >= 0.0f) ? (!EdgeEffectWrapper.m2453g(edgeEffectWrapper.f4970e) || Velocity.m6686c(j) <= 0.0f) ? 0.0f : -EdgeEffectCompat.m2447a(edgeEffectWrapper.m2455b(), -Velocity.m6686c(j), Float.intBitsToFloat((int) (this.f4811g & 4294967295L)), density) : EdgeEffectCompat.m2447a(edgeEffectWrapper.m2458e(), Velocity.m6686c(j), Float.intBitsToFloat((int) (this.f4811g & 4294967295L)), density));
                if (jM6691a != 0) {
                    m2419c();
                }
                jM6687d = Velocity.m6687d(j, jM6691a);
                Object velocity2 = new Velocity(jM6687d);
                androidEdgeEffectOverscrollEffect$applyToFling$1.f4814a = this;
                androidEdgeEffectOverscrollEffect$applyToFling$1.f4815b = jM6687d;
                androidEdgeEffectOverscrollEffect$applyToFling$1.f4818f = 2;
                objInvoke = function2.invoke(velocity2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                if (objInvoke != obj) {
                    androidEdgeEffectOverscrollEffect = this;
                }
            }
            return obj;
        }
        if (i2 == 1) {
            ResultKt.m18313b(objInvoke);
            return unit;
        }
        if (i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jM6687d = androidEdgeEffectOverscrollEffect$applyToFling$1.f4815b;
        androidEdgeEffectOverscrollEffect = androidEdgeEffectOverscrollEffect$applyToFling$1.f4814a;
        ResultKt.m18313b(objInvoke);
        long jM6687d2 = Velocity.m6687d(jM6687d, ((Velocity) objInvoke).f20578a);
        androidEdgeEffectOverscrollEffect.f4810f = false;
        float fM6685b = Velocity.m6685b(jM6687d2);
        EdgeEffectWrapper edgeEffectWrapper2 = androidEdgeEffectOverscrollEffect.f4807c;
        if (fM6685b > 0.0f) {
            EdgeEffectCompat.m2449c(edgeEffectWrapper2.m2456c(), MathKt.m18640b(Velocity.m6685b(jM6687d2)));
        } else if (Velocity.m6685b(jM6687d2) < 0.0f) {
            EdgeEffectCompat.m2449c(edgeEffectWrapper2.m2457d(), -MathKt.m18640b(Velocity.m6685b(jM6687d2)));
        }
        if (Velocity.m6686c(jM6687d2) > 0.0f) {
            EdgeEffectCompat.m2449c(edgeEffectWrapper2.m2458e(), MathKt.m18640b(Velocity.m6686c(jM6687d2)));
        } else if (Velocity.m6686c(jM6687d2) < 0.0f) {
            EdgeEffectCompat.m2449c(edgeEffectWrapper2.m2455b(), -MathKt.m18640b(Velocity.m6686c(jM6687d2)));
        }
        androidEdgeEffectOverscrollEffect.m2417a();
        return unit;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: F */
    public final boolean mo2416F() {
        EdgeEffectWrapper edgeEffectWrapper = this.f4807c;
        EdgeEffect edgeEffect = edgeEffectWrapper.f4969d;
        if (edgeEffect != null && EdgeEffectCompat.m2448b(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.f4970e;
        if (edgeEffect2 != null && EdgeEffectCompat.m2448b(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.f4971f;
        if (edgeEffect3 != null && EdgeEffectCompat.m2448b(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.f4972g;
        return (edgeEffect4 == null || EdgeEffectCompat.m2448b(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m2417a() {
        boolean z2;
        EdgeEffectWrapper edgeEffectWrapper = this.f4807c;
        EdgeEffect edgeEffect = edgeEffectWrapper.f4969d;
        boolean z3 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = !edgeEffect.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = edgeEffectWrapper.f4970e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 = !edgeEffect2.isFinished() || z2;
        }
        EdgeEffect edgeEffect3 = edgeEffectWrapper.f4971f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 = !edgeEffect3.isFinished() || z2;
        }
        EdgeEffect edgeEffect4 = edgeEffectWrapper.f4972g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (z2) {
            m2419c();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m2418b() {
        long jM5087b = this.f4806b;
        if ((9223372034707292159L & jM5087b) == 9205357640488583168L) {
            jM5087b = SizeKt.m5087b(this.f4811g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM5087b >> 32)) / Float.intBitsToFloat((int) (this.f4811g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jM5087b & 4294967295L)) / Float.intBitsToFloat((int) (this.f4811g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: c */
    public final void m2419c() {
        if (this.f4809e) {
            ((SnapshotMutableStateImpl) this.f4808d).setValue(Unit.f51459a);
        }
    }

    /* JADX INFO: renamed from: d */
    public final float m2420d(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2418b() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f4811g & 4294967295L));
        EdgeEffect edgeEffectM2455b = this.f4807c.m2455b();
        return EdgeEffectCompat.m2448b(edgeEffectM2455b) == 0.0f ? Float.intBitsToFloat((int) (this.f4811g & 4294967295L)) * (-EdgeEffectCompat.m2450d(edgeEffectM2455b, -fIntBitsToFloat2, 1 - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: e */
    public final float m2421e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2418b() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f4811g >> 32));
        EdgeEffect edgeEffectM2456c = this.f4807c.m2456c();
        return EdgeEffectCompat.m2448b(edgeEffectM2456c) == 0.0f ? Float.intBitsToFloat((int) (this.f4811g >> 32)) * EdgeEffectCompat.m2450d(edgeEffectM2456c, fIntBitsToFloat2, 1 - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: f */
    public final float m2422f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2418b() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f4811g >> 32));
        EdgeEffect edgeEffectM2457d = this.f4807c.m2457d();
        return EdgeEffectCompat.m2448b(edgeEffectM2457d) == 0.0f ? Float.intBitsToFloat((int) (this.f4811g >> 32)) * (-EdgeEffectCompat.m2450d(edgeEffectM2457d, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: g */
    public final float m2423g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (m2418b() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.f4811g & 4294967295L));
        EdgeEffect edgeEffectM2458e = this.f4807c.m2458e();
        return EdgeEffectCompat.m2448b(edgeEffectM2458e) == 0.0f ? Float.intBitsToFloat((int) (this.f4811g & 4294967295L)) * EdgeEffectCompat.m2450d(edgeEffectM2458e, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    /* JADX INFO: renamed from: h */
    public final void m2424h(long j) {
        boolean zM5080a = Size.m5080a(this.f4811g, 0L);
        boolean zM5080a2 = Size.m5080a(j, this.f4811g);
        this.f4811g = j;
        if (!zM5080a2) {
            int iM18640b = MathKt.m18640b(Float.intBitsToFloat((int) (j >> 32)));
            long jM18640b = (((long) MathKt.m18640b(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM18640b) << 32);
            EdgeEffectWrapper edgeEffectWrapper = this.f4807c;
            edgeEffectWrapper.f4968c = jM18640b;
            EdgeEffect edgeEffect = edgeEffectWrapper.f4969d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM18640b >> 32), (int) (jM18640b & 4294967295L));
            }
            EdgeEffect edgeEffect2 = edgeEffectWrapper.f4970e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM18640b >> 32), (int) (jM18640b & 4294967295L));
            }
            EdgeEffect edgeEffect3 = edgeEffectWrapper.f4971f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM18640b & 4294967295L), (int) (jM18640b >> 32));
            }
            EdgeEffect edgeEffect4 = edgeEffectWrapper.f4972g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM18640b & 4294967295L), (int) (jM18640b >> 32));
            }
            EdgeEffect edgeEffect5 = edgeEffectWrapper.f4973h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM18640b >> 32), (int) (jM18640b & 4294967295L));
            }
            EdgeEffect edgeEffect6 = edgeEffectWrapper.f4974i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM18640b >> 32), (int) (jM18640b & 4294967295L));
            }
            EdgeEffect edgeEffect7 = edgeEffectWrapper.f4975j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM18640b & 4294967295L), (int) (jM18640b >> 32));
            }
            EdgeEffect edgeEffect8 = edgeEffectWrapper.f4976k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM18640b), (int) (jM18640b >> 32));
            }
        }
        if (zM5080a || zM5080a2) {
            return;
        }
        m2417a();
    }
}
