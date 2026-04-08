package androidx.transition;

import android.view.View;
import com.king.logx.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TransitionValues {

    /* JADX INFO: renamed from: b */
    public View f32282b;

    /* JADX INFO: renamed from: a */
    public final HashMap f32281a = new HashMap();

    /* JADX INFO: renamed from: c */
    public final ArrayList f32283c = new ArrayList();

    public TransitionValues(View view) {
        this.f32282b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.f32282b == transitionValues.f32282b && this.f32281a.equals(transitionValues.f32281a);
    }

    public final int hashCode() {
        return this.f32281a.hashCode() + (this.f32282b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM21r = AbstractC0000a.m21r("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbM21r.append(this.f32282b);
        sbM21r.append("\n");
        String strM2C = AbstractC0000a.m2C(sbM21r.toString(), "    values:");
        HashMap map = this.f32281a;
        for (String str : map.keySet()) {
            strM2C = strM2C + Logger.INDENT + str + ": " + map.get(str) + "\n";
        }
        return strM2C;
    }
}
