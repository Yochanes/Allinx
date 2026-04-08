package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ChainReference extends HelperReference {

    /* JADX INFO: renamed from: o0 */
    public float f21759o0;

    /* JADX INFO: renamed from: p0 */
    public final HashMap f21760p0;

    /* JADX INFO: renamed from: q0 */
    public final HashMap f21761q0;

    /* JADX INFO: renamed from: r0 */
    public final HashMap f21762r0;

    /* JADX INFO: renamed from: s0 */
    public HashMap f21763s0;

    /* JADX INFO: renamed from: t0 */
    public HashMap f21764t0;

    /* JADX INFO: renamed from: u0 */
    public State.Chain f21765u0;

    public ChainReference(State state, State.Helper helper) {
        super(state, helper);
        this.f21759o0 = 0.5f;
        this.f21760p0 = new HashMap();
        this.f21761q0 = new HashMap();
        this.f21762r0 = new HashMap();
        this.f21765u0 = State.Chain.f21643a;
    }

    /* JADX INFO: renamed from: t */
    public final float m7025t(String str) {
        HashMap map = this.f21764t0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f21764t0.get(str)).floatValue();
    }

    /* JADX INFO: renamed from: u */
    public final float m7026u(String str) {
        HashMap map = this.f21762r0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: v */
    public final float m7027v(String str) {
        HashMap map = this.f21763s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f21763s0.get(str)).floatValue();
    }

    /* JADX INFO: renamed from: w */
    public final float m7028w(String str) {
        HashMap map = this.f21761q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }
}
